/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import java.util.Map;

final class aT
implements Map.Entry<K, V> {
    final K a;
    V b;
    final /* synthetic */ O c;

    aT(K var1_1, V k2) {
        this.c = var1_1;
        this.a = k2;
        this.b = v2;
    }

    @Override
    public K getKey() {
        return this.a;
    }

    @Override
    public V getValue() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public V setValue(V v2) {
        V v3 = this.c.put(this.a, v2);
        this.b = v2;
        return v3;
    }

    public String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

