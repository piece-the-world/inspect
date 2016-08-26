/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.fX;
import java.util.Iterator;

class fY
implements Iterator<T> {
    boolean a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ fX c;

    fY(fX fX2, Iterator iterator) {
        this.c = fX2;
        this.b = iterator;
        this.a = true;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public T next() {
        Object e2 = this.b.next();
        this.a = false;
        return (T)e2;
    }

    @Override
    public void remove() {
        aK.a(!this.a);
        this.b.remove();
    }
}

