/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dd;
import java.util.Collection;
import java.util.Set;

final class im
extends dd<E> {
    final /* synthetic */ Set a;

    im(Set set) {
        this.a = set;
    }

    @Override
    protected Set<E> a() {
        return this.a;
    }

    @Override
    public boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

