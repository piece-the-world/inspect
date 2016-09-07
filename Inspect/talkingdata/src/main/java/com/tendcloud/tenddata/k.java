/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.aj;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.e;
import com.tendcloud.tenddata.g;
import com.tendcloud.tenddata.h;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

@SuppressLint(value={"Assert"})
public abstract class k
extends e
implements d,
Runnable {
    protected URI c = null;
    private g e = null;
    private Socket f = null;
    private InputStream g;
    private OutputStream h;
    private Proxy i = Proxy.NO_PROXY;
    private Thread j;
    private l k;
    private Map l;
    private CountDownLatch m = new CountDownLatch(1);
    private CountDownLatch n = new CountDownLatch(1);
    private int o = 0;

    public k(URI uRI) {
        this(uRI, new n());
    }

    public k(URI uRI, l l2) {
        this(uRI, l2, null, 0);
    }

    public k(URI uRI, l l2, Map map, int n2) {
        if (uRI == null) {
            throw new IllegalArgumentException();
        }
        if (l2 == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.c = uRI;
        this.k = l2;
        this.l = map;
        this.o = n2;
        this.e = new g((h)this, l2);
    }

    public URI m() {
        return this.c;
    }

    @Override
    public l j() {
        return this.k;
    }

    public void n() {
        if (this.j != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        this.j = new Thread(this);
        this.j.start();
    }

    public boolean o() {
        this.n();
        this.m.await();
        return this.e.f();
    }

    @Override
    public void a() {
        if (this.j != null) {
            this.e.close(1000);
        }
    }

    public void p() {
        this.a();
        this.n.await();
    }

    @Override
    public void send(String string) {
        this.e.send(string);
    }

    @Override
    public void send(byte[] arrby) {
        this.e.send(arrby);
    }

    @Override
    public void run() {
        cc.c.put(Thread.currentThread().getId(), this.m().getHost());
        try {
            if (this.f == null) {
                this.f = new Socket(this.i);
            } else if (this.f.isClosed()) {
                throw new IOException();
            }
            if (!this.f.isBound()) {
                this.f.connect(new InetSocketAddress(this.c.getHost(), this.r()), this.o);
            }
            this.g = this.f.getInputStream();
            this.h = this.f.getOutputStream();
            this.s();
        }
        catch (Exception var1_1) {
            this.a((d)this.e, var1_1);
            this.e.b(-1, var1_1.getMessage());
            return;
        }
        this.j = new Thread(new a());
        this.j.start();
        byte[] arrby = new byte[g.c];
        try {
            int n2;
            while (!this.i() && (n2 = this.g.read(arrby)) != -1) {
                this.e.decode(ByteBuffer.wrap(arrby, 0, n2));
            }
            this.e.n();
        }
        catch (IOException var3_4) {
            this.e.n();
        }
        catch (RuntimeException var3_5) {
            this.onError(var3_5);
            this.e.b(1006, var3_5.getMessage());
        }
        assert (this.f.isClosed());
    }

    private int r() {
        int n2 = this.c.getPort();
        if (n2 == -1) {
            String string = this.c.getScheme();
            if (string.equals("wss")) {
                return 443;
            }
            if (string.equals("ws")) {
                return 80;
            }
            throw new RuntimeException("unkonow scheme" + string);
        }
        return n2;
    }

    private void s() {
        int n2;
        String string = this.c.getPath();
        String string2 = this.c.getQuery();
        String string3 = string == null || string.length() == 0 ? "/" : string;
        if (string2 != null) {
            string3 = string3 + "?" + string2;
        }
        String string4 = this.c.getHost() + ((n2 = this.r()) != 80 ? new StringBuilder().append(":").append(n2).toString() : "");
        aj aj2 = new aj();
        aj2.setResourceDescriptor(string3);
        aj2.a("Host", string4);
        if (this.l != null) {
            for (Map.Entry entry : this.l.entrySet()) {
                aj2.a((String)entry.getKey(), (String)entry.getValue());
            }
        }
        this.e.startHandshake(aj2);
    }

    @Override
    public d.a k() {
        return this.e.k();
    }

    @Override
    public final void a(d d2, String string) {
        this.onMessage(string);
    }

    @Override
    public final void a(d d2, ByteBuffer byteBuffer) {
        this.onMessage(byteBuffer);
    }

    @Override
    public void a(d d2, ad ad2) {
        this.onFragment(ad2);
    }

    @Override
    public final void a(d d2, al al2) {
        this.m.countDown();
        this.onOpen((an)al2);
    }

    @Override
    public final void a(d d2, int n2, String string, boolean bl2) {
        this.m.countDown();
        this.n.countDown();
        if (this.j != null) {
            this.j.interrupt();
        }
        try {
            if (this.f != null) {
                this.f.close();
            }
        }
        catch (IOException var5_5) {
            this.a((d)this, var5_5);
        }
        this.b(n2, string, bl2);
    }

    @Override
    public final void a(d d2, Exception exception) {
        this.onError(exception);
    }

    @Override
    public final void onWriteDemand(d d2) {
    }

    @Override
    public void a(d d2, int n2, String string) {
        this.c(n2, string);
    }

    @Override
    public void b(d d2, int n2, String string, boolean bl2) {
        this.a(n2, string, bl2);
    }

    public void c(int n2, String string) {
    }

    public void a(int n2, String string, boolean bl2) {
    }

    public d q() {
        return this.e;
    }

    @Override
    public InetSocketAddress b(d d2) {
        if (this.f != null) {
            return (InetSocketAddress)this.f.getLocalSocketAddress();
        }
        return null;
    }

    @Override
    public InetSocketAddress c(d d2) {
        if (this.f != null) {
            return (InetSocketAddress)this.f.getRemoteSocketAddress();
        }
        return null;
    }

    public abstract void onOpen(an var1);

    public abstract void onMessage(String var1);

    public abstract void b(int var1, String var2, boolean var3);

    public abstract void onError(Exception var1);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public void onFragment(ad ad2) {
    }

    public void setProxy(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.i = proxy;
    }

    public void setSocket(Socket socket) {
        if (this.f != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.f = socket;
    }

    @Override
    public void a(ad.a a2, ByteBuffer byteBuffer, boolean bl2) {
        this.e.a(a2, byteBuffer, bl2);
    }

    @Override
    public boolean f() {
        return this.e.f();
    }

    @Override
    public boolean h() {
        return this.e.h();
    }

    @Override
    public boolean i() {
        return this.e.i();
    }

    @Override
    public boolean g() {
        return this.e.g();
    }

    @Override
    public boolean e() {
        return this.e.e();
    }

    @Override
    public boolean b() {
        return this.e.b();
    }

    @Override
    public void close(int n2) {
        this.e.a();
    }

    @Override
    public void a(int n2, String string) {
        this.e.a(n2, string);
    }

    @Override
    public void b(int n2, String string) {
        this.e.b(n2, string);
    }

    @Override
    public void send(ByteBuffer byteBuffer) {
        this.e.send(byteBuffer);
    }

    @Override
    public void sendFrame(ad ad2) {
        this.e.sendFrame(ad2);
    }

    @Override
    public InetSocketAddress d() {
        return this.e.d();
    }

    @Override
    public InetSocketAddress c() {
        return this.e.c();
    }

    @Override
    public String l() {
        return this.c.getPath();
    }

    class a
    implements Runnable {
        private a() {
        }

        @Override
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            try {
                while (!Thread.interrupted()) {
                    ByteBuffer byteBuffer = (ByteBuffer)k.a((k)k.this).h.take();
                    k.this.h.write(byteBuffer.array(), 0, byteBuffer.limit());
                    k.this.h.flush();
                }
            }
            catch (IOException var1_2) {
                k.this.e.n();
            }
            catch (InterruptedException var1_3) {
                // empty catch block
            }
        }
    }

}

