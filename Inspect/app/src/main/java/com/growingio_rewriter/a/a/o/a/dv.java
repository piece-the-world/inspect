/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.du;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class dv
implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ Integer e;
    final /* synthetic */ Thread.UncaughtExceptionHandler f;

    dv(ThreadFactory threadFactory, String string, AtomicLong atomicLong, Boolean bl2, Integer n2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = threadFactory;
        this.b = string;
        this.c = atomicLong;
        this.d = bl2;
        this.e = n2;
        this.f = uncaughtExceptionHandler;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = this.a.newThread(runnable);
        if (this.b != null) {
            thread.setName(du.a(this.b, new Object[]{this.c.getAndIncrement()}));
        }
        if (this.d != null) {
            thread.setDaemon(this.d);
        }
        if (this.e != null) {
            thread.setPriority(this.e);
        }
        if (this.f != null) {
            thread.setUncaughtExceptionHandler(this.f);
        }
        return thread;
    }
}

