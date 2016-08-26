/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.nj;
import java.util.Collection;
import java.util.Queue;

class nu<E>
extends nj<E>
implements Queue<E> {
    private static final long a = 0;

    nu(Queue<E> queue, Object object) {
        super(queue, object, null);
    }

    Queue<E> c() {
        return (Queue)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E element() {
        Object object = this.h;
        synchronized (object) {
            return this.c().element();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean offer(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.c().offer(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E peek() {
        Object object = this.h;
        synchronized (object) {
            return this.c().peek();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E poll() {
        Object object = this.h;
        synchronized (object) {
            return this.c().poll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E remove() {
        Object object = this.h;
        synchronized (object) {
            return this.c().remove();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    /* synthetic */ Object e() {
        return this.c();
    }
}

