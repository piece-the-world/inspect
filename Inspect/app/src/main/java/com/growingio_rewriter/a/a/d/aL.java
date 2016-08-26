/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.aM;
import com.growingio.a.a.d.aN;
import com.growingio.a.a.d.aO;
import com.growingio.a.a.d.aQ;
import com.growingio.a.a.d.aS;
import com.growingio.a.a.d.dG;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.kO;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class aL {
    static final aC a = aC.a(", ").b("null");

    private aL() {
    }

    public static <E> Collection<E> a(Collection<E> collection, aV<? super E> aV2) {
        if (collection instanceof aN) {
            return ((aN)collection).a(aV2);
        }
        return new aN<E>(aU.a(collection), aU.a(aV2));
    }

    static boolean a(Collection<?> collection, Object object) {
        aU.a(collection);
        try {
            return collection.contains(object);
        }
        catch (ClassCastException var2_2) {
            return false;
        }
        catch (NullPointerException var2_3) {
            return false;
        }
    }

    static boolean b(Collection<?> collection, Object object) {
        aU.a(collection);
        try {
            return collection.remove(object);
        }
        catch (ClassCastException var2_2) {
            return false;
        }
        catch (NullPointerException var2_3) {
            return false;
        }
    }

    public static <F, T> Collection<T> a(Collection<F> collection, aq<? super F, T> aq2) {
        return new aS<F, T>(collection, aq2);
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        return (boolean)fL.e(collection2, aW.a(collection));
    }

    static String a(Collection<?> collection) {
        StringBuilder stringBuilder = aL.a(collection.size()).append('[');
        a.a(stringBuilder, fL.a(collection, new aM(collection)));
        return stringBuilder.append(']').toString();
    }

    static StringBuilder a(int n2) {
        aK.a(n2, "size");
        return new StringBuilder((int)Math.min((long)n2 * 8, 0x40000000));
    }

    static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection)iterable;
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> b(Iterable<E> iterable) {
        return aL.a(iterable, kO.d());
    }

    public static <E> Collection<List<E>> a(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new aO<E>(iterable, comparator);
    }

    public static <E> Collection<List<E>> b(Collection<E> collection) {
        return new aQ<E>(ea.a(collection));
    }

    private static boolean b(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        dG dG2 = dG.a(list);
        dG dG3 = dG.a(list2);
        return dG2.equals(dG3);
    }

    private static boolean b(long l2) {
        return l2 >= 0 && l2 <= Integer.MAX_VALUE;
    }

    static /* synthetic */ boolean a(long l2) {
        return aL.b(l2);
    }

    static /* synthetic */ boolean a(List list, List list2) {
        return aL.b(list, list2);
    }
}

