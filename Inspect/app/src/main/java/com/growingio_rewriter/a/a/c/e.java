/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.I;
import com.growingio.a.a.d.ei;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public interface e<K, V> {
    public V d(Object var1);

    public V a(K var1, Callable<? extends V> var2) throws ExecutionException;

    public ei<K, V> a(Iterable<?> var1);

    public void a(K var1, V var2);

    public void a(Map<? extends K, ? extends V> var1);

    public void a(Object var1);

    public void b(Iterable<?> var1);

    public void c();

    public long b();

    public I d();

    public ConcurrentMap<K, V> e();

    public void a();
}

