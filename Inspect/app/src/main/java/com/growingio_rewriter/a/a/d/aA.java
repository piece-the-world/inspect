/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.d.aw;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kU;
import java.util.BitSet;
import java.util.Deque;

final class aA
extends j<T> {
    private final Deque<T> b;
    private final BitSet c;
    final /* synthetic */ aw a;

    aA(T var1_1) {
        this.a = var1_1;
        this.b = kU.a(8);
        this.c = new BitSet();
        this.b.addLast(t2);
    }

    @Override
    protected T a() {
        while (!this.b.isEmpty()) {
            T t2 = this.b.getLast();
            if (this.c.get(this.b.size() - 1)) {
                this.b.removeLast();
                this.c.clear(this.b.size());
                aw.a(this.b, this.a.b(t2));
                return t2;
            }
            this.c.set(this.b.size() - 1);
            aw.a(this.b, this.a.a(t2));
        }
        return this.b();
    }
}

