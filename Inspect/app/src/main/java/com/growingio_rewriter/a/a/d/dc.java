/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cC;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

public abstract class dc<E>
extends cC<E>
implements Queue<E> {
    protected dc() {
    }

    protected abstract Queue<E> c();

    @Override
    public boolean offer(E e2) {
        return this.c().offer(e2);
    }

    @Override
    public E poll() {
        return this.c().poll();
    }

    @Override
    public E remove() {
        return this.c().remove();
    }

    @Override
    public E peek() {
        return this.c().peek();
    }

    @Override
    public E element() {
        return this.c().element();
    }

    protected boolean a(E e2) {
        try {
            return this.add(e2);
        }
        catch (IllegalStateException var2_2) {
            return false;
        }
    }

    protected E e() {
        try {
            return this.element();
        }
        catch (NoSuchElementException var1_1) {
            return null;
        }
    }

    protected E f() {
        try {
            return this.remove();
        }
        catch (NoSuchElementException var1_1) {
            return null;
        }
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

