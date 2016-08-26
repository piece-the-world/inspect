/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eN;
import com.growingio.a.a.d.eO;
import com.growingio.a.a.d.eP;
import com.growingio.a.a.d.eR;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gB;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.lq;
import com.growingio.a.a.d.oP;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public abstract class eM<E>
extends dQ<E>
implements kl<E> {
    private transient fg<km<E>> a;

    public static <E> eM<E> e() {
        return lq.a;
    }

    public static <E> eM<E> b(E e2) {
        return eM.b(new Object[]{e2});
    }

    public static <E> eM<E> a(E e2, E e3) {
        return eM.b(e2, e3);
    }

    public static <E> eM<E> a(E e2, E e3, E e4) {
        return eM.b(e2, e3, e4);
    }

    public static <E> eM<E> a(E e2, E e3, E e4, E e5) {
        return eM.b(e2, e3, e4, e5);
    }

    public static <E> eM<E> a(E e2, E e3, E e4, E e5, E e6) {
        return eM.b(e2, e3, e4, e5, e6);
    }

    public static /* varargs */ <E> eM<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E ... arrE) {
        return new eO<E>().a(e2).a(e3).a(e4).a(e5).a(e6).a(e7).b(arrE).b();
    }

    public static <E> eM<E> a(E[] arrE) {
        return eM.b(arrE);
    }

    public static <E> eM<E> a(Iterable<? extends E> iterable) {
        kl kl2;
        if (iterable instanceof eM && !(kl2 = (eM)iterable).i_()) {
            return kl2;
        }
        kl2 = iterable instanceof kl ? kn.b(iterable) : gB.a(iterable);
        return eM.a(kl2.a());
    }

    private static /* varargs */ <E> eM<E> b(E ... arrE) {
        gB gB2 = gB.g();
        Collections.addAll(gB2, arrE);
        return eM.a(gB2.a());
    }

    static <E> eM<E> a(Collection<? extends km<? extends E>> collection) {
        if (collection.isEmpty()) {
            return eM.e();
        }
        return new lq(collection);
    }

    public static <E> eM<E> a(Iterator<? extends E> iterator) {
        gB gB2 = gB.g();
        gb.a(gB2, iterator);
        return eM.a(gB2.a());
    }

    eM() {
    }

    @Override
    public oP<E> k_() {
        oP<km<E>> oP2 = this.f().k_();
        return new eN(this, oP2);
    }

    @Override
    public boolean contains(Object object) {
        return this.a(object) > 0;
    }

    @Override
    public final int a(E e2, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int b(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int c(E e2, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean a(E e2, int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        oP<km<E>> oP2 = this.f().k_();
        while (oP2.hasNext()) {
            km<E> km2 = oP2.next();
            Arrays.fill(arrobject, n2, n2 + km2.b(), km2.a());
            n2 += km2.b();
        }
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        return kn.a(this, object);
    }

    @Override
    public int hashCode() {
        return lI.b(this.f());
    }

    @Override
    public String toString() {
        return this.f().toString();
    }

    public fg<km<E>> f() {
        fg<km<km<E>>> fg2 = this.a;
        fg<km<km<E>>> fg3 = fg2 == null ? (this.a = this.c()) : fg2;
        return fg3;
    }

    private final fg<km<E>> c() {
        return this.isEmpty() ? fg.k() : new eP(this, null);
    }

    abstract km<E> a(int var1);

    @Override
    Object j_() {
        return new eR(this);
    }

    public static <E> eO<E> n() {
        return new eO<E>();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.f();
    }
}

