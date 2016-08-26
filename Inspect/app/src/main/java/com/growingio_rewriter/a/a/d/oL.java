/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.d.oP;
import java.util.ArrayDeque;
import java.util.Queue;

final class oL
extends oP<T>
implements kT<T> {
    private final Queue<T> b;
    final /* synthetic */ oH a;

    oL(T var1_1) {
        this.a = var1_1;
        this.b = new ArrayDeque<T>();
        this.b.add(t2);
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    @Override
    public T a() {
        return this.b.element();
    }

    @Override
    public T next() {
        T t2 = this.b.remove();
        fL.a(this.b, this.a.c(t2));
        return t2;
    }
}

