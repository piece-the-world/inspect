/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.c.e;
import com.growingio.a.a.d.ei;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public interface N<K, V>
extends aq<K, V>,
e<K, V> {
    public V e(K var1) throws ExecutionException;

    public V b(K var1);

    public ei<K, V> c(Iterable<? extends K> var1) throws ExecutionException;

    @Override
    public V f(K var1);

    public void c(K var1);

    @Override
    public ConcurrentMap<K, V> e();
}

