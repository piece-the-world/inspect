/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.I;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.ap;
import com.growingio.a.a.c.aq;
import com.growingio.a.a.c.at;
import com.growingio.a.a.c.b;
import com.growingio.a.a.c.c;
import com.growingio.a.a.c.e;
import com.growingio.a.a.c.f;
import com.growingio.a.a.d.ei;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

class ao<K, V>
implements e<K, V>,
Serializable {
    final O<K, V> a;
    private static final long b = 1;

    ao(f<? super K, ? super V> f2) {
        this(new O<K, V>(f2, null));
    }

    private ao(O<K, V> o2) {
        this.a = o2;
    }

    @Override
    public V d(Object object) {
        return this.a.b(object);
    }

    @Override
    public V a(K k2, Callable<? extends V> callable) throws ExecutionException {
        aU.a(callable);
        return this.a.a(k2, new ap(this, callable));
    }

    @Override
    public ei<K, V> a(Iterable<?> iterable) {
        return this.a.a(iterable);
    }

    @Override
    public void a(K k2, V v2) {
        this.a.put(k2, v2);
    }

    @Override
    public void a(Map<? extends K, ? extends V> map) {
        this.a.putAll(map);
    }

    @Override
    public void a(Object object) {
        aU.a(object);
        this.a.remove(object);
    }

    @Override
    public void b(Iterable<?> iterable) {
        this.a.c(iterable);
    }

    @Override
    public void c() {
        this.a.clear();
    }

    @Override
    public long b() {
        return this.a.u();
    }

    @Override
    public ConcurrentMap<K, V> e() {
        return this.a;
    }

    @Override
    public I d() {
        b b2 = new b();
        b2.a(this.a.x);
        for (at at2 : this.a.i) {
            b2.a(at2.n);
        }
        return b2.b();
    }

    @Override
    public void a() {
        this.a.t();
    }

    Object f() {
        return new aq<K, V>(this.a);
    }

    /* synthetic */ ao(O o2, P p2) {
        this(o2);
    }
}

