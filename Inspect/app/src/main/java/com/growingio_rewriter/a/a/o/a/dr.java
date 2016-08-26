/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.dh;
import com.growingio.a.a.o.a.di;

abstract class dr<L>
extends dh<L> {
    final int d;

    dr(int n2) {
        super(null);
        aU.a(n2 > 0, (Object)"Stripes must be positive");
        this.d = n2 > 1073741824 ? -1 : dh.f(n2) - 1;
    }

    @Override
    final int b(Object object) {
        int n2 = dh.g(object.hashCode());
        return n2 & this.d;
    }

    @Override
    public final L a(Object object) {
        return this.a(this.b(object));
    }
}

