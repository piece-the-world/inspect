/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.d;

import com.growingio.e.a.a.a.d.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

public final class c
implements Runnable {
    private final long a;
    private final List<d> b = new CopyOnWriteArrayList<d>();
    private Thread c = null;
    private ThreadFactory d;
    private volatile boolean e = false;

    public c() {
        this(10000);
    }

    public c(long l2) {
        this.a = l2;
    }

    public /* varargs */ c(long l2, d ... arrd) {
        this(l2);
        if (arrd != null) {
            for (d d2 : arrd) {
                this.a(d2);
            }
        }
    }

    public long a() {
        return this.a;
    }

    public synchronized void a(ThreadFactory threadFactory) {
        this.d = threadFactory;
    }

    public void a(d d2) {
        if (d2 != null) {
            this.b.add(d2);
        }
    }

    public void b(d d2) {
        if (d2 != null) {
            while (this.b.remove(d2)) {
            }
        }
    }

    public Iterable<d> b() {
        return this.b;
    }

    public synchronized void c() throws Exception {
        if (this.e) {
            throw new IllegalStateException("Monitor is already running");
        }
        for (d d2 : this.b) {
            d2.d();
        }
        this.e = true;
        this.c = this.d != null ? this.d.newThread(this) : new Thread(this);
        this.c.start();
    }

    public synchronized void d() throws Exception {
        this.a(this.a);
    }

    public synchronized void a(long l2) throws Exception {
        if (!this.e) {
            throw new IllegalStateException("Monitor is not running");
        }
        this.e = false;
        try {
            this.c.join(l2);
        }
        catch (InterruptedException var3_2) {
            Thread.currentThread().interrupt();
        }
        for (d d2 : this.b) {
            d2.e();
        }
    }

    @Override
    public void run() {
        while (this.e) {
            for (d d2 : this.b) {
                d2.f();
            }
            if (!this.e) break;
            try {
                Thread.sleep(this.a);
            }
            catch (InterruptedException var1_2) {}
        }
    }
}

