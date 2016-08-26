/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.b.bP;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.kV;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bZ;
import com.growingio.a.a.o.a.ca;
import com.growingio.a.a.o.a.ce;
import com.growingio.a.a.o.a.cf;
import com.growingio.a.a.o.a.cg;
import com.growingio.a.a.o.a.ch;
import com.growingio.a.a.o.a.ci;
import com.growingio.a.a.o.a.ck;
import com.growingio.a.a.o.a.cm;
import com.growingio.a.a.o.a.cn;
import com.growingio.a.a.o.a.co;
import com.growingio.a.a.o.a.cp;
import com.growingio.a.a.o.a.du;
import com.growingio.a.a.o.a.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class cd {
    private cd() {
    }

    public static ExecutorService a(ThreadPoolExecutor threadPoolExecutor, long l2, TimeUnit timeUnit) {
        return new ck().a(threadPoolExecutor, l2, timeUnit);
    }

    public static ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long l2, TimeUnit timeUnit) {
        return new ck().a(scheduledThreadPoolExecutor, l2, timeUnit);
    }

    public static void a(ExecutorService executorService, long l2, TimeUnit timeUnit) {
        new ck().a(executorService, l2, timeUnit);
    }

    public static ExecutorService a(ThreadPoolExecutor threadPoolExecutor) {
        return new ck().a(threadPoolExecutor);
    }

    public static ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new ck().a(scheduledThreadPoolExecutor);
    }

    private static void c(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new du().a(true).a(threadPoolExecutor.getThreadFactory()).a());
    }

    public static bZ a() {
        return new cn(null);
    }

    public static bZ b() {
        return new cn(null);
    }

    public static Executor c() {
        return cm.a;
    }

    public static bZ a(ExecutorService executorService) {
        return executorService instanceof bZ ? (bZ)executorService : (executorService instanceof ScheduledExecutorService ? new cp((ScheduledExecutorService)executorService) : new co(executorService));
    }

    public static ca a(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof ca ? (ca)scheduledExecutorService : new cp(scheduledExecutorService);
    }

    static <T> T a(bZ bZ2, Collection<? extends Callable<T>> collection, boolean bl2, long l2) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutionException executionException;
        ArrayList<bU<T>> arrayList;
        block15 : {
            aU.a(bZ2);
            int n2 = collection.size();
            aU.a(n2 > 0);
            arrayList = gO.b(n2);
            LinkedBlockingQueue<Future<T>> linkedBlockingQueue = kV.d();
            executionException = null;
            long l3 = bl2 ? System.nanoTime() : 0;
            Iterator<Callable<T>> iterator = collection.iterator();
            arrayList.add(cd.a(bZ2, iterator.next(), linkedBlockingQueue));
            --n2;
            int n3 = 1;
            do {
                T t2;
                Future<T> future;
                if ((future = linkedBlockingQueue.poll()) == null) {
                    if (n2 > 0) {
                        --n2;
                        arrayList.add(cd.a(bZ2, iterator.next(), linkedBlockingQueue));
                        ++n3;
                    } else {
                        if (n3 == 0) break;
                        if (bl2) {
                            future = linkedBlockingQueue.poll(l2, TimeUnit.NANOSECONDS);
                            if (future == null) {
                                throw new TimeoutException();
                            }
                            long l4 = System.nanoTime();
                            l2 -= l4 - l3;
                            l3 = l4;
                        } else {
                            future = linkedBlockingQueue.take();
                        }
                    }
                }
                if (future == null) continue;
                --n3;
                try {
                    t2 = future.get();
                }
                catch (ExecutionException var14_14) {
                    executionException = var14_14;
                    continue;
                }
                catch (RuntimeException var14_15) {
                    executionException = new ExecutionException(var14_15);
                    continue;
                }
                return t2;
                break;
            } while (true);
            if (executionException != null) break block15;
            executionException = new ExecutionException(null);
        }
        throw executionException;
        finally {
            for (Future future : arrayList) {
                future.cancel(true);
            }
        }
    }

    private static <T> bU<T> a(bZ bZ2, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        bU<T> bU2 = bZ2.a(callable);
        bU2.a(new ce(blockingQueue, bU2), cd.c());
        return bU2;
    }

    public static ThreadFactory d() {
        if (!cd.e()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory)Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        }
        catch (IllegalAccessException var0) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", var0);
        }
        catch (ClassNotFoundException var0_1) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", var0_1);
        }
        catch (NoSuchMethodException var0_2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", var0_2);
        }
        catch (InvocationTargetException var0_3) {
            throw bP.c(var0_3.getCause());
        }
    }

    private static boolean e() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
        }
        catch (ClassNotFoundException var0) {
            return false;
        }
        catch (InvocationTargetException var0_1) {
            return false;
        }
        catch (IllegalAccessException var0_2) {
            return false;
        }
        catch (NoSuchMethodException var0_3) {
            return false;
        }
    }

    static Thread a(String string, Runnable runnable) {
        aU.a(string);
        aU.a(runnable);
        Thread thread = cd.d().newThread(runnable);
        try {
            thread.setName(string);
        }
        catch (SecurityException var3_3) {
            // empty catch block
        }
        return thread;
    }

    static Executor a(Executor executor, bG<String> bG2) {
        aU.a(executor);
        aU.a(bG2);
        if (cd.e()) {
            return executor;
        }
        return new cf(executor, bG2);
    }

    static ExecutorService a(ExecutorService executorService, bG<String> bG2) {
        aU.a(executorService);
        aU.a(bG2);
        if (cd.e()) {
            return executorService;
        }
        return new cg(executorService, bG2);
    }

    static ScheduledExecutorService a(ScheduledExecutorService scheduledExecutorService, bG<String> bG2) {
        aU.a(scheduledExecutorService);
        aU.a(bG2);
        if (cd.e()) {
            return scheduledExecutorService;
        }
        return new ch(scheduledExecutorService, bG2);
    }

    public static boolean b(ExecutorService executorService, long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2) / 2;
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(l3, TimeUnit.NANOSECONDS)) {
                executorService.shutdownNow();
                executorService.awaitTermination(l3, TimeUnit.NANOSECONDS);
            }
        }
        catch (InterruptedException var6_4) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    static Executor a(Executor executor, j<?> j2) {
        aU.a(executor);
        aU.a(j2);
        if (executor == cd.c()) {
            return executor;
        }
        return new ci(executor, j2);
    }

    static /* synthetic */ void b(ThreadPoolExecutor threadPoolExecutor) {
        cd.c(threadPoolExecutor);
    }
}

