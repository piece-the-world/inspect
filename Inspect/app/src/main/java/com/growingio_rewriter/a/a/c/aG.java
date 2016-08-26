/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.as;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

interface aG<K, V> {
    public V get();

    public V e() throws ExecutionException;

    public int a();

    public as<K, V> b();

    public aG<K, V> a(ReferenceQueue<V> var1, V var2, as<K, V> var3);

    public void a(V var1);

    public boolean c();

    public boolean d();
}

