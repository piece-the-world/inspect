/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jj<K, V>
extends AbstractCollection<V> {
    final Map<K, V> c;

    jj(Map<K, V> map) {
        this.c = aU.a(map);
    }

    final Map<K, V> a() {
        return this.c;
    }

    @Override
    public Iterator<V> iterator() {
        return ii.b(this.a().entrySet().iterator());
    }

    @Override
    public boolean remove(Object object) {
        try {
            return super.remove(object);
        }
        catch (UnsupportedOperationException var2_2) {
            for (Map.Entry<K, V> entry : this.a().entrySet()) {
                if (!aL.a(object, entry.getValue())) continue;
                this.a().remove(entry.getKey());
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll(aU.a(collection));
        }
        catch (UnsupportedOperationException var2_2) {
            HashSet<K> hashSet = lI.a();
            for (Map.Entry<K, V> entry : this.a().entrySet()) {
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().removeAll(hashSet);
        }
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll(aU.a(collection));
        }
        catch (UnsupportedOperationException var2_2) {
            HashSet<K> hashSet = lI.a();
            for (Map.Entry<K, V> entry : this.a().entrySet()) {
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().retainAll(hashSet);
        }
    }

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.a().containsValue(object);
    }

    @Override
    public void clear() {
        this.a().clear();
    }
}

