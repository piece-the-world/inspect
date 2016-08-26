/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cS;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.List;

public abstract class cM<K, V>
extends cS<K, V>
implements gN<K, V> {
    protected cM() {
    }

    protected abstract gN<K, V> a();

    @Override
    public List<V> a(K k2) {
        return this.a().a(k2);
    }

    @Override
    public List<V> b(Object object) {
        return this.a().b(object);
    }

    @Override
    public List<V> a(K k2, Iterable<? extends V> iterable) {
        return this.a().a(k2, iterable);
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
    protected /* synthetic */ jr b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

