/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.dc;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class bf<E>
extends dc<E>
implements BlockingQueue<E> {
    protected bf() {
    }

    protected abstract BlockingQueue<E> a();

    @Override
    public int drainTo(Collection<? super E> collection, int n2) {
        return this.a().drainTo(collection, n2);
    }

    @Override
    public int drainTo(Collection<? super E> collection) {
        return this.a().drainTo(collection);
    }

    @Override
    public boolean offer(E e2, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().offer(e2, l2, timeUnit);
    }

    @Override
    public E poll(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().poll(l2, timeUnit);
    }

    @Override
    public void put(E e2) throws InterruptedException {
        this.a().put(e2);
    }

    @Override
    public int remainingCapacity() {
        return this.a().remainingCapacity();
    }

    @Override
    public E take() throws InterruptedException {
        return this.a().take();
    }

    @Override
    protected /* synthetic */ Queue c() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

