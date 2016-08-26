/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.M;
import com.growingio.a.a.d.mH;
import com.growingio.a.a.d.mJ;
import java.util.Map;

class mK
extends M<R, V> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ mJ b;

    mK() {
        this.b = var1_1;
        this.a = var2_2;
    }

    @Override
    public R getKey() {
        return (R)this.a.getKey();
    }

    @Override
    public V getValue() {
        return ((Map)this.a.getValue()).get(this.b.b.a);
    }

    @Override
    public V setValue(V v2) {
        return ((Map)this.a.getValue()).put(this.b.b.a, aU.a(v2));
    }
}

