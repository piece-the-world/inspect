/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bl;
import com.growingio.a.a.d.bn;
import com.growingio.a.a.d.bo;
import com.growingio.a.a.d.bp;
import com.growingio.a.a.d.bq;
import com.growingio.a.a.d.br;
import com.growingio.a.a.d.bs;
import com.growingio.a.a.d.gO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

final class bm {
    private bm() {
    }

    public static <E> Collection<E> a(Collection<E> collection, bl<? super E> bl2) {
        return new bn<E>(collection, bl2);
    }

    public static <E> Set<E> a(Set<E> set, bl<? super E> bl2) {
        return new br<E>(set, bl2);
    }

    public static <E> SortedSet<E> a(SortedSet<E> sortedSet, bl<? super E> bl2) {
        return new bs<E>(sortedSet, bl2);
    }

    public static <E> List<E> a(List<E> list, bl<? super E> bl2) {
        return list instanceof RandomAccess ? new bq<E>(list, bl2) : new bo<E>(list, bl2);
    }

    private static <E> ListIterator<E> b(ListIterator<E> listIterator, bl<? super E> bl2) {
        return new bp<E>(listIterator, bl2);
    }

    static <E> Collection<E> b(Collection<E> collection, bl<E> bl2) {
        if (collection instanceof SortedSet) {
            return bm.a((SortedSet)collection, bl2);
        }
        if (collection instanceof Set) {
            return bm.a((Set)collection, bl2);
        }
        if (collection instanceof List) {
            return bm.a((List)collection, bl2);
        }
        return bm.a(collection, bl2);
    }

    private static <E> Collection<E> d(Collection<E> collection, bl<? super E> bl2) {
        ArrayList<E> arrayList = gO.a(collection);
        for (E e2 : arrayList) {
            bl2.a(e2);
        }
        return arrayList;
    }

    static /* synthetic */ Collection c(Collection collection, bl bl2) {
        return bm.d(collection, bl2);
    }

    static /* synthetic */ ListIterator a(ListIterator listIterator, bl bl2) {
        return bm.b(listIterator, bl2);
    }
}

