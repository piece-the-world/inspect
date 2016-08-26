/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cw;
import com.growingio.a.a.o.a.dd;
import com.growingio.a.a.o.a.de;

final class df
extends dd {
    final double d;

    df(cw cw2, double d2) {
        super(cw2, null);
        this.d = d2;
    }

    @Override
    void a(double d2, double d3) {
        double d4 = this.b;
        this.b = this.d * d2;
        this.a = d4 == Double.POSITIVE_INFINITY ? this.b : (d4 == 0.0 ? 0.0 : this.a * this.b / d4);
    }

    @Override
    long b(double d2, double d3) {
        return 0;
    }

    @Override
    double e() {
        return this.c;
    }
}

