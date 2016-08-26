/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bj;
import java.util.concurrent.Future;

public abstract class bk<V>
extends bj<V> {
    private final Future<V> a;

    protected bk(Future<V> future) {
        this.a = aU.a(future);
    }

    @Override
    protected final Future<V> c() {
        return this.a;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

