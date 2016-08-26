/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.M;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.ds;
import com.growingio.a.a.d.du;

class dt
extends M<K, V> {
    du<K, V> a;
    final /* synthetic */ ds b;

    dt(du<K, V> var1_1) {
        this.b = var1_1;
        this.a = du2;
    }

    @Override
    public K getKey() {
        return (K)this.a.g;
    }

    @Override
    public V getValue() {
        return (V)this.a.h;
    }

    @Override
    public V setValue(V v2) {
        Object object = this.a.h;
        int n2 = dH.a(v2);
        if (n2 == this.a.b && aL.a(v2, object)) {
            return v2;
        }
        aU.a(dr.b(this.b.a, v2, n2) == null, "value already present: %s", v2);
        dr.a(this.b.a, this.a);
        du<Object, V> du2 = new du<Object, V>(this.a.g, this.a.a, v2, n2);
        dr.a(this.b.a, du2, this.a);
        this.a.f = null;
        this.a.e = null;
        this.b.d = dr.b(this.b.a);
        if (this.b.c == this.a) {
            this.b.c = du2;
        }
        this.a = du2;
        return (V)object;
    }
}

