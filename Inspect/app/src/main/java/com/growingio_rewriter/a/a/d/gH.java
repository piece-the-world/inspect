/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gG;
import com.growingio.a.a.d.gL;
import com.growingio.a.a.d.nQ;
import java.util.ListIterator;
import java.util.Map;

class gH
extends nQ<Map.Entry<K, V>, V> {
    final /* synthetic */ gL a;
    final /* synthetic */ gG b;

    gH(gG gG2, ListIterator listIterator, gL gL2) {
        this.b = gG2;
        this.a = gL2;
        super(listIterator);
    }

    @Override
    V a(Map.Entry<K, V> entry) {
        return entry.getValue();
    }

    @Override
    public void set(V v2) {
        this.a.a(v2);
    }
}

