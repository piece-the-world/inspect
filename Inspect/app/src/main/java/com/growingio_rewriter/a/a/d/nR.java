/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.mB;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nS;
import com.growingio.a.a.d.nT;
import com.growingio.a.a.d.nU;
import com.growingio.a.a.d.nV;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class nR<R, C, V>
extends mB<R, C, V> {
    private final Comparator<? super C> c;
    private static final long d = 0;

    public static <R extends Comparable, C extends Comparable, V> nR<R, C, V> o() {
        return new nR(kO.d(), kO.d());
    }

    public static <R, C, V> nR<R, C, V> a(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        aU.a(comparator);
        aU.a(comparator2);
        return new nR<R, C, V>(comparator, comparator2);
    }

    public static <R, C, V> nR<R, C, V> a(nR<R, C, ? extends V> nR2) {
        nR<R, C, V> nR3 = new nR<R, C, V>(nR2.q(), nR2.s());
        nR3.a(nR2);
        return nR3;
    }

    nR(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new nU(comparator2));
        this.c = comparator2;
    }

    public Comparator<? super R> q() {
        return this.p_().comparator();
    }

    public Comparator<? super C> s() {
        return this.c;
    }

    public SortedMap<C, V> f(R r2) {
        return new nV(this, r2);
    }

    @Override
    public SortedSet<R> p_() {
        return super.p_();
    }

    @Override
    public SortedMap<R, Map<C, V>> j() {
        return super.j();
    }

    @Override
    Iterator<C> m() {
        Comparator<C> comparator = this.s();
        oP<C> oP2 = gb.a(fL.a(this.a.values(), new nS(this)), comparator);
        return new nT(this, oP2, comparator);
    }

    @Override
    public /* synthetic */ Map r() {
        return this.j();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.p_();
    }

    @Override
    public /* synthetic */ Map e(Object object) {
        return this.f(object);
    }
}

