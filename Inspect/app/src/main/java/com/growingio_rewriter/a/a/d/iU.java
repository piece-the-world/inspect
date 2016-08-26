/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lU;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class iU<K, V>
extends lU<K> {
    final Map<K, V> d;

    iU(Map<K, V> map) {
        this.d = aU.a(map);
    }

    Map<K, V> c() {
        return this.d;
    }

    @Override
    public Iterator<K> iterator() {
        return ii.a(this.c().entrySet().iterator());
    }

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public boolean isEmpty() {
        return this.c().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.c().containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            this.c().remove(object);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.c().clear();
    }
}

