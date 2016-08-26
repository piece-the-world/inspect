/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bl;
import com.growingio.a.a.d.bm;
import com.growingio.a.a.d.dd;
import java.util.Collection;
import java.util.Set;

class br<E>
extends dd<E> {
    private final Set<E> a;
    private final bl<? super E> b;

    public br(Set<E> set, bl<? super E> bl2) {
        this.a = aU.a(set);
        this.b = aU.a(bl2);
    }

    @Override
    protected Set<E> a() {
        return this.a;
    }

    @Override
    public boolean add(E e2) {
        this.b.a(e2);
        return this.a.add(e2);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(bm.c(collection, this.b));
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

