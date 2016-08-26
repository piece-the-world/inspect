/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

final class iq
extends oP<Map.Entry<K, V>> {
    final /* synthetic */ Iterator a;

    iq(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry<K, V> a() {
        return ii.a((Map.Entry)this.a.next());
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

