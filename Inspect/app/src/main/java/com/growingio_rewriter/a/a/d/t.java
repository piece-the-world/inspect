/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class t<T>
implements Iterator<T> {
    final Iterator<Map.Entry<K, Collection<V>>> b;
    K c;
    Collection<V> d;
    Iterator<V> e;
    final /* synthetic */ n f;

    t(n n2) {
        this.f = n2;
        this.b = n.a(n2).entrySet().iterator();
        this.c = null;
        this.d = null;
        this.e = gb.c();
    }

    abstract T a(K var1, V var2);

    @Override
    public boolean hasNext() {
        return this.b.hasNext() || this.e.hasNext();
    }

    @Override
    public T next() {
        if (!this.e.hasNext()) {
            Map.Entry<K, Collection<V>> entry = this.b.next();
            this.c = entry.getKey();
            this.d = entry.getValue();
            this.e = this.d.iterator();
        }
        return this.a(this.c, this.e.next());
    }

    @Override
    public void remove() {
        this.e.remove();
        if (this.d.isEmpty()) {
            this.b.remove();
        }
        n.b(this.f);
    }
}

