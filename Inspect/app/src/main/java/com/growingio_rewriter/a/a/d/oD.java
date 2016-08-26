/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lc;
import com.growingio.a.a.d.oE;
import com.growingio.a.a.d.ot;
import com.growingio.a.a.d.ou;
import java.util.NavigableMap;

final class oD
extends ot<C> {
    private final kW<C> c;
    final /* synthetic */ ot b;

    oD(kW<C> var1_1) {
        this.b = var1_1;
        super(new oE(kW.c(), kW2, var1_1.a, null), null);
        this.c = kW2;
    }

    @Override
    public boolean d(kW<C> kW2) {
        if (!this.c.j() && this.c.a(kW2)) {
            kW kW3 = ot.a(this.b, kW2);
            return kW3 != null && !kW3.c(this.c).j();
        }
        return false;
    }

    @Override
    public kW<C> b(C c2) {
        if (!this.c.f(c2)) {
            return null;
        }
        kW<C> kW2 = this.b.b(c2);
        return kW2 == null ? null : kW2.c(this.c);
    }

    @Override
    public void a(kW<C> kW2) {
        aU.a(this.c.a(kW2), "Cannot add range %s to subRangeSet(%s)", kW2, this.c);
        super.a(kW2);
    }

    @Override
    public void b(kW<C> kW2) {
        if (kW2.b(this.c)) {
            this.b.b(kW2.c(this.c));
        }
    }

    @Override
    public boolean a(C c2) {
        return this.c.f(c2) && this.b.a((Comparable)c2);
    }

    @Override
    public void b() {
        this.b.b(this.c);
    }

    @Override
    public lc<C> g(kW<C> kW2) {
        if (kW2.a(this.c)) {
            return this;
        }
        if (kW2.b(this.c)) {
            return new oD((ot)this, this.c.c(kW2));
        }
        return eX.c();
    }
}

