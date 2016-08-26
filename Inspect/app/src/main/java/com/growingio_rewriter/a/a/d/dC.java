/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.du;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class dC<T>
implements Iterator<T> {
    du<K, V> b;
    du<K, V> c;
    int d;
    final /* synthetic */ dr e;

    dC(dr dr2) {
        this.e = dr2;
        this.b = dr.a(this.e);
        this.c = null;
        this.d = dr.b(this.e);
    }

    @Override
    public boolean hasNext() {
        if (dr.b(this.e) != this.d) {
            throw new ConcurrentModificationException();
        }
        return this.b != null;
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        du<K, V> du2 = this.b;
        this.b = du2.e;
        this.c = du2;
        return this.b(du2);
    }

    @Override
    public void remove() {
        if (dr.b(this.e) != this.d) {
            throw new ConcurrentModificationException();
        }
        aK.a(this.c != null);
        dr.a(this.e, this.c);
        this.d = dr.b(this.e);
        this.c = null;
    }

    abstract T b(du<K, V> var1);
}

