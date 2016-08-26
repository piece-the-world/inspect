/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.hD;

class ji<V>
implements hD<V> {
    private final V a;
    private final V b;

    static <V> hD<V> a(V v2, V v3) {
        return new ji<V>(v2, v3);
    }

    private ji(V v2, V v3) {
        this.a = v2;
        this.b = v3;
    }

    @Override
    public V a() {
        return this.a;
    }

    @Override
    public V b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof hD) {
            hD hD2 = (hD)object;
            return aL.a(this.a, hD2.a()) && aL.a(this.b, hD2.b());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}

