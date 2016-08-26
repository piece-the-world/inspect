/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import com.growingio.a.a.d.ao;
import com.growingio.a.a.d.ap;

class aq
extends M<K, V> {
    final /* synthetic */ int a;
    final /* synthetic */ ap b;

    aq(ap ap2, int n2) {
        this.b = ap2;
        this.a = n2;
    }

    @Override
    public K getKey() {
        return this.b.a.a(this.a);
    }

    @Override
    public V getValue() {
        return this.b.a.b(this.a);
    }

    @Override
    public V setValue(V v2) {
        return this.b.a.a(this.a, v2);
    }
}

