/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nt;
import java.util.Map;

class nl<K, V>
extends nt
implements Map.Entry<K, V> {
    private static final long a = 0;

    nl(Map.Entry<K, V> entry, Object object) {
        super(entry, object);
    }

    Map.Entry<K, V> a() {
        return (Map.Entry)super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.a().hashCode();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K getKey() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V getValue() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getValue();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V setValue(V v2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().setValue(v2);
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

