/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dF {
    public static void a(CountDownLatch countDownLatch) {
        boolean bl2 = false;
        do {
            try {
                countDownLatch.await();
                return;
            }
            catch (InterruptedException var2_2) {
                bl2 = true;
                continue;
            }
            break;
        } while (true);
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean a(CountDownLatch countDownLatch, long l2, TimeUnit timeUnit) {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            do {
                try {
                    boolean bl3 = countDownLatch.await(l3, TimeUnit.NANOSECONDS);
                    return bl3;
                }
                catch (InterruptedException var9_6) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            } while (true);
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(Thread thread) {
        boolean bl2 = false;
        do {
            try {
                thread.join();
                return;
            }
            catch (InterruptedException var2_2) {
                bl2 = true;
                continue;
            }
            break;
        } while (true);
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <V> V a(Future<V> future) throws ExecutionException {
        boolean bl2 = false;
        do {
            try {
                V v2 = future.get();
                return v2;
            }
            catch (InterruptedException var2_2) {
                bl2 = true;
                continue;
            }
            break;
        } while (true);
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <V> V a(Future<V> future, long l2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            do {
                V v2;
                try {
                    v2 = future.get(l3, TimeUnit.NANOSECONDS);
                }
                catch (InterruptedException var9_6) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                return v2;
                break;
            } while (true);
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(Thread thread, long l2, TimeUnit timeUnit) {
        aU.a(thread);
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            do {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, l3);
                    return;
                }
                catch (InterruptedException var9_6) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            } while (true);
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <E> E a(BlockingQueue<E> blockingQueue) {
        boolean bl2 = false;
        do {
            try {
                E e2 = blockingQueue.take();
                return e2;
            }
            catch (InterruptedException var2_2) {
                bl2 = true;
                continue;
            }
            break;
        } while (true);
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <E> void a(BlockingQueue<E> blockingQueue, E e2) {
        boolean bl2 = false;
        do {
            try {
                blockingQueue.put(e2);
                return;
            }
            catch (InterruptedException var3_3) {
                bl2 = true;
                continue;
            }
            break;
        } while (true);
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(long l2, TimeUnit timeUnit) {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            do {
                try {
                    TimeUnit.NANOSECONDS.sleep(l3);
                    return;
                }
                catch (InterruptedException var8_5) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            } while (true);
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean a(Semaphore semaphore, long l2, TimeUnit timeUnit) {
        return dF.a(semaphore, 1, l2, timeUnit);
    }

    public static boolean a(Semaphore semaphore, int n2, long l2, TimeUnit timeUnit) {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            do {
                try {
                    boolean bl3 = semaphore.tryAcquire(n2, l3, TimeUnit.NANOSECONDS);
                    return bl3;
                }
                catch (InterruptedException var10_7) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            } while (true);
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private dF() {
    }
}

