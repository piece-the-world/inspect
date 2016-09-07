/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.i;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;

@SuppressLint(value={"Assert"})
public class b
implements i,
ByteChannel {
    protected static ByteBuffer a = ByteBuffer.allocate(0);
    protected ExecutorService b;
    protected List c;
    protected ByteBuffer d;
    protected ByteBuffer e;
    protected ByteBuffer f;
    protected SocketChannel g;
    protected SelectionKey h;
    protected SSLEngine i;
    protected SSLEngineResult j;
    protected SSLEngineResult k;
    protected int l = 0;

    public b(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.g = socketChannel;
        this.i = sSLEngine;
        this.b = executorService;
        this.j = this.k = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.c = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.h = selectionKey;
        }
        this.a(sSLEngine.getSession());
        this.g.write(this.b(a));
        this.j();
    }

    private void a(Future future) {
        try {
            boolean bl2 = false;
            do {
                try {
                    future.get();
                    break;
                }
                catch (InterruptedException var3_4) {
                    bl2 = true;
                    continue;
                }
                break;
            } while (true);
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
        catch (ExecutionException var2_3) {
            throw new RuntimeException(var2_3);
        }
    }

    private synchronized void j() {
        if (this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return;
        }
        if (!this.c.isEmpty()) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                Future future = (Future)iterator.next();
                if (future.isDone()) {
                    iterator.remove();
                    continue;
                }
                if (this.d()) {
                    this.a(future);
                }
                return;
            }
        }
        if (this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            if (!this.d() || this.j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                this.f.compact();
                int n2 = this.g.read(this.f);
                if (n2 == -1) {
                    throw new IOException("connection closed unexpectedly by peer");
                }
                this.f.flip();
            }
            this.d.compact();
            this.k();
            if (this.j.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.a(this.i.getSession());
                return;
            }
        }
        this.e();
        if (this.c.isEmpty() || this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            this.g.write(this.b(a));
            if (this.k.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.a(this.i.getSession());
                return;
            }
        }
        assert (this.i.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING);
        this.l = 1;
    }

    private synchronized ByteBuffer b(ByteBuffer byteBuffer) {
        this.e.compact();
        this.k = this.i.wrap(byteBuffer, this.e);
        this.e.flip();
        return this.e;
    }

    private synchronized ByteBuffer k() {
        int n2;
        do {
            n2 = this.d.remaining();
            this.j = this.i.unwrap(this.f, this.d);
        } while (this.j.getStatus() == SSLEngineResult.Status.OK && (n2 != this.d.remaining() || this.i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP));
        this.d.flip();
        return this.d;
    }

    protected void e() {
        Runnable runnable;
        while ((runnable = this.i.getDelegatedTask()) != null) {
            this.c.add(this.b.submit(runnable));
        }
    }

    protected void a(SSLSession sSLSession) {
        int n2 = sSLSession.getApplicationBufferSize();
        int n3 = sSLSession.getPacketBufferSize();
        if (this.d == null) {
            this.d = ByteBuffer.allocate(n2);
            this.e = ByteBuffer.allocate(n3);
            this.f = ByteBuffer.allocate(n3);
        } else {
            if (this.d.capacity() != n2) {
                this.d = ByteBuffer.allocate(n2);
            }
            if (this.e.capacity() != n3) {
                this.e = ByteBuffer.allocate(n3);
            }
            if (this.f.capacity() != n3) {
                this.f = ByteBuffer.allocate(n3);
            }
        }
        this.d.rewind();
        this.d.flip();
        this.f.rewind();
        this.f.flip();
        this.e.rewind();
        this.e.flip();
        ++this.l;
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        if (!this.l()) {
            this.j();
            return 0;
        }
        if (this.l <= 1) {
            this.a(this.i.getSession());
        }
        int n2 = this.g.write(this.b(byteBuffer));
        return n2;
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        int n2;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!this.l()) {
            if (this.d()) {
                while (!this.l()) {
                    this.j();
                }
            } else {
                this.j();
                if (!this.l()) {
                    return 0;
                }
            }
        }
        if (this.l <= 1) {
            this.a(this.i.getSession());
        }
        if ((n2 = this.c(byteBuffer)) != 0) {
            return n2;
        }
        assert (this.d.position() == 0);
        this.d.clear();
        if (!this.f.hasRemaining()) {
            this.f.clear();
        } else {
            this.f.compact();
        }
        if ((this.d() || this.j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.g.read(this.f) == -1) {
            return -1;
        }
        this.f.flip();
        this.k();
        int n3 = this.a(this.d, byteBuffer);
        if (n3 == 0 && this.d()) {
            return this.read(byteBuffer);
        }
        return n3;
    }

    private int c(ByteBuffer byteBuffer) {
        if (this.d.hasRemaining()) {
            return this.a(this.d, byteBuffer);
        }
        if (!this.d.hasRemaining()) {
            this.d.clear();
        }
        if (this.f.hasRemaining()) {
            this.k();
            int n2 = this.a(this.d, byteBuffer);
            if (n2 > 0) {
                return n2;
            }
        }
        return 0;
    }

    public boolean f() {
        return this.g.isConnected();
    }

    @Override
    public void close() {
        this.i.closeOutbound();
        this.i.getSession().invalidate();
        if (this.g.isOpen()) {
            this.g.write(this.b(a));
        }
        this.g.close();
        this.b.shutdownNow();
    }

    private boolean l() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.i.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    public SelectableChannel a(boolean bl2) {
        return this.g.configureBlocking(bl2);
    }

    public boolean a(SocketAddress socketAddress) {
        return this.g.connect(socketAddress);
    }

    public boolean g() {
        return this.g.finishConnect();
    }

    public Socket h() {
        return this.g.socket();
    }

    public boolean i() {
        return this.i.isInboundDone();
    }

    @Override
    public boolean isOpen() {
        return this.g.isOpen();
    }

    @Override
    public boolean a() {
        return this.e.hasRemaining() || !this.l();
    }

    @Override
    public void b() {
        this.write(this.e);
    }

    @Override
    public boolean c() {
        return this.d.hasRemaining() || this.f.hasRemaining() && this.j.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW && this.j.getStatus() != SSLEngineResult.Status.CLOSED;
    }

    @Override
    public int a(ByteBuffer byteBuffer) {
        return this.c(byteBuffer);
    }

    private int a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int n2;
        int n3 = byteBuffer.remaining();
        if (n3 > (n2 = byteBuffer2.remaining())) {
            int n4 = Math.min(n3, n2);
            for (int i2 = 0; i2 < n4; ++i2) {
                byteBuffer2.put(byteBuffer.get());
            }
            return n4;
        }
        byteBuffer2.put(byteBuffer);
        return n3;
    }

    @Override
    public boolean d() {
        return this.g.isBlocking();
    }
}

