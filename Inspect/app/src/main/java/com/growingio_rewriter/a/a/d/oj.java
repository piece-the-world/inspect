/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.iS;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oh;
import com.growingio.a.a.d.ok;
import java.util.Iterator;
import java.util.Map;

final class oj
extends iS<kW<K>, V> {
    final Iterable<Map.Entry<kW<K>, V>> a;
    final /* synthetic */ oh b;

    oj(Iterable<ok<K, V>> var1_1) {
        this.b = var1_1;
        this.a = iterable;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public V get(Object object) {
        if (object instanceof kW) {
            kW kW2 = (kW)object;
            ok ok2 = (ok)oh.a(this.b).get(kW2.b);
            if (ok2 != null && ok2.a().equals(kW2)) {
                return ok2.getValue();
            }
        }
        return null;
    }

    @Override
    public int size() {
        return oh.a(this.b).size();
    }

    @Override
    Iterator<Map.Entry<kW<K>, V>> b() {
        return this.a.iterator();
    }
}

