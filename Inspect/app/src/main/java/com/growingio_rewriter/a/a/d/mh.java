/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.mj;
import com.growingio.a.a.d.mn;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

final class mh {
    private mh() {
    }

    public static <E extends Comparable> int a(List<? extends E> list, E e2, mn mn2, mj mj2) {
        aU.a(e2);
        return mh.a(list, e2, kO.d(), mn2, mj2);
    }

    public static <E, K extends Comparable> int a(List<E> list, aq<? super E, K> aq2, K k2, mn mn2, mj mj2) {
        return mh.a(list, aq2, k2, kO.d(), mn2, mj2);
    }

    public static <E, K> int a(List<E> list, aq<? super E, K> aq2, K k2, Comparator<? super K> comparator, mn mn2, mj mj2) {
        return mh.a(gO.a(list, aq2), k2, comparator, mn2, mj2);
    }

    public static <E> int a(List<? extends E> list, E e2, Comparator<? super E> comparator, mn mn2, mj mj2) {
        aU.a(comparator);
        aU.a(list);
        aU.a(mn2);
        aU.a(mj2);
        if (!(list instanceof RandomAccess)) {
            list = gO.a(list);
        }
        int n2 = 0;
        int n3 = list.size() - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = comparator.compare(e2, list.get(n4));
            if (n5 < 0) {
                n3 = n4 - 1;
                continue;
            }
            if (n5 > 0) {
                n2 = n4 + 1;
                continue;
            }
            return n2 + mn2.a(comparator, e2, list.subList(n2, n3 + 1), n4 - n2);
        }
        return mj2.a(n2);
    }
}

