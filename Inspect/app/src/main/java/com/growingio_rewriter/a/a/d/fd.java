/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lc;
import com.growingio.a.a.d.ot;
import java.util.Set;

public class fd<C extends Comparable<?>> {
    private final lc<C> a = ot.c();

    public fd<C> a(kW<C> kW2) {
        if (kW2.j()) {
            throw new IllegalArgumentException("range must not be empty, but was " + kW2);
        }
        if (!this.a.l().d(kW2)) {
            for (kW<C> kW3 : this.a.n()) {
                aU.a(!kW3.b(kW2) || kW3.c(kW2).j(), "Ranges may not overlap, but received %s and %s", kW3, kW2);
            }
            throw new AssertionError((Object)"should have thrown an IAE above");
        }
        this.a.a(kW2);
        return this;
    }

    public fd<C> a(lc<C> lc2) {
        for (kW<C> kW2 : lc2.n()) {
            this.a(kW2);
        }
        return this;
    }

    public eX<C> a() {
        return eX.d(this.a);
    }
}

