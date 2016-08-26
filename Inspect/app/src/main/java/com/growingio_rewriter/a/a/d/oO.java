/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.d.oP;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

final class oO
extends oP<T> {
    private final Deque<Iterator<T>> b;
    final /* synthetic */ oH a;

    oO(T var1_1) {
        this.a = var1_1;
        this.b = new ArrayDeque<Iterator<T>>();
        this.b.addLast(gb.a(aU.a(t2)));
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    @Override
    public T next() {
        Iterator<T> iterator;
        Iterator<T> iterator2 = this.b.getLast();
        T t2 = aU.a(iterator2.next());
        if (!iterator2.hasNext()) {
            this.b.removeLast();
        }
        if ((iterator = this.a.c(t2).iterator()).hasNext()) {
            this.b.addLast(iterator);
        }
        return t2;
    }
}

