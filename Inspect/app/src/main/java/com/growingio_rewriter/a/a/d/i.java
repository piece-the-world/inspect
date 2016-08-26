/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.oQ;
import java.util.NoSuchElementException;

abstract class i<E>
extends oQ<E> {
    private final int a;
    private int b;

    protected abstract E a(int var1);

    protected i(int n2) {
        this(n2, 0);
    }

    protected i(int n2, int n3) {
        aU.b(n3, n2);
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a(this.b++);
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override
    public final E previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.a(--this.b);
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
}

