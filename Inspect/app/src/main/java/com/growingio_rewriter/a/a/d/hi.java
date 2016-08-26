/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.hg;
import java.util.Map;

final class hi
extends cR<K, V> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ hg b;

    hi(Map.Entry entry, hg hg2) {
        this.a = entry;
        this.b = hg2;
    }

    @Override
    protected Map.Entry<K, V> a() {
        return this.a;
    }

    @Override
    public V setValue(V v2) {
        this.b.a(this.getKey(), v2);
        return this.a.setValue(v2);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

