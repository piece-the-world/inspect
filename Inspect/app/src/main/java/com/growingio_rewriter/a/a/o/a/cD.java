/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface cD {
    public cD i();

    public boolean f();

    public cG g();

    public cD j();

    public void k();

    public void a(long var1, TimeUnit var3) throws TimeoutException;

    public void l();

    public void b(long var1, TimeUnit var3) throws TimeoutException;

    public Throwable h();

    public void a(cF var1, Executor var2);
}

