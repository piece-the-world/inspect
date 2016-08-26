/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.k.h;
import com.growingio.a.a.k.l;

final class m
extends h {
    final double a;
    h b;

    m(double d2) {
        this.a = d2;
        this.b = null;
    }

    m(double d2, h h2) {
        this.a = d2;
        this.b = h2;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public double d() {
        throw new IllegalStateException();
    }

    @Override
    public double c(double d2) {
        throw new IllegalStateException();
    }

    @Override
    public h e() {
        h h2 = this.b;
        h h3 = h2 == null ? (this.b = this.f()) : h2;
        return h3;
    }

    public String toString() {
        return String.format("x = %g", this.a);
    }

    private h f() {
        return new l(0.0, this.a, this);
    }
}

