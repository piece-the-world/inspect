/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.mi;
import com.growingio.a.a.d.mn;
import java.util.Comparator;
import java.util.List;

final class mp
extends mn {
    mp(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <E> int a(Comparator<? super E> comparator, E e2, List<? extends E> list, int n2) {
        int n3 = n2;
        int n4 = list.size() - 1;
        while (n3 < n4) {
            int n5 = n3 + n4 + 1 >>> 1;
            int n6 = comparator.compare(list.get(n5), e2);
            if (n6 > 0) {
                n4 = n5 - 1;
                continue;
            }
            n3 = n5;
        }
        return n3;
    }
}

