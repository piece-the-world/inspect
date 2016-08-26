/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hh;
import com.growingio.a.a.d.hl;
import com.growingio.a.a.d.nP;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class hm
extends nP<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {
    final /* synthetic */ hl a;

    hm(hl hl2, Iterator iterator) {
        this.a = hl2;
        super(iterator);
    }

    @Override
    Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
        return hh.b(entry, hl.a(this.a));
    }
}

