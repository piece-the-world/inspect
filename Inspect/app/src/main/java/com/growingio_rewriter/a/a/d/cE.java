/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dc;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public abstract class cE<E>
extends dc<E>
implements Deque<E> {
    protected cE() {
    }

    protected abstract Deque<E> d();

    @Override
    public void addFirst(E e2) {
        this.d().addFirst(e2);
    }

    @Override
    public void addLast(E e2) {
        this.d().addLast(e2);
    }

    @Override
    public Iterator<E> descendingIterator() {
        return this.d().descendingIterator();
    }

    @Override
    public E getFirst() {
        return this.d().getFirst();
    }

    @Override
    public E getLast() {
        return this.d().getLast();
    }

    @Override
    public boolean offerFirst(E e2) {
        return this.d().offerFirst(e2);
    }

    @Override
    public boolean offerLast(E e2) {
        return this.d().offerLast(e2);
    }

    @Override
    public E peekFirst() {
        return this.d().peekFirst();
    }

    @Override
    public E peekLast() {
        return this.d().peekLast();
    }

    @Override
    public E pollFirst() {
        return this.d().pollFirst();
    }

    @Override
    public E pollLast() {
        return this.d().pollLast();
    }

    @Override
    public E pop() {
        return this.d().pop();
    }

    @Override
    public void push(E e2) {
        this.d().push(e2);
    }

    @Override
    public E removeFirst() {
        return this.d().removeFirst();
    }

    @Override
    public E removeLast() {
        return this.d().removeLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object object) {
        return this.d().removeFirstOccurrence(object);
    }

    @Override
    public boolean removeLastOccurrence(Object object) {
        return this.d().removeLastOccurrence(object);
    }

    @Override
    protected /* synthetic */ Queue c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.d();
    }
}

