/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.B;
import com.growingio.a.a.c.D;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bV;
import java.util.Map;
import java.util.concurrent.Executor;

final class C
extends B<K, V> {
    final /* synthetic */ B a;
    final /* synthetic */ Executor b;

    C(B b2, Executor executor) {
        this.a = b2;
        this.b = executor;
    }

    @Override
    public V a(K k2) throws Exception {
        return this.a.a(k2);
    }

    @Override
    public bU<V> a(K k2, V v2) throws Exception {
        bV bV2 = bV.a(new D(this, k2, v2));
        this.b.execute(bV2);
        return bV2;
    }

    @Override
    public Map<K, V> a(Iterable<? extends K> iterable) throws Exception {
        return this.a.a(iterable);
    }
}

