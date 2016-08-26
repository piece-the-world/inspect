/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.av;
import java.lang.ref.ReferenceQueue;

final class aN<K, V>
extends av<K, V> {
    final int b;

    aN(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2, int n2) {
        super(referenceQueue, v2, as2);
        this.b = n2;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public aG<K, V> a(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2) {
        return new aN<K, V>(referenceQueue, v2, as2, this.b);
    }
}

