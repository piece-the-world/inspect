/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nd;
import com.growingio.a.a.d.ne;
import java.util.Collection;
import java.util.Map;

class nf
extends cR<K, Collection<V>> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ne b;

    nf(ne ne2, Map.Entry entry) {
        this.b = ne2;
        this.a = entry;
    }

    @Override
    protected Map.Entry<K, Collection<V>> a() {
        return this.a;
    }

    public Collection<V> d() {
        return na.a((Collection)this.a.getValue(), this.b.a.h);
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

