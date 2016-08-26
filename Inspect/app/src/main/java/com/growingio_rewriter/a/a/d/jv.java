/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jD;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class jv
extends jD<K0> {
    final /* synthetic */ Comparator a;

    jv(Comparator comparator) {
        this.a = comparator;
    }

    @Override
    <K extends K0, V> Map<K, Collection<V>> a() {
        return new TreeMap(this.a);
    }
}

