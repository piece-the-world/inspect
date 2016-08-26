/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.iS;
import java.util.Iterator;
import java.util.Map;

class iT
extends iD<K, V> {
    final /* synthetic */ iS a;

    iT(iS iS2) {
        this.a = iS2;
    }

    @Override
    Map<K, V> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.a.b();
    }
}

