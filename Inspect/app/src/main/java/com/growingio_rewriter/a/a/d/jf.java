/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class jf<K, V>
extends cC<Map.Entry<K, V>> {
    private final Collection<Map.Entry<K, V>> a;

    jf(Collection<Map.Entry<K, V>> collection) {
        this.a = collection;
    }

    @Override
    protected Collection<Map.Entry<K, V>> b() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return ii.c(this.a.iterator());
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.a(arrT);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

