/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oP;
import java.util.NoSuchElementException;

public abstract class Z<T>
extends oP<T> {
    private T a;

    protected Z(T t2) {
        this.a = t2;
    }

    protected abstract T a(T var1);

    @Override
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override
    public final T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t2 = this.a;
            return t2;
        }
        finally {
            this.a = this.a(this.a);
        }
    }
}

