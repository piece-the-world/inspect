/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.utils;

import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.utils.l;
import java.util.ArrayList;

class m
extends com.growingio.android.sdk.b.l {
    private long a;
    private ArrayList b = new ArrayList();

    private m() {
    }

    public void a() {
        this.a = System.currentTimeMillis();
        this.b.clear();
    }

    @Override
    public void b(i i2) {
        if (this.b != null) {
            b b2 = new b();
            b2.a = i2.j;
            b2.d = i2.k;
            b2.c = i2.e;
            b2.b = this.a;
            b2.e = i2.l;
            this.b.add(b2);
        }
    }

    static /* synthetic */ ArrayList a(m m2) {
        return m2.b;
    }

    /* synthetic */ m(l l2) {
        this();
    }
}

