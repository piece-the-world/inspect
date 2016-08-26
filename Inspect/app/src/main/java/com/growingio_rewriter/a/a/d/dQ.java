/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ee;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.lh;
import com.growingio.a.a.d.oP;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class dQ<E>
extends AbstractCollection<E>
implements Serializable {
    private transient ea<E> a;

    dQ() {
    }

    public abstract oP<E> k_();

    @Override
    public final Object[] toArray() {
        int n2 = this.size();
        if (n2 == 0) {
            return kN.a;
        }
        Object[] arrobject = new Object[n2];
        this.a(arrobject, 0);
        return arrobject;
    }

    @Override
    public final <T> T[] toArray(T[] arrT) {
        aU.a(arrT);
        int n2 = this.size();
        if (arrT.length < n2) {
            arrT = kN.a(arrT, n2);
        } else if (arrT.length > n2) {
            arrT[n2] = null;
        }
        this.a(arrT, 0);
        return arrT;
    }

    @Override
    public abstract boolean contains(Object var1);

    @Override
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ea<E> h() {
        ea<E> ea2 = this.a;
        ea<E> ea3 = ea2 == null ? (this.a = this.m()) : ea2;
        return ea3;
    }

    ea<E> m() {
        switch (this.size()) {
            case 0: {
                return ea.d();
            }
            case 1: {
                return ea.a(this.k_().next());
            }
        }
        return new lh<E>(this, this.toArray());
    }

    abstract boolean i_();

    int a(Object[] arrobject, int n2) {
        oP<E> oP2 = this.k_();
        while (oP2.hasNext()) {
            E e2 = oP2.next();
            arrobject[n2++] = e2;
        }
        return n2;
    }

    Object j_() {
        return new ee(this.toArray());
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

