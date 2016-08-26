/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.nj;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class nm<E>
extends nj<E>
implements List<E> {
    private static final long a = 0;

    nm(List<E> list, Object object) {
        super(list, object, null);
    }

    List<E> a() {
        return (List)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void add(int n2, E e2) {
        Object object = this.h;
        synchronized (object) {
            this.a().add(n2, e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean addAll(int n2, Collection<? extends E> collection) {
        Object object = this.h;
        synchronized (object) {
            return this.a().addAll(n2, collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E get(int n2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().get(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int indexOf(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().indexOf(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int lastIndexOf(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().lastIndexOf(object);
        }
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.a().listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int n2) {
        return this.a().listIterator(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E remove(int n2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().remove(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E set(int n2, E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().set(n2, e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<E> subList(int n2, int n3) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().subList(n2, n3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.a().hashCode();
        }
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

