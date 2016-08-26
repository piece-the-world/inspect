/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.aD;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.aO;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import com.growingio.a.a.c.aw;

final class ax
extends aw {
    ax(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <K, V> aG<K, V> a(at<K, V> at2, as<K, V> as2, V v2, int n2) {
        return n2 == 1 ? new aD(v2) : new aO(v2, n2);
    }

    @Override
    ab<Object> b() {
        return ab.b();
    }
}

