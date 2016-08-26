/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bH;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.el;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.oP;
import java.util.Map;

abstract class bG<K, V>
extends el<K, V> {
    private final int a;

    bG(int n2) {
        this.a = n2;
    }

    abstract ei<K, Integer> h_();

    private boolean e() {
        return this.a == this.h_().size();
    }

    K c(int n2) {
        return this.h_().m().h().get(n2);
    }

    abstract V a(int var1);

    @Override
    fg<K> c() {
        return this.e() ? this.h_().m() : super.c();
    }

    @Override
    public int size() {
        return this.a;
    }

    @Override
    public V get(Object object) {
        Integer n2 = this.h_().get(object);
        return n2 == null ? null : (V)this.a(n2);
    }

    @Override
    oP<Map.Entry<K, V>> d() {
        return new bH(this);
    }
}

