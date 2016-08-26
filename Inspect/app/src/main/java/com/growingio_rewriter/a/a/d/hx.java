/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hh;
import com.growingio.a.a.d.hn;
import com.growingio.a.a.d.hv;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class hx
extends cN<K, Collection<V>> {
    Set<Map.Entry<K, Collection<V>>> a;
    Collection<Collection<V>> b;
    final /* synthetic */ Map c;
    final /* synthetic */ hv d;

    hx() {
        this.d = var1_1;
        this.c = var2_2;
    }

    @Override
    protected Map<K, Collection<V>> a() {
        return this.c;
    }

    @Override
    public Set<Map.Entry<K, Collection<V>>> entrySet() {
        Set set = this.a;
        if (set == null) {
            this.a = set = hh.b(this.c.entrySet(), this.d.a);
        }
        return set;
    }

    public Collection<V> a(Object object) {
        try {
            Collection collection = this.d.c(object);
            return collection.isEmpty() ? null : collection;
        }
        catch (ClassCastException var2_3) {
            return null;
        }
    }

    @Override
    public Collection<Collection<V>> values() {
        Collection<Collection<V>> collection = this.b;
        if (collection == null) {
            this.b = collection = new hn<K, V>(this.a().values(), this.entrySet());
        }
        return collection;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.values().contains(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

