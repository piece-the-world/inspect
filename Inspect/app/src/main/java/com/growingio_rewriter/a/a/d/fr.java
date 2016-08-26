/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dI;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.fq;
import com.growingio.a.a.d.ii;
import java.util.Map;

class fr
extends dI<Map.Entry<K, V>> {
    final /* synthetic */ fq a;

    fr(fq fq2) {
        this.a = fq2;
    }

    public Map.Entry<K, V> b(int n2) {
        return ii.a(fp.a(this.a.a).h().get(n2), fp.b(this.a.a).get(n2));
    }

    @Override
    dQ<Map.Entry<K, V>> c() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

