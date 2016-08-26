/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.li;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public final class dL<K, V>
extends ek<K, V> {
    public dL() {
    }

    dL(int n2) {
        super(n2);
    }

    public dL<K, V> a(K k2, V v2) {
        super.b(k2, v2);
        return this;
    }

    public dL<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
        super.b(entry);
        return this;
    }

    public dL<K, V> a(Map<? extends K, ? extends V> map) {
        super.b(map);
        return this;
    }

    public dL<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        super.b(iterable);
        return this;
    }

    public dL<K, V> a(Comparator<? super V> comparator) {
        super.b(comparator);
        return this;
    }

    public dK<K, V> a() {
        switch (this.c) {
            case 0: {
                return dK.n_();
            }
            case 1: {
                return dK.b(this.b[0].getKey(), this.b[0].getValue());
            }
        }
        if (this.a != null) {
            if (this.d) {
                this.b = kN.b(this.b, this.c);
            }
            Arrays.sort(this.b, 0, this.c, kO.a(this.a).a(ii.b()));
        }
        this.d = this.c == this.b.length;
        return li.a(this.c, this.b);
    }

    @Override
    public /* synthetic */ ei b() {
        return this.a();
    }

    @Override
    public /* synthetic */ ek b(Comparator comparator) {
        return this.a(comparator);
    }

    @Override
    public /* synthetic */ ek b(Iterable iterable) {
        return this.a(iterable);
    }

    @Override
    public /* synthetic */ ek b(Map map) {
        return this.a(map);
    }

    @Override
    public /* synthetic */ ek b(Map.Entry entry) {
        return this.a(entry);
    }

    @Override
    public /* synthetic */ ek b(Object object, Object object2) {
        return this.a(object, object2);
    }
}

