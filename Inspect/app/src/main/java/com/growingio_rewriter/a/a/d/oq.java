/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class oq
extends iD<kW<K>, V> {
    final /* synthetic */ oo a;

    oq(oo oo2) {
        this.a = oo2;
    }

    @Override
    Map<kW<K>, V> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<kW<K>, V>> iterator() {
        return this.a.a();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return oo.a(this.a, aW.a(aW.a(collection)));
    }

    @Override
    public int size() {
        return gb.b(this.iterator());
    }

    @Override
    public boolean isEmpty() {
        return !this.iterator().hasNext();
    }
}

