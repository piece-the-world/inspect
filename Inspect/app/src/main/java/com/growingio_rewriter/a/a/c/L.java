/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.J;
import com.growingio.a.a.c.N;
import com.growingio.a.a.c.e;
import com.growingio.a.a.d.ei;
import java.util.concurrent.ExecutionException;

public abstract class L<K, V>
extends J<K, V>
implements N<K, V> {
    protected L() {
    }

    protected abstract N<K, V> h();

    @Override
    public V e(K k2) throws ExecutionException {
        return this.h().e(k2);
    }

    @Override
    public V b(K k2) {
        return this.h().b(k2);
    }

    @Override
    public ei<K, V> c(Iterable<? extends K> iterable) throws ExecutionException {
        return this.h().c(iterable);
    }

    @Override
    public V f(K k2) {
        return this.h().f(k2);
    }

    @Override
    public void c(K k2) {
        this.h().c(k2);
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

