/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oE;
import java.util.Iterator;
import java.util.Map;

class oG
extends j<Map.Entry<bw<C>, kW<C>>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ oE b;

    oG(oE oE2, Iterator iterator) {
        this.b = oE2;
        this.a = iterator;
    }

    protected Map.Entry<bw<C>, kW<C>> d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        kW kW2 = (kW)this.a.next();
        if (oE.a((oE)this.b).b.a(kW2.c) >= 0) {
            return (Map.Entry)this.b();
        }
        kW2 = kW2.c(oE.a(this.b));
        if (oE.b(this.b).f(kW2.b)) {
            return ii.a(kW2.b, kW2);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

