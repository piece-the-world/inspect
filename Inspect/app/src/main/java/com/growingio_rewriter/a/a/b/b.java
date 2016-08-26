/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.c;
import com.growingio.a.a.b.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class b<T>
implements Iterator<T> {
    private d a = d.b;
    private T b;

    protected b() {
    }

    protected abstract T a();

    protected final T b() {
        this.a = d.c;
        return null;
    }

    @Override
    public final boolean hasNext() {
        aU.b(this.a != d.d);
        switch (c.a[this.a.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
        }
        return this.c();
    }

    private boolean c() {
        this.a = d.d;
        this.b = this.a();
        if (this.a != d.c) {
            this.a = d.a;
            return true;
        }
        return false;
    }

    @Override
    public final T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = d.b;
        T t2 = this.b;
        this.b = null;
        return t2;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

