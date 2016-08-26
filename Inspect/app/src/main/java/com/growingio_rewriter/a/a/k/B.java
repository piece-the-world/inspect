/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.A;
import com.growingio.a.a.k.e;
import com.growingio.a.a.m.i;
import java.util.Iterator;

public final class B {
    private long a = 0;
    private double b = 0.0;
    private double c = 0.0;
    private double d = Double.NaN;
    private double e = Double.NaN;

    public void a(double d2) {
        if (this.a == 0) {
            this.a = 1;
            this.b = d2;
            this.d = d2;
            this.e = d2;
            if (!i.b(d2)) {
                this.c = Double.NaN;
            }
        } else {
            ++this.a;
            if (i.b(d2) && i.b(this.b)) {
                double d3 = d2 - this.b;
                this.b += d3 / (double)this.a;
                this.c += d3 * (d2 - this.b);
            } else {
                this.b = B.a(this.b, d2);
                this.c = Double.NaN;
            }
            this.d = Math.min(this.d, d2);
            this.e = Math.max(this.e, d2);
        }
    }

    public void a(Iterable<? extends Number> iterable) {
        for (Number number : iterable) {
            this.a(number.doubleValue());
        }
    }

    public void a(Iterator<? extends Number> iterator) {
        while (iterator.hasNext()) {
            this.a(iterator.next().doubleValue());
        }
    }

    public /* varargs */ void a(double ... arrd) {
        for (double d2 : arrd) {
            this.a(d2);
        }
    }

    public /* varargs */ void a(int ... arrn) {
        for (int n2 : arrn) {
            this.a((double)n2);
        }
    }

    public /* varargs */ void a(long ... arrl) {
        for (long l2 : arrl) {
            this.a((double)l2);
        }
    }

    public void a(A a2) {
        if (a2.a() == 0) {
            return;
        }
        if (this.a == 0) {
            this.a = a2.a();
            this.b = a2.b();
            this.c = a2.j();
            this.d = a2.h();
            this.e = a2.i();
        } else {
            this.a += a2.a();
            if (i.b(this.b) && i.b(a2.b())) {
                double d2 = a2.b() - this.b;
                this.b += d2 * (double)a2.a() / (double)this.a;
                this.c += a2.j() + d2 * (a2.b() - this.b) * (double)a2.a();
            } else {
                this.b = B.a(this.b, a2.b());
                this.c = Double.NaN;
            }
            this.d = Math.min(this.d, a2.h());
            this.e = Math.max(this.e, a2.i());
        }
    }

    public A a() {
        return new A(this.a, this.b, this.c, this.d, this.e);
    }

    public long b() {
        return this.a;
    }

    public double c() {
        aU.b(this.a != 0);
        return this.b;
    }

    public final double d() {
        return this.b * (double)this.a;
    }

    public final double e() {
        aU.b(this.a != 0);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        if (this.a == 1) {
            return 0.0;
        }
        return e.f(this.c) / (double)this.a;
    }

    public final double f() {
        return Math.sqrt(this.e());
    }

    public final double g() {
        aU.b(this.a > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        return e.f(this.c) / (double)(this.a - 1);
    }

    public final double h() {
        return Math.sqrt(this.g());
    }

    public double i() {
        aU.b(this.a != 0);
        return this.d;
    }

    public double j() {
        aU.b(this.a != 0);
        return this.e;
    }

    double k() {
        return this.c;
    }

    static double a(double d2, double d3) {
        if (i.b(d2)) {
            return d3;
        }
        if (i.b(d3) || d2 == d3) {
            return d2;
        }
        return Double.NaN;
    }
}

