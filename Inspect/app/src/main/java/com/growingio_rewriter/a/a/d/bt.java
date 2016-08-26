/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kU;
import java.util.Collections;
import java.util.Queue;

class bt<T>
extends j<T> {
    private final Queue<T> a;

    /* varargs */ bt(T ... arrT) {
        this.a = kU.a(arrT.length);
        Collections.addAll(this.a, arrT);
    }

    bt(Queue<T> queue) {
        this.a = aU.a(queue);
    }

    @Override
    public T a() {
        return this.a.isEmpty() ? this.b() : this.a.remove();
    }
}

