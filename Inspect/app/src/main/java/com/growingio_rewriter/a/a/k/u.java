/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.A;
import com.growingio.a.a.k.B;
import com.growingio.a.a.k.h;
import com.growingio.a.a.k.t;
import com.growingio.a.a.m.i;

public final class u {
    private final B a = new B();
    private final B b = new B();
    private double c = 0.0;

    public void a(double d2, double d3) {
        this.a.a(d2);
        if (i.b(d2) && i.b(d3)) {
            if (this.a.b() > 1) {
                this.c += (d2 - this.a.c()) * (d3 - this.b.c());
            }
        } else {
            this.c = Double.NaN;
        }
        this.b.a(d3);
    }

    public void a(t t2) {
        if (t2.a() == 0) {
            return;
        }
        this.a.a(t2.b());
        this.c = this.b.b() == 0 ? t2.h() : (this.c += t2.h() + (t2.b().b() - this.a.c()) * (t2.c().b() - this.b.c()) * (double)t2.a());
        this.b.a(t2.c());
    }

    public t a() {
        return new t(this.a.a(), this.b.a(), this.c);
    }

    public long b() {
        return this.a.b();
    }

    public A c() {
        return this.a.a();
    }

    public A d() {
        return this.b.a();
    }

    public double e() {
        aU.b(this.b() != 0);
        return this.c / (double)this.b();
    }

    public final double f() {
        aU.b(this.b() > 1);
        return this.c / (double)(this.b() - 1);
    }

    public final double g() {
        aU.b(this.b() > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        double d2 = this.a.k();
        double d3 = this.b.k();
        aU.b(d2 > 0.0);
        aU.b(d3 > 0.0);
        double d4 = this.a(d2 * d3);
        return u.b(this.c / Math.sqrt(d4));
    }

    public final h h() {
        aU.b(this.b() > 1);
        if (Double.isNaN(this.c)) {
            return h.a();
        }
        double d2 = this.a.k();
        if (d2 > 0.0) {
            if (this.b.k() > 0.0) {
                return h.a(this.a.c(), this.b.c()).a(this.c / d2);
            }
            return h.b(this.b.c());
        }
        aU.b(this.b.k() > 0.0);
        return h.a(this.a.c());
    }

    private double a(double d2) {
        if (d2 > 0.0) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    private static double b(double d2) {
        if (d2 >= 1.0) {
            return 1.0;
        }
        if (d2 <= -1.0) {
            return -1.0;
        }
        return d2;
    }
}

