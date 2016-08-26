/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.n.p;
import com.growingio.a.a.n.r;
import com.growingio.a.a.n.s;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class q<K, V>
extends cR<K, V> {
    private final Map.Entry<K, V> a;

    static <K, V> Set<Map.Entry<K, V>> a(Set<Map.Entry<K, V>> set) {
        return new r(set);
    }

    private static <K, V> Iterator<Map.Entry<K, V>> b(Iterator<Map.Entry<K, V>> iterator) {
        return gb.a(iterator, new s());
    }

    private q(Map.Entry<K, V> entry) {
        this.a = aU.a(entry);
    }

    @Override
    protected Map.Entry<K, V> a() {
        return this.a;
    }

    @Override
    public V setValue(V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    static /* synthetic */ Iterator a(Iterator iterator) {
        return q.b(iterator);
    }

    /* synthetic */ q(Map.Entry entry, p p2) {
        this(entry);
    }
}

