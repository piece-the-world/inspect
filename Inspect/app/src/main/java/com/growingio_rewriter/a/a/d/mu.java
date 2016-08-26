/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.mf;
import com.growingio.a.a.d.mv;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public interface mu<E>
extends mf<E>,
mv<E> {
    @Override
    public Comparator<? super E> comparator();

    public km<E> i();

    public km<E> j();

    public km<E> k();

    public km<E> l();

    public NavigableSet<E> e_();

    @Override
    public Set<km<E>> a();

    @Override
    public Iterator<E> iterator();

    public mu<E> o();

    public mu<E> d(E var1, aD var2);

    public mu<E> a(E var1, aD var2, E var3, aD var4);

    public mu<E> c(E var1, aD var2);
}

