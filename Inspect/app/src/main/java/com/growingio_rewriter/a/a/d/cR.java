/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.db;
import java.util.Map;

public abstract class cR<K, V>
extends db
implements Map.Entry<K, V> {
    protected cR() {
    }

    protected abstract Map.Entry<K, V> a();

    @Override
    public K getKey() {
        return this.a().getKey();
    }

    @Override
    public V getValue() {
        return this.a().getValue();
    }

    @Override
    public V setValue(V v2) {
        return this.a().setValue(v2);
    }

    @Override
    public boolean equals(Object object) {
        return this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    protected boolean a(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return aL.a(this.getKey(), entry.getKey()) && aL.a(this.getValue(), entry.getValue());
        }
        return false;
    }

    protected int b() {
        K k2 = this.getKey();
        V v2 = this.getValue();
        return (k2 == null ? 0 : k2.hashCode()) ^ (v2 == null ? 0 : v2.hashCode());
    }

    protected String c() {
        return this.getKey() + "=" + this.getValue();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

