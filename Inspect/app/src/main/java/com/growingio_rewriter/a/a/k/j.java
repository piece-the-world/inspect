/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.e;
import com.growingio.a.a.k.h;
import com.growingio.a.a.k.i;
import com.growingio.a.a.k.l;
import com.growingio.a.a.k.m;

public final class j {
    private final double a;
    private final double b;

    private j(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    public h a(double d2, double d3) {
        aU.a(e.c(d2) && e.c(d3));
        if (d2 == this.a) {
            aU.a(d3 != this.b);
            return new m(this.a);
        }
        return this.a((d3 - this.b) / (d2 - this.a));
    }

    public h a(double d2) {
        aU.a(!Double.isNaN(d2));
        if (e.c(d2)) {
            double d3 = this.b - this.a * d2;
            return new l(d2, d3);
        }
        return new m(this.a);
    }

    /* synthetic */ j(double d2, double d3, i i2) {
        this(d2, d3);
    }
}

