/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eb;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.ed;
import com.growingio.a.a.d.ee;
import com.growingio.a.a.d.ef;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.lo;
import com.growingio.a.a.d.mc;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.d.oQ;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ea<E>
extends dQ<E>
implements List<E>,
RandomAccess {
    public static <E> ea<E> d() {
        return lo.a;
    }

    public static <E> ea<E> a(E e2) {
        return new mc<E>(e2);
    }

    public static <E> ea<E> a(E e2, E e3) {
        return ea.c(e2, e3);
    }

    public static <E> ea<E> a(E e2, E e3, E e4) {
        return ea.c(e2, e3, e4);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5) {
        return ea.c(e2, e3, e4, e5);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6) {
        return ea.c(e2, e3, e4, e5, e6);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7) {
        return ea.c(e2, e3, e4, e5, e6, e7);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return ea.c(e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return ea.c(e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return ea.c(e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return ea.c(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    public static <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        return ea.c(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    }

    public static /* varargs */ <E> ea<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E ... arrE) {
        Object[] arrobject = new Object[12 + arrE.length];
        arrobject[0] = e2;
        arrobject[1] = e3;
        arrobject[2] = e4;
        arrobject[3] = e5;
        arrobject[4] = e6;
        arrobject[5] = e7;
        arrobject[6] = e8;
        arrobject[7] = e9;
        arrobject[8] = e10;
        arrobject[9] = e11;
        arrobject[10] = e12;
        arrobject[11] = e13;
        System.arraycopy(arrE, 0, arrobject, 12, arrE.length);
        return ea.c(arrobject);
    }

    public static <E> ea<E> a(Iterable<? extends E> iterable) {
        aU.a(iterable);
        return iterable instanceof Collection ? ea.a((Collection)iterable) : ea.a(iterable.iterator());
    }

    public static <E> ea<E> a(Collection<? extends E> collection) {
        if (collection instanceof dQ) {
            ea ea2 = ((dQ)collection).h();
            return ea2.i_() ? ea.b(ea2.toArray()) : ea2;
        }
        return ea.c(collection.toArray());
    }

    public static <E> ea<E> a(Iterator<? extends E> iterator) {
        if (!iterator.hasNext()) {
            return ea.d();
        }
        E e2 = iterator.next();
        if (!iterator.hasNext()) {
            return ea.a(e2);
        }
        return new ec<E>().c(e2).b(iterator).b();
    }

    public static <E> ea<E> a(E[] arrE) {
        switch (arrE.length) {
            case 0: {
                return ea.d();
            }
            case 1: {
                return new mc<E>(arrE[0]);
            }
        }
        return new lo(kN.a((Object[])arrE.clone()));
    }

    private static /* varargs */ <E> ea<E> c(Object ... arrobject) {
        return ea.b(kN.a(arrobject));
    }

    static <E> ea<E> b(Object[] arrobject) {
        return ea.b(arrobject, arrobject.length);
    }

    static <E> ea<E> b(Object[] arrobject, int n2) {
        switch (n2) {
            case 0: {
                return ea.d();
            }
            case 1: {
                mc<Object> mc2 = new mc<Object>(arrobject[0]);
                return mc2;
            }
        }
        if (n2 < arrobject.length) {
            arrobject = kN.b(arrobject, n2);
        }
        return new lo(arrobject);
    }

    ea() {
    }

    @Override
    public oP<E> k_() {
        return this.e();
    }

    public oQ<E> e() {
        return this.a(0);
    }

    public oQ<E> a(int n2) {
        return new eb(this, this.size(), n2);
    }

    @Override
    public int indexOf(Object object) {
        return object == null ? -1 : gO.b(this, object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return object == null ? -1 : gO.c(this, object);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    public ea<E> a(int n2, int n3) {
        aU.a(n2, n3, this.size());
        int n4 = n3 - n2;
        if (n4 == this.size()) {
            return this;
        }
        switch (n4) {
            case 0: {
                return ea.d();
            }
            case 1: {
                return ea.a(this.get(n2));
            }
        }
        return this.b(n2, n3);
    }

    ea<E> b(int n2, int n3) {
        return new ef(this, n2, n3 - n2);
    }

    @Override
    public final boolean addAll(int n2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final E set(int n2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void add(int n2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final E remove(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ea<E> h() {
        return this;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        int n3 = this.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[n2 + i2] = this.get(i2);
        }
        return n2 + n3;
    }

    public ea<E> f() {
        return this.size() <= 1 ? this : new ed(this);
    }

    @Override
    public boolean equals(Object object) {
        return gO.a(this, object);
    }

    @Override
    public int hashCode() {
        int n2 = 1;
        int n3 = this.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = 31 * n2 + this.get(i2).hashCode();
            n2 = ~ (~ n2);
        }
        return n2;
    }

    private void a(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object j_() {
        return new ee(this.toArray());
    }

    public static <E> ec<E> g() {
        return new ec();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }
}

