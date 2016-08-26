/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.eS;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lb;
import com.growingio.a.a.d.lc;
import com.growingio.a.a.d.oh;
import com.growingio.a.a.d.ot;
import java.util.Map;
import java.util.Set;

public final class eV<K extends Comparable<?>, V> {
    private final lc<K> a = ot.c();
    private final lb<K, V> b = oh.a();

    public eV<K, V> a(kW<K> kW2, V v2) {
        aU.a(kW2);
        aU.a(v2);
        aU.a(!kW2.j(), "Range must not be empty, but was %s", kW2);
        if (!this.a.l().d(kW2)) {
            for (Map.Entry<kW<K>, V> entry : this.b.i().entrySet()) {
                kW<K> kW3 = entry.getKey();
                if (!kW3.b(kW2) || kW3.c(kW2).j()) continue;
                throw new IllegalArgumentException("Overlapping ranges: range " + kW2 + " overlaps with entry " + entry);
            }
        }
        this.a.a(kW2);
        this.b.b(kW2, v2);
        return this;
    }

    public eV<K, V> a(lb<K, ? extends V> lb2) {
        for (Map.Entry<kW<K>, V> entry : lb2.i().entrySet()) {
            this.a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public eS<K, V> a() {
        Map<kW<K>, V> map = this.b.i();
        ec<kW<K>> ec2 = new ec<kW<K>>(map.size());
        ec<V> ec3 = new ec<V>(map.size());
        for (Map.Entry<kW<K>, V> entry : map.entrySet()) {
            ec2.c(entry.getKey());
            ec3.c(entry.getValue());
        }
        return new eS(ec2.b(), ec3.b());
    }
}

