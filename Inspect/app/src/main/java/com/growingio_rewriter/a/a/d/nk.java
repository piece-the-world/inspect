/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nu;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

final class nk<E>
extends nu<E>
implements Deque<E> {
    private static final long a = 0;

    nk(Deque<E> deque, Object object) {
        super(deque, object);
    }

    Deque<E> a() {
        return (Deque)super.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void addFirst(E e2) {
        Object object = this.h;
        synchronized (object) {
            this.a().addFirst(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void addLast(E e2) {
        Object object = this.h;
        synchronized (object) {
            this.a().addLast(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean offerFirst(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().offerFirst(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean offerLast(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().offerLast(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E removeFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().removeFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E removeLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().removeLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E pollFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E pollLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E getFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E getLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E peekFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().peekFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E peekLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().peekLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeFirstOccurrence(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().removeFirstOccurrence(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeLastOccurrence(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().removeLastOccurrence(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void push(E e2) {
        Object object = this.h;
        synchronized (object) {
            this.a().push(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E pop() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pop();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Iterator<E> descendingIterator() {
        Object object = this.h;
        synchronized (object) {
            return this.a().descendingIterator();
        }
    }

    @Override
    /* synthetic */ Queue c() {
        return this.a();
    }

    @Override
    /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

