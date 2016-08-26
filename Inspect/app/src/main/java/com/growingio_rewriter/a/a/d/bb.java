/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.id;
import java.lang.ref.ReferenceQueue;

final class bb<K, V>
implements id<K, V> {
    final V a;

    bb(V v2) {
        this.a = v2;
    }

    @Override
    public V get() {
        return this.a;
    }

    @Override
    public hT<K, V> a() {
        return null;
    }

    @Override
    public id<K, V> a(ReferenceQueue<V> referenceQueue, V v2, hT<K, V> hT2) {
        return this;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public V c() {
        return this.get();
    }

    @Override
    public void a(id<K, V> id2) {
    }
}

