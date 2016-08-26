/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aU;
import com.growingio.a.a.m.a;
import com.growingio.a.a.m.q;
import com.growingio.a.a.m.u;
import java.util.Comparator;

final class aV
extends aU {
    aV() {
        super(null);
    }

    public aU a(Comparable comparable, Comparable comparable2) {
        return this.a(comparable.compareTo(comparable2));
    }

    @Override
    public <T> aU a(T t2, T t3, Comparator<T> comparator) {
        return this.a(comparator.compare(t2, t3));
    }

    @Override
    public aU a(int n2, int n3) {
        return this.a(q.a(n2, n3));
    }

    @Override
    public aU a(long l2, long l3) {
        return this.a(u.a(l2, l3));
    }

    @Override
    public aU a(float f2, float f3) {
        return this.a(Float.compare(f2, f3));
    }

    @Override
    public aU a(double d2, double d3) {
        return this.a(Double.compare(d2, d3));
    }

    @Override
    public aU a(boolean bl2, boolean bl3) {
        return this.a(a.a(bl3, bl2));
    }

    @Override
    public aU b(boolean bl2, boolean bl3) {
        return this.a(a.a(bl2, bl3));
    }

    aU a(int n2) {
        return n2 < 0 ? aU.c() : (n2 > 0 ? aU.d() : aU.e());
    }

    @Override
    public int b() {
        return 0;
    }
}

