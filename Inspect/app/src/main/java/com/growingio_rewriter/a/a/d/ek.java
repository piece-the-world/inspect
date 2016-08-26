/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.dS;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.lp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class ek<K, V> {
    Comparator<? super V> a;
    er<K, V>[] b;
    int c;
    boolean d;

    public ek() {
        this(4);
    }

    ek(int n2) {
        this.b = new er[n2];
        this.c = 0;
        this.d = false;
    }

    private void a(int n2) {
        if (n2 > this.b.length) {
            this.b = kN.b(this.b, dS.a(this.b.length, n2));
            this.d = false;
        }
    }

    public ek<K, V> b(K k2, V v2) {
        this.a(this.c + 1);
        er<K, V> er2 = ei.d(k2, v2);
        this.b[this.c++] = er2;
        return this;
    }

    public ek<K, V> b(Map.Entry<? extends K, ? extends V> entry) {
        return this.b(entry.getKey(), entry.getValue());
    }

    public ek<K, V> b(Map<? extends K, ? extends V> map) {
        return this.b(map.entrySet());
    }

    public ek<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            this.a(this.c + ((Collection)iterable).size());
        }
        for (Map.Entry<K, V> entry : iterable) {
            this.b(entry);
        }
        return this;
    }

    public ek<K, V> b(Comparator<? super V> comparator) {
        aU.b(this.a == null, "valueComparator was already set");
        this.a = aU.a(comparator, (Object)"valueComparator");
        return this;
    }

    public ei<K, V> b() {
        switch (this.c) {
            case 0: {
                return ei.i();
            }
            case 1: {
                return ei.c(this.b[0].getKey(), this.b[0].getValue());
            }
        }
        if (this.a != null) {
            if (this.d) {
                this.b = kN.b(this.b, this.c);
            }
            Arrays.sort(this.b, 0, this.c, kO.a(this.a).a(ii.b()));
        }
        this.d = this.c == this.b.length;
        return lp.a(this.c, this.b);
    }
}

