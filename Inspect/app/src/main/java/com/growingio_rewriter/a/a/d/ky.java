/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kz;
import com.growingio.a.a.d.lU;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class ky<E>
extends lU<E> {
    ky() {
    }

    abstract kl<E> a();

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.a().contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.a().containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return new kz(this, this.a().a().iterator());
    }

    @Override
    public boolean remove(Object object) {
        return this.a().b(object, Integer.MAX_VALUE) > 0;
    }

    @Override
    public int size() {
        return this.a().a().size();
    }
}

