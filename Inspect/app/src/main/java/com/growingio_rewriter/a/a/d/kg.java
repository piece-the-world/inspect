/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kh;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class kg<K, V>
extends kh<K, V>
implements gN<K, V> {
    private static final long g = 0;

    kg(gN<K, V> gN2) {
        super(gN2);
    }

    public gN<K, V> a() {
        return (gN)super.b();
    }

    @Override
    public List<V> a(K k2) {
        return Collections.unmodifiableList(this.a().a(k2));
    }

    @Override
    public List<V> b(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<V> a(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ jr b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object g() {
        return this.a();
    }
}

