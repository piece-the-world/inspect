/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.I;
import com.growingio.a.a.c.e;
import com.growingio.a.a.d.db;
import com.growingio.a.a.d.ei;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public abstract class J<K, V>
extends db
implements e<K, V> {
    protected J() {
    }

    protected abstract e<K, V> f();

    @Override
    public V d(Object object) {
        return this.f().d(object);
    }

    @Override
    public V a(K k2, Callable<? extends V> callable) throws ExecutionException {
        return this.f().a(k2, callable);
    }

    @Override
    public ei<K, V> a(Iterable<?> iterable) {
        return this.f().a(iterable);
    }

    @Override
    public void a(K k2, V v2) {
        this.f().a(k2, v2);
    }

    @Override
    public void a(Map<? extends K, ? extends V> map) {
        this.f().a(map);
    }

    @Override
    public void a(Object object) {
        this.f().a(object);
    }

    @Override
    public void b(Iterable<?> iterable) {
        this.f().b(iterable);
    }

    @Override
    public void c() {
        this.f().c();
    }

    @Override
    public long b() {
        return this.f().b();
    }

    @Override
    public I d() {
        return this.f().d();
    }

    @Override
    public ConcurrentMap<K, V> e() {
        return this.f().e();
    }

    @Override
    public void a() {
        this.f().a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.f();
    }
}

