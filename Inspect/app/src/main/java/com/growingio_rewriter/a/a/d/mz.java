/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

public interface mz<K, V>
extends lH<K, V> {
    public SortedSet<V> h(K var1);

    public SortedSet<V> i(Object var1);

    public SortedSet<V> d(K var1, Iterable<? extends V> var2);

    @Override
    public Map<K, Collection<V>> c();

    public Comparator<? super V> d_();
}

