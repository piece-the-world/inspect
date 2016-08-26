/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import java.io.Serializable;
import java.util.Map;

class av<K, V>
implements aq<K, V>,
Serializable {
    final Map<K, ? extends V> a;
    final V b;
    private static final long c = 0;

    av(Map<K, ? extends V> map, V v2) {
        this.a = aU.a(map);
        this.b = v2;
    }

    @Override
    public V f(K k2) {
        V v2 = this.a.get(k2);
        return v2 != null || this.a.containsKey(k2) ? v2 : this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof av) {
            av av2 = (av)object;
            return this.a.equals(av2.a) && aL.a(this.b, av2.b);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "Functions.forMap(" + this.a + ", defaultValue=" + this.b + ")";
    }
}

