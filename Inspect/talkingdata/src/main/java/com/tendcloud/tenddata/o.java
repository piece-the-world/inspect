/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.ae;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.ai;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.aw;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.r;
import com.tendcloud.tenddata.s;
import com.tendcloud.tenddata.w;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class o
extends l {
    public static final byte f = 13;
    public static final byte g = 10;
    public static final byte h = 0;
    public static final byte i = -1;
    protected boolean j = false;
    protected List k = new LinkedList();
    protected ByteBuffer l;
    private final Random m = new Random();

    @Override
    public l.b a(af af2, an an2) {
        return af2.a("WebSocket-Origin").equals(an2.a("Origin")) && this.a(an2) ? l.b.a : l.b.b;
    }

    @Override
    public l.b a(af af2) {
        if (af2.b("Origin") && this.a((al)af2)) {
            return l.b.a;
        }
        return l.b.b;
    }

    @Override
    public ByteBuffer a(ad ad2) {
        if (ad2.f() != ad.a.b) {
            throw new RuntimeException("only text frames supported");
        }
        ByteBuffer byteBuffer = ad2.c();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining() + 2);
        byteBuffer2.put(0);
        byteBuffer.mark();
        byteBuffer2.put(byteBuffer);
        byteBuffer.reset();
        byteBuffer2.put(-1);
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override
    public List a(ByteBuffer byteBuffer, boolean bl2) {
        throw new RuntimeException("not yet implemented");
    }

    @Override
    public List a(String string, boolean bl2) {
        ae ae2 = new ae();
        try {
            ae2.setPayload(ByteBuffer.wrap(aw.a(string)));
        }
        catch (r var4_4) {
            throw new w(var4_4);
        }
        ae2.setFin(true);
        ae2.setOptcode(ad.a.b);
        ae2.setTransferemasked(bl2);
        return Collections.singletonList(ae2);
    }

    @Override
    public ah a(ah ah2) {
        ah2.a("Upgrade", "WebSocket");
        ah2.a("Connection", "Upgrade");
        if (!ah2.b("Origin")) {
            ah2.a("Origin", "random" + this.m.nextInt());
        }
        return ah2;
    }

    @Override
    public ai a(af af2, ap ap2) {
        ap2.setHttpStatusMessage("Web Socket Protocol Handshake");
        ap2.a("Upgrade", "WebSocket");
        ap2.a("Connection", af2.a("Connection"));
        ap2.a("WebSocket-Origin", af2.a("Origin"));
        String string = "ws://" + af2.a("Host") + af2.a();
        ap2.a("WebSocket-Location", string);
        return ap2;
    }

    protected List e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            byte by2 = byteBuffer.get();
            if (by2 == 0) {
                if (this.j) {
                    throw new s("unexpected START_OF_FRAME");
                }
                this.j = true;
                continue;
            }
            if (by2 == -1) {
                if (!this.j) {
                    throw new s("unexpected END_OF_FRAME");
                }
                if (this.l != null) {
                    this.l.flip();
                    ae ae2 = new ae();
                    ae2.setPayload(this.l);
                    ae2.setFin(true);
                    ae2.setOptcode(ad.a.b);
                    this.k.add(ae2);
                    this.l = null;
                    byteBuffer.mark();
                }
                this.j = false;
                continue;
            }
            if (this.j) {
                if (this.l == null) {
                    this.l = this.e();
                } else if (!this.l.hasRemaining()) {
                    this.l = this.f(this.l);
                }
                this.l.put(by2);
                continue;
            }
            return null;
        }
        List list = this.k;
        this.k = new LinkedList();
        return list;
    }

    @Override
    public List c(ByteBuffer byteBuffer) {
        List list = this.e(byteBuffer);
        if (list == null) {
            throw new r(1002);
        }
        return list;
    }

    @Override
    public void a() {
        this.j = false;
        this.l = null;
    }

    @Override
    public l.a b() {
        return l.a.a;
    }

    public ByteBuffer e() {
        return ByteBuffer.allocate(b);
    }

    public ByteBuffer f(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(this.a(byteBuffer.capacity() * 2));
        byteBuffer2.put(byteBuffer);
        return byteBuffer2;
    }

    @Override
    public l c() {
        return new o();
    }
}

