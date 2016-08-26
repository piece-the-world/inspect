/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.c;
import com.growingio.a.a.h.h;

abstract class b
extends h {
    final L[] a;
    private static final long b = 0;

    /* varargs */ b(L ... arrl) {
        for (L l2 : arrl) {
            aU.a(l2);
        }
        this.a = arrl;
    }

    abstract H a(M[] var1);

    @Override
    public M a() {
        M[] arrm = new M[this.a.length];
        for (int i2 = 0; i2 < arrm.length; ++i2) {
            arrm[i2] = this.a[i2].a();
        }
        return new c(this, arrm);
    }
}

