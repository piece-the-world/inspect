/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aK;
import com.growingio.a.a.c.as;
import java.lang.ref.ReferenceQueue;

final class aM<K, V>
extends aK<K, V> {
    volatile long a = Long.MAX_VALUE;
    as<K, V> b = O.q();
    as<K, V> c = O.q();

    aM(ReferenceQueue<K> referenceQueue, K k2, int n2, as<K, V> as2) {
        super(referenceQueue, k2, n2, as2);
    }

    @Override
    public long h() {
        return this.a;
    }

    @Override
    public void b(long l2) {
        this.a = l2;
    }

    @Override
    public as<K, V> i() {
        return this.b;
    }

    @Override
    public void c(as<K, V> as2) {
        this.b = as2;
    }

    @Override
    public as<K, V> j() {
        return this.c;
    }

    @Override
    public void d(as<K, V> as2) {
        this.c = as2;
    }
}

