/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fl;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

final class fn<K, V>
extends fg<Map.Entry<K, V>> {
    private final transient fl<K, V> a;

    fn(fl<K, V> fl2) {
        this.a = fl2;
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
    public int size() {
        return this.a.l_();
    }

    @Override
    public oP<Map.Entry<K, V>> k_() {
        return this.a.B();
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

