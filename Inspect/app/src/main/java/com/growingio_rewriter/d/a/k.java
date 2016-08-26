/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.b;
import com.growingio.d.a.c;
import com.growingio.d.a.d;
import com.growingio.d.a.g;
import com.growingio.d.a.j;
import com.growingio.d.a.o;
import com.growingio.d.a.v;

final class k
extends j {
    private final g c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private b i;
    private b j;
    private b k;
    private b l;
    private c m;

    k(g g2, int n2, String string, String string2, String string3, Object object) {
        super(327680);
        if (g2.ag == null) {
            g2.ag = this;
        } else {
            g2.ah.b = this;
        }
        g2.ah = this;
        this.c = g2;
        this.d = n2;
        this.e = g2.a(string);
        this.f = g2.a(string2);
        if (string3 != null) {
            this.g = g2.a(string3);
        }
        if (object != null) {
            this.h = g2.a((Object)object).a;
        }
    }

    @Override
    public a a(String string, boolean bl2) {
        d d2 = new d();
        d2.b(this.c.a(string)).b(0);
        b b2 = new b(this.c, true, d2, d2, 2);
        if (bl2) {
            b2.a = this.i;
            this.i = b2;
        } else {
            b2.a = this.j;
            this.j = b2;
        }
        return b2;
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        d d2 = new d();
        b.a(n2, v2, d2);
        d2.b(this.c.a(string)).b(0);
        b b2 = new b(this.c, true, d2, d2, d2.b - 2);
        if (bl2) {
            b2.a = this.k;
            this.k = b2;
        } else {
            b2.a = this.l;
            this.l = b2;
        }
        return b2;
    }

    @Override
    public void a(c c2) {
        c2.c = this.m;
        this.m = c2;
    }

    @Override
    public void a() {
    }

    int b() {
        int n2 = 8;
        if (this.h != 0) {
            this.c.a("ConstantValue");
            n2 += 8;
        }
        if ((this.d & 4096) != 0 && ((this.c.T & 65535) < 49 || (this.d & 262144) != 0)) {
            this.c.a("Synthetic");
            n2 += 6;
        }
        if ((this.d & 131072) != 0) {
            this.c.a("Deprecated");
            n2 += 6;
        }
        if (this.g != 0) {
            this.c.a("Signature");
            n2 += 8;
        }
        if (this.i != null) {
            this.c.a("RuntimeVisibleAnnotations");
            n2 += 8 + this.i.b();
        }
        if (this.j != null) {
            this.c.a("RuntimeInvisibleAnnotations");
            n2 += 8 + this.j.b();
        }
        if (this.k != null) {
            this.c.a("RuntimeVisibleTypeAnnotations");
            n2 += 8 + this.k.b();
        }
        if (this.l != null) {
            this.c.a("RuntimeInvisibleTypeAnnotations");
            n2 += 8 + this.l.b();
        }
        if (this.m != null) {
            n2 += this.m.b(this.c, null, 0, -1, -1);
        }
        return n2;
    }

    void a(d d2) {
        int n2 = 64;
        int n3 = 393216 | (this.d & 262144) / 64;
        d2.b(this.d & ~ n3).b(this.e).b(this.f);
        int n4 = 0;
        if (this.h != 0) {
            ++n4;
        }
        if ((this.d & 4096) != 0 && ((this.c.T & 65535) < 49 || (this.d & 262144) != 0)) {
            ++n4;
        }
        if ((this.d & 131072) != 0) {
            ++n4;
        }
        if (this.g != 0) {
            ++n4;
        }
        if (this.i != null) {
            ++n4;
        }
        if (this.j != null) {
            ++n4;
        }
        if (this.k != null) {
            ++n4;
        }
        if (this.l != null) {
            ++n4;
        }
        if (this.m != null) {
            n4 += this.m.d();
        }
        d2.b(n4);
        if (this.h != 0) {
            d2.b(this.c.a("ConstantValue"));
            d2.c(2).b(this.h);
        }
        if ((this.d & 4096) != 0 && ((this.c.T & 65535) < 49 || (this.d & 262144) != 0)) {
            d2.b(this.c.a("Synthetic")).c(0);
        }
        if ((this.d & 131072) != 0) {
            d2.b(this.c.a("Deprecated")).c(0);
        }
        if (this.g != 0) {
            d2.b(this.c.a("Signature"));
            d2.c(2).b(this.g);
        }
        if (this.i != null) {
            d2.b(this.c.a("RuntimeVisibleAnnotations"));
            this.i.a(d2);
        }
        if (this.j != null) {
            d2.b(this.c.a("RuntimeInvisibleAnnotations"));
            this.j.a(d2);
        }
        if (this.k != null) {
            d2.b(this.c.a("RuntimeVisibleTypeAnnotations"));
            this.k.a(d2);
        }
        if (this.l != null) {
            d2.b(this.c.a("RuntimeInvisibleTypeAnnotations"));
            this.l.a(d2);
        }
        if (this.m != null) {
            this.m.a(this.c, null, 0, -1, -1, d2);
        }
    }
}

