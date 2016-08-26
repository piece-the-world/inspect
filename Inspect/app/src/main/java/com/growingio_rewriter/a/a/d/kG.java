/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gb;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class kG<F, T>
implements Iterator<T> {
    final Iterator<? extends F> a;
    private Iterator<? extends T> b = gb.a();
    private Iterator<? extends T> c;

    kG(Iterator<? extends F> iterator) {
        this.a = aU.a(iterator);
    }

    abstract Iterator<? extends T> a(F var1);

    @Override
    public boolean hasNext() {
        aU.a(this.b);
        if (this.b.hasNext()) {
            return true;
        }
        while (this.a.hasNext()) {
            this.b = this.a(this.a.next());
            aU.a(this.b);
            if (!this.b.hasNext()) continue;
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = this.b;
        return this.b.next();
    }

    @Override
    public void remove() {
        aK.a(this.c != null);
        this.c.remove();
        this.c = null;
    }
}

