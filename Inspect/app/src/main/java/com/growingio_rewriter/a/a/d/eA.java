/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ez;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.oP;
import java.util.Map;

class eA
extends oP<V> {
    final oP<Map.Entry<K, V>> a;
    final /* synthetic */ ez b;

    eA(ez ez2) {
        this.b = ez2;
        this.a = ez.a(this.b).k().k_();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public V next() {
        return this.a.next().getValue();
    }
}

