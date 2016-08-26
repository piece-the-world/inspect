/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class no<K, V>
extends nt
implements Map<K, V> {
    transient Set<K> c;
    transient Collection<V> d;
    transient Set<Map.Entry<K, V>> e;
    private static final long a = 0;

    no(Map<K, V> map, Object object) {
        super(map, object);
    }

    Map<K, V> d() {
        return (Map)super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.h;
        synchronized (object) {
            this.d().clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsKey(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().containsKey(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsValue(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().containsValue(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.e == null) {
                this.e = na.a(this.d().entrySet(), this.h);
            }
            return this.e;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V get(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().get(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isEmpty() {
        Object object = this.h;
        synchronized (object) {
            return this.d().isEmpty();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<K> keySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.c == null) {
                this.c = na.a(this.d().keySet(), this.h);
            }
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V put(K k2, V v2) {
        Object object = this.h;
        synchronized (object) {
            return this.d().put(k2, v2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        Object object = this.h;
        synchronized (object) {
            this.d().putAll(map);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V remove(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.h;
        synchronized (object) {
            return this.d().size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<V> values() {
        Object object = this.h;
        synchronized (object) {
            if (this.d == null) {
                this.d = na.b(this.d().values(), this.h);
            }
            return this.d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.d().hashCode();
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.d();
    }
}

