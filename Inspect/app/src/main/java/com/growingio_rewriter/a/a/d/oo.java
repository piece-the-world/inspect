/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oh;
import com.growingio.a.a.d.ok;
import com.growingio.a.a.d.ol;
import com.growingio.a.a.d.op;
import com.growingio.a.a.d.oq;
import com.growingio.a.a.d.or;
import com.growingio.a.a.d.os;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

class oo
extends AbstractMap<kW<K>, V> {
    final /* synthetic */ ol b;

    oo(ol ol2) {
        this.b = ol2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public V get(Object object) {
        try {
            if (object instanceof kW) {
                kW kW2 = (kW)object;
                if (!ol.a(this.b).a(kW2) || kW2.j()) {
                    return null;
                }
                ok ok2 = null;
                if (kW2.b.a(ol.a((ol)this.b).b) == 0) {
                    Map.Entry entry = oh.a(this.b.a).floorEntry(kW2.b);
                    if (entry != null) {
                        ok2 = (ok)entry.getValue();
                    }
                } else {
                    ok2 = (ok)oh.a(this.b.a).get(kW2.b);
                }
                if (ok2 != null && ok2.a().b(ol.a(this.b)) && ok2.a().c(ol.a(this.b)).equals(kW2)) {
                    return ok2.getValue();
                }
            }
        }
        catch (ClassCastException var2_3) {
            return null;
        }
        return null;
    }

    @Override
    public V remove(Object object) {
        V v2 = this.get(object);
        if (v2 != null) {
            kW kW2 = (kW)object;
            this.b.a.a(kW2);
            return v2;
        }
        return null;
    }

    @Override
    public void clear() {
        this.b.d();
    }

    private boolean a(aV<? super Map.Entry<kW<K>, V>> aV2) {
        ArrayList<kW<K>> arrayList = gO.a();
        for (Map.Entry<kW<K>, V> entry2 : this.entrySet()) {
            if (!aV2.a(entry2)) continue;
            arrayList.add(entry2.getKey());
        }
        for (kW kW2 : arrayList) {
            this.b.a.a(kW2);
        }
        return !arrayList.isEmpty();
    }

    @Override
    public Set<kW<K>> keySet() {
        return new op(this, this);
    }

    @Override
    public Set<Map.Entry<kW<K>, V>> entrySet() {
        return new oq(this);
    }

    Iterator<Map.Entry<kW<K>, V>> a() {
        if (ol.a(this.b).j()) {
            return gb.a();
        }
        bw bw2 = aH.a(oh.a(this.b.a).floorKey(ol.a((ol)this.b).b), ol.a((ol)this.b).b);
        Iterator iterator = oh.a(this.b.a).tailMap(bw2, true).values().iterator();
        return new or(this, iterator);
    }

    @Override
    public Collection<V> values() {
        return new os(this, this);
    }

    static /* synthetic */ boolean a(oo oo2, aV aV2) {
        return oo2.a(aV2);
    }
}

