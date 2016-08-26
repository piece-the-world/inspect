/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.db;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class cN<K, V>
extends db
implements Map<K, V> {
    protected cN() {
    }

    protected abstract Map<K, V> a();

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public V remove(Object object) {
        return this.a().remove(object);
    }

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a().containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a().containsValue(object);
    }

    @Override
    public V get(Object object) {
        return this.a().get(object);
    }

    @Override
    public V put(K k2, V v2) {
        return this.a().put(k2, v2);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.a().putAll(map);
    }

    @Override
    public Set<K> keySet() {
        return this.a().keySet();
    }

    @Override
    public Collection<V> values() {
        return this.a().values();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.a().entrySet();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    protected void c(Map<? extends K, ? extends V> map) {
        ii.b(this, map);
    }

    protected V c(Object object) {
        Iterator<Map.Entry<K, V>> iterator = this.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (!aL.a(entry.getKey(), object)) continue;
            V v2 = entry.getValue();
            iterator.remove();
            return v2;
        }
        return null;
    }

    protected void f() {
        gb.i(this.entrySet().iterator());
    }

    protected boolean d(Object object) {
        return ii.d(this, object);
    }

    protected boolean e(Object object) {
        return ii.e(this, object);
    }

    protected boolean h() {
        return !this.entrySet().iterator().hasNext();
    }

    protected boolean f(Object object) {
        return ii.f(this, object);
    }

    protected int i() {
        return lI.b(this.entrySet());
    }

    protected String j() {
        return ii.e(this);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

