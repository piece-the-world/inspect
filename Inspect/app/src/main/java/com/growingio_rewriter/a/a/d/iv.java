/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.iw;
import com.growingio.a.a.d.jk;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class iv<K, V>
extends jk<K, V> {
    private final Set<K> b;
    final aq<? super K, V> a;

    Set<K> c() {
        return this.b;
    }

    iv(Set<K> set, aq<? super K, V> aq2) {
        this.b = aU.a(set);
        this.a = aU.a(aq2);
    }

    @Override
    public Set<K> h() {
        return ii.b(this.c());
    }

    @Override
    Collection<V> b() {
        return aL.a(this.b, this.a);
    }

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.c().contains(object);
    }

    @Override
    public V get(Object object) {
        if (aL.a(this.c(), object)) {
            Object object2 = object;
            return this.a.f((Object)object2);
        }
        return null;
    }

    @Override
    public V remove(Object object) {
        if (this.c().remove(object)) {
            Object object2 = object;
            return this.a.f((Object)object2);
        }
        return null;
    }

    @Override
    public void clear() {
        this.c().clear();
    }

    @Override
    protected Set<Map.Entry<K, V>> a() {
        return new iw(this);
    }
}

