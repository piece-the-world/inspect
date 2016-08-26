/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bC;
import com.growingio.a.a.d.bG;
import com.growingio.a.a.d.ei;

final class bE
extends bG<R, V> {
    private final int c;
    final /* synthetic */ bC a;

    bE(bC bC2, int n2) {
        this.a = bC2;
        super(bC.d(bC2)[n2]);
        this.c = n2;
    }

    @Override
    ei<R, Integer> h_() {
        return bC.e(this.a);
    }

    @Override
    V a(int n2) {
        return (V)bC.c(this.a)[n2][this.c];
    }

    @Override
    boolean b() {
        return true;
    }
}

