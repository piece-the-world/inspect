/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.kq;
import java.util.Iterator;

class kr
extends j<km<E>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ kq b;

    kr(kq kq2, Iterator iterator) {
        this.b = kq2;
        this.a = iterator;
    }

    protected km<E> d() {
        while (this.a.hasNext()) {
            km km2 = (km)this.a.next();
            Object e2 = km2.a();
            int n2 = Math.min(km2.b(), this.b.b.a(e2));
            if (n2 <= 0) continue;
            return kn.a(e2, n2);
        }
        return (km)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

