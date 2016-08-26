/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.q;
import com.growingio.a.a.d.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class r
extends iD<K, Collection<V>> {
    final /* synthetic */ q a;

    r(q q2) {
        this.a = q2;
    }

    @Override
    Map<K, Collection<V>> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new s(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return aL.a(this.a.a.entrySet(), object);
    }

    @Override
    public boolean remove(Object object) {
        if (!this.contains(object)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        n.a(this.a.b, entry.getKey());
        return true;
    }
}

