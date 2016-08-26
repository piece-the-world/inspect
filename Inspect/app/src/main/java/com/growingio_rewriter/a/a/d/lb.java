/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kW;
import java.util.Map;

public interface lb<K extends Comparable, V> {
    public V a(K var1);

    public Map.Entry<kW<K>, V> b(K var1);

    public kW<K> c();

    public void b(kW<K> var1, V var2);

    public void b(lb<K, V> var1);

    public void d();

    public void a(kW<K> var1);

    public Map<kW<K>, V> i();

    public Map<kW<K>, V> h();

    public lb<K, V> c(kW<K> var1);

    public boolean equals(Object var1);

    public int hashCode();

    public String toString();
}

