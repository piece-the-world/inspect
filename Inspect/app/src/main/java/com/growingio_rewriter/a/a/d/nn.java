/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.np;
import java.util.Collection;
import java.util.List;

class nn<K, V>
extends np<K, V>
implements gN<K, V> {
    private static final long f = 0;

    nn(gN<K, V> gN2, Object object) {
        super(gN2, object);
    }

    gN<K, V> a() {
        return (gN)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<V> a(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().a(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<V> b(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().b(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<V> a(K k2, Iterable<? extends V> iterable) {
        Object object = this.h;
        synchronized (object) {
            return this.a().a(k2, iterable);
        }
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    /* synthetic */ jr b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

