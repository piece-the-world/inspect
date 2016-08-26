/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aA;
import com.growingio.a.a.b.aB;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.at;
import com.growingio.a.a.b.au;
import com.growingio.a.a.b.av;
import com.growingio.a.a.b.aw;
import com.growingio.a.a.b.ax;
import com.growingio.a.a.b.ay;
import com.growingio.a.a.b.az;
import com.growingio.a.a.b.bG;
import java.util.Map;

public final class as {
    private as() {
    }

    public static aq<Object, String> a() {
        return aB.a;
    }

    public static <E> aq<E, E> b() {
        return ay.a;
    }

    public static <K, V> aq<K, V> a(Map<K, V> map) {
        return new ax<K, V>(map);
    }

    public static <K, V> aq<K, V> a(Map<K, ? extends V> map, V v2) {
        return new av<K, V>(map, (V)v2);
    }

    public static <A, B, C> aq<A, C> a(aq<B, C> aq2, aq<A, ? extends B> aq3) {
        return new aw<A, B, C>(aq2, aq3);
    }

    public static <T> aq<T, Boolean> a(aV<T> aV2) {
        return new az(aV2, null);
    }

    public static <E> aq<Object, E> a(E e2) {
        return new au<E>(e2);
    }

    public static <T> aq<Object, T> a(bG<T> bG2) {
        return new aA(bG2, null);
    }
}

