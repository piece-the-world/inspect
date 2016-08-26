/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.P;
import com.growingio.a.a.c.W;
import com.growingio.a.a.c.aI;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import java.lang.ref.ReferenceQueue;

final class ac
extends W {
    ac(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <K, V> as<K, V> a(at<K, V> at2, K k2, int n2, as<K, V> as2) {
        return new aI(at2.h, k2, n2, as2);
    }

    @Override
    <K, V> as<K, V> a(at<K, V> at2, as<K, V> as2, as<K, V> as3) {
        as<K, V> as4 = super.a(at2, as2, as3);
        this.a(as2, as4);
        return as4;
    }
}

