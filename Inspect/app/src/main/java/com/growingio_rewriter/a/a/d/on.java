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
import com.growingio.a.a.d.om;
import java.util.Iterator;
import java.util.Map;

class on
extends j<Map.Entry<kW<K>, V>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ om b;

    on(om om2, Iterator iterator) {
        this.b = om2;
        this.a = iterator;
    }

    protected Map.Entry<kW<K>, V> d() {
        if (this.a.hasNext()) {
            ok ok2 = (ok)this.a.next();
            if (ok2.c().a(ol.a((ol)this.b.a).b) <= 0) {
                return (Map.Entry)this.b();
            }
            return ii.a(ok2.a().c(ol.a(this.b.a)), ok2.getValue());
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

