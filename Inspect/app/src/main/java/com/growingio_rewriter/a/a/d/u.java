/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class u
extends iU<K, Collection<V>> {
    final /* synthetic */ n a;

    u(Map<K, Collection<V>> var1_1) {
        this.a = var1_1;
        super(map);
    }

    @Override
    public Iterator<K> iterator() {
        Iterator iterator = this.c().entrySet().iterator();
        return new v(this, iterator);
    }

    @Override
    public boolean remove(Object object) {
        int n2 = 0;
        Collection collection = (Collection)this.c().remove(object);
        if (collection != null) {
            n2 = collection.size();
            collection.clear();
            n.a(this.a, n.d(this.a) - n2);
        }
        return n2 > 0;
    }

    @Override
    public void clear() {
        gb.i(this.iterator());
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.c().keySet().containsAll(collection);
    }

    @Override
    public boolean equals(Object object) {
        return this == object || this.c().keySet().equals(object);
    }

    @Override
    public int hashCode() {
        return this.c().keySet().hashCode();
    }
}

