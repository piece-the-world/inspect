/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kl;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface jr<K, V> {
    public int l_();

    public boolean o();

    public boolean f(Object var1);

    public boolean g(Object var1);

    public boolean b(Object var1, Object var2);

    public boolean a(K var1, V var2);

    public boolean c(Object var1, Object var2);

    public boolean c(K var1, Iterable<? extends V> var2);

    public boolean a(jr<? extends K, ? extends V> var1);

    public Collection<V> b(K var1, Iterable<? extends V> var2);

    public Collection<V> d(Object var1);

    public void h();

    public Collection<V> c(K var1);

    public Set<K> q();

    public kl<K> r();

    public Collection<V> j();

    public Collection<Map.Entry<K, V>> l();

    public Map<K, Collection<V>> c();

    public boolean equals(Object var1);

    public int hashCode();
}

