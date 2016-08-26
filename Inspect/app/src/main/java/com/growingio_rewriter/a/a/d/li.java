/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.es;
import com.growingio.a.a.d.ew;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.lj;
import com.growingio.a.a.d.lk;
import com.growingio.a.a.d.lp;
import java.util.Map;

class li<K, V>
extends dK<K, V> {
    static final li<Object, Object> a = new li(null, null, ei.b, 0, 0);
    static final double c = 1.2;
    private final transient er<K, V>[] d;
    private final transient er<K, V>[] e;
    private final transient Map.Entry<K, V>[] f;
    private final transient int g;
    private final transient int h;
    private transient dK<V, K> i;

    static /* varargs */ <K, V> li<K, V> a(Map.Entry<K, V> ... arrentry) {
        return li.a(arrentry.length, arrentry);
    }

    static <K, V> li<K, V> a(int n2, Map.Entry<K, V>[] arrentry) {
        aU.b(n2, arrentry.length);
        int n3 = dH.a(n2, 1.2);
        int n4 = n3 - 1;
        er<K, V>[] arrer = er.a(n3);
        er<K, V>[] arrer2 = er.a(n3);
        Map.Entry<K, V>[] arrentry2 = n2 == arrentry.length ? arrentry : er.a(n2);
        int n5 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            er er22;
            er er22;
            Map.Entry<K, V> entry = arrentry[i2];
            K k2 = entry.getKey();
            V v2 = entry.getValue();
            aK.a(k2, v2);
            int n6 = k2.hashCode();
            int n7 = v2.hashCode();
            int n8 = dH.a(n6) & n4;
            int n9 = dH.a(n7) & n4;
            er er3 = arrer[n8];
            lp.a(k2, entry, er3);
            er er4 = arrer2[n9];
            li.a(v2, entry, er4);
            if (er4 == null && er3 == null) {
                boolean bl2 = entry instanceof er && ((er)entry).c();
                er22 = bl2 ? (er)entry : new er(k2, v2);
            } else {
                er22 = new es<K, V>(k2, v2, er3, er4);
            }
            arrer[n8] = er22;
            arrer2[n9] = er22;
            arrentry2[i2] = er22;
            n5 += n6 ^ n7;
        }
        return new li(arrer, arrer2, arrentry2, n4, n5);
    }

    private li(er<K, V>[] arrer, er<K, V>[] arrer2, Map.Entry<K, V>[] arrentry, int n2, int n3) {
        this.d = arrer;
        this.e = arrer2;
        this.f = arrentry;
        this.g = n2;
        this.h = n3;
    }

    private static void a(Object object, Map.Entry<?, ?> entry, er<?, ?> er2) {
        while (er2 != null) {
            li.a(!object.equals(er2.getValue()), "value", entry, er2);
            er2 = er2.b();
        }
    }

    @Override
    public V get(Object object) {
        return this.d == null ? null : (V)lp.a(object, this.d, this.g);
    }

    @Override
    fg<Map.Entry<K, V>> l() {
        return this.isEmpty() ? fg.k() : new ew<K, V>(this, this.f);
    }

    @Override
    boolean o() {
        return true;
    }

    @Override
    public int hashCode() {
        return this.h;
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    public int size() {
        return this.f.length;
    }

    @Override
    public dK<V, K> e() {
        if (this.isEmpty()) {
            return dK.n_();
        }
        lk lk2 = this.i;
        lk lk3 = lk2 == null ? (this.i = new lk(this, null)) : lk2;
        return lk3;
    }

    @Override
    public /* synthetic */ av m_() {
        return this.e();
    }

    static /* synthetic */ er[] a(li li2) {
        return li2.e;
    }

    static /* synthetic */ int b(li li2) {
        return li2.g;
    }

    static /* synthetic */ int c(li li2) {
        return li2.h;
    }

    static /* synthetic */ Map.Entry[] d(li li2) {
        return li2.f;
    }
}

