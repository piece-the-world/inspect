/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aB;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bg;
import java.util.concurrent.Future;

public abstract class bh<V, X extends Exception>
extends bg<V, X> {
    private final aB<V, X> a;

    protected bh(aB<V, X> aB2) {
        this.a = aU.a(aB2);
    }

    @Override
    protected final aB<V, X> b() {
        return this.a;
    }

    @Override
    protected /* synthetic */ bU d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

