/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.ok;
import com.growingio.a.a.d.ol;
import com.growingio.a.a.d.oo;
import java.util.Iterator;
import java.util.Map;

class or
extends j<Map.Entry<kW<K>, V>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ oo b;

    or(oo oo2, Iterator iterator) {
        this.b = oo2;
        this.a = iterator;
    }

    protected Map.Entry<kW<K>, V> d() {
        while (this.a.hasNext()) {
            ok ok2 = (ok)this.a.next();
            if (ok2.b().a(ol.a((ol)this.b.b).c) >= 0) {
                return (Map.Entry)this.b();
            }
            if (ok2.c().a(ol.a((ol)this.b.b).b) <= 0) continue;
            return ii.a(ok2.a().c(ol.a(this.b.b)), ok2.getValue());
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

