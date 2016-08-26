/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.cj;
import com.growingio.a.a.d.kn;
import java.util.Collection;
import java.util.Map;

class ck
implements aV<Map.Entry<K, Collection<V>>> {
    final /* synthetic */ aV a;
    final /* synthetic */ cj b;

    ck(cj cj2, aV aV2) {
        this.b = cj2;
        this.a = aV2;
    }

    @Override
    public boolean a(Map.Entry<K, Collection<V>> entry) {
        return this.a.a(kn.a(entry.getKey(), entry.getValue().size()));
    }
}

