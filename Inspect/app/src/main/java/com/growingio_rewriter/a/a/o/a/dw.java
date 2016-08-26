/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public interface dw {
    public <T> T a(T var1, Class<T> var2, long var3, TimeUnit var5);

    public <T> T a(Callable<T> var1, long var2, TimeUnit var4, boolean var5) throws Exception;
}

