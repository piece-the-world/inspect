/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hL;
import com.growingio.a.a.d.hP;
import com.growingio.a.a.d.hS;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.hW;
import com.growingio.a.a.d.hX;
import com.growingio.a.a.d.id;
import com.growingio.a.a.d.ie;
import com.growingio.a.a.m.q;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

class hG<K, V>
extends AbstractMap<K, V>
implements Serializable,
ConcurrentMap<K, V> {
    static final int b = 1073741824;
    static final int c = 65536;
    static final int d = 3;
    static final int e = 63;
    static final int f = 16;
    static final long g = 60;
    final transient int h;
    final transient int i;
    final transient hV<K, V>[] j;
    final int k;
    final ab<Object> l;
    final ab<Object> m;
    final hX n;
    final hX o;
    final transient hL p;
    static final id<Object, Object> q = new hH();
    transient Set<K> r;
    transient Collection<V> s;
    transient Set<Map.Entry<K, V>> t;
    private static final long a = 5;

    hG(hE hE2) {
        int n2;
        int n3;
        this.k = Math.min(hE2.c(), 65536);
        this.n = hE2.e();
        this.o = hE2.g();
        this.l = hE2.a();
        this.m = this.o.b();
        this.p = hL.a(this.n);
        int n4 = Math.min(hE2.b(), 1073741824);
        int n5 = 0;
        for (n2 = 1; n2 < this.k; n2 <<= 1) {
            ++n5;
        }
        this.i = 32 - n5;
        this.h = n2 - 1;
        this.j = this.d(n2);
        int n6 = n4 / n2;
        if (n6 * n2 < n4) {
            ++n6;
        }
        for (n3 = 1; n3 < n6; n3 <<= 1) {
        }
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            this.j[i2] = this.a(n3, -1);
        }
    }

    boolean b() {
        return this.n != hX.a;
    }

    boolean c() {
        return this.o != hX.a;
    }

    static <K, V> id<K, V> d() {
        return q;
    }

    static int c(int n2) {
        n2 += n2 << 15 ^ -12931;
        n2 ^= n2 >>> 10;
        n2 += n2 << 3;
        n2 ^= n2 >>> 6;
        n2 += (n2 << 2) + (n2 << 14);
        return n2 ^ n2 >>> 16;
    }

    hT<K, V> a(K k2, int n2, hT<K, V> hT2) {
        return this.b(n2).a(k2, n2, hT2);
    }

    hT<K, V> a(hT<K, V> hT2, hT<K, V> hT3) {
        int n2 = hT2.c();
        return this.b(n2).a(hT2, hT3);
    }

    id<K, V> a(hT<K, V> hT2, V v2) {
        int n2 = hT2.c();
        return this.o.a(this.b(n2), hT2, v2);
    }

    int b(Object object) {
        int n2 = this.l.a(object);
        return hG.c(n2);
    }

    void a(id<K, V> id2) {
        hT<K, V> hT2 = id2.a();
        int n2 = hT2.c();
        this.b(n2).a(hT2.d(), n2, id2);
    }

    void a(hT<K, V> hT2) {
        int n2 = hT2.c();
        this.b(n2).a(hT2, n2);
    }

    boolean b(hT<K, V> hT2) {
        return this.b(hT2.c()).a(hT2) != null;
    }

    hV<K, V> b(int n2) {
        return this.j[n2 >>> this.i & this.h];
    }

    hV<K, V> a(int n2, int n3) {
        return new hV(this, n2, n3);
    }

    V c(hT<K, V> hT2) {
        if (hT2.d() == null) {
            return null;
        }
        V v2 = hT2.a().get();
        if (v2 == null) {
            return null;
        }
        return v2;
    }

    final hV<K, V>[] d(int n2) {
        return new hV[n2];
    }

    @Override
    public boolean isEmpty() {
        int n2;
        long l2 = 0;
        hV<K, V>[] arrhV = this.j;
        for (n2 = 0; n2 < arrhV.length; ++n2) {
            if (arrhV[n2].b != 0) {
                return false;
            }
            l2 += (long)arrhV[n2].c;
        }
        if (l2 != 0) {
            for (n2 = 0; n2 < arrhV.length; ++n2) {
                if (arrhV[n2].b != 0) {
                    return false;
                }
                l2 -= (long)arrhV[n2].c;
            }
            if (l2 != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        hV<K, V>[] arrhV = this.j;
        long l2 = 0;
        for (int i2 = 0; i2 < arrhV.length; ++i2) {
            l2 += (long)arrhV[i2].b;
        }
        return q.b(l2);
    }

    @Override
    public V get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.b(object);
        return this.b(n2).c(object, n2);
    }

    hT<K, V> c(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.b(object);
        return this.b(n2).a(object, n2);
    }

    @Override
    public boolean containsKey(Object object) {
        if (object == null) {
            return false;
        }
        int n2 = this.b(object);
        return this.b(n2).d(object, n2);
    }

    @Override
    public boolean containsValue(Object object) {
        if (object == null) {
            return false;
        }
        hV<K, V>[] arrhV = this.j;
        long l2 = -1;
        for (int i2 = 0; i2 < 3; ++i2) {
            long l3 = 0;
            for (hV hV2 : arrhV) {
                int n2 = hV2.b;
                AtomicReferenceArray atomicReferenceArray = hV2.e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); ++i3) {
                    for (hT hT2 = atomicReferenceArray.get((int)i3); hT2 != null; hT2 = hT2.b()) {
                        V v2 = hV2.a(hT2);
                        if (v2 == null || !this.m.a(object, v2)) continue;
                        return true;
                    }
                }
                l3 += (long)hV2.c;
            }
            if (l3 == l2) break;
            l2 = l3;
        }
        return false;
    }

    @Override
    public V put(K k2, V v2) {
        aU.a(k2);
        aU.a(v2);
        int n2 = this.b(k2);
        return this.b(n2).a(k2, n2, v2, false);
    }

    @Override
    public V putIfAbsent(K k2, V v2) {
        aU.a(k2);
        aU.a(v2);
        int n2 = this.b(k2);
        return this.b(n2).a(k2, n2, v2, true);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public V remove(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.b(object);
        return this.b(n2).e(object, n2);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        if (object == null || object2 == null) {
            return false;
        }
        int n2 = this.b(object);
        return this.b(n2).b(object, n2, object2);
    }

    @Override
    public boolean replace(K k2, V v2, V v3) {
        aU.a(k2);
        aU.a(v3);
        if (v2 == null) {
            return false;
        }
        int n2 = this.b(k2);
        return this.b(n2).a(k2, n2, v2, v3);
    }

    @Override
    public V replace(K k2, V v2) {
        aU.a(k2);
        aU.a(v2);
        int n2 = this.b(k2);
        return this.b(n2).a(k2, n2, v2);
    }

    @Override
    public void clear() {
        for (hV<K, V> hV2 : this.j) {
            hV2.i();
        }
    }

    @Override
    public Set<K> keySet() {
        hS hS2 = this.r;
        hS hS3 = hS2 != null ? hS2 : (this.r = new hS(this));
        return hS3;
    }

    @Override
    public Collection<V> values() {
        ie ie2 = this.s;
        ie ie3 = ie2 != null ? ie2 : (this.s = new ie(this));
        return ie3;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        hP hP2 = this.t;
        hP hP3 = hP2 != null ? hP2 : (this.t = new hP(this));
        return hP3;
    }

    private static <E> ArrayList<E> b(Collection<E> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        gb.a(arrayList, collection.iterator());
        return arrayList;
    }

    Object a() {
        return new hW(this.n, this.o, this.l, this.m, this.k, this);
    }

    static /* synthetic */ ArrayList a(Collection collection) {
        return hG.b(collection);
    }
}

