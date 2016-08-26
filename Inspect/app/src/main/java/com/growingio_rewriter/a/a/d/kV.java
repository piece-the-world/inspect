/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.na;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public final class kV {
    private kV() {
    }

    public static <E> ArrayBlockingQueue<E> a(int n2) {
        return new ArrayBlockingQueue(n2);
    }

    public static <E> ArrayDeque<E> a() {
        return new ArrayDeque();
    }

    public static <E> ArrayDeque<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<E>(aL.a(iterable));
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        fL.a(arrayDeque, iterable);
        return arrayDeque;
    }

    public static <E> ConcurrentLinkedQueue<E> b() {
        return new ConcurrentLinkedQueue();
    }

    public static <E> ConcurrentLinkedQueue<E> b(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<E>(aL.a(iterable));
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        fL.a(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    public static <E> LinkedBlockingDeque<E> c() {
        return new LinkedBlockingDeque();
    }

    public static <E> LinkedBlockingDeque<E> b(int n2) {
        return new LinkedBlockingDeque(n2);
    }

    public static <E> LinkedBlockingDeque<E> c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque<E>(aL.a(iterable));
        }
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        fL.a(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    public static <E> LinkedBlockingQueue<E> d() {
        return new LinkedBlockingQueue();
    }

    public static <E> LinkedBlockingQueue<E> c(int n2) {
        return new LinkedBlockingQueue(n2);
    }

    public static <E> LinkedBlockingQueue<E> d(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<E>(aL.a(iterable));
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        fL.a(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    public static <E extends Comparable> PriorityBlockingQueue<E> e() {
        return new PriorityBlockingQueue();
    }

    public static <E extends Comparable> PriorityBlockingQueue<E> e(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<E>(aL.a(iterable));
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        fL.a(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> f() {
        return new PriorityQueue();
    }

    public static <E extends Comparable> PriorityQueue<E> f(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<E>(aL.a(iterable));
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        fL.a(priorityQueue, iterable);
        return priorityQueue;
    }

    public static <E> SynchronousQueue<E> g() {
        return new SynchronousQueue();
    }

    public static <E> int a(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int n2, long l2, TimeUnit timeUnit) throws InterruptedException {
        aU.a(collection);
        long l3 = System.nanoTime() + timeUnit.toNanos(l2);
        int n3 = 0;
        while (n3 < n2) {
            if ((n3 += blockingQueue.drainTo(collection, n2 - n3)) >= n2) continue;
            E e2 = blockingQueue.poll(l3 - System.nanoTime(), TimeUnit.NANOSECONDS);
            if (e2 == null) break;
            collection.add(e2);
            ++n3;
        }
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static <E> int b(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int n2, long l2, TimeUnit timeUnit) {
        int n3;
        aU.a(collection);
        long l3 = System.nanoTime() + timeUnit.toNanos(l2);
        n3 = 0;
        boolean bl2 = false;
        try {
            while (n3 < n2) {
                E e2;
                if ((n3 += blockingQueue.drainTo(collection, n2 - n3)) >= n2) continue;
                do {
                    try {
                        e2 = blockingQueue.poll(l3 - System.nanoTime(), TimeUnit.NANOSECONDS);
                        break;
                    }
                    catch (InterruptedException var11_9) {
                        bl2 = true;
                        continue;
                    }
                    break;
                } while (true);
                if (e2 != null) {
                    collection.add(e2);
                    ++n3;
                    continue;
                }
                break;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
        return n3;
    }

    public static <E> Queue<E> a(Queue<E> queue) {
        return na.a(queue, (Object)null);
    }

    public static <E> Deque<E> a(Deque<E> deque) {
        return na.a(deque, (Object)null);
    }
}

