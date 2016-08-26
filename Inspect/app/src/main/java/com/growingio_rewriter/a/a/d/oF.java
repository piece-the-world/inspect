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

class oF
extends j<Map.Entry<bw<C>, kW<C>>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ bw b;
    final /* synthetic */ oE c;

    oF(oE oE2, Iterator iterator, bw bw2) {
        this.c = oE2;
        this.a = iterator;
        this.b = bw2;
    }

    protected Map.Entry<bw<C>, kW<C>> d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        kW kW2 = (kW)this.a.next();
        if (this.b.a(kW2.b)) {
            return (Map.Entry)this.b();
        }
        kW2 = kW2.c(oE.a(this.c));
        return ii.a(kW2.b, kW2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

