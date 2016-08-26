/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.dU;
import com.growingio.a.a.d.ej;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.en;
import com.growingio.a.a.d.eq;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.ex;
import com.growingio.a.a.d.ez;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fl;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.lp;
import com.growingio.a.a.d.oP;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public abstract class ei<K, V>
implements Serializable,
Map<K, V> {
    static final Map.Entry<?, ?>[] b = new Map.Entry[0];
    private transient fg<Map.Entry<K, V>> a;
    private transient fg<K> c;
    private transient dQ<V> d;
    private transient fl<K, V> e;

    public static <K, V> ei<K, V> i() {
        return dK.n_();
    }

    public static <K, V> ei<K, V> c(K k2, V v2) {
        return dK.b(k2, v2);
    }

    public static <K, V> ei<K, V> b(K k2, V v2, K k3, V v3) {
        return lp.a(ei.d(k2, v2), ei.d(k3, v3));
    }

    public static <K, V> ei<K, V> b(K k2, V v2, K k3, V v3, K k4, V v4) {
        return lp.a(ei.d(k2, v2), ei.d(k3, v3), ei.d(k4, v4));
    }

    public static <K, V> ei<K, V> b(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return lp.a(ei.d(k2, v2), ei.d(k3, v3), ei.d(k4, v4), ei.d(k5, v5));
    }

    public static <K, V> ei<K, V> b(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return lp.a(ei.d(k2, v2), ei.d(k3, v3), ei.d(k4, v4), ei.d(k5, v5), ei.d(k6, v6));
    }

    static <K, V> er<K, V> d(K k2, V v2) {
        return new er<K, V>(k2, v2);
    }

    public static <K, V> ek<K, V> j() {
        return new ek();
    }

    static void a(boolean bl2, String string, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!bl2) {
            throw new IllegalArgumentException("Multiple entries with same " + string + ": " + entry + " and " + entry2);
        }
    }

    public static <K, V> ei<K, V> b(Map<? extends K, ? extends V> map) {
        if (map instanceof ei && !(map instanceof fp)) {
            ei ei2 = (ei)map;
            if (!ei2.b()) {
                return ei2;
            }
        } else if (map instanceof EnumMap) {
            ei<K, V> ei3 = ei.a((EnumMap)map);
            return ei3;
        }
        return ei.b(map.entrySet());
    }

    public static <K, V> ei<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry<?, ?>[] arrentry = fL.a(iterable, b);
        switch (arrentry.length) {
            case 0: {
                return ei.i();
            }
            case 1: {
                Map.Entry entry = arrentry[0];
                return ei.c(entry.getKey(), entry.getValue());
            }
        }
        return lp.a(arrentry);
    }

    private static <K extends Enum<K>, V> ei<K, V> a(EnumMap<K, ? extends V> enumMap) {
        EnumMap<K, V> enumMap2 = new EnumMap<K, V>(enumMap);
        for (Map.Entry<K, V> entry : enumMap2.entrySet()) {
            aK.a(entry.getKey(), entry.getValue());
        }
        return dU.a(enumMap2);
    }

    ei() {
    }

    @Override
    public final V put(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final V remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.h().contains(object);
    }

    @Override
    public abstract V get(Object var1);

    public fg<Map.Entry<K, V>> k() {
        fg<Map.Entry<K, V>> fg2 = this.a;
        fg<Map.Entry<K, V>> fg3 = fg2 == null ? (this.a = this.l()) : fg2;
        return fg3;
    }

    abstract fg<Map.Entry<K, V>> l();

    public fg<K> m() {
        fg<K> fg2 = this.c;
        fg<K> fg3 = fg2 == null ? (this.c = this.c()) : fg2;
        return fg3;
    }

    fg<K> c() {
        return this.isEmpty() ? fg.k() : new ex<K, V>(this);
    }

    oP<K> a() {
        oP<Map.Entry<K, V>> oP2 = this.k().k_();
        return new ej(this, oP2);
    }

    public dQ<V> h() {
        dQ<V> dQ2 = this.d;
        dQ<V> dQ3 = dQ2 == null ? (this.d = new ez<K, V>(this)) : dQ2;
        return dQ3;
    }

    public fl<K, V> n() {
        if (this.isEmpty()) {
            return fl.a();
        }
        fl<K, V> fl2 = this.e;
        fl<K, V> fl3 = fl2 == null ? (this.e = new fl<K, V>(new en(this, null), this.size(), null)) : fl2;
        return fl3;
    }

    @Override
    public boolean equals(Object object) {
        return ii.f(this, object);
    }

    abstract boolean b();

    @Override
    public int hashCode() {
        return lI.b(this.k());
    }

    boolean o() {
        return false;
    }

    public String toString() {
        return ii.e(this);
    }

    Object g() {
        return new eq(this);
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.k();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.h();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.m();
    }
}

