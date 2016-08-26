/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.j;
import com.growingio.a.a.h.k;
import com.growingio.a.a.h.m;
import com.growingio.a.a.h.q;
import com.growingio.a.a.h.x;
import java.io.Serializable;

class l<T>
implements Serializable {
    final long[] a;
    final int b;
    final x<? super T> c;
    final m d;
    private static final long e = 1;

    l(j<T> j2) {
        this.a = j.c(j2).a;
        this.b = j.d(j2);
        this.c = j.e(j2);
        this.d = j.f(j2);
    }

    Object a() {
        return new j(new q(this.a), this.b, this.c, this.d, null);
    }
}

