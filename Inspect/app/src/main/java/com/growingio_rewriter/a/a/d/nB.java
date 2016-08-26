/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nC;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface nB<R, C, V> {
    public boolean a(Object var1, Object var2);

    public boolean a(Object var1);

    public boolean b(Object var1);

    public boolean c(Object var1);

    public V b(Object var1, Object var2);

    public boolean c();

    public int n();

    public boolean equals(Object var1);

    public int hashCode();

    public void d();

    public V a(R var1, C var2, V var3);

    public void a(nB<? extends R, ? extends C, ? extends V> var1);

    public V c(Object var1, Object var2);

    public Map<C, V> e(R var1);

    public Map<R, V> d(C var1);

    public Set<nC<R, C, V>> e();

    public Set<R> a();

    public Set<C> b();

    public Collection<V> h();

    public Map<R, Map<C, V>> r();

    public Map<C, Map<R, V>> p();
}

