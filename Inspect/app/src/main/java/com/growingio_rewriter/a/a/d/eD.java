/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.N;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eE;
import com.growingio.a.a.d.eF;
import com.growingio.a.a.d.eG;
import com.growingio.a.a.d.eH;
import com.growingio.a.a.d.eK;
import com.growingio.a.a.d.eL;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.eg;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.oP;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class eD<K, V>
extends N<K, V>
implements Serializable {
    final transient ei<K, ? extends dQ<V>> b;
    final transient int c;
    private static final long a = 0;

    public static <K, V> eD<K, V> f() {
        return eg.a();
    }

    public static <K, V> eD<K, V> e(K k2, V v2) {
        return eg.d(k2, v2);
    }

    public static <K, V> eD<K, V> b(K k2, V v2, K k3, V v3) {
        return eg.a(k2, v2, k3, v3);
    }

    public static <K, V> eD<K, V> b(K k2, V v2, K k3, V v3, K k4, V v4) {
        return eg.a(k2, v2, k3, v3, k4, v4);
    }

    public static <K, V> eD<K, V> b(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return eg.a(k2, v2, k3, v3, k4, v4, k5, v5);
    }

    public static <K, V> eD<K, V> b(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return eg.a(k2, v2, k3, v3, k4, v4, k5, v5, k6, v6);
    }

    public static <K, V> eG<K, V> v() {
        return new eG();
    }

    public static <K, V> eD<K, V> c(jr<? extends K, ? extends V> jr2) {
        eD eD2;
        if (jr2 instanceof eD && !(eD2 = (eD)jr2).w()) {
            return eD2;
        }
        return eg.b(jr2);
    }

    public static <K, V> eD<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return eg.a(iterable);
    }

    eD(ei<K, ? extends dQ<V>> ei2, int n2) {
        this.b = ei2;
        this.c = n2;
    }

    public dQ<V> j(Object object) {
        throw new UnsupportedOperationException();
    }

    public dQ<V> e(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void h() {
        throw new UnsupportedOperationException();
    }

    public abstract dQ<V> i(K var1);

    public abstract eD<V, K> e();

    @Override
    public boolean a(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(jr<? extends K, ? extends V> jr2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    boolean w() {
        return this.b.b();
    }

    @Override
    public boolean f(Object object) {
        return this.b.containsKey(object);
    }

    @Override
    public boolean g(Object object) {
        return object != null && super.g(object);
    }

    @Override
    public int l_() {
        return this.c;
    }

    public fg<K> x() {
        return this.b.m();
    }

    public ei<K, Collection<V>> y() {
        return this.b;
    }

    @Override
    Map<K, Collection<V>> n() {
        throw new AssertionError((Object)"should never be called");
    }

    public dQ<Map.Entry<K, V>> z() {
        return (dQ)super.l();
    }

    dQ<Map.Entry<K, V>> A() {
        return new eH<K, V>(this);
    }

    oP<Map.Entry<K, V>> B() {
        return new eE(this);
    }

    public eM<K> C() {
        return (eM)super.r();
    }

    eM<K> D() {
        return new eK(this);
    }

    public dQ<V> E() {
        return (dQ)super.j();
    }

    dQ<V> F() {
        return new eL<K, V>(this);
    }

    oP<V> G() {
        return new eF(this);
    }

    @Override
    public /* synthetic */ Map c() {
        return this.y();
    }

    @Override
    /* synthetic */ Iterator k() {
        return this.G();
    }

    @Override
    /* synthetic */ Collection t() {
        return this.F();
    }

    @Override
    public /* synthetic */ Collection j() {
        return this.E();
    }

    @Override
    /* synthetic */ kl s() {
        return this.D();
    }

    @Override
    public /* synthetic */ kl r() {
        return this.C();
    }

    @Override
    public /* synthetic */ Set q() {
        return this.x();
    }

    @Override
    /* synthetic */ Iterator m() {
        return this.B();
    }

    @Override
    /* synthetic */ Collection p() {
        return this.A();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.z();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.e(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.j(object);
    }
}

