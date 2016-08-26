/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.jP;
import com.growingio.a.a.d.jk;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class jO<K, V>
extends jk<K, Collection<V>> {
    private final jr<K, V> a;

    jO(jr<K, V> jr2) {
        this.a = aU.a(jr2);
    }

    @Override
    public int size() {
        return this.a.q().size();
    }

    @Override
    protected Set<Map.Entry<K, Collection<V>>> a() {
        return new jP(this);
    }

    void a(Object object) {
        this.a.q().remove(object);
    }

    public Collection<V> b(Object object) {
        return this.containsKey(object) ? this.a.c(object) : null;
    }

    public Collection<V> c(Object object) {
        return this.containsKey(object) ? this.a.d(object) : null;
    }

    @Override
    public Set<K> keySet() {
        return this.a.q();
    }

    @Override
    public boolean isEmpty() {
        return this.a.o();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.f(object);
    }

    @Override
    public void clear() {
        this.a.h();
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.c(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.b(object);
    }

    static /* synthetic */ jr a(jO jO2) {
        return jO2.a;
    }
}

