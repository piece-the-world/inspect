/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import java.io.Serializable;
import java.util.Map;

class ax<K, V>
implements aq<K, V>,
Serializable {
    final Map<K, V> a;
    private static final long b = 0;

    ax(Map<K, V> map) {
        this.a = aU.a(map);
    }

    @Override
    public V f(K k2) {
        V v2 = this.a.get(k2);
        aU.a(v2 != null || this.a.containsKey(k2), "Key '%s' not present in map", k2);
        return v2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ax) {
            ax ax2 = (ax)object;
            return this.a.equals(ax2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Functions.forMap(" + this.a + ")";
    }
}

