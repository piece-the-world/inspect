/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import java.util.Map;

final class ip
extends M<K, V> {
    final /* synthetic */ Map.Entry a;

    ip(Map.Entry entry) {
        this.a = entry;
    }

    @Override
    public K getKey() {
        return this.a.getKey();
    }

    @Override
    public V getValue() {
        return this.a.getValue();
    }
}

