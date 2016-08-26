/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

final class jM<V>
implements bG<SortedSet<V>>,
Serializable {
    private final Comparator<? super V> a;

    jM(Comparator<? super V> comparator) {
        this.a = aU.a(comparator);
    }

    public SortedSet<V> b() {
        return new TreeSet<V>(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

