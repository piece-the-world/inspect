/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class v
implements Iterator<K> {
    Map.Entry<K, Collection<V>> a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ u c;

    v(u u2, Iterator iterator) {
        this.c = u2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public K next() {
        this.a = (Map.Entry)this.b.next();
        return this.a.getKey();
    }

    @Override
    public void remove() {
        aK.a(this.a != null);
        Collection<V> collection = this.a.getValue();
        this.b.remove();
        n.a(this.c.a, n.d(this.c.a) - collection.size());
        collection.clear();
    }
}

