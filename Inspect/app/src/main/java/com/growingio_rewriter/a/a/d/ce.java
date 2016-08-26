/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cd;
import com.growingio.a.a.d.cf;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iD;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class ce
extends iD<K, Collection<V>> {
    final /* synthetic */ cd a;

    ce(cd cd2) {
        this.a = cd2;
    }

    @Override
    Map<K, Collection<V>> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new cf(this);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.a.a.a(aW.a(collection));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a.a.a(aW.a(aW.a(collection)));
    }

    @Override
    public int size() {
        return gb.b(this.iterator());
    }
}

