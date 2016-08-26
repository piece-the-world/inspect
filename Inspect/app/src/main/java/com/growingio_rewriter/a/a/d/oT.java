/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.oU;
import com.growingio.a.a.d.oV;
import java.util.Map;
import java.util.Set;

final class oT<K, V>
extends cN<K, V> {
    private final Map<K, V> a;
    private Set<Map.Entry<K, V>> b;

    private oT(Map<K, V> map) {
        this.a = map;
    }

    static <K, V> oT<K, V> a(Map<K, V> map) {
        return new oT<K, V>(map);
    }

    @Override
    protected Map<K, V> a() {
        return this.a;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.b;
        if (set != null) {
            return set;
        }
        this.b = new oV(this, null);
        return this.b;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

