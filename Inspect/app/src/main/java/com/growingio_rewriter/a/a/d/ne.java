/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nP;
import com.growingio.a.a.d.nd;
import com.growingio.a.a.d.nf;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class ne
extends nP<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {
    final /* synthetic */ nd a;

    ne(nd nd2, Iterator iterator) {
        this.a = nd2;
        super(iterator);
    }

    @Override
    Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
        return new nf(this, entry);
    }
}

