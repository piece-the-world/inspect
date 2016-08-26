/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.k.h;
import com.growingio.a.a.k.m;

final class l
extends h {
    final double a;
    final double b;
    h c;

    l(double d2, double d3) {
        this.a = d2;
        this.b = d3;
        this.c = null;
    }

    l(double d2, double d3, h h2) {
        this.a = d2;
        this.b = d3;
        this.c = h2;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean c() {
        return this.a == 0.0;
    }

    @Override
    public double d() {
        return this.a;
    }

    @Override
    public double c(double d2) {
        return d2 * this.a + this.b;
    }

    @Override
    public h e() {
        h h2 = this.c;
        h h3 = h2 == null ? (this.c = this.f()) : h2;
        return h3;
    }

    public String toString() {
        return String.format("y = %g * x + %g", this.a, this.b);
    }

    private h f() {
        if (this.a != 0.0) {
            return new l(1.0 / this.a, -1.0 * this.b / this.a, this);
        }
        return new m(this.b, this);
    }
}

