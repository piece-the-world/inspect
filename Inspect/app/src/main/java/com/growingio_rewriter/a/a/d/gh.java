/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class gh
implements Iterator<Object> {
    gh() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        aK.a(false);
    }
}

