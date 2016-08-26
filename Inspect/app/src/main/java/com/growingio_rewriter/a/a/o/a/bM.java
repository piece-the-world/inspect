/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bN;
import com.growingio.a.a.o.a.bO;
import com.growingio.a.a.o.a.bP;
import com.growingio.a.a.o.a.bQ;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class bM
implements Runnable {
    private volatile Thread a;
    private volatile boolean b;
    private static final bO c;
    private static final Logger d;

    bM() {
    }

    @Override
    public final void run() {
        if (!c.a(this, null, Thread.currentThread())) {
            return;
        }
        try {
            this.b();
        }
        finally {
            if (this.c()) {
                while (!this.b) {
                    Thread.yield();
                }
            }
        }
    }

    abstract void b();

    abstract boolean c();

    final void e() {
        Thread thread = this.a;
        if (thread != null) {
            thread.interrupt();
        }
        this.b = true;
    }

    static /* synthetic */ Thread a(bM bM2) {
        return bM2.a;
    }

    static /* synthetic */ Thread a(bM bM2, Thread thread) {
        bM2.a = thread;
        return bM2.a;
    }

    static {
        bO bO22;
        bO bO22;
        d = Logger.getLogger(bM.class.getName());
        try {
            bO22 = new bP(AtomicReferenceFieldUpdater.newUpdater(bM.class, Thread.class, "a"));
        }
        catch (Throwable var1_1) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", var1_1);
            bO22 = new bQ(null);
        }
        c = bO22;
    }
}

