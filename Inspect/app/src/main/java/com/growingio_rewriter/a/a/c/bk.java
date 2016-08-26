/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.ba;
import java.util.AbstractMap;

public final class bk<K, V>
extends AbstractMap.SimpleImmutableEntry<K, V> {
    private final ba a;
    private static final long b = 0;

    public static <K, V> bk<K, V> a(K k2, V v2, ba ba2) {
        return new bk<K, V>(k2, v2, ba2);
    }

    private bk(K k2, V v2, ba ba2) {
        super(k2, v2);
        this.a = aU.a(ba2);
    }

    public ba a() {
        return this.a;
    }

    public boolean b() {
        return this.a.b();
    }
}

