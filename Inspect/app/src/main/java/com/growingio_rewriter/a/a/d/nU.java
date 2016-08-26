/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeMap;

class nU<C, V>
implements bG<TreeMap<C, V>>,
Serializable {
    final Comparator<? super C> a;
    private static final long b = 0;

    nU(Comparator<? super C> comparator) {
        this.a = comparator;
    }

    public TreeMap<C, V> b() {
        return new TreeMap(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

