/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.ld;
import com.growingio.a.a.d.le;
import java.io.Serializable;

final class lg<C extends Comparable>
implements Serializable {
    final kW<C> a;
    final bO<C> b;

    private lg(kW<C> kW2, bO<C> bO2) {
        this.a = kW2;
        this.b = bO2;
    }

    private Object a() {
        return new ld<C>(this.a, this.b);
    }

    /* synthetic */ lg(kW kW2, bO bO2, le le2) {
        this(kW2, bO2);
    }
}

