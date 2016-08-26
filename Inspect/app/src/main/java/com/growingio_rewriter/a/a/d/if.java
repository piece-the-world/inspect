/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.id;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class if<K, V>
extends WeakReference<K>
implements hT<K, V> {
    final int a;
    final hT<K, V> b;
    volatile id<K, V> c = hG.d();

    if(ReferenceQueue<K> referenceQueue, K k2, int n2, hT<K, V> hT2) {
        super(k2, referenceQueue);
        this.a = n2;
        this.b = hT2;
    }

    @Override
    public K d() {
        return (K)this.get();
    }

    @Override
    public id<K, V> a() {
        return this.c;
    }

    @Override
    public void a(id<K, V> id2) {
        id<K, V> id3 = this.c;
        this.c = id2;
        id3.a(id2);
    }

    @Override
    public int c() {
        return this.a;
    }

    @Override
    public hT<K, V> b() {
        return this.b;
    }
}

