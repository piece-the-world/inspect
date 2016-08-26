/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bm;
import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hk;
import java.util.Collection;
import java.util.Map;

final class hj
extends cR<K, Collection<V>> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ hg b;

    hj(Map.Entry entry, hg hg2) {
        this.a = entry;
        this.b = hg2;
    }

    @Override
    protected Map.Entry<K, Collection<V>> a() {
        return this.a;
    }

    public Collection<V> d() {
        return bm.b((Collection)this.a.getValue(), new hk(this));
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

