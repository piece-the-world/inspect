/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bp;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.k;
import com.growingio.a.a.o.a.l;
import com.growingio.a.a.o.a.m;
import com.growingio.a.a.o.a.n;
import com.growingio.a.a.o.a.p;
import com.growingio.a.a.o.a.q;
import com.growingio.a.a.o.a.r;
import com.growingio.a.a.o.a.s;
import com.growingio.a.a.o.a.t;
import com.growingio.a.a.o.a.u;
import com.growingio.a.a.o.a.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class j<V>
implements bU<V> {
    private static final boolean a;
    private static final Logger b;
    private static final long c = 1000;
    private static final l d;
    private static final Object e;
    private volatile Object f;
    private volatile p g;
    private volatile w h;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(w var1_1) {
        var1_1.b = null;
        block0 : do {
            var2_2 = null;
            var3_3 = this.h;
            if (var3_3 == w.a) {
                return;
            }
            while (var3_3 != null) {
                var4_4 = var3_3.c;
                if (var3_3.b != null) {
                    var2_2 = var3_3;
                } else if (var2_2 != null) {
                    var2_2.c = var4_4;
                    if (var2_2.b == null) {
                        continue block0;
                    }
                } else {
                    if (j.d.a(this, var3_3, var4_4)) ** break;
                    continue block0;
                }
                var3_3 = var4_4;
            }
            return;
            break;
        } while (true);
    }

    protected j() {
    }

    @Override
    public V get(long l2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long l3;
        long l4;
        Object object;
        block10 : {
            l3 = timeUnit.toNanos(l2);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            object = this.f;
            if (object != null & !(object instanceof r)) {
                return this.a(object);
            }
            long l5 = l4 = l3 > 0 ? System.nanoTime() + l3 : 0;
            if (l3 >= 1000) {
                w w2 = this.h;
                if (w2 != w.a) {
                    w w3 = new w();
                    do {
                        w3.a(w2);
                        if (!d.a(this, w2, w3)) continue;
                        do {
                            LockSupport.parkNanos(this, l3);
                            if (Thread.interrupted()) {
                                this.a(w3);
                                throw new InterruptedException();
                            }
                            object = this.f;
                            if (!(object != null & !(object instanceof r))) continue;
                            return this.a(object);
                        } while ((l3 = l4 - System.nanoTime()) >= 1000);
                        this.a(w3);
                        break block10;
                    } while ((w2 = this.h) != w.a);
                }
                return this.a(this.f);
            }
        }
        while (l3 > 0) {
            object = this.f;
            if (object != null & !(object instanceof r)) {
                return this.a(object);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            l3 = l4 - System.nanoTime();
        }
        throw new TimeoutException();
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object = this.f;
        if (object != null & !(object instanceof r)) {
            return this.a(object);
        }
        w w2 = this.h;
        if (w2 != w.a) {
            w w3 = new w();
            do {
                w3.a(w2);
                if (!d.a(this, w2, w3)) continue;
                do {
                    LockSupport.park(this);
                    if (!Thread.interrupted()) continue;
                    this.a(w3);
                    throw new InterruptedException();
                } while (!((object = this.f) != null & !(object instanceof r)));
                return this.a(object);
            } while ((w2 = this.h) != w.a);
        }
        return this.a(this.f);
    }

    private V a(Object object) throws ExecutionException {
        if (object instanceof m) {
            throw j.a("Task was cancelled.", ((m)object).b);
        }
        if (object instanceof n) {
            throw new ExecutionException(((n)object).b);
        }
        if (object == e) {
            return null;
        }
        Object object2 = object;
        return (V)object2;
    }

    @Override
    public boolean isDone() {
        Object object = this.f;
        return object != null & !(object instanceof r);
    }

    @Override
    public boolean isCancelled() {
        Object object = this.f;
        return object instanceof m;
    }

    @Override
    public boolean cancel(boolean bl2) {
        Object object = this.f;
        if (object == null | object instanceof r) {
            CancellationException cancellationException = a ? new CancellationException("Future.cancel() was called.") : null;
            m m2 = new m(bl2, cancellationException);
            do {
                if (!d.a(this, object, m2)) continue;
                if (bl2) {
                    this.b();
                }
                this.f();
                if (object instanceof r) {
                    ((r)object).a.cancel(bl2);
                }
                return true;
            } while ((object = this.f) instanceof r);
        }
        return false;
    }

    protected void b() {
    }

    protected final boolean c() {
        Object object = this.f;
        return object instanceof m && ((m)object).a;
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        aU.a(runnable, (Object)"Runnable was null.");
        aU.a(executor, (Object)"Executor was null.");
        p p2 = this.g;
        if (p2 != p.a) {
            p p3 = new p(runnable, executor);
            do {
                p3.d = p2;
                if (!d.a(this, p2, p3)) continue;
                return;
            } while ((p2 = this.g) != p.a);
        }
        j.b(runnable, executor);
    }

    protected boolean b(V object) {
        Object object2;
        Object object3 = object2 = object == null ? e : object;
        if (d.a(this, (Object)null, object2)) {
            this.f();
            return true;
        }
        return false;
    }

    protected boolean a(Throwable throwable) {
        n n2 = new n(aU.a(throwable));
        if (d.a(this, (Object)null, n2)) {
            this.f();
            return true;
        }
        return false;
    }

    protected boolean b(bU<? extends V> bU2) {
        aU.a(bU2);
        Object object = this.f;
        if (object == null) {
            if (bU2.isDone()) {
                return this.a(bU2, (Object)null);
            }
            r r2 = new r(this, bU2);
            if (d.a(this, (Object)null, r2)) {
                try {
                    bU2.a(r2, cd.c());
                }
                catch (Throwable var4_4) {
                    n n2;
                    try {
                        n2 = new n(var4_4);
                    }
                    catch (Throwable var6_6) {
                        n2 = n.a;
                    }
                    boolean bl2 = d.a(this, r2, n2);
                }
                return true;
            }
            object = this.f;
        }
        if (object instanceof m) {
            bU2.cancel(((m)object).a);
        }
        return false;
    }

    private boolean a(bU<? extends V> bU2, Object object) {
        Object object2;
        if (bU2 instanceof t) {
            object2 = ((j)bU2).f;
        } else {
            try {
                V v2 = bp.a(bU2);
                object2 = v2 == null ? e : v2;
            }
            catch (ExecutionException var4_5) {
                object2 = new n(var4_5.getCause());
            }
            catch (CancellationException var4_6) {
                object2 = new m(false, var4_6);
            }
            catch (Throwable var4_7) {
                object2 = new n(var4_7);
            }
        }
        if (d.a(this, object, object2)) {
            this.f();
            return true;
        }
        return false;
    }

    private void f() {
        Object object = this.g();
        while (object != null) {
            object.a();
            object = object.c;
        }
        object = this.h();
        Object object2 = null;
        while (object != null) {
            Object object3 = object;
            object = object.d;
            object3.d = object2;
            object2 = object3;
        }
        while (object2 != null) {
            j.b(object2.b, object2.c);
            object2 = object2.d;
        }
        this.a();
    }

    protected void a() {
    }

    final Throwable d() {
        return ((n)this.f).b;
    }

    final void a(Future<?> future) {
        if (future != null & this.isCancelled()) {
            future.cancel(this.c());
        }
    }

    private w g() {
        w w2;
        while (!d.a(this, w2 = this.h, w.a)) {
        }
        return w2;
    }

    private p h() {
        p p2;
        while (!d.a(this, p2 = this.g, p.a)) {
        }
        return p2;
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (RuntimeException var2_2) {
            b.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, var2_2);
        }
    }

    private static CancellationException a(String string, Throwable throwable) {
        CancellationException cancellationException = new CancellationException(string);
        cancellationException.initCause(throwable);
        return cancellationException;
    }

    static /* synthetic */ l e() {
        return d;
    }

    static /* synthetic */ Object a(j j2) {
        return j2.f;
    }

    static /* synthetic */ boolean a(j j2, bU bU2, Object object) {
        return j2.a(bU2, object);
    }

    static /* synthetic */ w b(j j2) {
        return j2.h;
    }

    static /* synthetic */ w a(j j2, w w2) {
        j2.h = w2;
        return j2.h;
    }

    static /* synthetic */ p c(j j2) {
        return j2.g;
    }

    static /* synthetic */ p a(j j2, p p2) {
        j2.g = p2;
        return j2.g;
    }

    static /* synthetic */ Object a(j j2, Object object) {
        j2.f = object;
        return j2.f;
    }

    static {
        l l222;
        l l222;
        a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        b = Logger.getLogger(j.class.getName());
        try {
            l222 = new u(null);
        }
        catch (Throwable var1_1) {
            try {
                l222 = new q(AtomicReferenceFieldUpdater.newUpdater(w.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(w.class, w.class, "c"), AtomicReferenceFieldUpdater.newUpdater(j.class, w.class, "h"), AtomicReferenceFieldUpdater.newUpdater(j.class, p.class, "g"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "f"));
            }
            catch (Throwable var2_3) {
                b.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", var1_1);
                b.log(Level.SEVERE, "SafeAtomicHelper is broken!", var2_3);
                l222 = new s(null);
            }
        }
        d = l222;
        reference var1_2 = LockSupport.class;
        e = new Object();
    }
}

