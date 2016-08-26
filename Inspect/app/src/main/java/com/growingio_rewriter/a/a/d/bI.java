/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bC;
import com.growingio.a.a.d.bG;
import com.growingio.a.a.d.ei;

final class bI
extends bG<C, V> {
    private final int c;
    final /* synthetic */ bC a;

    bI(bC bC2, int n2) {
        this.a = bC2;
        super(bC.a(bC2)[n2]);
        this.c = n2;
    }

    @Override
    ei<C, Integer> h_() {
        return bC.b(this.a);
    }

    @Override
    V a(int n2) {
        return (V)bC.c(this.a)[this.c][n2];
    }

    @Override
    boolean b() {
        return true;
    }
}

