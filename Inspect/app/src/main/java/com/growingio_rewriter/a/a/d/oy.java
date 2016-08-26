/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.ox;
import java.util.Map;

class oy
extends j<Map.Entry<bw<C>, kW<C>>> {
    bw<C> a;
    final /* synthetic */ bw b;
    final /* synthetic */ kT c;
    final /* synthetic */ ox d;

    oy(ox ox2, bw bw2, kT kT2) {
        this.d = ox2;
        this.b = bw2;
        this.c = kT2;
        this.a = this.b;
    }

    protected Map.Entry<bw<C>, kW<C>> d() {
        kW kW2;
        if (ox.a((ox)this.d).c.a(this.a) || this.a == bw.e()) {
            return (Map.Entry)this.b();
        }
        if (this.c.hasNext()) {
            kW kW3 = (kW)this.c.next();
            kW2 = kW.a(this.a, kW3.b);
            this.a = kW3.c;
        } else {
            kW2 = kW.a(this.a, bw.e());
            this.a = bw.e();
        }
        return ii.a(kW2.b, kW2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

