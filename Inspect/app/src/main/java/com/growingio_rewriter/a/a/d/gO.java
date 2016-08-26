/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aH;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gP;
import com.growingio.a.a.d.gQ;
import com.growingio.a.a.d.gR;
import com.growingio.a.a.d.gS;
import com.growingio.a.a.d.gT;
import com.growingio.a.a.d.gU;
import com.growingio.a.a.d.gW;
import com.growingio.a.a.d.gX;
import com.growingio.a.a.d.gY;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ha;
import com.growingio.a.a.d.hb;
import com.growingio.a.a.d.hd;
import com.growingio.a.a.d.hf;
import com.growingio.a.a.m.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gO {
    private gO() {
    }

    public static <E> ArrayList<E> a() {
        return new ArrayList();
    }

    public static /* varargs */ <E> ArrayList<E> a(E ... arrE) {
        aU.a(arrE);
        int n2 = gO.a(arrE.length);
        ArrayList arrayList = new ArrayList(n2);
        Collections.addAll(arrayList, arrE);
        return arrayList;
    }

    static int a(int n2) {
        aK.a(n2, "arraySize");
        return q.b(5 + (long)n2 + (long)(n2 / 10));
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        aU.a(iterable);
        return iterable instanceof Collection ? new ArrayList<E>(aL.a(iterable)) : gO.a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> iterator) {
        ArrayList<E> arrayList = gO.a();
        gb.a(arrayList, iterator);
        return arrayList;
    }

    public static <E> ArrayList<E> b(int n2) {
        aK.a(n2, "initialArraySize");
        return new ArrayList(n2);
    }

    public static <E> ArrayList<E> c(int n2) {
        return new ArrayList(gO.a(n2));
    }

    public static <E> LinkedList<E> b() {
        return new LinkedList();
    }

    public static <E> LinkedList<E> b(Iterable<? extends E> iterable) {
        LinkedList<E> linkedList = gO.b();
        fL.a(linkedList, iterable);
        return linkedList;
    }

    public static <E> CopyOnWriteArrayList<E> c() {
        return new CopyOnWriteArrayList();
    }

    public static <E> CopyOnWriteArrayList<E> c(Iterable<? extends E> iterable) {
        Collection<? extends E> collection = iterable instanceof Collection ? aL.a(iterable) : gO.a(iterable);
        return new CopyOnWriteArrayList<E>(collection);
    }

    public static <E> List<E> a(E e2, E[] arrE) {
        return new gT<E>(e2, arrE);
    }

    public static <E> List<E> a(E e2, E e3, E[] arrE) {
        return new hf<E>(e2, e3, arrE);
    }

    public static <B> List<List<B>> a(List<? extends List<? extends B>> list) {
        return aH.a(list);
    }

    public static /* varargs */ <B> List<List<B>> a(List<? extends B> ... arrlist) {
        return gO.a(Arrays.asList(arrlist));
    }

    public static <F, T> List<T> a(List<F> list, aq<? super F, ? extends T> aq2) {
        return list instanceof RandomAccess ? new hb<F, T>(list, aq2) : new hd<F, T>(list, aq2);
    }

    public static <T> List<List<T>> a(List<T> list, int n2) {
        aU.a(list);
        aU.a(n2 > 0);
        return list instanceof RandomAccess ? new gW<T>(list, n2) : new gU<T>(list, n2);
    }

    public static ea<Character> a(String string) {
        return new ha(aU.a(string));
    }

    public static List<Character> a(CharSequence charSequence) {
        return new gS(aU.a(charSequence));
    }

    public static <T> List<T> b(List<T> list) {
        if (list instanceof ea) {
            return ((ea)list).f();
        }
        if (list instanceof gY) {
            return ((gY)list).a();
        }
        if (list instanceof RandomAccess) {
            return new gX<T>(list);
        }
        return new gY<T>(list);
    }

    static int c(List<?> list) {
        int n2 = 1;
        for (Object obj : list) {
            n2 = 31 * n2 + (obj == null ? 0 : obj.hashCode());
            n2 = ~ (~ n2);
        }
        return n2;
    }

    static boolean a(List<?> list, Object object) {
        if (object == aU.a(list)) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        List list2 = (List)object;
        int n2 = list.size();
        if (n2 != list2.size()) {
            return false;
        }
        if (list instanceof RandomAccess && list2 instanceof RandomAccess) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (com.growingio.a.a.b.aL.a(list.get(i2), list2.get(i2))) continue;
                return false;
            }
            return true;
        }
        return gb.a(list.iterator(), list2.iterator());
    }

    static <E> boolean a(List<E> list, int n2, Iterable<? extends E> iterable) {
        boolean bl2 = false;
        ListIterator<E> listIterator = list.listIterator(n2);
        for (E e2 : iterable) {
            listIterator.add(e2);
            bl2 = true;
        }
        return bl2;
    }

    static int b(List<?> list, Object object) {
        if (list instanceof RandomAccess) {
            return gO.d(list, object);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!com.growingio.a.a.b.aL.a(object, listIterator.next())) continue;
            return listIterator.previousIndex();
        }
        return -1;
    }

    private static int d(List<?> list, Object object) {
        int n2 = list.size();
        if (object == null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (list.get(i2) != null) continue;
                return i2;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!object.equals(list.get(i3))) continue;
                return i3;
            }
        }
        return -1;
    }

    static int c(List<?> list, Object object) {
        if (list instanceof RandomAccess) {
            return gO.e(list, object);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!com.growingio.a.a.b.aL.a(object, listIterator.previous())) continue;
            return listIterator.nextIndex();
        }
        return -1;
    }

    private static int e(List<?> list, Object object) {
        if (object == null) {
            for (int i2 = list.size() - 1; i2 >= 0; --i2) {
                if (list.get(i2) != null) continue;
                return i2;
            }
        } else {
            for (int i3 = list.size() - 1; i3 >= 0; --i3) {
                if (!object.equals(list.get(i3))) continue;
                return i3;
            }
        }
        return -1;
    }

    static <E> ListIterator<E> b(List<E> list, int n2) {
        return new gR<E>(list).listIterator(n2);
    }

    static <E> List<E> a(List<E> list, int n2, int n3) {
        List list2 = list instanceof RandomAccess ? new gP(list) : new gQ(list);
        return list2.subList(n2, n3);
    }

    static <T> List<T> d(Iterable<T> iterable) {
        return (List)iterable;
    }
}

