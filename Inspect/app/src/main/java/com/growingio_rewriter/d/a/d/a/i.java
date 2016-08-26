/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class i<E>
extends AbstractSet<E>
implements Iterator<E> {
    E a;
    E b;

    static final <T> Set<T> a() {
        return new i<Object>(null, null);
    }

    i(E e2, E e3) {
        this.a = e2;
        this.b = e3;
    }

    @Override
    public Iterator<E> iterator() {
        return new i<E>(this.a, this.b);
    }

    @Override
    public int size() {
        return this.a == null ? 0 : (this.b == null ? 1 : 2);
    }

    @Override
    public boolean hasNext() {
        return this.a != null;
    }

    @Override
    public E next() {
        if (this.a == null) {
            throw new NoSuchElementException();
        }
        E e2 = this.a;
        this.a = this.b;
        this.b = null;
        return e2;
    }

    @Override
    public void remove() {
    }

    Set<E> a(i<E> i2) {
        if (i2.a == this.a && i2.b == this.b || i2.a == this.b && i2.b == this.a) {
            return this;
        }
        if (i2.a == null) {
            return this;
        }
        if (this.a == null) {
            return i2;
        }
        if (i2.b == null) {
            if (this.b == null) {
                return new i<E>(this.a, i2.a);
            }
            if (i2.a == this.a || i2.a == this.b) {
                return this;
            }
        }
        if (this.b == null && (this.a == i2.a || this.a == i2.b)) {
            return i2;
        }
        HashSet<E> hashSet = new HashSet<E>(4);
        hashSet.add(this.a);
        if (this.b != null) {
            hashSet.add(this.b);
        }
        hashSet.add(i2.a);
        if (i2.b != null) {
            hashSet.add(i2.b);
        }
        return hashSet;
    }
}

