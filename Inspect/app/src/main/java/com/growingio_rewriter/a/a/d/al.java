/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.af;
import com.growingio.a.a.d.am;
import com.growingio.a.a.d.ar;
import com.growingio.a.a.d.as;
import com.growingio.a.a.d.at;
import com.growingio.a.a.d.au;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class al<R, C, V>
extends af<R, C, V>
implements Serializable {
    private final ea<R> a;
    private final ea<C> b;
    private final ei<R, Integer> c;
    private final ei<C, Integer> d;
    private final V[][] e;
    private transient al<R, C, V> f;
    private transient al<R, C, V> g;
    private static final long h = 0;

    public static <R, C, V> al<R, C, V> a(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new al<R, C, V>(iterable, iterable2);
    }

    public static <R, C, V> al<R, C, V> b(nB<R, C, V> nB2) {
        return nB2 instanceof al ? new al<R, C, V>((al)nB2) : new al<R, C, V>(nB2);
    }

    private al(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        Object[][] arrobject;
        this.a = ea.a(iterable);
        this.b = ea.a(iterable2);
        aU.a(!this.a.isEmpty());
        aU.a(!this.b.isEmpty());
        this.c = ii.a(this.a);
        this.d = ii.a(this.b);
        this.e = arrobject = new Object[this.a.size()][this.b.size()];
        this.m();
    }

    private al(nB<R, C, V> nB2) {
        this(nB2.a(), nB2.b());
        this.a(nB2);
    }

    private al(al<R, C, V> al2) {
        Object[][] arrobject;
        this.a = al2.a;
        this.b = al2.b;
        this.c = al2.c;
        this.d = al2.d;
        this.e = arrobject = new Object[this.a.size()][this.b.size()];
        this.m();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            System.arraycopy(al2.e[i2], 0, arrobject[i2], 0, al2.e[i2].length);
        }
    }

    public ea<R> k() {
        return this.a;
    }

    public ea<C> l() {
        return this.b;
    }

    public V a(int n2, int n3) {
        aU.a(n2, this.a.size());
        aU.a(n3, this.b.size());
        return this.e[n2][n3];
    }

    @Override
    public V a(int n2, int n3, V v2) {
        aU.a(n2, this.a.size());
        aU.a(n3, this.b.size());
        V v3 = this.e[n2][n3];
        this.e[n2][n3] = v2;
        return v3;
    }

    public V[][] a(Class<V> class_) {
        Object[][] arrobject = (Object[][])Array.newInstance(class_, this.a.size(), this.b.size());
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            System.arraycopy(this.e[i2], 0, arrobject[i2], 0, this.e[i2].length);
        }
        return arrobject;
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }

    public void m() {
        for (Object[] arrobject : this.e) {
            Arrays.fill(arrobject, null);
        }
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.a(object) && this.b(object2);
    }

    @Override
    public boolean b(Object object) {
        return this.d.containsKey(object);
    }

    @Override
    public boolean a(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public boolean c(Object object) {
        V[][] arrV = this.e;
        int n2 = arrV.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            V[] arrV2;
            for (V v2 : arrV2 = arrV[i2]) {
                if (!aL.a(object, v2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public V b(Object object, Object object2) {
        Integer n2 = this.c.get(object);
        Integer n3 = this.d.get(object2);
        return n2 == null || n3 == null ? null : (V)this.a(n2, n3);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public V a(R r2, C c2, V v2) {
        aU.a(r2);
        aU.a(c2);
        Integer n2 = this.c.get(r2);
        aU.a(n2 != null, "Row %s not in %s", r2, this.a);
        Integer n3 = this.d.get(c2);
        aU.a(n3 != null, "Column %s not in %s", c2, this.b);
        return this.a((R)n2, (C)n3, v2);
    }

    @Override
    public void a(nB<? extends R, ? extends C, ? extends V> nB2) {
        super.a(nB2);
    }

    @Override
    public V c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public V d(Object object, Object object2) {
        Integer n2 = this.c.get(object);
        Integer n3 = this.d.get(object2);
        if (n2 == null || n3 == null) {
            return null;
        }
        return this.a((R)n2, (C)n3, null);
    }

    @Override
    public int n() {
        return this.a.size() * this.b.size();
    }

    @Override
    public Set<nC<R, C, V>> e() {
        return super.e();
    }

    @Override
    Iterator<nC<R, C, V>> g() {
        return new am(this, this.n());
    }

    @Override
    public Map<R, V> d(C c2) {
        aU.a(c2);
        Integer n2 = this.d.get(c2);
        return n2 == null ? ei.i() : new ar(this, n2);
    }

    public fg<C> o() {
        return this.d.m();
    }

    @Override
    public Map<C, Map<R, V>> p() {
        al<R, C, V> al2 = this.f;
        Object object = al2 == null ? (this.f = new as(this, null)) : al2;
        return object;
    }

    @Override
    public Map<C, V> e(R r2) {
        aU.a(r2);
        Integer n2 = this.c.get(r2);
        return n2 == null ? ei.i() : new at(this, n2);
    }

    public fg<R> q() {
        return this.c.m();
    }

    @Override
    public Map<R, Map<C, V>> r() {
        al<R, C, V> al2 = this.g;
        Object object = al2 == null ? (this.g = new au(this, null)) : al2;
        return object;
    }

    @Override
    public Collection<V> h() {
        return super.h();
    }

    @Override
    public /* synthetic */ Set b() {
        return this.o();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.q();
    }

    static /* synthetic */ ea a(al al2) {
        return al2.b;
    }

    static /* synthetic */ ea b(al al2) {
        return al2.a;
    }

    static /* synthetic */ ei c(al al2) {
        return al2.c;
    }

    static /* synthetic */ ei d(al al2) {
        return al2.d;
    }
}

