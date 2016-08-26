/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nF;
import java.io.Serializable;

final class nG<R, C, V>
extends nF<R, C, V>
implements Serializable {
    private final R a;
    private final C b;
    private final V c;
    private static final long d = 0;

    nG(R r2, C c2, V v2) {
        this.a = r2;
        this.b = c2;
        this.c = v2;
    }

    @Override
    public R a() {
        return this.a;
    }

    @Override
    public C b() {
        return this.b;
    }

    @Override
    public V c() {
        return this.c;
    }
}

