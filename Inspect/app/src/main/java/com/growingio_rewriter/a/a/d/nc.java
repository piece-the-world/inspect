/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nd;
import com.growingio.a.a.d.ng;
import com.growingio.a.a.d.no;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class nc<K, V>
extends no<K, Collection<V>> {
    transient Set<Map.Entry<K, Collection<V>>> a;
    transient Collection<Collection<V>> b;
    private static final long f = 0;

    nc(Map<K, Collection<V>> map, Object object) {
        super(map, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Collection<V> a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            Collection collection = (Collection)super.get(object);
            return collection == null ? null : na.a(collection, this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<Map.Entry<K, Collection<V>>> entrySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = new nd(this.d().entrySet(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<Collection<V>> values() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = new ng(this.d().values(), this.h);
            }
            return this.b;
        }
    }

    @Override
    public boolean containsValue(Object object) {
        return this.values().contains(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

