/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.d.aw;
import com.growingio.a.a.d.kU;
import com.growingio.a.a.d.oP;
import java.util.BitSet;
import java.util.Deque;

final class aB
extends oP<T> {
    private final Deque<T> b;
    private final BitSet c;
    final /* synthetic */ aw a;

    aB(T var1_1) {
        this.a = var1_1;
        this.b = kU.a(8);
        this.b.addLast(t2);
        this.c = new BitSet();
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    @Override
    public T next() {
        do {
            T t2 = this.b.getLast();
            boolean bl2 = this.c.get(this.b.size() - 1);
            if (bl2) {
                this.b.removeLast();
                this.c.clear(this.b.size());
                return t2;
            }
            this.c.set(this.b.size() - 1);
            aw.a(this.b, this.a.b(t2));
            aw.a(this.b, this.a.a(t2));
        } while (true);
    }
}

