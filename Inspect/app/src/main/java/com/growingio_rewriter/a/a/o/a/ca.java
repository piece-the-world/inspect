/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bW;
import com.growingio.a.a.o.a.bZ;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface ca
extends bZ,
ScheduledExecutorService {
    public bW<?> a(Runnable var1, long var2, TimeUnit var4);

    public <V> bW<V> a(Callable<V> var1, long var2, TimeUnit var4);

    public bW<?> a(Runnable var1, long var2, long var4, TimeUnit var6);

    public bW<?> b(Runnable var1, long var2, long var4, TimeUnit var6);
}

