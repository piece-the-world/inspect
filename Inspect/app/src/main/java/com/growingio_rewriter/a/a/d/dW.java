/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dU;
import com.growingio.a.a.d.dV;
import java.io.Serializable;
import java.util.EnumMap;

class dW<K extends Enum<K>, V>
implements Serializable {
    final EnumMap<K, V> a;
    private static final long b = 0;

    dW(EnumMap<K, V> enumMap) {
        this.a = enumMap;
    }

    Object a() {
        return new dU(this.a, null);
    }
}

