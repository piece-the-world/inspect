/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.o.a.aC;
import com.growingio.a.a.o.a.ah;
import com.growingio.a.a.o.a.ai;
import com.growingio.a.a.o.a.bU;
import java.util.List;

abstract class aD
extends ah<V, C> {
    private List<aP<V>> c;
    final /* synthetic */ aC b;

    /*
     * WARNING - Possible parameter corruption
     */
    aD(dQ<? extends bU<? extends V>> n2, boolean dQ2) {
        this.b = (aC)n2;
        super((ah)n2, dQ2, bl2, true);
        this.c = dQ2.isEmpty() ? ea.d() : gO.b(dQ2.size());
        for (int i2 = 0; i2 < dQ2.size(); ++i2) {
            this.c.add(null);
        }
    }

    final void a(boolean bl2, int n2, V v2) {
        List<aP<V>> list = this.c;
        if (list != null) {
            list.set(n2, aP.c(v2));
        } else {
            aU.b(bl2 || this.b.isCancelled(), "Future was done before all dependencies completed");
        }
    }

    @Override
    final void b() {
        List<aP<V>> list = this.c;
        if (list != null) {
            this.b.b(this.a(list));
        } else {
            aU.b(this.b.isDone());
        }
    }

    @Override
    void a() {
        super.a();
        this.c = null;
    }

    abstract C a(List<aP<V>> var1);
}

