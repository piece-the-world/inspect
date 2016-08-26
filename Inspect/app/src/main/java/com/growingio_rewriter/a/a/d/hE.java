/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.e;
import com.growingio.a.a.d.hF;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hX;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class hE {
    private static final int h = 16;
    private static final int i = 4;
    static final int a = -1;
    boolean b;
    int c = -1;
    int d = -1;
    hX e;
    hX f;
    ab<Object> g;

    hE a(ab<Object> ab2) {
        aU.b(this.g == null, "key equivalence was already set to %s", this.g);
        this.g = aU.a(ab2);
        this.b = true;
        return this;
    }

    ab<Object> a() {
        return aH.a(this.g, this.e().b());
    }

    public hE a(int n2) {
        aU.b(this.c == -1, "initial capacity was already set to %s", this.c);
        aU.a(n2 >= 0);
        this.c = n2;
        return this;
    }

    int b() {
        return this.c == -1 ? 16 : this.c;
    }

    public hE b(int n2) {
        aU.b(this.d == -1, "concurrency level was already set to %s", this.d);
        aU.a(n2 > 0);
        this.d = n2;
        return this;
    }

    int c() {
        return this.d == -1 ? 4 : this.d;
    }

    public hE d() {
        return this.a(hX.b);
    }

    hE a(hX hX2) {
        aU.b(this.e == null, "Key strength was already set to %s", (Object)this.e);
        this.e = aU.a(hX2);
        if (hX2 != hX.a) {
            this.b = true;
        }
        return this;
    }

    hX e() {
        return aH.a(this.e, hX.a);
    }

    public hE f() {
        return this.b(hX.b);
    }

    hE b(hX hX2) {
        aU.b(this.f == null, "Value strength was already set to %s", (Object)this.f);
        this.f = aU.a(hX2);
        if (hX2 != hX.a) {
            this.b = true;
        }
        return this;
    }

    hX g() {
        return aH.a(this.f, hX.a);
    }

    public <K, V> ConcurrentMap<K, V> h() {
        if (!this.b) {
            return new ConcurrentHashMap(this.b(), 0.75f, this.c());
        }
        return new hG(this);
    }

    <K, V> hG<K, V> i() {
        return new hG(this);
    }

    <K, V> ConcurrentMap<K, V> a(aq<? super K, ? extends V> aq2) {
        return new hF<K, V>(this, aq2);
    }

    public String toString() {
        aJ aJ2 = aH.a(this);
        if (this.c != -1) {
            aJ2.a("initialCapacity", this.c);
        }
        if (this.d != -1) {
            aJ2.a("concurrencyLevel", this.d);
        }
        if (this.e != null) {
            aJ2.a("keyStrength", e.a(this.e.toString()));
        }
        if (this.f != null) {
            aJ2.a("valueStrength", e.a(this.f.toString()));
        }
        if (this.g != null) {
            aJ2.a("keyEquivalence");
        }
        return aJ2.toString();
    }
}

