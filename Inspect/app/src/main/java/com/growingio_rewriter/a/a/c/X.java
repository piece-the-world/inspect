/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.P;
import com.growingio.a.a.c.W;
import com.growingio.a.a.c.aC;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;

final class X
extends W {
    X(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <K, V> as<K, V> a(at<K, V> at2, K k2, int n2, as<K, V> as2) {
        return new aC<K, V>(k2, n2, as2);
    }
}

