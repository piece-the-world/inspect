/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fv;
import com.growingio.a.a.d.fw;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.mu;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;

final class fx<E>
implements Serializable {
    final Comparator<? super E> a;
    final E[] b;
    final int[] c;

    fx(mu<E> mu2) {
        this.a = mu2.comparator();
        int n2 = mu2.a().size();
        this.b = new Object[n2];
        this.c = new int[n2];
        int n3 = 0;
        for (km<E> km2 : mu2.a()) {
            this.b[n3] = km2.a();
            this.c[n3] = km2.b();
            ++n3;
        }
    }

    Object a() {
        int n2 = this.b.length;
        fw<E> fw2 = new fw<E>(this.a);
        for (int i2 = 0; i2 < n2; ++i2) {
            fw2.c(this.b[i2], this.c[i2]);
        }
        return fw2.c();
    }
}

