/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.hX;
import com.growingio.a.a.d.id;
import com.growingio.a.a.d.ig;
import java.lang.ref.ReferenceQueue;

final class hZ
extends hX {
    hZ(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <K, V> id<K, V> a(hV<K, V> hV2, hT<K, V> hT2, V v2) {
        return new ig(hV2.h, v2, hT2);
    }

    @Override
    ab<Object> b() {
        return ab.c();
    }
}

