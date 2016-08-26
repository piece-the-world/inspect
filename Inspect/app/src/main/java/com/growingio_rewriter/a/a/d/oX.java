/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import com.growingio.a.a.d.oT;
import com.growingio.a.a.d.oV;
import com.growingio.a.a.d.oW;

class oX
extends M<K, V> {
    final /* synthetic */ Object a;
    final /* synthetic */ oW b;

    oX(oW oW2, Object object) {
        this.b = oW2;
        this.a = object;
    }

    @Override
    public K getKey() {
        return (K)this.a;
    }

    @Override
    public V getValue() {
        return this.b.a.a.get(this.a);
    }

    @Override
    public V setValue(V v2) {
        return this.b.a.a.put(this.a, v2);
    }
}

