/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.V;
import com.growingio.a.a.d.W;
import com.growingio.a.a.d.iy;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

final class X
extends iy<K, V> {
    final /* synthetic */ V a;

    private X(V v2) {
        this.a = v2;
    }

    @Override
    NavigableMap<K, V> b() {
        return this.a;
    }

    @Override
    Iterator<Map.Entry<K, V>> c() {
        return this.a.a();
    }

    /* synthetic */ X(V v2, W w2) {
        this(v2);
    }
}

