/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.db;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kN;
import java.util.Collection;
import java.util.Iterator;

public abstract class cC<E>
extends db
implements Collection<E> {
    protected cC() {
    }

    protected abstract Collection<E> b();

    @Override
    public Iterator<E> iterator() {
        return this.b().iterator();
    }

    @Override
    public int size() {
        return this.b().size();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.b().removeAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.b().contains(object);
    }

    @Override
    public boolean add(E e2) {
        return this.b().add(e2);
    }

    @Override
    public boolean remove(Object object) {
        return this.b().remove(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.b().containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.b().addAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.b().retainAll(collection);
    }

    @Override
    public void clear() {
        this.b().clear();
    }

    @Override
    public Object[] toArray() {
        return this.b().toArray();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.b().toArray(arrT);
    }

    protected boolean b(Object object) {
        return gb.a(this.iterator(), object);
    }

    protected boolean a(Collection<?> collection) {
        return aL.a(this, collection);
    }

    protected boolean b(Collection<? extends E> collection) {
        return gb.a(this, collection.iterator());
    }

    protected boolean c(Object object) {
        Iterator<E> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (!com.growingio.a.a.b.aL.a(iterator.next(), object)) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    protected boolean c(Collection<?> collection) {
        return gb.a(this.iterator(), collection);
    }

    protected boolean d(Collection<?> collection) {
        return (boolean)gb.b(this.iterator(), collection);
    }

    protected void m() {
        gb.i(this.iterator());
    }

    protected boolean n() {
        return !this.iterator().hasNext();
    }

    protected String p() {
        return aL.a(this);
    }

    protected Object[] r() {
        Object[] arrobject = new Object[this.size()];
        return this.toArray(arrobject);
    }

    protected <T> T[] a(T[] arrT) {
        return kN.a(this, arrT);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

