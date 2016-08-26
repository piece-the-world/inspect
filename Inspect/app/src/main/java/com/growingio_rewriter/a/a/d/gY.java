/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gZ;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class gY<T>
extends AbstractList<T> {
    private final List<T> a;

    gY(List<T> list) {
        this.a = aU.a(list);
    }

    List<T> a() {
        return this.a;
    }

    private int a(int n2) {
        int n3 = this.size();
        aU.a(n2, n3);
        return n3 - 1 - n2;
    }

    private int b(int n2) {
        int n3 = this.size();
        aU.b(n2, n3);
        return n3 - n2;
    }

    @Override
    public void add(int n2, T t2) {
        this.a.add(this.b(n2), t2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public T remove(int n2) {
        return this.a.remove(this.a(n2));
    }

    @Override
    protected void removeRange(int n2, int n3) {
        this.subList(n2, n3).clear();
    }

    @Override
    public T set(int n2, T t2) {
        return this.a.set(this.a(n2), t2);
    }

    @Override
    public T get(int n2) {
        return this.a.get(this.a(n2));
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public List<T> subList(int n2, int n3) {
        aU.a(n2, n3, this.size());
        return gO.b(this.a.subList(this.b(n3), this.b(n2)));
    }

    @Override
    public Iterator<T> iterator() {
        return this.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int n2) {
        int n3 = this.b(n2);
        ListIterator<T> listIterator = this.a.listIterator(n3);
        return new gZ(this, listIterator);
    }

    static /* synthetic */ int a(gY gY2, int n2) {
        return gY2.b(n2);
    }
}

