/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.ar;
import com.tendcloud.tenddata.at;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.e;
import com.tendcloud.tenddata.f;
import com.tendcloud.tenddata.g;
import com.tendcloud.tenddata.l;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint(value={"Assert"})
public abstract class as
extends e
implements Runnable {
    public static int a = Runtime.getRuntime().availableProcessors();
    private final Collection c;
    private final InetSocketAddress d;
    private ServerSocketChannel e;
    private Selector f;
    private List g;
    private Thread h;
    private volatile AtomicBoolean i = new AtomicBoolean(false);
    private List j;
    private List k;
    private BlockingQueue l;
    private int m = 0;
    private AtomicInteger n = new AtomicInteger(0);
    private a o = new ar();

    public as() {
        this(new InetSocketAddress(80), a, null);
    }

    public as(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, a, null);
    }

    public as(InetSocketAddress inetSocketAddress, int n2) {
        this(inetSocketAddress, n2, null);
    }

    public as(InetSocketAddress inetSocketAddress, List list) {
        this(inetSocketAddress, a, list);
    }

    public as(InetSocketAddress inetSocketAddress, int n2, List list) {
        this(inetSocketAddress, n2, list, new HashSet());
    }

    public as(InetSocketAddress inetSocketAddress, int n2, List list, Collection collection) {
        if (inetSocketAddress == null || n2 < 1 || collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        this.g = list == null ? Collections.emptyList() : list;
        this.d = inetSocketAddress;
        this.c = collection;
        this.k = new LinkedList();
        this.j = new ArrayList(n2);
        this.l = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < n2; ++i2) {
            b b2 = new b();
            this.j.add(b2);
            b2.start();
        }
    }

    public void a() {
        if (this.h != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
        }
        new Thread(this).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void stop(int n2) {
        if (!this.i.compareAndSet(false, true)) {
            return;
        }
        ArrayList arrayList = null;
        Object object = this.c;
        synchronized (object) {
            arrayList = new ArrayList(this.c);
        }
        for (d d2 : arrayList) {
            d2.close(1001);
        }
        object = this;
        synchronized (object) {
            if (this.h != null) {
                if (Thread.currentThread() != this.h) {
                    // empty if block
                }
                if (this.h != Thread.currentThread()) {
                    if (arrayList.size() > 0) {
                        this.h.join(n2);
                    }
                    this.h.interrupt();
                    this.h.join();
                }
            }
        }
    }

    public void b() {
        this.stop(0);
    }

    public Collection c() {
        return this.c;
    }

    public InetSocketAddress d() {
        return this.d;
    }

    public int e() {
        int n2 = this.d().getPort();
        if (n2 == 0 && this.e != null) {
            n2 = this.e.socket().getLocalPort();
        }
        return n2;
    }

    public List f() {
        return Collections.unmodifiableList(this.g);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:371)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:449)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2869)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:817)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:129)
        // org.benf.cfr.reader.Main.main(Main.java:181)
        throw new IllegalStateException("Decompilation failed");
    }

    protected void d(d d2) {
        if (this.n.get() >= 2 * this.j.size() + 1) {
            return;
        }
        this.n.incrementAndGet();
        this.l.put(this.g());
    }

    protected void e(d d2) {
    }

    public ByteBuffer g() {
        return ByteBuffer.allocate(g.c);
    }

    private void a(g g2) {
        if (g2.j == null) {
            g2.j = (b)this.j.get(this.m % this.j.size());
            ++this.m;
        }
        g2.j.put(g2);
    }

    private ByteBuffer j() {
        return (ByteBuffer)this.l.take();
    }

    private void a(ByteBuffer byteBuffer) {
        if (this.l.size() > this.n.intValue()) {
            return;
        }
        this.l.put(byteBuffer);
    }

    private void a(SelectionKey selectionKey, d d2, IOException iOException) {
        SelectableChannel selectableChannel;
        if (d2 != null) {
            d2.b(1006, iOException.getMessage());
        } else if (selectionKey != null && (selectableChannel = selectionKey.channel()) != null && selectableChannel.isOpen()) {
            try {
                selectableChannel.close();
            }
            catch (IOException var5_5) {
                // empty catch block
            }
            if (g.d) {
                System.out.println("Connection closed because of" + iOException);
            }
        }
    }

    private void c(d d2, Exception exception) {
        this.b(d2, exception);
        try {
            this.b();
        }
        catch (IOException var3_3) {
            this.b(null, var3_3);
        }
        catch (InterruptedException var3_4) {
            Thread.currentThread().interrupt();
            this.b(null, var3_4);
        }
    }

    protected String h() {
        return "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"" + this.e() + "\" /></cross-domain-policy>";
    }

    @Override
    public final void a(d d2, String string) {
        this.b(d2, string);
    }

    @Deprecated
    @Override
    public void a(d d2, ad ad2) {
        this.d(d2, ad2);
    }

    @Override
    public final void a(d d2, ByteBuffer byteBuffer) {
        this.b(d2, byteBuffer);
    }

    @Override
    public final void a(d d2, al al2) {
        if (this.g(d2)) {
            this.b(d2, (af)al2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(d d2, int n2, String string, boolean bl2) {
        this.f.wakeup();
        try {
            if (this.f(d2)) {
                this.d(d2, n2, string, bl2);
            }
        }
        finally {
            try {
                this.e(d2);
            }
            catch (InterruptedException var5_5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected boolean f(d d2) {
        boolean bl2;
        Collection collection = this.c;
        synchronized (collection) {
            bl2 = this.c.remove(d2);
            assert (bl2);
        }
        if (this.i.get() && this.c.size() == 0) {
            this.h.interrupt();
        }
        return bl2;
    }

    @Override
    public ap a(d d2, l l2, af af2) {
        return super.a(d2, l2, af2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected boolean g(d d2) {
        if (!this.i.get()) {
            Collection collection = this.c;
            synchronized (collection) {
                boolean bl2 = this.c.add(d2);
                assert (bl2);
                return bl2;
            }
        }
        d2.close(1001);
        return true;
    }

    @Override
    public final void a(d d2, Exception exception) {
        this.b(d2, exception);
    }

    @Override
    public final void onWriteDemand(d d2) {
        g g2 = (g)d2;
        try {
            g2.f.interestOps(5);
        }
        catch (CancelledKeyException var3_3) {
            g2.h.clear();
        }
        this.f.wakeup();
    }

    @Override
    public void a(d d2, int n2, String string) {
        this.b(d2, n2, string);
    }

    @Override
    public void b(d d2, int n2, String string, boolean bl2) {
        this.c(d2, n2, string, bl2);
    }

    public void b(d d2, int n2, String string) {
    }

    public void c(d d2, int n2, String string, boolean bl2) {
    }

    public final void setWebSocketFactory(a a2) {
        this.o = a2;
    }

    public final f i() {
        return this.o;
    }

    protected boolean a(SelectionKey selectionKey) {
        return true;
    }

    private Socket h(d d2) {
        g g2 = (g)d2;
        return ((SocketChannel)g2.f.channel()).socket();
    }

    @Override
    public InetSocketAddress b(d d2) {
        return (InetSocketAddress)this.h(d2).getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress c(d d2) {
        return (InetSocketAddress)this.h(d2).getRemoteSocketAddress();
    }

    public abstract void b(d var1, af var2);

    public abstract void d(d var1, int var2, String var3, boolean var4);

    public abstract void b(d var1, String var2);

    public abstract void b(d var1, Exception var2);

    public void b(d d2, ByteBuffer byteBuffer) {
    }

    public void d(d d2, ad ad2) {
    }

    static /* synthetic */ void a(as as2, ByteBuffer byteBuffer) {
        as2.a(byteBuffer);
    }

    static /* synthetic */ void a(as as2, d d2, Exception exception) {
        as2.c(d2, exception);
    }

    public static interface a
    extends f {
        public g b(e var1, l var2, Socket var3);

        public g b(e var1, List var2, Socket var3);

        public ByteChannel a(SocketChannel var1, SelectionKey var2);
    }

    public class b
    extends Thread {
        private BlockingQueue c;

        public b() {
            this.c = new LinkedBlockingQueue();
            this.setName("WebSocketWorker-" + this.getId());
            this.setUncaughtExceptionHandler(new at(this, as.this));
        }

        public void put(g g2) {
            this.c.put(g2);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public void run() {
            var1_1 = null;
            try {
                do lbl-1000: // 3 sources:
                {
                    var2_2 = null;
                    var1_1 = (g)this.c.take();
                    var2_2 = (ByteBuffer)var1_1.i.poll();
                    if (!b.a && var2_2 == null) {
                        throw new AssertionError();
                    }
                    try {
                        var1_1.decode(var2_2);
                    }
                    finally {
                        as.a(as.this, var2_2);
                        continue;
                    }
                    break;
                } while (true);
            }
            catch (InterruptedException var2_3) {
                return;
            }
            catch (RuntimeException var2_4) {
                as.a(as.this, var1_1, var2_4);
            }
            ** GOTO lbl-1000
        }
    }

}

