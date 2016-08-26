/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bK;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fw;
import com.growingio.a.a.d.fx;
import com.growingio.a.a.d.fy;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lv;
import com.growingio.a.a.d.lw;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.nX;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public abstract class fv<E>
extends fy<E>
implements mu<E> {
    transient fv<E> a;

    public static <E> fv<E> p() {
        return lv.b;
    }

    public static <E extends Comparable<? super E>> fv<E> a(E e2) {
        lw lw2 = (lw)fz.c(e2);
        long[] arrl = new long[]{0, 1};
        return new lv(lw2, arrl, 0, 1);
    }

    public static <E extends Comparable<? super E>> fv<E> a(E e2, E e3) {
        return fv.a(kO.d(), Arrays.asList(e2, e3));
    }

    public static <E extends Comparable<? super E>> fv<E> a(E e2, E e3, E e4) {
        return fv.a(kO.d(), Arrays.asList(e2, e3, e4));
    }

    public static <E extends Comparable<? super E>> fv<E> a(E e2, E e3, E e4, E e5) {
        return fv.a(kO.d(), Arrays.asList(e2, e3, e4, e5));
    }

    public static <E extends Comparable<? super E>> fv<E> a(E e2, E e3, E e4, E e5, E e6) {
        return fv.a(kO.d(), Arrays.asList(e2, e3, e4, e5, e6));
    }

    public static /* varargs */ <E extends Comparable<? super E>> fv<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E ... arrE) {
        int n2 = arrE.length + 6;
        ArrayList arrayList = gO.b(n2);
        Collections.addAll(arrayList, e2, e3, e4, e5, e6, e7);
        Collections.addAll(arrayList, arrE);
        return fv.a(kO.d(), arrayList);
    }

    public static <E extends Comparable<? super E>> fv<E> a(E[] arrE) {
        return fv.a(kO.d(), Arrays.asList(arrE));
    }

    public static <E> fv<E> b(Iterable<? extends E> iterable) {
        kO kO2 = kO.d();
        return fv.a(kO2, iterable);
    }

    public static <E> fv<E> b(Iterator<? extends E> iterator) {
        kO kO2 = kO.d();
        return fv.a(kO2, iterator);
    }

    public static <E> fv<E> a(Comparator<? super E> comparator, Iterator<? extends E> iterator) {
        aU.a(comparator);
        return new fw<E>(comparator).c(iterator).c();
    }

    public static <E> fv<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        dQ dQ2;
        if (iterable instanceof fv && comparator.equals((dQ2 = (fv)iterable).comparator())) {
            if (dQ2.i_()) {
                return fv.a(comparator, dQ2.f().h());
            }
            return dQ2;
        }
        iterable = gO.a(iterable);
        dQ2 = nX.a(aU.a(comparator));
        fL.a(dQ2, iterable);
        return fv.a(comparator, dQ2.a());
    }

    public static <E> fv<E> a(mu<E> mu2) {
        return fv.a(mu2.comparator(), gO.a(mu2.a()));
    }

    private static <E> fv<E> a(Comparator<? super E> comparator, Collection<km<E>> collection) {
        if (collection.isEmpty()) {
            return fv.a(comparator);
        }
        ec<E> ec2 = new ec<E>(collection.size());
        long[] arrl = new long[collection.size() + 1];
        int n2 = 0;
        for (km<E> km2 : collection) {
            ec2.c(km2.a());
            arrl[n2 + 1] = arrl[n2] + (long)km2.b();
            ++n2;
        }
        return new lv<E>(new lw<E>(ec2.b(), comparator), arrl, 0, collection.size());
    }

    static <E> fv<E> a(Comparator<? super E> comparator) {
        if (kO.d().equals(comparator)) {
            return lv.b;
        }
        return new lv<E>(comparator);
    }

    fv() {
    }

    @Override
    public final Comparator<? super E> comparator() {
        return this.b().comparator();
    }

    public abstract fz<E> b();

    public fv<E> c() {
        fv<E> fv2 = this.a;
        if (fv2 == null) {
            this.a = this.isEmpty() ? fv.a(kO.a(this.comparator()).a()) : new bK<E>(this);
            return this.a;
        }
        return fv2;
    }

    @Override
    public final km<E> k() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final km<E> l() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract fv<E> a(E var1, aD var2);

    @Override
    public fv<E> b(E e2, aD aD2, E e3, aD aD3) {
        aU.a(this.comparator().compare(e2, e3) <= 0, "Expected lowerBound <= upperBound but %s > %s", e2, e3);
        return this.b(e2, aD2).a(e3, aD3);
    }

    @Override
    public abstract fv<E> b(E var1, aD var2);

    public static <E> fw<E> b(Comparator<E> comparator) {
        return new fw<E>(comparator);
    }

    public static <E extends Comparable<?>> fw<E> r() {
        return new fw<S>(kO.d().a());
    }

    public static <E extends Comparable<?>> fw<E> s() {
        return new fw<C>(kO.<C>d());
    }

    @Override
    Object j_() {
        return new fx<E>(this);
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }

    @Override
    public /* synthetic */ mu c(Object object, aD aD2) {
        return this.b(object, aD2);
    }

    @Override
    public /* synthetic */ mu a(Object object, aD aD2, Object object2, aD aD3) {
        return this.b(object, aD2, object2, aD3);
    }

    @Override
    public /* synthetic */ mu d(Object object, aD aD2) {
        return this.a(object, aD2);
    }

    @Override
    public /* synthetic */ mu o() {
        return this.c();
    }

    @Override
    public /* synthetic */ NavigableSet e_() {
        return this.b();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.b();
    }
}

