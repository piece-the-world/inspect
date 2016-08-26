/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.utils;

import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.utils.m;

final class n
extends l {
    n() {
    }

    @Override
    public void b(i i2) {
        if (m.a() != null) {
            b b2 = new b();
            b2.a = i2.j;
            b2.d = i2.k;
            b2.c = i2.e;
            b2.b = m.b();
            b2.e = i2.l;
            m.a().add(b2);
        }
    }
}

