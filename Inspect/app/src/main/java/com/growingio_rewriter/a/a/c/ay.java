/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.aN;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import com.growingio.a.a.c.av;
import com.growingio.a.a.c.aw;
import java.lang.ref.ReferenceQueue;

final class ay
extends aw {
    ay(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    <K, V> aG<K, V> a(at<K, V> at2, as<K, V> as2, V v2, int n2) {
        return n2 == 1 ? new av(at2.i, v2, as2) : new aN(at2.i, v2, as2, n2);
    }

    @Override
    ab<Object> b() {
        return ab.c();
    }
}

