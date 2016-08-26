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

class oz
extends j<Map.Entry<bw<C>, kW<C>>> {
    bw<C> a;
    final /* synthetic */ bw b;
    final /* synthetic */ kT c;
    final /* synthetic */ ox d;

    oz(ox ox2, bw bw2, kT kT2) {
        this.d = ox2;
        this.b = bw2;
        this.c = kT2;
        this.a = this.b;
    }

    protected Map.Entry<bw<C>, kW<C>> d() {
        if (this.a == bw.d()) {
            return (Map.Entry)this.b();
        }
        if (this.c.hasNext()) {
            kW kW2 = (kW)this.c.next();
            kW<bw<C>> kW3 = kW.a(kW2.c, this.a);
            this.a = kW2.b;
            if (ox.a((ox)this.d).b.a(kW3.b)) {
                return ii.a(kW3.b, kW3);
            }
        } else if (ox.a((ox)this.d).b.a(bw.d())) {
            kW<bw<C>> kW4 = kW.a(bw.d(), this.a);
            this.a = bw.d();
            return ii.a(bw.d(), kW4);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

