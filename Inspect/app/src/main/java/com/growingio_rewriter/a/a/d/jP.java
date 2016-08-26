/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jO;
import com.growingio.a.a.d.jQ;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jP
extends iD<K, Collection<V>> {
    final /* synthetic */ jO a;

    jP(jO jO2) {
        this.a = jO2;
    }

    @Override
    Map<K, Collection<V>> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return ii.b(jO.a(this.a).q(), new jQ(this));
    }

    @Override
    public boolean remove(Object object) {
        if (!this.contains(object)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        this.a.a(entry.getKey());
        return true;
    }
}

