/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.km;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public interface kl<E>
extends Collection<E> {
    public int a(Object var1);

    public int a(E var1, int var2);

    public int b(Object var1, int var2);

    public int c(E var1, int var2);

    public boolean a(E var1, int var2, int var3);

    public Set<E> d();

    public Set<km<E>> a();

    @Override
    public boolean equals(Object var1);

    @Override
    public int hashCode();

    public String toString();

    @Override
    public Iterator<E> iterator();

    @Override
    public boolean contains(Object var1);

    @Override
    public boolean containsAll(Collection<?> var1);

    @Override
    public boolean add(E var1);

    @Override
    public boolean remove(Object var1);

    @Override
    public boolean removeAll(Collection<?> var1);

    @Override
    public boolean retainAll(Collection<?> var1);
}

