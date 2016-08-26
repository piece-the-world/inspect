/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

class eH<K, V>
extends dQ<Map.Entry<K, V>> {
    final eD<K, V> a;
    private static final long b = 0;

    eH(eD<K, V> eD2) {
        this.a = eD2;
    }

    @Override
    public oP<Map.Entry<K, V>> k_() {
        return this.a.B();
    }

    @Override
    boolean i_() {
        return this.a.w();
    }

    @Override
    public int size() {
        return this.a.l_();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a.b(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

