/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.et;
import com.growingio.a.a.d.ew;
import com.growingio.a.a.d.fg;
import java.util.Map;

final class lp<K, V>
extends ei<K, V> {
    private final transient Map.Entry<K, V>[] a;
    private final transient er<K, V>[] c;
    private final transient int d;
    private static final double e = 1.2;
    private static final long f = 0;

    static /* varargs */ <K, V> lp<K, V> a(Map.Entry<K, V> ... arrentry) {
        return lp.a(arrentry.length, arrentry);
    }

    static <K, V> lp<K, V> a(int n2, Map.Entry<K, V>[] arrentry) {
        aU.b(n2, arrentry.length);
        Map.Entry<K, V>[] arrentry2 = n2 == arrentry.length ? arrentry : er.a(n2);
        int n3 = dH.a(n2, 1.2);
        er<K, V>[] arrer = er.a(n3);
        int n4 = n3 - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            er er22;
            er er22;
            Map.Entry<K, V> entry = arrentry[i2];
            K k2 = entry.getKey();
            V v2 = entry.getValue();
            aK.a(k2, v2);
            int n5 = dH.a(k2.hashCode()) & n4;
            er er3 = arrer[n5];
            if (er3 == null) {
                boolean bl2 = entry instanceof er && ((er)entry).c();
                er22 = bl2 ? (er)entry : new er(k2, v2);
            } else {
                er22 = new et<K, V>(k2, v2, er3);
            }
            arrer[n5] = er22;
            arrentry2[i2] = er22;
            lp.a(k2, er22, er3);
        }
        return new lp<K, V>(arrentry2, arrer, n4);
    }

    private lp(Map.Entry<K, V>[] arrentry, er<K, V>[] arrer, int n2) {
        this.a = arrentry;
        this.c = arrer;
        this.d = n2;
    }

    static void a(Object object, Map.Entry<?, ?> entry, er<?, ?> er2) {
        while (er2 != null) {
            lp.a(!object.equals(er2.getKey()), "key", entry, er2);
            er2 = er2.a();
        }
    }

    @Override
    public V get(Object object) {
        return lp.a(object, this.c, this.d);
    }

    static <V> V a(Object object, er<?, V>[] arrer, int n2) {
        if (object == null) {
            return null;
        }
        int n3 = dH.a(object.hashCode()) & n2;
        for (er er2 = arrer[n3]; er2 != null; er2 = er2.a()) {
            Object obj = er2.getKey();
            if (!object.equals(obj)) continue;
            return er2.getValue();
        }
        return null;
    }

    @Override
    public int size() {
        return this.a.length;
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    fg<Map.Entry<K, V>> l() {
        return new ew<K, V>(this, this.a);
    }
}

