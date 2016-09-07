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
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.ai;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.as;
import com.tendcloud.tenddata.aw;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.h;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.m;
import com.tendcloud.tenddata.n;
import com.tendcloud.tenddata.o;
import com.tendcloud.tenddata.p;
import com.tendcloud.tenddata.q;
import com.tendcloud.tenddata.r;
import com.tendcloud.tenddata.t;
import com.tendcloud.tenddata.x;
import com.tendcloud.tenddata.y;
import com.tendcloud.tenddata.z;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressLint(value={"Assert"})
public class g
implements d {
    public static int c = 16384;
    public static boolean d = false;
    public static final List e = new ArrayList(4);
    public SelectionKey f;
    public ByteChannel g;
    public final BlockingQueue h;
    public final BlockingQueue i;
    public volatile as.b j;
    private volatile boolean l = false;
    private d.a m = d.a.a;
    private final h n;
    private List o;
    private l p = null;
    private d.b q;
    private ad.a r = null;
    private ByteBuffer s = ByteBuffer.allocate(0);
    private af t = null;
    private String u = null;
    private Integer v = null;
    private Boolean w = null;
    private String x = null;

    public g(h h2, List list) {
        this(h2, (l)null);
        this.q = d.b.b;
        this.o = list == null || list.isEmpty() ? e : list;
    }

    public g(h h2, l l2) {
        if (h2 == null || l2 == null && this.q == d.b.b) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.h = new LinkedBlockingQueue();
        this.i = new LinkedBlockingQueue();
        this.n = h2;
        this.q = d.b.a;
        if (l2 != null) {
            this.p = l2.c();
        }
    }

    @Deprecated
    public g(h h2, l l2, Socket socket) {
        this(h2, l2);
    }

    @Deprecated
    public g(h h2, List list, Socket socket) {
        this(h2, list);
    }

    public void decode(ByteBuffer byteBuffer) {
        assert (byteBuffer.hasRemaining());
        if (d) {
            System.out.println("process(" + byteBuffer.remaining() + "): {" + (byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())) + "}");
        }
        if (this.m != d.a.a) {
            this.b(byteBuffer);
        } else if (this.a(byteBuffer)) {
            assert (this.s.hasRemaining() != byteBuffer.hasRemaining() || !byteBuffer.hasRemaining());
            if (byteBuffer.hasRemaining()) {
                this.b(byteBuffer);
            } else if (this.s.hasRemaining()) {
                this.b(this.s);
            }
        }
        assert (this.g() || this.h() || !byteBuffer.hasRemaining());
    }

    private boolean a(ByteBuffer byteBuffer) {
        block31 : {
            ByteBuffer byteBuffer2;
            Object object;
            if (this.s.capacity() == 0) {
                byteBuffer2 = byteBuffer;
            } else {
                if (this.s.remaining() < byteBuffer.remaining()) {
                    object = ByteBuffer.allocate(this.s.capacity() + byteBuffer.remaining());
                    this.s.flip();
                    object.put(this.s);
                    this.s = object;
                }
                this.s.put(byteBuffer);
                this.s.flip();
                byteBuffer2 = this.s;
            }
            byteBuffer2.mark();
            try {
                if (this.p == null && (object = this.c(byteBuffer2)) == l.b.a) {
                    try {
                        this.d(ByteBuffer.wrap(aw.a(this.n.a(this))));
                        this.a(-3, "");
                    }
                    catch (r var4_5) {
                        this.c(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
                    }
                    return false;
                }
                object = null;
                try {
                    if (this.q == d.b.b) {
                        if (this.p == null) {
                            Iterator iterator = this.o.iterator();
                            while (iterator.hasNext()) {
                                l l2 = (l)iterator.next();
                                l2 = l2.c();
                                try {
                                    ap ap2;
                                    l2.setParseMode(this.q);
                                    byteBuffer2.reset();
                                    al al2 = l2.d(byteBuffer2);
                                    if (!(al2 instanceof af)) {
                                        this.b(1002, "wrong http function", false);
                                        return false;
                                    }
                                    af af2 = (af)al2;
                                    object = l2.a(af2);
                                    if (object != l.b.a) continue;
                                    this.x = af2.a();
                                    try {
                                        ap2 = this.n.a((d)this, l2, af2);
                                    }
                                    catch (r var9_20) {
                                        this.b(var9_20.a(), var9_20.getMessage(), false);
                                        return false;
                                    }
                                    catch (RuntimeException var9_21) {
                                        this.n.a((d)this, var9_21);
                                        this.b(-1, var9_21.getMessage(), false);
                                        return false;
                                    }
                                    this.a(l2.a(l2.a(af2, ap2), this.q));
                                    this.p = l2;
                                    this.a(af2);
                                    return true;
                                }
                                catch (t var6_15) {
                                    continue;
                                }
                            }
                            if (this.p == null) {
                                this.a(1002, "no draft matches");
                            }
                            return false;
                        }
                        al al3 = this.p.d(byteBuffer2);
                        if (!(al3 instanceof af)) {
                            this.b(1002, "wrong http function", false);
                            return false;
                        }
                        af af3 = (af)al3;
                        object = this.p.a(af3);
                        if (object == l.b.a) {
                            this.a(af3);
                            return true;
                        }
                        this.a(1002, "the handshake did finaly not match");
                        return false;
                    }
                    if (this.q != d.b.a) break block31;
                    this.p.setParseMode(this.q);
                    al al4 = this.p.d(byteBuffer2);
                    if (!(al4 instanceof an)) {
                        this.b(1002, "wrong http function", false);
                        return false;
                    }
                    an an2 = (an)al4;
                    object = this.p.a(this.t, an2);
                    if (object == l.b.a) {
                        try {
                            this.n.a((d)this, this.t, an2);
                        }
                        catch (r var6_16) {
                            this.b(var6_16.a(), var6_16.getMessage(), false);
                            return false;
                        }
                        catch (RuntimeException var6_17) {
                            this.n.a((d)this, var6_17);
                            this.b(-1, var6_17.getMessage(), false);
                            return false;
                        }
                        this.a(an2);
                        return true;
                    }
                    this.a(1002, "draft " + this.p + " refuses handshake");
                }
                catch (t var4_9) {
                    this.close(var4_9);
                }
            }
            catch (q var3_4) {
                if (this.s.capacity() == 0) {
                    byteBuffer2.reset();
                    int n2 = var3_4.a();
                    if (n2 == 0) {
                        n2 = byteBuffer2.capacity() + 16;
                    } else assert (var3_4.a() >= byteBuffer2.remaining());
                    this.s = ByteBuffer.allocate(n2);
                    this.s.put(byteBuffer);
                }
                this.s.position(this.s.limit());
                this.s.limit(this.s.capacity());
            }
        }
        return false;
    }

    private void b(ByteBuffer byteBuffer) {
        try {
            List list = this.p.c(byteBuffer);
            for (ad ad2 : list) {
                if (d) {
                    System.out.println("matched frame: " + ad2);
                }
                ad.a a2 = ad2.f();
                boolean bl2 = ad2.d();
                if (a2 == ad.a.f) {
                    int n2 = 1005;
                    String string = "";
                    if (ad2 instanceof y) {
                        y y2 = (y)ad2;
                        n2 = y2.a();
                        string = y2.b();
                    }
                    if (this.m == d.a.d) {
                        this.a(n2, string, true);
                        continue;
                    }
                    if (this.p.b() == l.a.c) {
                        this.c(n2, string, true);
                        continue;
                    }
                    this.b(n2, string, false);
                    continue;
                }
                if (a2 == ad.a.d) {
                    this.n.b(this, ad2);
                    continue;
                }
                if (a2 == ad.a.e) {
                    this.n.c(this, ad2);
                    continue;
                }
                if (!bl2 || a2 == ad.a.a) {
                    if (a2 != ad.a.a) {
                        if (this.r != null) {
                            throw new r(1002, "Previous continuous frame sequence not completed.");
                        }
                        this.r = a2;
                    } else if (bl2) {
                        if (this.r == null) {
                            throw new r(1002, "Continuous frame sequence was not started.");
                        }
                        this.r = null;
                    } else if (this.r == null) {
                        throw new r(1002, "Continuous frame sequence was not started.");
                    }
                    try {
                        this.n.a((d)this, ad2);
                    }
                    catch (RuntimeException var7_9) {
                        this.n.a((d)this, var7_9);
                    }
                    continue;
                }
                if (this.r != null) {
                    throw new r(1002, "Continuous frame sequence not completed.");
                }
                if (a2 == ad.a.b) {
                    try {
                        this.n.a((d)this, aw.a(ad2.c()));
                    }
                    catch (RuntimeException var7_10) {
                        this.n.a((d)this, var7_10);
                    }
                    continue;
                }
                if (a2 == ad.a.c) {
                    try {
                        this.n.a((d)this, ad2.c());
                    }
                    catch (RuntimeException var7_11) {
                        this.n.a((d)this, var7_11);
                    }
                    continue;
                }
                throw new r(1002, "non control or continious frame expected");
            }
        }
        catch (r var3_4) {
            this.n.a((d)this, var3_4);
            this.close(var3_4);
            return;
        }
    }

    private void c(int n2, String string, boolean bl2) {
        if (this.m != d.a.d && this.m != d.a.e) {
            if (this.m == d.a.c) {
                if (n2 == 1006) {
                    assert (!bl2);
                    this.m = d.a.d;
                    this.b(n2, string, false);
                    return;
                }
                if (this.p.b() != l.a.a) {
                    try {
                        if (!bl2) {
                            try {
                                this.n.a((d)this, n2, string);
                            }
                            catch (RuntimeException var4_4) {
                                this.n.a((d)this, var4_4);
                            }
                        }
                        this.sendFrame(new z(n2, string));
                    }
                    catch (r var4_5) {
                        this.n.a((d)this, var4_5);
                        this.b(1006, "generated frame is invalid", false);
                    }
                }
                this.b(n2, string, bl2);
            } else if (n2 == -3) {
                assert (bl2);
                this.b(-3, string, true);
            } else {
                this.b(-1, string, false);
            }
            if (n2 == 1002) {
                this.b(n2, string, bl2);
            }
            this.m = d.a.d;
            this.s = null;
            return;
        }
    }

    @Override
    public void a(int n2, String string) {
        this.c(n2, string, false);
    }

    protected synchronized void a(int n2, String string, boolean bl2) {
        if (this.m == d.a.e) {
            return;
        }
        if (this.f != null) {
            this.f.cancel();
        }
        if (this.g != null) {
            try {
                this.g.close();
            }
            catch (IOException var4_4) {
                this.n.a((d)this, var4_4);
            }
        }
        try {
            this.n.a(this, n2, string, bl2);
        }
        catch (RuntimeException var4_5) {
            this.n.a((d)this, var4_5);
        }
        if (this.p != null) {
            this.p.a();
        }
        this.t = null;
        this.m = d.a.e;
        this.h.clear();
    }

    protected void a(int n2, boolean bl2) {
        this.a(n2, "", bl2);
    }

    public void m() {
        if (this.w == null) {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        }
        this.a(this.v, this.u, (boolean)this.w);
    }

    @Override
    public void b(int n2, String string) {
        this.a(n2, string, false);
    }

    protected synchronized void b(int n2, String string, boolean bl2) {
        if (this.l) {
            return;
        }
        this.v = n2;
        this.u = string;
        this.w = bl2;
        this.l = true;
        this.n.onWriteDemand(this);
        try {
            this.n.b(this, n2, string, bl2);
        }
        catch (RuntimeException var4_4) {
            this.n.a((d)this, var4_4);
        }
        if (this.p != null) {
            this.p.a();
        }
        this.t = null;
    }

    public void n() {
        if (this.k() == d.a.a) {
            this.a(-1, true);
        } else if (this.l) {
            this.a(this.v, this.u, (boolean)this.w);
        } else if (this.p.b() == l.a.a) {
            this.a(1000, true);
        } else if (this.p.b() == l.a.b) {
            if (this.q == d.b.b) {
                this.a(1006, true);
            } else {
                this.a(1000, true);
            }
        } else {
            this.a(1006, true);
        }
    }

    @Override
    public void close(int n2) {
        this.c(n2, "", false);
    }

    public void close(r r2) {
        this.c(r2.a(), r2.getMessage(), false);
    }

    @Override
    public void send(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.a((Collection)this.p.a(string, this.q == d.b.a));
    }

    @Override
    public void send(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.a((Collection)this.p.a(byteBuffer, this.q == d.b.a));
    }

    @Override
    public void send(byte[] arrby) {
        this.send(ByteBuffer.wrap(arrby));
    }

    private void a(Collection collection) {
        if (!this.f()) {
            throw new x();
        }
        for (ad ad2 : collection) {
            this.sendFrame(ad2);
        }
    }

    @Override
    public void a(ad.a a2, ByteBuffer byteBuffer, boolean bl2) {
        this.a((Collection)this.p.a(a2, byteBuffer, bl2));
    }

    @Override
    public void sendFrame(ad ad2) {
        if (d) {
            System.out.println("send frame: " + ad2);
        }
        this.d(this.p.a(ad2));
    }

    @Override
    public boolean b() {
        return !this.h.isEmpty();
    }

    private l.b c(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        if (byteBuffer.limit() > l.c.length) {
            return l.b.b;
        }
        if (byteBuffer.limit() < l.c.length) {
            throw new q(l.c.length);
        }
        int n2 = 0;
        while (byteBuffer.hasRemaining()) {
            if (l.c[n2] != byteBuffer.get()) {
                byteBuffer.reset();
                return l.b.b;
            }
            ++n2;
        }
        return l.b.a;
    }

    public void startHandshake(ah ah2) {
        assert (this.m != d.a.b);
        this.t = this.p.a(ah2);
        this.x = ah2.a();
        assert (this.x != null);
        try {
            this.n.a((d)this, this.t);
        }
        catch (r var2_2) {
            throw new t("Handshake data rejected by client.");
        }
        catch (RuntimeException var2_3) {
            this.n.a((d)this, var2_3);
            throw new t("rejected because of" + var2_3);
        }
        this.a(this.p.a((al)this.t, this.q));
    }

    private void d(ByteBuffer byteBuffer) {
        if (d) {
            System.out.println("write(" + byteBuffer.remaining() + "): {" + (byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array())) + "}");
        }
        this.h.add(byteBuffer);
        this.n.onWriteDemand(this);
    }

    private void a(List list) {
        for (ByteBuffer byteBuffer : list) {
            this.d(byteBuffer);
        }
    }

    private void a(al al2) {
        if (d) {
            System.out.println("open using draft: " + this.p.getClass().getSimpleName());
        }
        this.m = d.a.c;
        try {
            this.n.a((d)this, al2);
        }
        catch (RuntimeException var2_2) {
            this.n.a((d)this, var2_2);
        }
    }

    @Override
    public boolean e() {
        assert (!this.l || this.m == d.a.b);
        return this.m == d.a.b;
    }

    @Override
    public boolean f() {
        assert (this.m != d.a.c || !this.l);
        return this.m == d.a.c;
    }

    @Override
    public boolean g() {
        return this.m == d.a.d;
    }

    @Override
    public boolean h() {
        return this.l;
    }

    @Override
    public boolean i() {
        return this.m == d.a.e;
    }

    @Override
    public d.a k() {
        return this.m;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public InetSocketAddress c() {
        return this.n.c(this);
    }

    @Override
    public InetSocketAddress d() {
        return this.n.b(this);
    }

    @Override
    public l j() {
        return this.p;
    }

    @Override
    public void a() {
        this.close(1000);
    }

    @Override
    public String l() {
        return this.x;
    }

    static {
        e.add(new n());
        e.add(new m());
        e.add(new p());
        e.add(new o());
    }
}

