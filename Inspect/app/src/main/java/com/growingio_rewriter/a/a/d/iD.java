/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.lU;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class iD<K, V>
extends lU<Map.Entry<K, V>> {
    iD() {
    }

    abstract Map<K, V> a();

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            K k2 = entry.getKey();
            V v2 = ii.a(this.a(), k2);
            return aL.a(v2, entry.getValue()) && (v2 != null || this.a().containsKey(k2));
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            Map.Entry entry = (Map.Entry)object;
            return this.a().keySet().remove(entry.getKey());
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll(aU.a(collection));
        }
        catch (UnsupportedOperationException var2_2) {
            return lI.a(this, collection.iterator());
        }
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll(aU.a(collection));
        }
        catch (UnsupportedOperationException var2_2) {
            HashSet<K> hashSet = lI.a(collection.size());
            for (? obj : collection) {
                if (!this.contains(obj)) continue;
                Map.Entry entry = (Map.Entry)obj;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().retainAll(hashSet);
        }
    }
}

