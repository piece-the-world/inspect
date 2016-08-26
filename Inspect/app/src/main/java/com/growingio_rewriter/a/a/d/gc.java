/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oQ;
import java.util.NoSuchElementException;

final class gc
extends oQ<Object> {
    gc() {
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
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object previous() {
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }
}

