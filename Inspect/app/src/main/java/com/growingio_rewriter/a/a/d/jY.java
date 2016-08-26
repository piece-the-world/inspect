/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jX;
import com.growingio.a.a.d.kx;
import java.util.Collection;
import java.util.Map;

class jY
extends kx<K> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ jX b;

    jY(jX jX2, Map.Entry entry) {
        this.b = jX2;
        this.a = entry;
    }

    @Override
    public K a() {
        return this.a.getKey();
    }

    @Override
    public int b() {
        return ((Collection)this.a.getValue()).size();
    }
}

