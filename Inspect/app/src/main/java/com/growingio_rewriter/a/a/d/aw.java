/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aB;
import com.growingio.a.a.d.aC;
import com.growingio.a.a.d.ax;
import com.growingio.a.a.d.az;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.d.oP;
import java.util.Deque;

public abstract class aw<T>
extends oH<T> {
    public abstract aP<T> a(T var1);

    public abstract aP<T> b(T var1);

    @Override
    public final Iterable<T> c(T t2) {
        aU.a(t2);
        return new ax(this, t2);
    }

    @Override
    oP<T> d(T t2) {
        return new aC(this, t2);
    }

    @Override
    oP<T> e(T t2) {
        return new aB(this, t2);
    }

    public final cx<T> f(T t2) {
        aU.a(t2);
        return new az(this, t2);
    }

    private static <T> void b(Deque<T> deque, aP<T> aP2) {
        if (aP2.b()) {
            deque.addLast(aP2.c());
        }
    }

    static /* synthetic */ void a(Deque deque, aP aP2) {
        aw.b(deque, aP2);
    }
}

