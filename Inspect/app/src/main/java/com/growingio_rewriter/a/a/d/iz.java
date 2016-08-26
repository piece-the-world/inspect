/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.iy;
import java.util.Iterator;
import java.util.Map;

class iz
extends iD<K, V> {
    final /* synthetic */ iy a;

    iz(iy iy2) {
        this.a = iy2;
    }

    @Override
    Map<K, V> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.a.c();
    }
}

