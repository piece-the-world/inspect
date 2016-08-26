/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface gN<K, V>
extends jr<K, V> {
    public List<V> a(K var1);

    public List<V> b(Object var1);

    public List<V> a(K var1, Iterable<? extends V> var2);

    @Override
    public Map<K, Collection<V>> c();

    @Override
    public boolean equals(Object var1);
}

