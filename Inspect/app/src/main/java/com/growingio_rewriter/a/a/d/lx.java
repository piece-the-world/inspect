/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bC;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fD;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.lA;
import com.growingio.a.a.d.ly;
import com.growingio.a.a.d.lz;
import com.growingio.a.a.d.mA;
import com.growingio.a.a.d.nC;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

abstract class lx<R, C, V>
extends fD<R, C, V> {
    lx() {
    }

    abstract nC<R, C, V> a(int var1);

    @Override
    final fg<nC<R, C, V>> s() {
        return this.c() ? fg.k() : new lz(this, null);
    }

    abstract V b(int var1);

    @Override
    final dQ<V> v() {
        return this.c() ? ea.d() : new lA(this, null);
    }

    static <R, C, V> lx<R, C, V> a(List<nC<R, C, V>> list, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        aU.a(list);
        if (comparator != null || comparator2 != null) {
            ly ly2 = new ly(comparator, comparator2);
            Collections.sort(list, ly2);
        }
        return lx.a(list, comparator, comparator2);
    }

    static <R, C, V> lx<R, C, V> a(Iterable<nC<R, C, V>> iterable) {
        return lx.a(iterable, null, null);
    }

    private static final <R, C, V> lx<R, C, V> a(Iterable<nC<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        LinkedHashSet<R> linkedHashSet = new LinkedHashSet<R>();
        LinkedHashSet<C> linkedHashSet2 = new LinkedHashSet<C>();
        ea<nC<R, C, V>> ea2 = ea.a(iterable);
        for (nC<R, C, V> object2 : iterable) {
            linkedHashSet.add(object2.a());
            linkedHashSet2.add(object2.b());
        }
        fg<E> fg2 = comparator == null ? fg.a(linkedHashSet) : fg.a(kO.a(comparator).b(linkedHashSet));
        fg<E> fg3 = comparator2 == null ? fg.a(linkedHashSet2) : fg.a(kO.a(comparator2).b(linkedHashSet2));
        return (long)ea2.size() > (long)fg2.size() * (long)fg3.size() / 2 ? new bC<R, C, V>(ea2, fg2, fg3) : new mA<R, C, V>(ea2, fg2, fg3);
    }

    @Override
    /* synthetic */ Collection i() {
        return this.v();
    }

    @Override
    /* synthetic */ Set f() {
        return this.s();
    }
}

