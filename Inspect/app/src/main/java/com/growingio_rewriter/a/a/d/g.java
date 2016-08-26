/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.a;
import com.growingio.a.a.d.b;
import com.growingio.a.a.d.dd;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class g
extends dd<K> {
    final /* synthetic */ a a;

    private g(a a2) {
        this.a = a2;
    }

    @Override
    protected Set<K> a() {
        return a.b(this.a).keySet();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean remove(Object object) {
        if (!this.contains(object)) {
            return false;
        }
        a.a(this.a, object);
        return true;
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
    public Iterator<K> iterator() {
        return ii.a(this.a.entrySet().iterator());
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    /* synthetic */ g(a a2, b b2) {
        this(a2);
    }
}

