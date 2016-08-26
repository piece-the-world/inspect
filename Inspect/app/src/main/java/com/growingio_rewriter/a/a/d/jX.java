/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jW;
import com.growingio.a.a.d.jY;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.nP;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class jX
extends nP<Map.Entry<K, Collection<V>>, km<K>> {
    final /* synthetic */ jW a;

    jX(jW jW2, Iterator iterator) {
        this.a = jW2;
        super(iterator);
    }

    @Override
    km<K> a(Map.Entry<K, Collection<V>> entry) {
        return new jY(this, entry);
    }
}

