/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dV;
import com.growingio.a.a.d.dW;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.el;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.oP;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class dU<K extends Enum<K>, V>
extends el<K, V> {
    private final transient EnumMap<K, V> a;

    static <K extends Enum<K>, V> ei<K, V> a(EnumMap<K, V> enumMap) {
        switch (enumMap.size()) {
            case 0: {
                return ei.i();
            }
            case 1: {
                Map.Entry<K, V> entry = fL.d(enumMap.entrySet());
                return ei.c(entry.getKey(), entry.getValue());
            }
        }
        return new dU<K, V>(enumMap);
    }

    private dU(EnumMap<K, V> enumMap) {
        this.a = enumMap;
        aU.a(!enumMap.isEmpty());
    }

    @Override
    oP<K> a() {
        return gb.a(this.a.keySet().iterator());
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public V get(Object object) {
        return this.a.get(object);
    }

    @Override
    public boolean equals(Object enumMap) {
        if (enumMap == this) {
            return true;
        }
        if (enumMap instanceof dU) {
            enumMap = ((dU)enumMap).a;
        }
        return this.a.equals((Object)enumMap);
    }

    @Override
    oP<Map.Entry<K, V>> d() {
        return ii.c(this.a.entrySet().iterator());
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    Object g() {
        return new dW<K, V>(this.a);
    }

    /* synthetic */ dU(EnumMap enumMap, dV dV2) {
        this(enumMap);
    }
}

