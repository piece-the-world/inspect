/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.fM;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class ga<T>
extends cx<T> {
    private final Iterable<? extends T> a;

    private ga(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.a(this.a.iterator());
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    /* synthetic */ ga(Iterable iterable, fM fM2) {
        this(iterable);
    }
}

