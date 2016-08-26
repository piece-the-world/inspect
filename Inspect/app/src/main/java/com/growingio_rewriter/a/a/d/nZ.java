/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.nX;
import com.growingio.a.a.d.of;
import java.util.Iterator;
import java.util.NoSuchElementException;

class nZ
implements Iterator<km<E>> {
    of<E> a;
    km<E> b;
    final /* synthetic */ nX c;

    nZ(nX nX2) {
        this.c = nX2;
        this.a = nX.a(this.c);
    }

    @Override
    public boolean hasNext() {
        if (this.a == null) {
            return false;
        }
        if (nX.b(this.c).b(this.a.a())) {
            this.a = null;
            return false;
        }
        return true;
    }

    public km<E> a() {
        km km2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = km2 = nX.a(this.c, this.a);
        this.a = of.g(this.a) == nX.c(this.c) ? null : of.g(this.a);
        return km2;
    }

    @Override
    public void remove() {
        aK.a(this.b != null);
        this.c.c(this.b.a(), 0);
        this.b = null;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

