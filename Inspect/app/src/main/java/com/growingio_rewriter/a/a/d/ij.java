/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.nP;
import java.util.Iterator;
import java.util.Map;

final class ij
extends nP<K, Map.Entry<K, V>> {
    final /* synthetic */ aq a;

    ij(Iterator iterator, aq aq2) {
        this.a = aq2;
        super(iterator);
    }

    Map.Entry<K, V> b(K k2) {
        return ii.a(k2, this.a.f(k2));
    }

    @Override
    /* synthetic */ Object a(Object object) {
        return this.b(object);
    }
}

