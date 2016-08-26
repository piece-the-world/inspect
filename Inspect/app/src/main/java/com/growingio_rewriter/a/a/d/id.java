/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hT;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

interface id<K, V> {
    public V get();

    public V c() throws ExecutionException;

    public hT<K, V> a();

    public id<K, V> a(ReferenceQueue<V> var1, V var2, hT<K, V> var3);

    public void a(id<K, V> var1);

    public boolean b();
}

