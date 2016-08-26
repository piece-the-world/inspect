/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import java.io.Serializable;

class dT<K, V>
extends M<K, V>
implements Serializable {
    final K g;
    final V h;
    private static final long a = 0;

    dT(K k2, V v2) {
        this.g = k2;
        this.h = v2;
    }

    @Override
    public final K getKey() {
        return this.g;
    }

    @Override
    public final V getValue() {
        return this.h;
    }

    @Override
    public final V setValue(V v2) {
        throw new UnsupportedOperationException();
    }
}

