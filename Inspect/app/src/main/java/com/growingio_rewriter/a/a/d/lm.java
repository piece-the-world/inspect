/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dI;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.li;
import com.growingio.a.a.d.lk;
import com.growingio.a.a.d.ll;
import java.util.Map;

class lm
extends dI<Map.Entry<V, K>> {
    final /* synthetic */ ll a;

    lm(ll ll2) {
        this.a = ll2;
    }

    public Map.Entry<V, K> b(int n2) {
        Map.Entry entry = li.d(this.a.a.a)[n2];
        return ii.a(entry.getValue(), entry.getKey());
    }

    @Override
    dQ<Map.Entry<V, K>> c() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

