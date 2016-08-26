/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hv;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.List;

class ht<K, V>
extends hv<K, V>
implements gN<K, V> {
    ht(gN<K, V> gN2, hg<? super K, ? super V> hg2) {
        super(gN2, hg2);
    }

    @Override
    public List<V> a(K k2) {
        return (List)super.c(k2);
    }

    @Override
    public List<V> b(Object object) {
        return (List)super.d(object);
    }

    @Override
    public List<V> a(K k2, Iterable<? extends V> iterable) {
        return (List)super.b(k2, iterable);
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
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }
}

