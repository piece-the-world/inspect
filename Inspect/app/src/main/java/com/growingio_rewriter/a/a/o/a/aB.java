/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface aB<V, X extends Exception>
extends bU<V> {
    public V a() throws Exception;

    public V a(long var1, TimeUnit var3) throws TimeoutException, Exception;
}

