/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lc;
import com.growingio.a.a.d.ot;
import com.growingio.a.a.d.ou;
import com.growingio.a.a.d.ox;
import java.util.NavigableMap;

final class ow
extends ot<C> {
    final /* synthetic */ ot b;

    ow(ot ot2) {
        this.b = ot2;
        super(new ox(ot2.a), null);
    }

    @Override
    public void a(kW<C> kW2) {
        this.b.b(kW2);
    }

    @Override
    public void b(kW<C> kW2) {
        this.b.a(kW2);
    }

    @Override
    public boolean a(C c2) {
        return !this.b.a((Comparable)c2);
    }

    @Override
    public lc<C> l() {
        return this.b;
    }
}

