/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hO;
import com.growingio.a.a.d.hU;
import java.util.Iterator;
import java.util.Map;

final class hP
extends hU<Map.Entry<K, V>> {
    final /* synthetic */ hG a;

    hP(hG hG2) {
        this.a = hG2;
        super(null);
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new hO(this.a);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        if (k2 == null) {
            return false;
        }
        Object v2 = this.a.get(k2);
        return v2 != null && this.a.m.a(entry.getValue(), v2);
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        return k2 != null && this.a.remove(k2, entry.getValue());
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public void clear() {
        this.a.clear();
    }
}

