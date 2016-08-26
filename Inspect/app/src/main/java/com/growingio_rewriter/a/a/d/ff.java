/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.kW;
import java.io.Serializable;

final class ff<C extends Comparable>
implements Serializable {
    private final ea<kW<C>> a;

    ff(ea<kW<C>> ea2) {
        this.a = ea2;
    }

    Object a() {
        if (this.a.isEmpty()) {
            return eX.c();
        }
        if (this.a.equals(ea.a(kW.c()))) {
            return eX.d();
        }
        return new eX<C>(this.a);
    }
}

