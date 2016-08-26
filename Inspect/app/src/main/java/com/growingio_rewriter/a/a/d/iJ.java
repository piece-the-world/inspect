/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iI;
import com.growingio.a.a.d.iK;
import com.growingio.a.a.d.nP;
import java.util.Iterator;
import java.util.Map;

class iJ
extends nP<Map.Entry<K, V>, Map.Entry<K, V>> {
    final /* synthetic */ iI a;

    iJ(iI iI2, Iterator iterator) {
        this.a = iI2;
        super(iterator);
    }

    @Override
    Map.Entry<K, V> a(Map.Entry<K, V> entry) {
        return new iK(this, entry);
    }
}

