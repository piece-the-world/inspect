/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.L;
import com.growingio.b.R;
import com.growingio.b.U;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.d;
import com.growingio.b.n;

public final class K
extends n {
    protected String b = null;

    K(as as2, com.growingio.b.o o2) {
        super(o2, as2);
    }

    public K(com.growingio.b.o o2, String string, com.growingio.b.o[] arro, com.growingio.b.o o3) {
        this(null, o3);
        Q q2 = o3.j().c();
        String string2 = T.a(o2, arro);
        this.a = new as(q2, string, string2);
        this.a(1025);
    }

    public K(K k2, com.growingio.b.o o2, d d2) throws b {
        this(null, o2);
        this.a(k2, false, d2);
    }

    public static K c(String string, com.growingio.b.o o2) throws b {
        return R.a(string, o2);
    }

    public static K a(as as2, com.growingio.b.o o2) throws b {
        if (o2.j().c() != as2.c()) {
            throw new b("bad declaring class");
        }
        return new K(as2, o2);
    }

    public int hashCode() {
        return this.o().hashCode();
    }

    @Override
    void t() {
        this.b = null;
    }

    final String o() {
        if (this.b == null) {
            this.b = this.a.a() + T.e(this.a.g());
        }
        return this.b;
    }

    public boolean equals(Object object) {
        return object != null && object instanceof K && ((K)object).o().equals(this.o());
    }

    @Override
    public String a() {
        return this.r_().s() + "." + this.q() + T.j(this.k());
    }

    @Override
    public String q() {
        return this.a.a();
    }

    public void h(String string) {
        this.d.p();
        this.a.a(string);
    }

    public com.growingio.b.o p() throws ae {
        return this.j();
    }

    @Override
    public boolean n() {
        y y2 = this.c().j();
        if (y2 == null) {
            return (this.d() & 1024) != 0;
        }
        B b2 = y2.k();
        try {
            return b2.e() && b2.c(b2.f()) == 177 && !b2.e();
        }
        catch (i var3_3) {
            return false;
        }
    }

    public void a(K k2, d d2) throws b {
        K.a(k2.d, k2.a, this.d, this.a, d2);
    }

    public void a(K k2, L l2) throws b {
        com.growingio.b.o o2;
        com.growingio.b.o[] arro;
        this.d.p();
        com.growingio.b.o o3 = this.r_();
        try {
            arro = this.i();
            o2 = this.p();
        }
        catch (ae var6_6) {
            throw new b(var6_6);
        }
        o o4 = U.a(o3, o3.j(), k2, arro, o2, l2);
        y y2 = o4.e();
        this.a.a(y2);
        this.a.a(this.a.f() & -1025);
    }
}

