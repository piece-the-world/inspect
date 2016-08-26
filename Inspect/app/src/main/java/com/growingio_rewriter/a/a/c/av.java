/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.as;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class av<K, V>
extends SoftReference<V>
implements aG<K, V> {
    final as<K, V> a;

    av(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2) {
        super(v2, referenceQueue);
        this.a = as2;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public as<K, V> b() {
        return this.a;
    }

    @Override
    public void a(V v2) {
    }

    @Override
    public aG<K, V> a(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2) {
        return new av<K, V>(referenceQueue, v2, as2);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public V e() {
        return (V)this.get();
    }
}

