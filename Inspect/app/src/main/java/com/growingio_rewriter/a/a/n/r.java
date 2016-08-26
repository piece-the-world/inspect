/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.dd;
import com.growingio.a.a.n.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class r
extends dd<Map.Entry<K, V>> {
    final /* synthetic */ Set a;

    r(Set set) {
        this.a = set;
    }

    @Override
    protected Set<Map.Entry<K, V>> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return q.a(super.iterator());
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
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

