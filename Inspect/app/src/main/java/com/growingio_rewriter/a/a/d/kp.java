/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.ko;
import java.util.Iterator;

class kp
extends j<km<E>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ ko c;

    kp(ko ko2, Iterator iterator, Iterator iterator2) {
        this.c = ko2;
        this.a = iterator;
        this.b = iterator2;
    }

    protected km<E> d() {
        if (this.a.hasNext()) {
            km km2 = (km)this.a.next();
            Object e2 = km2.a();
            int n2 = Math.max(km2.b(), this.c.b.a(e2));
            return kn.a(e2, n2);
        }
        while (this.b.hasNext()) {
            km km3 = (km)this.b.next();
            Object e3 = km3.a();
            if (this.c.a.contains(e3)) continue;
            return kn.a(e3, km3.b());
        }
        return (km)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

