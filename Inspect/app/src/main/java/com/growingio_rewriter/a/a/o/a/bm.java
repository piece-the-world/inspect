/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bl;
import java.util.concurrent.Future;

public abstract class bm<V>
extends bl<V> {
    private final bU<V> a;

    protected bm(bU<V> bU2) {
        this.a = aU.a(bU2);
    }

    @Override
    protected final bU<V> d() {
        return this.a;
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.d();
    }
}

