/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.lx;
import com.growingio.a.a.d.ly;

final class lA
extends ea<V> {
    final /* synthetic */ lx a;

    private lA(lx lx2) {
        this.a = lx2;
    }

    @Override
    public int size() {
        return this.a.n();
    }

    @Override
    public V get(int n2) {
        return this.a.b(n2);
    }

    @Override
    boolean i_() {
        return true;
    }

    /* synthetic */ lA(lx lx2, ly ly2) {
        this(lx2);
    }
}

