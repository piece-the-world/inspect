/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.d.aw;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.kU;
import com.growingio.a.a.d.oP;
import java.util.Deque;

final class aC
extends oP<T>
implements kT<T> {
    private final Deque<T> b;
    final /* synthetic */ aw a;

    aC(T var1_1) {
        this.a = var1_1;
        this.b = kU.a(8);
        this.b.addLast(t2);
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    @Override
    public T next() {
        T t2 = this.b.removeLast();
        aw.a(this.b, this.a.b(t2));
        aw.a(this.b, this.a.a(t2));
        return t2;
    }

    @Override
    public T a() {
        return this.b.getLast();
    }
}

