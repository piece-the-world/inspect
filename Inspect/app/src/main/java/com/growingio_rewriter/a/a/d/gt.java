/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kT;
import java.util.Iterator;

class gt<E>
implements kT<E> {
    private final Iterator<? extends E> a;
    private boolean b;
    private E c;

    public gt(Iterator<? extends E> iterator) {
        this.a = aU.a(iterator);
    }

    @Override
    public boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override
    public E next() {
        if (!this.b) {
            return this.a.next();
        }
        E e2 = this.c;
        this.b = false;
        this.c = null;
        return e2;
    }

    @Override
    public void remove() {
        aU.b(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }

    @Override
    public E a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }
}

