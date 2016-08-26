/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bC;
import com.growingio.a.a.d.bD;
import com.growingio.a.a.d.bG;
import com.growingio.a.a.d.bI;
import com.growingio.a.a.d.ei;
import java.util.Map;

final class bJ
extends bG<R, Map<C, V>> {
    final /* synthetic */ bC a;

    private bJ(bC bC2) {
        this.a = bC2;
        super(bC.a(bC2).length);
    }

    @Override
    ei<R, Integer> h_() {
        return bC.e(this.a);
    }

    Map<C, V> b(int n2) {
        return new bI(this.a, n2);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }

    /* synthetic */ bJ(bC bC2, bD bD2) {
        this(bC2);
    }
}

