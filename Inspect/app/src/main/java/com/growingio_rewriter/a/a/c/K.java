/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.J;
import com.growingio.a.a.c.e;

public abstract class K<K, V>
extends J<K, V> {
    private final e<K, V> a;

    protected K(e<K, V> e2) {
        this.a = aU.a(e2);
    }

    @Override
    protected final e<K, V> f() {
        return this.a;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.f();
    }
}

