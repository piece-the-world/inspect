/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.as;
import java.lang.ref.ReferenceQueue;

class aD<K, V>
implements aG<K, V> {
    final V a;

    aD(V v2) {
        this.a = v2;
    }

    @Override
    public V get() {
        return this.a;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public as<K, V> b() {
        return null;
    }

    @Override
    public aG<K, V> a(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2) {
        return this;
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
        return this.get();
    }

    @Override
    public void a(V v2) {
    }
}

