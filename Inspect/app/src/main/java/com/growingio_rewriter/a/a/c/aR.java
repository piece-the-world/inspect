/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.S;
import com.growingio.a.a.c.aQ;
import com.growingio.a.a.c.as;

class aR
extends S<K, V> {
    as<K, V> a;
    as<K, V> b;
    final /* synthetic */ aQ c;

    aR(aQ aQ2) {
        this.c = aQ2;
        this.a = this;
        this.b = this;
    }

    @Override
    public long h() {
        return Long.MAX_VALUE;
    }

    @Override
    public void b(long l2) {
    }

    @Override
    public as<K, V> i() {
        return this.a;
    }

    @Override
    public void c(as<K, V> as2) {
        this.a = as2;
    }

    @Override
    public as<K, V> j() {
        return this.b;
    }

    @Override
    public void d(as<K, V> as2) {
        this.b = as2;
    }
}

