/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.bt;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gc;
import com.growingio.a.a.d.gd;
import com.growingio.a.a.d.ge;
import com.growingio.a.a.d.gf;
import com.growingio.a.a.d.gg;
import com.growingio.a.a.d.gh;
import com.growingio.a.a.d.gi;
import com.growingio.a.a.d.gj;
import com.growingio.a.a.d.gk;
import com.growingio.a.a.d.gl;
import com.growingio.a.a.d.gm;
import com.growingio.a.a.d.gn;
import com.growingio.a.a.d.go;
import com.growingio.a.a.d.gp;
import com.growingio.a.a.d.gr;
import com.growingio.a.a.d.gt;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.d.oQ;
import com.growingio.a.a.m.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class gb {
    static final oQ<Object> a = new gc();
    private static final Iterator<Object> b = new gh();

    private gb() {
    }

    static <T> oP<T> a() {
        return gb.b();
    }

    static <T> oQ<T> b() {
        return a;
    }

    static <T> Iterator<T> c() {
        return b;
    }

    public static <T> oP<T> a(Iterator<? extends T> iterator) {
        aU.a(iterator);
        if (iterator instanceof oP) {
            oP oP2 = (oP)iterator;
            return oP2;
        }
        return new gi(iterator);
    }

    public static <T> oP<T> a(oP<T> oP2) {
        return aU.a(oP2);
    }

    public static int b(Iterator<?> iterator) {
        long l2 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            ++l2;
        }
        return q.b(l2);
    }

    public static boolean a(Iterator<?> iterator, Object object) {
        return gb.c(iterator, aW.a(object));
    }

    public static boolean a(Iterator<?> iterator, Collection<?> collection) {
        return gb.a(iterator, aW.a(collection));
    }

    public static <T> boolean a(Iterator<T> iterator, aV<? super T> aV2) {
        aU.a(aV2);
        boolean bl2 = false;
        while (iterator.hasNext()) {
            if (!aV2.a(iterator.next())) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public static boolean b(Iterator<?> iterator, Collection<?> collection) {
        return gb.a(iterator, aW.a(aW.a(collection)));
    }

    public static boolean a(Iterator<?> iterator, Iterator<?> iterator2) {
        while (iterator.hasNext()) {
            Object obj;
            if (!iterator2.hasNext()) {
                return false;
            }
            Object obj2 = iterator.next();
            if (com.growingio.a.a.b.aL.a(obj2, obj = iterator2.next())) continue;
            return false;
        }
        return !iterator2.hasNext();
    }

    public static String c(Iterator<?> iterator) {
        return aL.a.a(new StringBuilder().append('['), iterator).append(']').toString();
    }

    public static <T> T d(Iterator<T> iterator) {
        T t2 = iterator.next();
        if (!iterator.hasNext()) {
            return t2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected one element but was: <" + t2);
        for (int i2 = 0; i2 < 4 && iterator.hasNext(); ++i2) {
            stringBuilder.append(", " + iterator.next());
        }
        if (iterator.hasNext()) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static <T> T b(Iterator<? extends T> iterator, T t2) {
        return iterator.hasNext() ? gb.d(iterator) : t2;
    }

    public static <T> T[] a(Iterator<? extends T> iterator, Class<T> class_) {
        ArrayList<? extends T> arrayList = gO.a(iterator);
        return fL.a(arrayList, class_);
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> iterator) {
        aU.a(collection);
        aU.a(iterator);
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= collection.add(iterator.next());
        }
        return bl2;
    }

    public static int c(Iterator<?> iterator, Object object) {
        return gb.b(gb.b(iterator, aW.a(object)));
    }

    public static <T> Iterator<T> a(Iterable<T> iterable) {
        aU.a(iterable);
        return new gj(iterable);
    }

    public static /* varargs */ <T> Iterator<T> a(T ... arrT) {
        return gb.a(gO.a(arrT));
    }

    public static <T> Iterator<T> b(Iterator<? extends T> iterator, Iterator<? extends T> iterator2) {
        aU.a(iterator);
        aU.a(iterator2);
        return gb.e(new bt<Iterator>(iterator, iterator2));
    }

    public static <T> Iterator<T> a(Iterator<? extends T> iterator, Iterator<? extends T> iterator2, Iterator<? extends T> iterator3) {
        aU.a(iterator);
        aU.a(iterator2);
        aU.a(iterator3);
        return gb.e(new bt<Iterator>(iterator, iterator2, iterator3));
    }

    public static <T> Iterator<T> a(Iterator<? extends T> iterator, Iterator<? extends T> iterator2, Iterator<? extends T> iterator3, Iterator<? extends T> iterator4) {
        aU.a(iterator);
        aU.a(iterator2);
        aU.a(iterator3);
        aU.a(iterator4);
        return gb.e(new bt<Iterator>(iterator, iterator2, iterator3, iterator4));
    }

    public static /* varargs */ <T> Iterator<T> a(Iterator<? extends T> ... arriterator) {
        for (Iterator<? extends T> iterator : aU.a(arriterator)) {
            aU.a(iterator);
        }
        return gb.e(new bt<Iterator<? extends T>>(arriterator));
    }

    public static <T> Iterator<T> e(Iterator<? extends Iterator<? extends T>> iterator) {
        return new gp(iterator);
    }

    public static <T> oP<List<T>> a(Iterator<T> iterator, int n2) {
        return gb.a(iterator, n2, false);
    }

    public static <T> oP<List<T>> b(Iterator<T> iterator, int n2) {
        return gb.a(iterator, n2, true);
    }

    private static <T> oP<List<T>> a(Iterator<T> iterator, int n2, boolean bl2) {
        aU.a(iterator);
        aU.a(n2 > 0);
        return new gk(iterator, n2, bl2);
    }

    public static <T> oP<T> b(Iterator<T> iterator, aV<? super T> aV2) {
        aU.a(iterator);
        aU.a(aV2);
        return new gl(iterator, aV2);
    }

    public static <T> oP<T> b(Iterator<?> iterator, Class<T> class_) {
        return gb.b(iterator, aW.a(class_));
    }

    public static <T> boolean c(Iterator<T> iterator, aV<? super T> aV2) {
        return gb.g(iterator, aV2) != -1;
    }

    public static <T> boolean d(Iterator<T> iterator, aV<? super T> aV2) {
        aU.a(aV2);
        while (iterator.hasNext()) {
            T t2 = iterator.next();
            if (aV2.a(t2)) continue;
            return false;
        }
        return true;
    }

    public static <T> T e(Iterator<T> iterator, aV<? super T> aV2) {
        return gb.b(iterator, aV2).next();
    }

    public static <T> T a(Iterator<? extends T> iterator, aV<? super T> aV2, T t2) {
        return gb.d(gb.b(iterator, aV2), t2);
    }

    public static <T> aP<T> f(Iterator<T> iterator, aV<? super T> aV2) {
        oP<T> oP2 = gb.b(iterator, aV2);
        return oP2.hasNext() ? aP.b(oP2.next()) : aP.f();
    }

    public static <T> int g(Iterator<T> iterator, aV<? super T> aV2) {
        aU.a(aV2, (Object)"predicate");
        int n2 = 0;
        while (iterator.hasNext()) {
            T t2 = iterator.next();
            if (aV2.a(t2)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static <F, T> Iterator<T> a(Iterator<F> iterator, aq<? super F, ? extends T> aq2) {
        aU.a(aq2);
        return new gm(iterator, aq2);
    }

    public static <T> T c(Iterator<T> iterator, int n2) {
        gb.a(n2);
        int n3 = gb.d(iterator, n2);
        if (!iterator.hasNext()) {
            throw new IndexOutOfBoundsException("position (" + n2 + ") must be less than the number of elements that remained (" + n3 + ")");
        }
        return iterator.next();
    }

    static void a(int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("position (" + n2 + ") must not be negative");
        }
    }

    public static <T> T a(Iterator<? extends T> iterator, int n2, T t2) {
        gb.a(n2);
        gb.d(iterator, n2);
        return gb.d(iterator, t2);
    }

    public static <T> T d(Iterator<? extends T> iterator, T t2) {
        return iterator.hasNext() ? iterator.next() : t2;
    }

    public static <T> T f(Iterator<T> iterator) {
        T t2;
        do {
            t2 = iterator.next();
        } while (iterator.hasNext());
        return t2;
    }

    public static <T> T e(Iterator<? extends T> iterator, T t2) {
        return iterator.hasNext() ? gb.f(iterator) : t2;
    }

    public static int d(Iterator<?> iterator, int n2) {
        int n3;
        aU.a(iterator);
        aU.a(n2 >= 0, (Object)"numberToAdvance must be nonnegative");
        for (n3 = 0; n3 < n2 && iterator.hasNext(); ++n3) {
            iterator.next();
        }
        return n3;
    }

    public static <T> Iterator<T> e(Iterator<T> iterator, int n2) {
        aU.a(iterator);
        aU.a(n2 >= 0, (Object)"limit is negative");
        return new gn(n2, iterator);
    }

    public static <T> Iterator<T> g(Iterator<T> iterator) {
        aU.a(iterator);
        return new go(iterator);
    }

    static <T> T h(Iterator<T> iterator) {
        if (iterator.hasNext()) {
            T t2 = iterator.next();
            iterator.remove();
            return t2;
        }
        return null;
    }

    static void i(Iterator<?> iterator) {
        aU.a(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static /* varargs */ <T> oP<T> b(T ... arrT) {
        return gb.a(arrT, 0, arrT.length, 0);
    }

    static <T> oQ<T> a(T[] arrT, int n2, int n3, int n4) {
        aU.a(n3 >= 0);
        int n5 = n2 + n3;
        aU.a(n2, n5, arrT.length);
        aU.b(n4, n3);
        if (n3 == 0) {
            return gb.b();
        }
        return new gd(n3, n4, arrT, n2);
    }

    public static <T> oP<T> a(T t2) {
        return new ge(t2);
    }

    public static <T> oP<T> a(Enumeration<T> enumeration) {
        aU.a(enumeration);
        return new gf(enumeration);
    }

    public static <T> Enumeration<T> j(Iterator<T> iterator) {
        aU.a(iterator);
        return new gg(iterator);
    }

    public static <T> kT<T> k(Iterator<? extends T> iterator) {
        if (iterator instanceof gt) {
            gt gt2 = (gt)iterator;
            return gt2;
        }
        return new gt<T>(iterator);
    }

    public static <T> kT<T> a(kT<T> kT2) {
        return aU.a(kT2);
    }

    public static <T> oP<T> a(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        aU.a(iterable, (Object)"iterators");
        aU.a(comparator, (Object)"comparator");
        return new gr<T>(iterable, comparator);
    }

    static <T> ListIterator<T> l(Iterator<T> iterator) {
        return (ListIterator)iterator;
    }
}

