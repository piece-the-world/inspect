/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.e.i;
import com.growingio.d.a.e.l;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.v;

public final class o
extends r {
    public final i a;

    public o(i i2) {
        this(null, i2);
    }

    public o(r r2, i i2) {
        super(327680, r2);
        this.a = i2;
    }

    @Override
    public void a(String string, int n2) {
        this.a.a(string, n2);
        super.a(string, n2);
    }

    @Override
    public a a(String string, boolean bl2) {
        i i2 = this.a.e(string, bl2);
        a a2 = this.n_ == null ? null : this.n_.a(string, bl2);
        return new l(a2, i2);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        i i2 = this.a.i(n2, v2, string, bl2);
        a a2 = this.n_ == null ? null : this.n_.a(n2, v2, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void a(c c2) {
        this.a.c(c2);
        super.a(c2);
    }

    @Override
    public a c() {
        i i2 = this.a.g();
        a a2 = this.n_ == null ? null : this.n_.c();
        return new l(a2, i2);
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        i i2 = this.a.b(n2, string, bl2);
        a a2 = this.n_ == null ? null : this.n_.a(n2, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void a_() {
        this.a.e();
        super.a_();
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        this.a.a(n2, n3, arrobject, n4, arrobject2);
        super.a(n2, n3, arrobject, n4, arrobject2);
    }

    @Override
    public void a_(int n2) {
        this.a.a(n2);
        super.a_(n2);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.a(n2, n3);
        super.a(n2, n3);
    }

    @Override
    public void b(int n2, int n3) {
        this.a.b(n2, n3);
        super.b(n2, n3);
    }

    @Override
    public void a(int n2, String string) {
        this.a.a(n2, string);
        super.a(n2, string);
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.a.a(n2, string, string2, string3);
        super.b(n2, string, string2, string3);
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        if (this.m_ >= 327680) {
            super.a(n2, string, string2, string3);
            return;
        }
        this.a.b(n2, string, string2, string3);
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3);
        }
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.m_ < 327680) {
            super.a(n2, string, string2, string3, bl2);
            return;
        }
        this.a.a(n2, string, string2, string3, bl2);
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3, bl2);
        }
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.a.a(string, string2, m2, arrobject);
        super.a(string, string2, m2, arrobject);
    }

    @Override
    public void a(int n2, p p2) {
        this.a.a(n2, p2);
        super.a(n2, p2);
    }

    @Override
    public void a(p p2) {
        this.a.a(p2);
        super.a(p2);
    }

    @Override
    public void a(Object object) {
        this.a.a(object);
        super.a(object);
    }

    @Override
    public void c(int n2, int n3) {
        this.a.c(n2, n3);
        super.c(n2, n3);
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        this.a.a(n2, n3, p2, arrp);
        super.a(n2, n3, p2, arrp);
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        this.a.a(p2, arrn, arrp);
        super.a(p2, arrn, arrp);
    }

    @Override
    public void b(String string, int n2) {
        this.a.b(string, n2);
        super.b(string, n2);
    }

    @Override
    public a b(int n2, v v2, String string, boolean bl2) {
        i i2 = this.a.h(n2, v2, string, bl2);
        a a2 = this.n_ == null ? null : this.n_.b(n2, v2, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        this.a.a(p2, p3, p4, string);
        super.a(p2, p3, p4, string);
    }

    @Override
    public a c(int n2, v v2, String string, boolean bl2) {
        i i2 = this.a.g(n2, v2, string, bl2);
        a a2 = this.n_ == null ? null : this.n_.c(n2, v2, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        this.a.a(string, string2, string3, p2, p3, n2);
        super.a(string, string2, string3, p2, p3, n2);
    }

    @Override
    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        i i2 = this.a.a(n2, v2, arrp, arrp2, arrn, string, bl2);
        a a2 = this.n_ == null ? null : this.n_.a(n2, v2, arrp, arrp2, arrn, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void b(int n2, p p2) {
        this.a.b(n2, p2);
        super.b(n2, p2);
    }

    @Override
    public void d(int n2, int n3) {
        this.a.d(n2, n3);
        super.d(n2, n3);
    }

    @Override
    public void b() {
        this.a.f();
        super.b();
    }
}

