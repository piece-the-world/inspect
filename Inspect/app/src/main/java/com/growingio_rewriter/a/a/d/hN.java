/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hL;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.if;
import java.lang.ref.ReferenceQueue;

final class hN
extends hL {
    hN(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <K, V> hT<K, V> a(hV<K, V> hV2, K k2, int n2, hT<K, V> hT2) {
        return new if(hV2.g, k2, n2, hT2);
    }
}

