/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.dv;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class du {
    private String a = null;
    private Boolean b = null;
    private Integer c = null;
    private Thread.UncaughtExceptionHandler d = null;
    private ThreadFactory e = null;

    public du a(String string) {
        String string2 = du.b(string, 0);
        this.a = string;
        return this;
    }

    public du a(boolean bl2) {
        this.b = bl2;
        return this;
    }

    public du a(int n2) {
        aU.a(n2 >= 1, "Thread priority (%s) must be >= %s", n2, 1);
        aU.a(n2 <= 10, "Thread priority (%s) must be <= %s", n2, 10);
        this.c = n2;
        return this;
    }

    public du a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.d = aU.a(uncaughtExceptionHandler);
        return this;
    }

    public du a(ThreadFactory threadFactory) {
        this.e = aU.a(threadFactory);
        return this;
    }

    public ThreadFactory a() {
        return du.a(this);
    }

    private static ThreadFactory a(du du2) {
        String string = du2.a;
        Boolean bl2 = du2.b;
        Integer n2 = du2.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = du2.d;
        ThreadFactory threadFactory = du2.e != null ? du2.e : Executors.defaultThreadFactory();
        AtomicLong atomicLong = string != null ? new AtomicLong(0) : null;
        return new dv(threadFactory, string, atomicLong, bl2, n2, uncaughtExceptionHandler);
    }

    private static /* varargs */ String b(String string, Object ... arrobject) {
        return String.format(Locale.ROOT, string, arrobject);
    }

    static /* synthetic */ String a(String string, Object[] arrobject) {
        return du.b(string, arrobject);
    }
}

