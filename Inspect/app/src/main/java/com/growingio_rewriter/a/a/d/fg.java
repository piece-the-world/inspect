/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.dX;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.fk;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.lu;
import com.growingio.a.a.d.md;
import com.growingio.a.a.d.oP;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public abstract class fg<E>
extends dQ<E>
implements Set<E> {
    static final int b = 1073741824;
    private static final double a = 0.7;
    private static final int c = 751619276;

    public static <E> fg<E> k() {
        return lu.a;
    }

    public static <E> fg<E> d(E e2) {
        return new md<E>(e2);
    }

    public static <E> fg<E> b(E e2, E e3) {
        return fg.b(2, e2, e3);
    }

    public static <E> fg<E> a(E e2, E e3, E e4) {
        return fg.b(3, e2, e3, e4);
    }

    public static <E> fg<E> a(E e2, E e3, E e4, E e5) {
        return fg.b(4, e2, e3, e4, e5);
    }

    public static <E> fg<E> a(E e2, E e3, E e4, E e5, E e6) {
        return fg.b(5, e2, e3, e4, e5, e6);
    }

    public static /* varargs */ <E> fg<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E ... arrE) {
        int n2 = 6;
        Object[] arrobject = new Object[6 + arrE.length];
        arrobject[0] = e2;
        arrobject[1] = e3;
        arrobject[2] = e4;
        arrobject[3] = e5;
        arrobject[4] = e6;
        arrobject[5] = e7;
        System.arraycopy(arrE, 0, arrobject, 6, arrE.length);
        return fg.b(arrobject.length, arrobject);
    }

    private static /* varargs */ <E> fg<E> b(int n2, Object ... arrobject) {
        switch (n2) {
            case 0: {
                return fg.k();
            }
            case 1: {
                Object object = arrobject[0];
                return fg.d(object);
            }
        }
        int n3 = fg.c(n2);
        Object[] arrobject2 = new Object[n3];
        int n4 = n3 - 1;
        int n5 = 0;
        int n6 = 0;
        block4 : for (int i2 = 0; i2 < n2; ++i2) {
            Object object = kN.a(arrobject[i2], i2);
            int n7 = object.hashCode();
            int n8 = dH.a(n7);
            do {
                Object object2;
                int n9;
                if ((object2 = arrobject2[n9 = n8 & n4]) == null) {
                    arrobject[n6++] = object;
                    arrobject2[n9] = object;
                    n5 += n7;
                    continue block4;
                }
                if (object2.equals(object)) continue block4;
                ++n8;
            } while (true);
        }
        Arrays.fill(arrobject, n6, n2, null);
        if (n6 == 1) {
            Object object = arrobject[0];
            return new md<Object>(object, n5);
        }
        if (n3 != fg.c(n6)) {
            return fg.b(n6, arrobject);
        }
        Object[] arrobject3 = n6 < arrobject.length ? kN.b(arrobject, n6) : arrobject;
        return new lu(arrobject3, n5, arrobject2, n4);
    }

    static int c(int n2) {
        if (n2 < 751619276) {
            int n3 = Integer.highestOneBit(n2 - 1) << 1;
            while ((double)n3 * 0.7 < (double)n2) {
                n3 <<= 1;
            }
            return n3;
        }
        aU.a(n2 < 1073741824, (Object)"collection too large");
        return 1073741824;
    }

    public static <E> fg<E> a(Collection<? extends E> collection) {
        Object[] arrobject;
        if (collection instanceof fg && !(collection instanceof fz)) {
            arrobject = (Object[])collection;
            if (!arrobject.i_()) {
                return arrobject;
            }
        } else if (collection instanceof EnumSet) {
            return fg.a((EnumSet)collection);
        }
        arrobject = collection.toArray();
        return fg.b(arrobject.length, arrobject);
    }

    public static <E> fg<E> a(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? fg.a((Collection)iterable) : fg.a(iterable.iterator());
    }

    public static <E> fg<E> a(Iterator<? extends E> iterator) {
        if (!iterator.hasNext()) {
            return fg.k();
        }
        E e2 = iterator.next();
        if (!iterator.hasNext()) {
            return fg.d(e2);
        }
        return new fh<E>().c(e2).b(iterator).b();
    }

    public static <E> fg<E> a(E[] arrE) {
        switch (arrE.length) {
            case 0: {
                return fg.k();
            }
            case 1: {
                return fg.d(arrE[0]);
            }
        }
        return fg.b(arrE.length, (Object[])arrE.clone());
    }

    private static fg a(EnumSet enumSet) {
        return dX.a(EnumSet.copyOf(enumSet));
    }

    fg() {
    }

    boolean i() {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fg && this.i() && ((fg)object).i() && this.hashCode() != object.hashCode()) {
            return false;
        }
        return lI.a(this, object);
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }

    @Override
    public abstract oP<E> k_();

    @Override
    Object j_() {
        return new fk(this.toArray());
    }

    public static <E> fh<E> l() {
        return new fh<E>();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    static /* synthetic */ fg a(int n2, Object[] arrobject) {
        return fg.b(n2, arrobject);
    }
}

