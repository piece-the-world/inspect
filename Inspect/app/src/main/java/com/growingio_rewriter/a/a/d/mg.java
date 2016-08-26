/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.mf;
import java.util.Comparator;
import java.util.SortedSet;

final class mg {
    private mg() {
    }

    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator22;
        Comparator comparator22;
        aU.a(comparator);
        aU.a(iterable);
        if (iterable instanceof SortedSet) {
            comparator22 = mg.a((SortedSet)iterable);
        } else if (iterable instanceof mf) {
            comparator22 = ((mf)iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator22);
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<E> comparator = sortedSet.comparator();
        if (comparator == null) {
            comparator = kO.d();
        }
        return comparator;
    }
}

