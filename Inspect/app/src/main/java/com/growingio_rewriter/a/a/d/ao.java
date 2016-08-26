/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.am;
import com.growingio.a.a.d.ap;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.iS;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class ao<K, V>
extends iS<K, V> {
    private final ei<K, Integer> a;

    private ao(ei<K, Integer> ei2) {
        this.a = ei2;
    }

    @Override
    public Set<K> keySet() {
        return this.a.m();
    }

    K a(int n2) {
        return this.a.m().h().get(n2);
    }

    abstract String a();

    abstract V b(int var1);

    abstract V a(int var1, V var2);

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    Iterator<Map.Entry<K, V>> b() {
        return new ap(this, this.size());
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public V get(Object object) {
        Integer n2 = this.a.get(object);
        if (n2 == null) {
            return null;
        }
        return this.b(n2);
    }

    @Override
    public V put(K k2, V v2) {
        Integer n2 = this.a.get(k2);
        if (n2 == null) {
            throw new IllegalArgumentException(this.a() + " " + k2 + " not in " + this.a.m());
        }
        return this.a(n2, v2);
    }

    @Override
    public V remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ ao(ei ei2, am am2) {
        this(ei2);
    }
}

