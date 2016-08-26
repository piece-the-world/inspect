/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.di;
import com.growingio.a.a.o.a.dr;

class dn<L>
extends dr<L> {
    private final Object[] a;

    private dn(int n2, bG<L> bG2) {
        super(n2);
        aU.a(n2 <= 1073741824, (Object)"Stripes must be <= 2^30)");
        this.a = new Object[this.d + 1];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = bG2.a();
        }
    }

    @Override
    public L a(int n2) {
        return (L)this.a[n2];
    }

    @Override
    public int a() {
        return this.a.length;
    }

    /* synthetic */ dn(int n2, bG bG2, di di2) {
        this(n2, bG2);
    }
}

