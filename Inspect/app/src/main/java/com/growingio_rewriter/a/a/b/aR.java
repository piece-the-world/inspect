/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aQ;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.b;
import java.util.Iterator;

class aR
extends b<T> {
    private final Iterator<? extends aP<? extends T>> b;
    final /* synthetic */ aQ a;

    aR(aQ aQ2) {
        this.a = aQ2;
        this.b = aU.a(this.a.a.iterator());
    }

    @Override
    protected T a() {
        while (this.b.hasNext()) {
            aP<T> aP2 = this.b.next();
            if (!aP2.b()) continue;
            return aP2.c();
        }
        return this.b();
    }
}

