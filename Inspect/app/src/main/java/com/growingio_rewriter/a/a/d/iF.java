/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.iG;
import com.growingio.a.a.d.iH;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class iF<K, V>
extends iH<K, V>
implements av<K, V> {
    private final av<V, K> d;

    private static <K, V> aV<Map.Entry<V, K>> a(aV<? super Map.Entry<K, V>> aV2) {
        return new iG(aV2);
    }

    iF(av<K, V> av2, aV<? super Map.Entry<K, V>> aV2) {
        super(av2, aV2);
        this.d = new iF<K, V>(av2.m_(), iF.a(aV2), this);
    }

    private iF(av<K, V> av2, aV<? super Map.Entry<K, V>> aV2, av<V, K> av3) {
        super(av2, aV2);
        this.d = av3;
    }

    av<K, V> d() {
        return (av)this.a;
    }

    @Override
    public V a(K k2, V v2) {
        aU.a(this.b(k2, v2));
        return this.d().a(k2, v2);
    }

    @Override
    public av<V, K> m_() {
        return this.d;
    }

    @Override
    public Set<V> o_() {
        return this.d.keySet();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }
}

