/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.cy;
import com.growingio.a.a.d.cz;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.eg;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.kO;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public abstract class cx<E>
implements Iterable<E> {
    private final Iterable<E> a;

    protected cx() {
        this.a = this;
    }

    cx(Iterable<E> iterable) {
        this.a = aU.a(iterable);
    }

    public static <E> cx<E> a(Iterable<E> iterable) {
        return iterable instanceof cx ? (cx)iterable : new cy(iterable, iterable);
    }

    public static <E> cx<E> a(E[] arrE) {
        return cx.a(Arrays.asList(arrE));
    }

    public static <E> cx<E> a(cx<E> cx2) {
        return aU.a(cx2);
    }

    public static <T> cx<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return cx.b(ea.a(iterable, iterable2));
    }

    public static <T> cx<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return cx.b(ea.a(iterable, iterable2, iterable3));
    }

    public static <T> cx<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return cx.b(ea.a(iterable, iterable2, iterable3, iterable4));
    }

    public static /* varargs */ <T> cx<T> a(Iterable<? extends T> ... arriterable) {
        return cx.b(ea.a(arriterable));
    }

    public static <T> cx<T> b(Iterable<? extends Iterable<? extends T>> iterable) {
        aU.a(iterable);
        return new cz(iterable);
    }

    public static <E> cx<E> b() {
        return cx.a(ea.d());
    }

    public static <E> cx<E> b(E[] arrE) {
        return cx.a(gO.a(arrE));
    }

    public static /* varargs */ <E> cx<E> a(E e2, E ... arrE) {
        return cx.a(gO.a(e2, arrE));
    }

    public String toString() {
        return fL.c(this.a);
    }

    public final int c() {
        return fL.b(this.a);
    }

    public final boolean a(Object object) {
        return fL.a(this.a, object);
    }

    public final cx<E> d() {
        return cx.a(fL.f(this.a));
    }

    public final cx<E> c(Iterable<? extends E> iterable) {
        return cx.a(cx.a(this.a, iterable));
    }

    public final /* varargs */ cx<E> c(E ... arrE) {
        return cx.a(cx.a(this.a, Arrays.asList(arrE)));
    }

    public final cx<E> a(aV<? super E> aV2) {
        return cx.a(fL.c(this.a, aV2));
    }

    public final <T> cx<T> a(Class<T> class_) {
        return cx.a(fL.b(this.a, class_));
    }

    public final boolean b(aV<? super E> aV2) {
        return (boolean)fL.d(this.a, aV2);
    }

    public final boolean c(aV<? super E> aV2) {
        return (boolean)fL.e(this.a, aV2);
    }

    public final aP<E> d(aV<? super E> aV2) {
        return fL.g(this.a, aV2);
    }

    public final <T> cx<T> a(aq<? super E, T> aq2) {
        return cx.a(fL.a(this.a, aq2));
    }

    public <T> cx<T> b(aq<? super E, ? extends Iterable<? extends T>> aq2) {
        return cx.a(cx.b(this.a((C)aq2)));
    }

    public final aP<E> e() {
        Iterator<E> iterator = this.a.iterator();
        return iterator.hasNext() ? aP.b(iterator.next()) : aP.f();
    }

    public final aP<E> f() {
        E e2;
        if (this.a instanceof List) {
            List list = (List)this.a;
            if (list.isEmpty()) {
                return aP.f();
            }
            return aP.b(list.get(list.size() - 1));
        }
        Iterator<E> iterator = this.a.iterator();
        if (!iterator.hasNext()) {
            return aP.f();
        }
        if (this.a instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet)this.a;
            return aP.b(sortedSet.last());
        }
        do {
            e2 = iterator.next();
        } while (iterator.hasNext());
        return aP.b(e2);
    }

    public final cx<E> a(int n2) {
        return cx.a(fL.d(this.a, n2));
    }

    public final cx<E> b(int n2) {
        return cx.a(fL.e(this.a, n2));
    }

    public final boolean g() {
        return !this.a.iterator().hasNext();
    }

    public final ea<E> h() {
        return ea.a(this.a);
    }

    public final ea<E> a(Comparator<? super E> comparator) {
        return kO.a(comparator).b(this.a);
    }

    public final fg<E> i() {
        return fg.a(this.a);
    }

    public final fz<E> b(Comparator<? super E> comparator) {
        return fz.a(comparator, this.a);
    }

    public final eM<E> j() {
        return eM.a(this.a);
    }

    public final <V> ei<E, V> c(aq<? super E, V> aq2) {
        return ii.a(this.a, aq2);
    }

    public final <K> eg<K, E> d(aq<? super E, K> aq2) {
        return jN.a(this.a, aq2);
    }

    public final <K> ei<K, E> e(aq<? super E, K> aq2) {
        return ii.b(this.a, aq2);
    }

    public final E[] b(Class<E> class_) {
        return fL.a(this.a, class_);
    }

    public final <C extends Collection<? super E>> C a(C c2) {
        aU.a(c2);
        if (this.a instanceof Collection) {
            c2.addAll(aL.a(this.a));
        } else {
            for (E e2 : this.a) {
                c2.add(e2);
            }
        }
        return c2;
    }

    public final String a(aC aC2) {
        return aC2.a(this);
    }

    public final E c(int n2) {
        return fL.c(this.a, n2);
    }
}

