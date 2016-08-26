/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.M;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.du;
import com.growingio.a.a.d.dv;
import com.growingio.a.a.d.dw;
import com.growingio.a.a.d.dx;

class dy
extends M<V, K> {
    du<K, V> a;
    final /* synthetic */ dx b;

    dy(du<K, V> var1_1) {
        this.b = var1_1;
        this.a = du2;
    }

    @Override
    public V getKey() {
        return (V)this.a.h;
    }

    @Override
    public K getValue() {
        return (K)this.a.g;
    }

    @Override
    public K setValue(K k2) {
        du<K, Object> du2;
        Object object = this.a.g;
        int n2 = dH.a(k2);
        if (n2 == this.a.a && aL.a(k2, object)) {
            return k2;
        }
        aU.a(dr.a(this.b.a.a.a, k2, n2) == null, "value already present: %s", k2);
        dr.a(this.b.a.a.a, this.a);
        this.a = du2 = new du<K, Object>(k2, n2, this.a.h, this.a.b);
        dr.a(this.b.a.a.a, du2, null);
        this.b.d = dr.b(this.b.a.a.a);
        return (K)object;
    }
}

