/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.mi;
import com.growingio.a.a.d.mn;
import java.util.Comparator;
import java.util.List;

final class mr
extends mn {
    mr(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public <E> int a(Comparator<? super E> comparator, E e2, List<? extends E> list, int n2) {
        return b.a(comparator, e2, list, n2) + 1;
    }
}

