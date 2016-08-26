/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.gO;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class cK<E>
extends cC<E>
implements List<E> {
    protected cK() {
    }

    protected abstract List<E> a();

    @Override
    public void add(int n2, E e2) {
        this.a().add(n2, e2);
    }

    @Override
    public boolean addAll(int n2, Collection<? extends E> collection) {
        return this.a().addAll(n2, collection);
    }

    @Override
    public E get(int n2) {
        return this.a().get(n2);
    }

    @Override
    public int indexOf(Object object) {
        return this.a().indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.a().lastIndexOf(object);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.a().listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int n2) {
        return this.a().listIterator(n2);
    }

    @Override
    public E remove(int n2) {
        return this.a().remove(n2);
    }

    @Override
    public E set(int n2, E e2) {
        return this.a().set(n2, e2);
    }

    @Override
    public List<E> subList(int n2, int n3) {
        return this.a().subList(n2, n3);
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    protected boolean a(E e2) {
        this.add(this.size(), e2);
        return true;
    }

    protected boolean a(int n2, Iterable<? extends E> iterable) {
        return gO.a(this, n2, iterable);
    }

    protected int d(Object object) {
        return gO.b(this, object);
    }

    protected int e(Object object) {
        return gO.c(this, object);
    }

    protected Iterator<E> c() {
        return this.listIterator();
    }

    protected ListIterator<E> d() {
        return this.listIterator(0);
    }

    protected ListIterator<E> a(int n2) {
        return gO.b(this, n2);
    }

    protected List<E> a(int n2, int n3) {
        return gO.a(this, n2, n3);
    }

    protected boolean f(Object object) {
        return gO.a(this, object);
    }

    protected int e() {
        return gO.c(this);
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

