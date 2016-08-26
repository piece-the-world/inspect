/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.kO;
import java.util.Comparator;
import java.util.Map;

final class T
extends kO<K> {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Map b;

    T(Comparator comparator, Map map) {
        this.a = comparator;
        this.b = map;
    }

    @Override
    public int compare(K k2, K k3) {
        return this.a.compare(this.b.get(k2), this.b.get(k3));
    }
}

