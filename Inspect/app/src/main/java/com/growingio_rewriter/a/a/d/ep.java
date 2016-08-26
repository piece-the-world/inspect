/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import com.growingio.a.a.d.eo;
import com.growingio.a.a.d.fg;
import java.util.Map;

class ep
extends M<K, fg<V>> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ eo b;

    ep(eo eo2, Map.Entry entry) {
        this.b = eo2;
        this.a = entry;
    }

    @Override
    public K getKey() {
        return this.a.getKey();
    }

    public fg<V> a() {
        return fg.d(this.a.getValue());
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.a();
    }
}

