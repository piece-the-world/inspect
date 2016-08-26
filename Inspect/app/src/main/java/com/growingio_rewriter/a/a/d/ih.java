/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import com.growingio.a.a.d.hG;
import java.util.Map;

final class ih
extends M<K, V> {
    final K a;
    V b;
    final /* synthetic */ hG c;

    ih(K var1_1, V k2) {
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
}

