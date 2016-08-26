/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oA;
import java.util.Map;

class oC
extends j<Map.Entry<bw<C>, kW<C>>> {
    final /* synthetic */ kT a;
    final /* synthetic */ oA b;

    oC(oA oA2, kT kT2) {
        this.b = oA2;
        this.a = kT2;
    }

    protected Map.Entry<bw<C>, kW<C>> d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        kW kW2 = (kW)this.a.next();
        return oA.a((oA)this.b).b.a(kW2.c) ? ii.a(kW2.c, kW2) : (Map.Entry<bw<C>, kW<C>>)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

