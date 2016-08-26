/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.c.B;
import java.io.Serializable;

final class E<K, V>
extends B<K, V>
implements Serializable {
    private final aq<K, V> a;
    private static final long b = 0;

    public E(aq<K, V> aq2) {
        this.a = aU.a(aq2);
    }

    @Override
    public V a(K k2) {
        return this.a.f(aU.a(k2));
    }
}

