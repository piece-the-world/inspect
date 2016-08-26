/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.a;
import com.growingio.a.a.d.b;
import com.growingio.a.a.d.d;
import com.growingio.a.a.d.dd;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class c
extends dd<Map.Entry<K, V>> {
    final Set<Map.Entry<K, V>> a;
    final /* synthetic */ a b;

    private c(a a2) {
        this.b = a2;
        this.a = a.b(this.b).entrySet();
    }

    @Override
    protected Set<Map.Entry<K, V>> a() {
        return this.a;
    }

    @Override
    public void clear() {
        this.b.clear();
    }

    @Override
    public boolean remove(Object object) {
        if (!this.a.contains(object)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        a.b(this.b.a).remove(entry.getValue());
        this.a.remove(entry);
        return true;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        Iterator<Map.Entry<K, V>> iterator = this.a.iterator();
        return new d(this, iterator);
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
    public boolean contains(Object object) {
        return ii.a(this.a(), object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.a(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.c(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.d(collection);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    /* synthetic */ c(a a2, b b2) {
        this(a2);
    }
}

