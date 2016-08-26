/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.cu;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class cv<K, V>
extends AbstractCollection<V> {
    private final cu<K, V> a;

    cv(cu<K, V> cu2) {
        this.a = aU.a(cu2);
    }

    @Override
    public Iterator<V> iterator() {
        return ii.b(this.a.l().iterator());
    }

    @Override
    public boolean contains(Object object) {
        return this.a.g(object);
    }

    @Override
    public int size() {
        return this.a.l_();
    }

    @Override
    public boolean remove(Object object) {
        aV<Map.Entry<K, V>> aV2 = this.a.b();
        Iterator<Map.Entry<K, V>> iterator = this.a.a().l().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (!aV2.a(entry) || !aL.a(entry.getValue(), object)) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return fL.a(this.a.a().l(), aW.a(this.a.b(), ii.b(aW.a(collection))));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return fL.a(this.a.a().l(), aW.a(this.a.b(), ii.b(aW.a(aW.a(collection)))));
    }

    @Override
    public void clear() {
        this.a.h();
    }
}

