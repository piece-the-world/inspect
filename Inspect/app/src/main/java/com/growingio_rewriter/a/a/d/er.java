/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dT;

class er<K, V>
extends dT<K, V> {
    static <K, V> er<K, V>[] a(int n2) {
        return new er[n2];
    }

    er(K k2, V v2) {
        super(k2, v2);
        aK.a(k2, v2);
    }

    er(er<K, V> er2) {
        super(er2.getKey(), er2.getValue());
    }

    er<K, V> a() {
        return null;
    }

    er<K, V> b() {
        return null;
    }

    boolean c() {
        return true;
    }
}

