/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.ii;
import java.util.Map;

final class iG
implements aV<Map.Entry<V, K>> {
    final /* synthetic */ aV a;

    iG(aV aV2) {
        this.a = aV2;
    }

    @Override
    public boolean a(Map.Entry<V, K> entry) {
        return this.a.a(ii.a(entry.getValue(), entry.getKey()));
    }
}

