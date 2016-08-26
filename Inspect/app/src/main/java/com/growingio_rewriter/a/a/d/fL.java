/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fM;
import com.growingio.a.a.d.fN;
import com.growingio.a.a.d.fO;
import com.growingio.a.a.d.fP;
import com.growingio.a.a.d.fQ;
import com.growingio.a.a.d.fR;
import com.growingio.a.a.d.fS;
import com.growingio.a.a.d.fT;
import com.growingio.a.a.d.fU;
import com.growingio.a.a.d.fV;
import com.growingio.a.a.d.fW;
import com.growingio.a.a.d.fX;
import com.growingio.a.a.d.fZ;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.ga;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.kl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

public final class fL {
    private fL() {
    }

    public static <T> Iterable<T> a(Iterable<? extends T> iterable) {
        aU.a(iterable);
        if (iterable instanceof ga || iterable instanceof dQ) {
            Iterable<? extends T> iterable2 = iterable;
            return iterable2;
        }
        return new ga(iterable, null);
    }

    public static <E> Iterable<E> a(dQ<E> dQ2) {
        return aU.a(dQ2);
    }

    public static int b(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection)iterable).size() : gb.b(iterable.iterator());
    }

    public static boolean a(Iterable<?> iterable, Object object) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            return aL.a(collection, object);
        }
        return gb.a(iterable.iterator(), object);
    }

    public static boolean a(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection)iterable).removeAll(aU.a(collection)) : gb.a(iterable.iterator(), collection);
    }

    public static boolean b(Iterable<?> iterable, Collection<?> collection) {
        return (boolean)(iterable instanceof Collection ? (Collection)((Collection)iterable).retainAll(aU.a(collection)) ? 1 : 0 : gb.b(iterable.iterator(), collection));
    }

    public static <T> boolean a(Iterable<T> iterable, aV<? super T> aV2) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            return fL.a((List)iterable, aU.a(aV2));
        }
        return gb.a(iterable.iterator(), aV2);
    }

    private static <T> boolean a(List<T> list, aV<? super T> aV2) {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < list.size(); ++n2) {
            T t2 = list.get(n2);
            if (aV2.a(t2)) continue;
            if (n2 > n3) {
                try {
                    list.set(n3, t2);
                }
                catch (UnsupportedOperationException var5_5) {
                    fL.a(list, aV2, n3, n2);
                    return true;
                }
                catch (IllegalArgumentException var5_6) {
                    fL.a(list, aV2, n3, n2);
                    return true;
                }
            }
            ++n3;
        }
        list.subList(n3, list.size()).clear();
        return n2 != n3;
    }

    private static <T> void a(List<T> list, aV<? super T> aV2, int n2, int n3) {
        int n4;
        for (n4 = list.size() - 1; n4 > n3; --n4) {
            if (!aV2.a(list.get(n4))) continue;
            list.remove(n4);
        }
        for (n4 = n3 - 1; n4 >= n2; --n4) {
            list.remove(n4);
        }
    }

    static <T> T b(Iterable<T> iterable, aV<? super T> aV2) {
        aU.a(aV2);
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            T t2 = iterator.next();
            if (!aV2.a(t2)) continue;
            iterator.remove();
            return t2;
        }
        return null;
    }

    public static boolean a(Iterable<?> iterable, Iterable<?> iterable2) {
        if (iterable instanceof Collection && iterable2 instanceof Collection) {
            Collection collection = (Collection)iterable;
            Collection collection2 = (Collection)iterable2;
            if (collection.size() != collection2.size()) {
                return false;
            }
        }
        return gb.a(iterable.iterator(), iterable2.iterator());
    }

    public static String c(Iterable<?> iterable) {
        return gb.c(iterable.iterator());
    }

    public static <T> T d(Iterable<T> iterable) {
        return gb.d(iterable.iterator());
    }

    public static <T> T b(Iterable<? extends T> iterable, T t2) {
        return gb.b(iterable.iterator(), t2);
    }

    public static <T> T[] a(Iterable<? extends T> iterable, Class<T> class_) {
        return fL.a(iterable, kN.a(class_, 0));
    }

    static <T> T[] a(Iterable<? extends T> iterable, T[] arrT) {
        Collection<T> collection = fL.k(iterable);
        return collection.toArray(arrT);
    }

    static Object[] e(Iterable<?> iterable) {
        return fL.k(iterable).toArray();
    }

    private static <E> Collection<E> k(Iterable<E> iterable) {
        return iterable instanceof Collection ? (ArrayList<E>)iterable : gO.a(iterable.iterator());
    }

    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            Collection<? extends T> collection2 = aL.a(iterable);
            return collection.addAll(collection2);
        }
        return gb.a(collection, aU.a(iterable).iterator());
    }

    public static int c(Iterable<?> iterable, Object object) {
        if (iterable instanceof kl) {
            return ((kl)iterable).a(object);
        }
        if (iterable instanceof Set) {
            return ((Set)iterable).contains(object) ? 1 : 0;
        }
        return gb.c(iterable.iterator(), object);
    }

    public static <T> Iterable<T> f(Iterable<T> iterable) {
        aU.a(iterable);
        return new fM(iterable);
    }

    public static /* varargs */ <T> Iterable<T> a(T ... arrT) {
        return fL.f(gO.a(arrT));
    }

    public static <T> Iterable<T> b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return cx.a(iterable, iterable2);
    }

    public static <T> Iterable<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return cx.a(iterable, iterable2, iterable3);
    }

    public static <T> Iterable<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return cx.a(iterable, iterable2, iterable3, iterable4);
    }

    public static /* varargs */ <T> Iterable<T> a(Iterable<? extends T> ... arriterable) {
        return fL.g(ea.a(arriterable));
    }

    public static <T> Iterable<T> g(Iterable<? extends Iterable<? extends T>> iterable) {
        return cx.b(iterable);
    }

    public static <T> Iterable<List<T>> a(Iterable<T> iterable, int n2) {
        aU.a(iterable);
        aU.a(n2 > 0);
        return new fR(iterable, n2);
    }

    public static <T> Iterable<List<T>> b(Iterable<T> iterable, int n2) {
        aU.a(iterable);
        aU.a(n2 > 0);
        return new fS(iterable, n2);
    }

    public static <T> Iterable<T> c(Iterable<T> iterable, aV<? super T> aV2) {
        aU.a(iterable);
        aU.a(aV2);
        return new fT(iterable, aV2);
    }

    public static <T> Iterable<T> b(Iterable<?> iterable, Class<T> class_) {
        aU.a(iterable);
        aU.a(class_);
        return new fU(iterable, class_);
    }

    public static <T> boolean d(Iterable<T> iterable, aV<? super T> aV2) {
        return gb.c(iterable.iterator(), aV2);
    }

    public static <T> boolean e(Iterable<T> iterable, aV<? super T> aV2) {
        return (boolean)gb.d(iterable.iterator(), aV2);
    }

    public static <T> T f(Iterable<T> iterable, aV<? super T> aV2) {
        return (T)gb.e(iterable.iterator(), aV2);
    }

    public static <T> T a(Iterable<? extends T> iterable, aV<? super T> aV2, T t2) {
        return gb.a(iterable.iterator(), aV2, t2);
    }

    public static <T> aP<T> g(Iterable<T> iterable, aV<? super T> aV2) {
        return gb.f(iterable.iterator(), aV2);
    }

    public static <T> int h(Iterable<T> iterable, aV<? super T> aV2) {
        return gb.g(iterable.iterator(), aV2);
    }

    public static <F, T> Iterable<T> a(Iterable<F> iterable, aq<? super F, ? extends T> aq2) {
        aU.a(iterable);
        aU.a(aq2);
        return new fV(iterable, aq2);
    }

    public static <T> T c(Iterable<T> iterable, int n2) {
        aU.a(iterable);
        return (T)(iterable instanceof List ? ((List)iterable).get(n2) : gb.c(iterable.iterator(), n2));
    }

    public static <T> T a(Iterable<? extends T> iterable, int n2, T t2) {
        aU.a(iterable);
        gb.a(n2);
        if (iterable instanceof List) {
            List<T> list = gO.d(iterable);
            return n2 < list.size() ? list.get(n2) : t2;
        }
        Iterator<? extends T> iterator = iterable.iterator();
        gb.d(iterator, n2);
        return gb.d(iterator, t2);
    }

    public static <T> T d(Iterable<? extends T> iterable, T t2) {
        return gb.d(iterable.iterator(), t2);
    }

    public static <T> T h(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List)iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return fL.a(list);
        }
        return gb.f(iterable.iterator());
    }

    public static <T> T e(Iterable<? extends T> iterable, T t2) {
        if (iterable instanceof Collection) {
            Collection<T> collection = aL.a(iterable);
            if (collection.isEmpty()) {
                return t2;
            }
            if (iterable instanceof List) {
                return fL.a(gO.d(iterable));
            }
        }
        return gb.e(iterable.iterator(), t2);
    }

    private static <T> T a(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> Iterable<T> d(Iterable<T> iterable, int n2) {
        aU.a(iterable);
        aU.a(n2 >= 0, (Object)"number to skip cannot be negative");
        if (iterable instanceof List) {
            List list = (List)iterable;
            return new fW(list, n2);
        }
        return new fX(iterable, n2);
    }

    public static <T> Iterable<T> e(Iterable<T> iterable, int n2) {
        aU.a(iterable);
        aU.a(n2 >= 0, (Object)"limit is negative");
        return new fZ(iterable, n2);
    }

    public static <T> Iterable<T> i(Iterable<T> iterable) {
        if (iterable instanceof Queue) {
            return new fN(iterable);
        }
        aU.a(iterable);
        return new fO(iterable);
    }

    public static boolean j(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection)iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> a(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        aU.a(iterable, (Object)"iterables");
        aU.a(comparator, (Object)"comparator");
        fP fP2 = new fP(iterable, comparator);
        return new ga(fP2, null);
    }

    static <T> aq<Iterable<? extends T>, Iterator<? extends T>> a() {
        return new fQ();
    }
}

