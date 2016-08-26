/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cN;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public abstract class cD<K, V>
extends cN<K, V>
implements ConcurrentMap<K, V> {
    protected cD() {
    }

    protected abstract ConcurrentMap<K, V> c();

    @Override
    public V putIfAbsent(K k2, V v2) {
        return this.c().putIfAbsent(k2, v2);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        return this.c().remove(object, object2);
    }

    @Override
    public V replace(K k2, V v2) {
        return this.c().replace(k2, v2);
    }

    @Override
    public boolean replace(K k2, V v2, V v3) {
        return this.c().replace(k2, v2, v3);
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

