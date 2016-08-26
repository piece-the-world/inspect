/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bX;

abstract class bY<L> {
    private final String a;

    bY(String string) {
        this.a = string;
    }

    abstract void a(L var1);

    void a(Iterable<bX<L>> iterable) {
        for (bX<L> bX2 : iterable) {
            bX2.a(this);
        }
    }

    static /* synthetic */ String a(bY bY2) {
        return bY2.a;
    }
}

