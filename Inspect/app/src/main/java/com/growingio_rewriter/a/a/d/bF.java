/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bC;
import com.growingio.a.a.d.bD;
import com.growingio.a.a.d.bE;
import com.growingio.a.a.d.bG;
import com.growingio.a.a.d.ei;
import java.util.Map;

final class bF
extends bG<C, Map<R, V>> {
    final /* synthetic */ bC a;

    private bF(bC bC2) {
        this.a = bC2;
        super(bC.d(bC2).length);
    }

    @Override
    ei<C, Integer> h_() {
        return bC.b(this.a);
    }

    Map<R, V> b(int n2) {
        return new bE(this.a, n2);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }

    /* synthetic */ bF(bC bC2, bD bD2) {
        this(bC2);
    }
}

