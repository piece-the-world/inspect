/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import java.util.Map;
import java.util.Set;

public interface av<K, V>
extends Map<K, V> {
    @Override
    public V put(K var1, V var2);

    public V a(K var1, V var2);

    @Override
    public void putAll(Map<? extends K, ? extends V> var1);

    public Set<V> o_();

    public av<V, K> m_();
}

