/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kW;
import java.io.Serializable;

class fc<C extends Comparable>
implements Serializable {
    private final ea<kW<C>> a;
    private final bO<C> b;

    fc(ea<kW<C>> ea2, bO<C> bO2) {
        this.a = ea2;
        this.b = bO2;
    }

    Object a() {
        return new eX<C>(this.a).a(this.b);
    }
}

