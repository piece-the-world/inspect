/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.kV;
import com.growingio.a.a.o.a.a;
import com.growingio.a.a.o.a.aB;
import com.growingio.a.a.o.a.aE;
import com.growingio.a.a.o.a.ae;
import com.growingio.a.a.o.a.aq;
import com.growingio.a.a.o.a.bF;
import com.growingio.a.a.o.a.bH;
import com.growingio.a.a.o.a.bI;
import com.growingio.a.a.o.a.bJ;
import com.growingio.a.a.o.a.bK;
import com.growingio.a.a.o.a.bL;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bb;
import com.growingio.a.a.o.a.bo;
import com.growingio.a.a.o.a.bq;
import com.growingio.a.a.o.a.br;
import com.growingio.a.a.o.a.bs;
import com.growingio.a.a.o.a.bt;
import com.growingio.a.a.o.a.bu;
import com.growingio.a.a.o.a.bv;
import com.growingio.a.a.o.a.bw;
import com.growingio.a.a.o.a.by;
import com.growingio.a.a.o.a.cA;
import com.growingio.a.a.o.a.cZ;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.dD;
import com.growingio.a.a.o.a.dF;
import com.growingio.a.a.o.a.dx;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class bp
extends bF {
    private static final aq<bU<Object>, Object> a = new br();

    private bp() {
    }

    public static <V, X extends Exception> aB<V, X> a(bU<V> bU2, com.growingio.a.a.b.aq<? super Exception, X> aq2) {
        return new bv<V, X>(aU.a(bU2), aq2);
    }

    public static <V> bU<V> a(V v2) {
        if (v2 == null) {
            bL<Object> bL2 = bL.a;
            return bL2;
        }
        return new bL<V>(v2);
    }

    public static <V, X extends Exception> aB<V, X> b(V v2) {
        return new bK(v2);
    }

    public static <V> bU<V> a(Throwable throwable) {
        aU.a(throwable);
        return new bJ(throwable);
    }

    public static <V> bU<V> a() {
        return new bH();
    }

    public static <V, X extends Exception> aB<V, X> a(X x2) {
        aU.a(x2);
        return new bI(x2);
    }

    public static <V, X extends Throwable> bU<V> a(bU<? extends V> bU2, Class<X> class_, com.growingio.a.a.b.aq<? super X, ? extends V> aq2) {
        return a.a(bU2, class_, aq2);
    }

    public static <V, X extends Throwable> bU<V> a(bU<? extends V> bU2, Class<X> class_, com.growingio.a.a.b.aq<? super X, ? extends V> aq2, Executor executor) {
        return a.a(bU2, class_, aq2, executor);
    }

    public static <V, X extends Throwable> bU<V> a(bU<? extends V> bU2, Class<X> class_, aq<? super X, ? extends V> aq2) {
        return a.a(bU2, class_, aq2);
    }

    public static <V, X extends Throwable> bU<V> a(bU<? extends V> bU2, Class<X> class_, aq<? super X, ? extends V> aq2, Executor executor) {
        return a.a(bU2, class_, aq2, executor);
    }

    public static <V> bU<V> a(bU<V> bU2, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return dx.a(bU2, l2, timeUnit, scheduledExecutorService);
    }

    public static <I, O> bU<O> a(bU<I> bU2, aq<? super I, ? extends O> aq2) {
        return ae.a(bU2, aq2);
    }

    public static <I, O> bU<O> a(bU<I> bU2, aq<? super I, ? extends O> aq2, Executor executor) {
        return ae.a(bU2, aq2, executor);
    }

    public static <I, O> bU<O> b(bU<I> bU2, com.growingio.a.a.b.aq<? super I, ? extends O> aq2) {
        return ae.a(bU2, aq2);
    }

    public static <I, O> bU<O> a(bU<I> bU2, com.growingio.a.a.b.aq<? super I, ? extends O> aq2, Executor executor) {
        return ae.a(bU2, aq2, executor);
    }

    public static <I, O> Future<O> a(Future<I> future, com.growingio.a.a.b.aq<? super I, ? extends O> aq2) {
        aU.a(future);
        aU.a(aq2);
        return new bq(future, aq2);
    }

    public static <V> bU<V> a(bU<? extends bU<? extends V>> bU2) {
        return bp.a(bU2, a);
    }

    public static /* varargs */ <V> bU<List<V>> a(bU<? extends V> ... arrbU) {
        return new aE<V>(ea.a(arrbU), true);
    }

    public static <V> bU<List<V>> a(Iterable<? extends bU<? extends V>> iterable) {
        return new aE(ea.a(iterable), true);
    }

    public static /* varargs */ <V> bu<V> b(bU<? extends V> ... arrbU) {
        return new bu(false, ea.a(arrbU), null);
    }

    public static <V> bu<V> b(Iterable<? extends bU<? extends V>> iterable) {
        return new bu(false, ea.a(iterable), null);
    }

    public static /* varargs */ <V> bu<V> c(bU<? extends V> ... arrbU) {
        return new bu(true, ea.a(arrbU), null);
    }

    public static <V> bu<V> c(Iterable<? extends bU<? extends V>> iterable) {
        return new bu(true, ea.a(iterable), null);
    }

    public static <V> bU<V> b(bU<V> bU2) {
        return new bw<V>(bU2);
    }

    public static /* varargs */ <V> bU<List<V>> d(bU<? extends V> ... arrbU) {
        return new aE<V>(ea.a(arrbU), false);
    }

    public static <V> bU<List<V>> d(Iterable<? extends bU<? extends V>> iterable) {
        return new aE(ea.a(iterable), false);
    }

    public static <T> ea<bU<T>> e(Iterable<? extends bU<? extends T>> iterable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = kV.b();
        ec ec2 = ea.g();
        cA cA2 = new cA(cd.c());
        for (bU<T> bU2 : iterable) {
            cZ cZ2 = cZ.f();
            concurrentLinkedQueue.add(cZ2);
            bU2.a(new bs(concurrentLinkedQueue, bU2), cA2);
            ec2.c(cZ2);
        }
        return ec2.b();
    }

    public static <V> void a(bU<V> bU2, bo<? super V> bo2) {
        bp.a(bU2, bo2, cd.c());
    }

    public static <V> void a(bU<V> bU2, bo<? super V> bo2, Executor executor) {
        aU.a(bo2);
        bt bt2 = new bt(bU2, bo2);
        bU2.a(bt2, executor);
    }

    public static <V> V a(Future<V> future) throws ExecutionException {
        aU.b(future.isDone(), "Future was expected to be done: %s", future);
        return dF.a(future);
    }

    public static <V, X extends Exception> V a(Future<V> future, Class<X> class_) throws Exception {
        return by.a(future, class_);
    }

    public static <V, X extends Exception> V a(Future<V> future, Class<X> class_, long l2, TimeUnit timeUnit) throws Exception {
        return by.a(future, class_, l2, timeUnit);
    }

    public static <V> V b(Future<V> future) {
        aU.a(future);
        try {
            return dF.a(future);
        }
        catch (ExecutionException var1_1) {
            bp.b(var1_1.getCause());
            throw new AssertionError();
        }
    }

    private static void b(Throwable throwable) {
        if (throwable instanceof Error) {
            throw new bb((Error)throwable);
        }
        throw new dD(throwable);
    }
}

