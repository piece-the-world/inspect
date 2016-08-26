/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.aL;
import com.growingio.a.a.c.as;
import java.lang.ref.ReferenceQueue;

final class aP<K, V>
extends aL<K, V> {
    final int b;

    aP(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2, int n2) {
        super(referenceQueue, v2, as2);
        this.b = n2;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public aG<K, V> a(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2) {
        return new aP<K, V>(referenceQueue, v2, as2, this.b);
    }
}

