/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import java.util.AbstractCollection;
import java.util.Map;

abstract class jV<K, V>
extends AbstractCollection<Map.Entry<K, V>> {
    jV() {
    }

    abstract jr<K, V> a();

    @Override
    public int size() {
        return this.a().l_();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a().b(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a().c(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public void clear() {
        this.a().h();
    }
}

