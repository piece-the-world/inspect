/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.cN;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class je<K, V>
extends cN<K, V>
implements av<K, V>,
Serializable {
    final Map<K, V> a;
    final av<? extends K, ? extends V> b;
    av<V, K> c;
    transient Set<V> d;
    private static final long e = 0;

    je(av<? extends K, ? extends V> av2, av<V, K> av3) {
        this.a = Collections.unmodifiableMap(av2);
        this.b = av2;
        this.c = av3;
    }

    @Override
    protected Map<K, V> a() {
        return this.a;
    }

    @Override
    public V a(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public av<V, K> m_() {
        av av2 = this.c;
        av av3 = av2 == null ? (this.c = new je<V, K>(this.b.m_(), this)) : av2;
        return av3;
    }

    @Override
    public Set<V> o_() {
        Set<V> set = this.d;
        Set set2 = set == null ? (this.d = Collections.unmodifiableSet(this.b.o_())) : set;
        return set2;
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

