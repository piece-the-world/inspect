/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cw;
import com.growingio.a.a.o.a.dd;
import com.growingio.a.a.o.a.de;
import java.util.concurrent.TimeUnit;

final class dg
extends dd {
    private final long d;
    private double e;
    private double f;
    private double g;

    dg(cw cw2, long l2, TimeUnit timeUnit, double d2) {
        super(cw2, null);
        this.d = timeUnit.toMicros(l2);
        this.g = d2;
    }

    @Override
    void a(double d2, double d3) {
        double d4 = this.b;
        double d5 = d3 * this.g;
        this.f = 0.5 * (double)this.d / d3;
        this.b = this.f + 2.0 * (double)this.d / (d3 + d5);
        this.e = (d5 - d3) / (this.b - this.f);
        this.a = d4 == Double.POSITIVE_INFINITY ? 0.0 : (d4 == 0.0 ? this.b : this.a * this.b / d4);
    }

    @Override
    long b(double d2, double d3) {
        double d4 = d2 - this.f;
        long l2 = 0;
        if (d4 > 0.0) {
            double d5 = Math.min(d4, d3);
            double d6 = this.c(d4) + this.c(d4 - d5);
            l2 = (long)(d5 * d6 / 2.0);
            d3 -= d5;
        }
        l2 = (long)((double)l2 + this.c * d3);
        return l2;
    }

    private double c(double d2) {
        return this.c + d2 * this.e;
    }

    @Override
    double e() {
        return (double)this.d / this.b;
    }
}

