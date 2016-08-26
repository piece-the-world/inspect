/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.nt;
import java.util.Collection;
import java.util.Iterator;

class nj<E>
extends nt
implements Collection<E> {
    private static final long a = 0;

    private nj(Collection<E> collection, Object object) {
        super(collection, object);
    }

    Collection<E> b() {
        return (Collection)super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean add(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.b().add(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean addAll(Collection<? extends E> collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().addAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.h;
        synchronized (object) {
            this.b().clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean contains(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().contains(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsAll(Collection<?> collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().containsAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isEmpty() {
        Object object = this.h;
        synchronized (object) {
            return this.b().isEmpty();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.b().iterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeAll(Collection<?> collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().removeAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean retainAll(Collection<?> collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().retainAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.h;
        synchronized (object) {
            return this.b().size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray() {
        Object object = this.h;
        synchronized (object) {
            return this.b().toArray();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public <T> T[] toArray(T[] arrT) {
        Object object = this.h;
        synchronized (object) {
            return this.b().toArray(arrT);
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.b();
    }

    /* synthetic */ nj(Collection collection, Object object, nb nb2) {
        this(collection, object);
    }
}

