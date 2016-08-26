/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.n;
import com.growingio.a.a.d.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class s
implements Iterator<Map.Entry<K, Collection<V>>> {
    final Iterator<Map.Entry<K, Collection<V>>> a;
    Collection<V> b;
    final /* synthetic */ q c;

    s(q q2) {
        this.c = q2;
        this.a = this.c.a.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry<K, Collection<V>> a() {
        Map.Entry<K, Collection<V>> entry = this.a.next();
        this.b = entry.getValue();
        return this.c.a(entry);
    }

    @Override
    public void remove() {
        this.a.remove();
        n.a(this.c.b, n.d(this.c.b) - this.b.size());
        this.b.clear();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

