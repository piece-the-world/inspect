/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.er;
import com.growingio.a.a.d.et;

final class es<K, V>
extends et<K, V> {
    private final transient er<K, V> a;

    es(K k2, V v2, er<K, V> er2, er<K, V> er3) {
        super(k2, v2, er2);
        this.a = er3;
    }

    @Override
    er<K, V> b() {
        return this.a;
    }
}

