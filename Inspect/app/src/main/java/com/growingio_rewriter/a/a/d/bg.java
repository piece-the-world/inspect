/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.bf;
import com.growingio.a.a.d.dd;
import java.util.Collection;
import java.util.Set;

class bg
extends dd<E> {
    final /* synthetic */ Set a;
    final /* synthetic */ bf b;

    bg(bf bf2, Set set) {
        this.b = bf2;
        this.a = set;
    }

    @Override
    protected Set<E> a() {
        return this.a;
    }

    @Override
    public boolean contains(Object object) {
        return object != null && aL.a(this.a, object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.a(collection);
    }

    @Override
    public boolean remove(Object object) {
        return object != null && aL.b(this.a, object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.c(collection);
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

