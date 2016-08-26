/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface lH<K, V>
extends jr<K, V> {
    public Set<V> a(K var1);

    public Set<V> b(Object var1);

    public Set<V> a(K var1, Iterable<? extends V> var2);

    public Set<Map.Entry<K, V>> u();

    @Override
    public Map<K, Collection<V>> c();

    @Override
    public boolean equals(Object var1);
}

