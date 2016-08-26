/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gY;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class gZ
implements ListIterator<T> {
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ gY c;

    gZ(gY gY2, ListIterator listIterator) {
        this.c = gY2;
        this.b = listIterator;
    }

    @Override
    public void add(T t2) {
        this.b.add(t2);
        this.b.previous();
        this.a = false;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override
    public boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return (T)this.b.previous();
    }

    @Override
    public int nextIndex() {
        return gY.a(this.c, this.b.nextIndex());
    }

    @Override
    public T previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return (T)this.b.next();
    }

    @Override
    public int previousIndex() {
        return this.nextIndex() - 1;
    }

    @Override
    public void remove() {
        aK.a(this.a);
        this.b.remove();
        this.a = false;
    }

    @Override
    public void set(T t2) {
        aU.b(this.a);
        this.b.set(t2);
    }
}

