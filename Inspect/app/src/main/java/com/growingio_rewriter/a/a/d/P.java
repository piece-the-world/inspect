/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.N;
import com.growingio.a.a.d.O;
import com.growingio.a.a.d.jV;
import com.growingio.a.a.d.jr;
import java.util.Iterator;
import java.util.Map;

class P
extends jV<K, V> {
    final /* synthetic */ N a;

    private P(N n2) {
        this.a = n2;
    }

    @Override
    jr<K, V> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.a.m();
    }

    /* synthetic */ P(N n2, O o2) {
        this(n2);
    }
}

