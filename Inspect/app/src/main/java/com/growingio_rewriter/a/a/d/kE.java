/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class kE<E>
implements Iterator<E> {
    private final kl<E> a;
    private final Iterator<km<E>> b;
    private km<E> c;
    private int d;
    private int e;
    private boolean f;

    kE(kl<E> kl2, Iterator<km<E>> iterator) {
        this.a = kl2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override
    public E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.d == 0) {
            this.c = this.b.next();
            this.e = this.d = this.c.b();
        }
        --this.d;
        this.f = true;
        return this.c.a();
    }

    @Override
    public void remove() {
        aK.a(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            this.a.remove(this.c.a());
        }
        --this.e;
        this.f = false;
    }
}

