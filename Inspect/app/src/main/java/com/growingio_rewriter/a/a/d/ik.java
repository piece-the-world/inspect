/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import com.growingio.a.a.d.iE;
import java.util.Map;

final class ik
extends M<K, V2> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ iE b;

    ik(Map.Entry entry, iE iE2) {
        this.a = entry;
        this.b = iE2;
    }

    @Override
    public K getKey() {
        return this.a.getKey();
    }

    @Override
    public V2 getValue() {
        return this.b.a(this.a.getKey(), this.a.getValue());
    }
}

