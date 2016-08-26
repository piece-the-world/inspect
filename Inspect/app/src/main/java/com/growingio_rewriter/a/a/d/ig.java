/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.id;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class ig<K, V>
extends WeakReference<V>
implements id<K, V> {
    final hT<K, V> a;

    ig(ReferenceQueue<V> referenceQueue, V v2, hT<K, V> hT2) {
        super(v2, referenceQueue);
        this.a = hT2;
    }

    @Override
    public hT<K, V> a() {
        return this.a;
    }

    @Override
    public void a(id<K, V> id2) {
        this.clear();
    }

    @Override
    public id<K, V> a(ReferenceQueue<V> referenceQueue, V v2, hT<K, V> hT2) {
        return new ig<K, V>(referenceQueue, v2, hT2);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public V c() {
        return (V)this.get();
    }
}

