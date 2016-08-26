/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.hC;
import com.growingio.a.a.d.hD;
import com.growingio.a.a.d.ii;
import java.util.Map;

class iV<K, V>
implements hC<K, V> {
    final Map<K, V> a;
    final Map<K, V> b;
    final Map<K, V> c;
    final Map<K, hD<V>> d;

    iV(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, hD<V>> map4) {
        this.a = ii.f(map);
        this.b = ii.f(map2);
        this.c = ii.f(map3);
        this.d = ii.f(map4);
    }

    @Override
    public boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty();
    }

    @Override
    public Map<K, V> b() {
        return this.a;
    }

    @Override
    public Map<K, V> c() {
        return this.b;
    }

    @Override
    public Map<K, V> d() {
        return this.c;
    }

    @Override
    public Map<K, hD<V>> e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hC) {
            hC hC2 = (hC)object;
            return this.b().equals(hC2.b()) && this.c().equals(hC2.c()) && this.d().equals(hC2.d()) && this.e().equals(hC2.e());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return aL.a(this.b(), this.c(), this.d(), this.e());
    }

    public String toString() {
        if (this.a()) {
            return "equal";
        }
        StringBuilder stringBuilder = new StringBuilder("not equal");
        if (!this.a.isEmpty()) {
            stringBuilder.append(": only on left=").append(this.a);
        }
        if (!this.b.isEmpty()) {
            stringBuilder.append(": only on right=").append(this.b);
        }
        if (!this.d.isEmpty()) {
            stringBuilder.append(": value differences=").append(this.d);
        }
        return stringBuilder.toString();
    }
}

