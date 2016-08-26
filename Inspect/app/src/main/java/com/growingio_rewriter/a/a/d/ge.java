/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oP;
import java.util.NoSuchElementException;

final class ge
extends oP<T> {
    boolean a;
    final /* synthetic */ Object b;

    ge(Object object) {
        this.b = object;
    }

    @Override
    public boolean hasNext() {
        return !this.a;
    }

    @Override
    public T next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return (T)this.b;
    }
}

