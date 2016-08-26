/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.L;
import com.growingio.a.a.c.N;
import com.growingio.a.a.c.e;

public abstract class M<K, V>
extends L<K, V> {
    private final N<K, V> a;

    protected M(N<K, V> n2) {
        this.a = aU.a(n2);
    }

    @Override
    protected final N<K, V> h() {
        return this.a;
    }

    @Override
    protected /* synthetic */ e f() {
        return this.h();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.h();
    }
}

