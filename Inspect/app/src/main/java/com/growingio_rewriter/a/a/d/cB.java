/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cE;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public abstract class cB<E>
extends cE<E>
implements BlockingDeque<E> {
    protected cB() {
    }

    protected abstract BlockingDeque<E> a();

    @Override
    public int remainingCapacity() {
        return this.a().remainingCapacity();
    }

    @Override
    public void putFirst(E e2) throws InterruptedException {
        this.a().putFirst(e2);
    }

    @Override
    public void putLast(E e2) throws InterruptedException {
        this.a().putLast(e2);
    }

    @Override
    public boolean offerFirst(E e2, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().offerFirst(e2, l2, timeUnit);
    }

    @Override
    public boolean offerLast(E e2, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().offerLast(e2, l2, timeUnit);
    }

    @Override
    public E takeFirst() throws InterruptedException {
        return this.a().takeFirst();
    }

    @Override
    public E takeLast() throws InterruptedException {
        return this.a().takeLast();
    }

    @Override
    public E pollFirst(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().pollFirst(l2, timeUnit);
    }

    @Override
    public E pollLast(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().pollLast(l2, timeUnit);
    }

    @Override
    public void put(E e2) throws InterruptedException {
        this.a().put(e2);
    }

    @Override
    public boolean offer(E e2, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().offer(e2, l2, timeUnit);
    }

    @Override
    public E take() throws InterruptedException {
        return this.a().take();
    }

    @Override
    public E poll(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().poll(l2, timeUnit);
    }

    @Override
    public int drainTo(Collection<? super E> collection) {
        return this.a().drainTo(collection);
    }

    @Override
    public int drainTo(Collection<? super E> collection, int n2) {
        return this.a().drainTo(collection, n2);
    }

    @Override
    protected /* synthetic */ Deque d() {
        return this.a();
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

