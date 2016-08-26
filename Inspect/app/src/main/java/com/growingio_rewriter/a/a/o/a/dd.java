/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.k.n;
import com.growingio.a.a.o.a.cv;
import com.growingio.a.a.o.a.cw;
import com.growingio.a.a.o.a.de;
import java.util.concurrent.TimeUnit;

abstract class dd
extends cv {
    double a;
    double b;
    double c;
    private long d = 0;

    private dd(cw cw2) {
        super(cw2);
    }

    @Override
    final void a(double d2, long l2) {
        double d3;
        this.b(l2);
        this.c = d3 = (double)TimeUnit.SECONDS.toMicros(1) / d2;
        this.a(d2, d3);
    }

    abstract void a(double var1, double var3);

    @Override
    final double b() {
        return (double)TimeUnit.SECONDS.toMicros(1) / this.c;
    }

    @Override
    final long a(long l2) {
        return this.d;
    }

    @Override
    final long b(int n2, long l2) {
        this.b(l2);
        long l3 = this.d;
        double d2 = Math.min((double)n2, this.a);
        double d3 = (double)n2 - d2;
        long l4 = this.b(this.a, d2) + (long)(d3 * this.c);
        this.d = n.g(this.d, l4);
        this.a -= d2;
        return l3;
    }

    abstract long b(double var1, double var3);

    abstract double e();

    void b(long l2) {
        if (l2 > this.d) {
            double d2 = (double)(l2 - this.d) / this.e();
            this.a = Math.min(this.b, this.a + d2);
            this.d = l2;
        }
    }

    /* synthetic */ dd(cw cw2, de de2) {
        this(cw2);
    }
}

