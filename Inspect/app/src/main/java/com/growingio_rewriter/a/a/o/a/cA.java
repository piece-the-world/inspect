/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.cB;
import com.growingio.a.a.o.a.cC;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

final class cA
implements Executor {
    private static final Logger a = Logger.getLogger(cA.class.getName());
    private final Executor b;
    private final Deque<Runnable> c = new ArrayDeque<Runnable>();
    private boolean d = false;
    private int e = 0;
    private final Object f = new Object();

    public cA(Executor executor) {
        this.b = aU.a(executor);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void execute(Runnable runnable) {
        Object object = this.f;
        synchronized (object) {
            this.c.add(runnable);
        }
        this.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Runnable runnable) {
        Object object = this.f;
        synchronized (object) {
            this.c.addFirst(runnable);
        }
        this.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        Object object = this.f;
        synchronized (object) {
            ++this.e;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        Object object = this.f;
        synchronized (object) {
            aU.b(this.e > 0);
            --this.e;
        }
        this.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d() {
        Object object = this.f;
        synchronized (object) {
            if (this.c.peek() == null) {
                return;
            }
            if (this.e > 0) {
                return;
            }
            if (this.d) {
                return;
            }
            this.d = true;
        }
        boolean bl2 = true;
        try {
            this.b.execute(new cC(this, null));
            bl2 = false;
        }
        finally {
            if (bl2) {
                Object object2 = this.f;
                synchronized (object2) {
                    this.d = false;
                }
            }
        }
    }

    static /* synthetic */ Object a(cA cA2) {
        return cA2.f;
    }

    static /* synthetic */ boolean a(cA cA2, boolean bl2) {
        cA2.d = bl2;
        return cA2.d;
    }

    static /* synthetic */ int b(cA cA2) {
        return cA2.e;
    }

    static /* synthetic */ Deque c(cA cA2) {
        return cA2.c;
    }

    static /* synthetic */ Logger c() {
        return a;
    }
}

