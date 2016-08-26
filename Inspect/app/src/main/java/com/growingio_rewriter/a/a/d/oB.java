/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oA;
import java.util.Iterator;
import java.util.Map;

class oB
extends j<Map.Entry<bw<C>, kW<C>>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ oA b;

    oB(oA oA2, Iterator iterator) {
        this.b = oA2;
        this.a = iterator;
    }

    protected Map.Entry<bw<C>, kW<C>> d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        kW kW2 = (kW)this.a.next();
        if (oA.a((oA)this.b).c.a(kW2.c)) {
            return (Map.Entry)this.b();
        }
        return ii.a(kW2.c, kW2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

