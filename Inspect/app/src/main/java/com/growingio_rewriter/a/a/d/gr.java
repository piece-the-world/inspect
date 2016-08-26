/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.gs;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.oP;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class gr<T>
extends oP<T> {
    final Queue<kT<T>> a;

    public gr(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        gs gs2 = new gs(this, comparator);
        this.a = new PriorityQueue<kT<T>>(2, gs2);
        for (Iterator<T> iterator : iterable) {
            if (!iterator.hasNext()) continue;
            this.a.add(gb.k(iterator));
        }
    }

    @Override
    public boolean hasNext() {
        return !this.a.isEmpty();
    }

    @Override
    public T next() {
        kT<T> kT2 = this.a.remove();
        T t2 = kT2.next();
        if (kT2.hasNext()) {
            this.a.add(kT2);
        }
        return t2;
    }
}

