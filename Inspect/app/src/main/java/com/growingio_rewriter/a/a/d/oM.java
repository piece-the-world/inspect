/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.j;
import com.growingio.a.a.d.oH;
import com.growingio.a.a.d.oN;
import java.util.ArrayDeque;
import java.util.Iterator;

final class oM
extends j<T> {
    private final ArrayDeque<oN<T>> b;
    final /* synthetic */ oH a;

    oM(T var1_1) {
        this.a = var1_1;
        this.b = new ArrayDeque();
        this.b.addLast(this.a(t2));
    }

    @Override
    protected T a() {
        while (!this.b.isEmpty()) {
            oN<T> oN2 = this.b.getLast();
            if (oN2.b.hasNext()) {
                Object t2 = oN2.b.next();
                this.b.addLast(this.a(t2));
                continue;
            }
            this.b.removeLast();
            return oN2.a;
        }
        return this.b();
    }

    private oN<T> a(T t2) {
        return new oN<T>(t2, this.a.c(t2).iterator());
    }
}

