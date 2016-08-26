/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bL;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fA;
import com.growingio.a.a.d.fB;
import com.growingio.a.a.d.fC;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.lw;
import com.growingio.a.a.d.mf;
import com.growingio.a.a.d.mg;
import com.growingio.a.a.d.oP;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class fz<E>
extends fC<E>
implements mf<E>,
NavigableSet<E> {
    final transient Comparator<? super E> c;
    transient fz<E> d;

    static <E> lw<E> a(Comparator<? super E> comparator) {
        if (kO.d().equals(comparator)) {
            return lw.a;
        }
        return new lw<E>(ea.d(), comparator);
    }

    public static <E> fz<E> n() {
        return lw.a;
    }

    public static <E extends Comparable<? super E>> fz<E> c(E e2) {
        return new lw<E>(ea.a(e2), kO.d());
    }

    public static <E extends Comparable<? super E>> fz<E> b(E e2, E e3) {
        return fz.a(kO.d(), 2, new Comparable[]{e2, e3});
    }

    public static <E extends Comparable<? super E>> fz<E> a(E e2, E e3, E e4) {
        return fz.a(kO.d(), 3, new Comparable[]{e2, e3, e4});
    }

    public static <E extends Comparable<? super E>> fz<E> a(E e2, E e3, E e4, E e5) {
        return fz.a(kO.d(), 4, e2, e3, e4, e5);
    }

    public static <E extends Comparable<? super E>> fz<E> a(E e2, E e3, E e4, E e5, E e6) {
        return fz.a(kO.d(), 5, new Comparable[]{e2, e3, e4, e5, e6});
    }

    public static /* varargs */ <E extends Comparable<? super E>> fz<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E ... arrE) {
        Comparable[] arrcomparable = new Comparable[6 + arrE.length];
        arrcomparable[0] = e2;
        arrcomparable[1] = e3;
        arrcomparable[2] = e4;
        arrcomparable[3] = e5;
        arrcomparable[4] = e6;
        arrcomparable[5] = e7;
        System.arraycopy(arrE, 0, arrcomparable, 6, arrE.length);
        return fz.a(kO.d(), arrcomparable.length, arrcomparable);
    }

    public static <E extends Comparable<? super E>> fz<E> a(E[] arrE) {
        return fz.a(kO.d(), arrE.length, (Object[])arrE.clone());
    }

    public static <E> fz<E> b(Iterable<? extends E> iterable) {
        kO kO2 = kO.d();
        return fz.a(kO2, iterable);
    }

    public static <E> fz<E> b(Collection<? extends E> collection) {
        kO kO2 = kO.d();
        return fz.a(kO2, collection);
    }

    public static <E> fz<E> b(Iterator<? extends E> iterator) {
        kO kO2 = kO.d();
        return fz.a(kO2, iterator);
    }

    public static <E> fz<E> a(Comparator<? super E> comparator, Iterator<? extends E> iterator) {
        return new fA<E>(comparator).c(iterator).c();
    }

    public static <E> fz<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Object object;
        aU.a(comparator);
        boolean bl2 = mg.a(comparator, iterable);
        if (bl2 && iterable instanceof fz && !(object = (fz)iterable).i_()) {
            return object;
        }
        object = fL.e(iterable);
        return fz.a(comparator, object.length, object);
    }

    public static <E> fz<E> a(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return fz.a(comparator, collection);
    }

    public static <E> fz<E> a(SortedSet<E> sortedSet) {
        Comparator<E> comparator = mg.a(sortedSet);
        ea<E> ea2 = ea.a(sortedSet);
        if (ea2.isEmpty()) {
            return fz.a(comparator);
        }
        return new lw<E>(ea2, comparator);
    }

    static /* varargs */ <E> fz<E> a(Comparator<? super E> comparator, int n2, E ... arrE) {
        if (n2 == 0) {
            return fz.a(comparator);
        }
        kN.c(arrE, n2);
        Arrays.sort(arrE, 0, n2, comparator);
        int n3 = 1;
        for (int i2 = 1; i2 < n2; ++i2) {
            E e2 = arrE[i2];
            E e3 = arrE[n3 - 1];
            if (comparator.compare(e2, e3) == 0) continue;
            arrE[n3++] = e2;
        }
        Arrays.fill(arrE, n3, n2, null);
        return new lw<E>(ea.b(arrE, n3), comparator);
    }

    public static <E> fA<E> b(Comparator<E> comparator) {
        return new fA<E>(comparator);
    }

    public static <E extends Comparable<?>> fA<E> o() {
        return new fA(kO.d().a());
    }

    public static <E extends Comparable<?>> fA<E> p() {
        return new fA(kO.d());
    }

    int c(Object object, Object object2) {
        return fz.a(this.c, object, object2);
    }

    static int a(Comparator<?> comparator, Object object, Object object2) {
        Comparator comparator2 = comparator;
        return comparator2.compare((Object)object, (Object)object2);
    }

    fz(Comparator<? super E> comparator) {
        this.c = comparator;
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.c;
    }

    @Override
    public abstract oP<E> k_();

    public fz<E> b(E e2) {
        return this.d(e2, false);
    }

    @Override
    public fz<E> d(E e2, boolean bl2) {
        return this.b(aU.a(e2), bl2);
    }

    public fz<E> a(E e2, E e3) {
        return this.b(e2, true, e3, false);
    }

    @Override
    public fz<E> b(E e2, boolean bl2, E e3, boolean bl3) {
        aU.a(e2);
        aU.a(e3);
        aU.a(this.c.compare(e2, e3) <= 0);
        return this.a(e2, bl2, e3, bl3);
    }

    public fz<E> a(E e2) {
        return this.c(e2, true);
    }

    public fz<E> c(E e2, boolean bl2) {
        return this.a(aU.a(e2), bl2);
    }

    @Override
    abstract fz<E> b(E var1, boolean var2);

    @Override
    abstract fz<E> a(E var1, boolean var2, E var3, boolean var4);

    abstract fz<E> a(E var1, boolean var2);

    @Override
    public E lower(E e2) {
        return gb.d(this.d(e2, false).d(), null);
    }

    @Override
    public E floor(E e2) {
        return gb.d(this.d(e2, true).d(), null);
    }

    @Override
    public E ceiling(E e2) {
        return fL.d(this.c(e2, true), null);
    }

    @Override
    public E higher(E e2) {
        return fL.d(this.c(e2, false), null);
    }

    @Override
    public E first() {
        return this.k_().next();
    }

    @Override
    public E last() {
        return this.d().next();
    }

    @Override
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public fz<E> g_() {
        fz<E> fz2 = this.d;
        if (fz2 == null) {
            fz2 = this.d = this.e();
            fz2.d = this;
        }
        return fz2;
    }

    fz<E> e() {
        return new bL<E>(this);
    }

    public abstract oP<E> d();

    abstract int c(Object var1);

    private void a(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object j_() {
        return new fB<E>(this.c, this.toArray());
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    @Override
    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ NavigableSet tailSet(Object object, boolean bl2) {
        return this.c((E)object, bl2);
    }

    @Override
    public /* synthetic */ NavigableSet headSet(Object object, boolean bl2) {
        return this.d(object, bl2);
    }

    @Override
    public /* synthetic */ NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b(object, bl2, object2, bl3);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ NavigableSet descendingSet() {
        return this.g_();
    }
}

