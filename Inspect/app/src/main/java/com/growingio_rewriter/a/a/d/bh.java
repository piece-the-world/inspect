/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bf;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class bh
extends j<km<E>> {
    private final Iterator<Map.Entry<E, AtomicInteger>> b;
    final /* synthetic */ bf a;

    bh(bf bf2) {
        this.a = bf2;
        this.b = bf.a(this.a).entrySet().iterator();
    }

    protected km<E> d() {
        Map.Entry<E, AtomicInteger> entry;
        int n2;
        do {
            if (this.b.hasNext()) continue;
            return (km)this.b();
        } while ((n2 = (entry = this.b.next()).getValue().get()) == 0);
        return kn.a(entry.getKey(), n2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

