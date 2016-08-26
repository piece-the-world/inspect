/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.as;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class aK<K, V>
extends WeakReference<K>
implements as<K, V> {
    final int g;
    final as<K, V> h;
    volatile aG<K, V> i = O.p();

    aK(ReferenceQueue<K> referenceQueue, K k2, int n2, as<K, V> as2) {
        super(k2, referenceQueue);
        this.g = n2;
        this.h = as2;
    }

    @Override
    public K d() {
        return (K)this.get();
    }

    @Override
    public long e() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public as<K, V> f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(as<K, V> as2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public as<K, V> g() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(as<K, V> as2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public as<K, V> i() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(as<K, V> as2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public as<K, V> j() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void d(as<K, V> as2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public aG<K, V> a() {
        return this.i;
    }

    @Override
    public void a(aG<K, V> aG2) {
        this.i = aG2;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public as<K, V> b() {
        return this.h;
    }
}

