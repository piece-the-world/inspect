/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.bD;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.b.bR;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.F;
import com.growingio.a.a.c.H;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.Q;
import com.growingio.a.a.c.W;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.aH;
import com.growingio.a.a.c.ag;
import com.growingio.a.a.c.aj;
import com.growingio.a.a.c.ar;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import com.growingio.a.a.c.aw;
import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bk;
import com.growingio.a.a.c.bo;
import com.growingio.a.a.c.c;
import com.growingio.a.a.c.f;
import com.growingio.a.a.c.j;
import com.growingio.a.a.c.k;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.m.q;
import com.growingio.a.a.o.a.bb;
import com.growingio.a.a.o.a.dD;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

class O<K, V>
extends AbstractMap<K, V>
implements ConcurrentMap<K, V> {
    static final int a = 1073741824;
    static final int b = 65536;
    static final int c = 3;
    static final int d = 63;
    static final int e = 16;
    static final Logger f = Logger.getLogger(O.class.getName());
    final int g;
    final int h;
    final at<K, V>[] i;
    final int j;
    final ab<Object> k;
    final ab<Object> l;
    final aw m;
    final aw n;
    final long o;
    final bo<K, V> p;
    final long q;
    final long r;
    final long s;
    final Queue<bk<K, V>> t;
    final bg<K, V> u;
    final bR v;
    final W w;
    final c x;
    final B<? super K, V> y;
    static final aG<Object, Object> z = new P();
    static final Queue<? extends Object> A = new Q();
    Set<K> B;
    Collection<V> C;
    Set<Map.Entry<K, V>> D;

    O(f<? super K, ? super V> f2, B<? super K, V> b2) {
        int n2;
        int n3;
        this.j = Math.min(f2.f(), 65536);
        this.m = f2.j();
        this.n = f2.m();
        this.k = f2.c();
        this.l = f2.d();
        this.o = f2.g();
        this.p = f2.h();
        this.q = f2.o();
        this.r = f2.n();
        this.s = f2.p();
        this.u = f2.q();
        this.t = this.u == j.a ? O.r() : new ConcurrentLinkedQueue();
        this.v = f2.a(this.k());
        this.w = W.a(this.m, this.m(), this.l());
        this.x = f2.t().a();
        this.y = b2;
        int n4 = Math.min(f2.e(), 1073741824);
        if (this.a() && !this.b()) {
            n4 = Math.min(n4, (int)this.o);
        }
        int n5 = 0;
        for (n2 = 1; !(n2 >= this.j || this.a() && (long)(n2 * 20) > this.o); n2 <<= 1) {
            ++n5;
        }
        this.h = 32 - n5;
        this.g = n2 - 1;
        this.i = this.c((K)n2);
        int n6 = n4 / n2;
        if (n6 * n2 < n4) {
            ++n6;
        }
        for (n3 = 1; n3 < n6; n3 <<= 1) {
        }
        if (this.a()) {
            long l2 = this.o / (long)n2 + 1;
            long l3 = this.o % (long)n2;
            for (int i2 = 0; i2 < this.i.length; ++i2) {
                if ((long)i2 == l3) {
                    --l2;
                }
                this.i[i2] = this.a(n3, l2, f2.t().a());
            }
        } else {
            for (int i3 = 0; i3 < this.i.length; ++i3) {
                this.i[i3] = this.a(n3, -1, f2.t().a());
            }
        }
    }

    boolean a() {
        return this.o >= 0;
    }

    boolean b() {
        return this.p != k.a;
    }

    boolean c() {
        return this.d() || this.e();
    }

    boolean d() {
        return this.r > 0;
    }

    boolean e() {
        return this.q > 0;
    }

    boolean f() {
        return this.s > 0;
    }

    boolean g() {
        return this.e() || this.a();
    }

    boolean h() {
        return this.d();
    }

    boolean i() {
        return this.d() || this.f();
    }

    boolean j() {
        return this.e();
    }

    boolean k() {
        return this.i() || this.j();
    }

    boolean l() {
        return this.h() || this.i();
    }

    boolean m() {
        return this.g() || this.j();
    }

    boolean n() {
        return this.m != aw.a;
    }

    boolean o() {
        return this.n != aw.a;
    }

    static <K, V> aG<K, V> p() {
        return z;
    }

    static <K, V> as<K, V> q() {
        return ar.a;
    }

    static <E> Queue<E> r() {
        return A;
    }

    static int a(int n2) {
        n2 += n2 << 15 ^ -12931;
        n2 ^= n2 >>> 10;
        n2 += n2 << 3;
        n2 ^= n2 >>> 6;
        n2 += (n2 << 2) + (n2 << 14);
        return n2 ^ n2 >>> 16;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    as<K, V> a(K k2, int n2, as<K, V> as2) {
        at<K, as<K, V>> at2 = this.b(n2);
        at2.lock();
        try {
            as<K, V> as3 = at2.a(k2, n2, as2);
            return as3;
        }
        finally {
            at2.unlock();
        }
    }

    as<K, V> a(as<K, V> as2, as<K, V> as3) {
        int n2 = as2.c();
        return this.b(n2).a(as2, as3);
    }

    aG<K, V> a(as<K, V> as2, V v2, int n2) {
        int n3 = as2.c();
        return this.n.a(this.b(n3), as2, aU.a(v2), n2);
    }

    int a(Object object) {
        int n2 = this.k.a(object);
        return O.a(n2);
    }

    void a(aG<K, V> aG2) {
        as<K, V> as2 = aG2.b();
        int n2 = as2.c();
        this.b(n2).a(as2.d(), n2, aG2);
    }

    void a(as<K, V> as2) {
        int n2 = as2.c();
        this.b(n2).a(as2, n2);
    }

    boolean a(as<K, V> as2, long l2) {
        return this.b(as2.c()).c(as2, l2) != null;
    }

    at<K, V> b(int n2) {
        return this.i[n2 >>> this.h & this.g];
    }

    at<K, V> a(int n2, long l2, c c2) {
        return new at(this, n2, l2, c2);
    }

    V b(as<K, V> as2, long l2) {
        if (as2.d() == null) {
            return null;
        }
        V v2 = as2.a().get();
        if (v2 == null) {
            return null;
        }
        if (this.c(as2, l2)) {
            return null;
        }
        return v2;
    }

    boolean c(as<K, V> as2, long l2) {
        aU.a(as2);
        if (this.e() && l2 - as2.e() >= this.q) {
            return true;
        }
        if (this.d() && l2 - as2.h() >= this.r) {
            return true;
        }
        return false;
    }

    static <K, V> void b(as<K, V> as2, as<K, V> as3) {
        as2.a(as3);
        as3.b(as2);
    }

    static <K, V> void b(as<K, V> as2) {
        as<K, V> as3 = O.q();
        as2.a(as3);
        as2.b(as3);
    }

    static <K, V> void c(as<K, V> as2, as<K, V> as3) {
        as2.c(as3);
        as3.d(as2);
    }

    static <K, V> void c(as<K, V> as2) {
        as<K, V> as3 = O.q();
        as2.c(as3);
        as2.d(as3);
    }

    void s() {
        bk<K, V> bk2;
        while ((bk2 = this.t.poll()) != null) {
            try {
                this.u.a(bk2);
            }
            catch (Throwable var2_2) {
                f.log(Level.WARNING, "Exception thrown by removal listener", var2_2);
            }
        }
    }

    final at<K, V>[] c(int n2) {
        return new at[n2];
    }

    public void t() {
        for (at<K, V> at2 : this.i) {
            at2.n();
        }
    }

    @Override
    public boolean isEmpty() {
        int n2;
        long l2 = 0;
        at<K, V>[] arrat = this.i;
        for (n2 = 0; n2 < arrat.length; ++n2) {
            if (arrat[n2].b != 0) {
                return false;
            }
            l2 += (long)arrat[n2].d;
        }
        if (l2 != 0) {
            for (n2 = 0; n2 < arrat.length; ++n2) {
                if (arrat[n2].b != 0) {
                    return false;
                }
                l2 -= (long)arrat[n2].d;
            }
            if (l2 != 0) {
                return false;
            }
        }
        return true;
    }

    long u() {
        at<K, V>[] arrat = this.i;
        long l2 = 0;
        for (int i2 = 0; i2 < arrat.length; ++i2) {
            l2 += (long)Math.max(0, arrat[i2].b);
        }
        return l2;
    }

    @Override
    public int size() {
        return q.b(this.u());
    }

    @Override
    public V get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        return this.b(n2).b(object, n2);
    }

    public V b(Object object) {
        int n2 = this.a(aU.a(object));
        V v2 = this.b(n2).b(object, n2);
        if (v2 == null) {
            this.x.b(1);
        } else {
            this.x.a(1);
        }
        return v2;
    }

    @Override
    public V getOrDefault(Object object, V v2) {
        V v3 = this.get(object);
        return v3 != null ? v3 : v2;
    }

    V a(K k2, B<? super K, V> b2) throws ExecutionException {
        int n2 = this.a(aU.a(k2));
        return (V)this.b(n2).a(k2, n2, b2);
    }

    V c(K k2) throws ExecutionException {
        return this.a(k2, this.y);
    }

    ei<K, V> a(Iterable<?> iterable) {
        int n2 = 0;
        int n3 = 0;
        LinkedHashMap linkedHashMap = ii.d();
        for (Object obj : iterable) {
            V v2 = this.get(obj);
            if (v2 == null) {
                ++n3;
                continue;
            }
            Object obj2 = obj;
            linkedHashMap.put(obj2, v2);
            ++n2;
        }
        this.x.a(n2);
        this.x.b(n3);
        return ei.b(linkedHashMap);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    ei<K, V> b(Iterable<? extends K> iterable) throws ExecutionException {
        int n2 = 0;
        int n3 = 0;
        LinkedHashMap<Iterator, V> linkedHashMap = ii.d();
        LinkedHashSet linkedHashSet = lI.c();
        for (Iterator iterator : iterable) {
            V object = this.get(iterator);
            if (linkedHashMap.containsKey(iterator)) continue;
            linkedHashMap.put(iterator, object);
            if (object == null) {
                ++n3;
                linkedHashSet.add(iterator);
                continue;
            }
            ++n2;
        }
        try {
            Map<K, V> map;
            if (!linkedHashSet.isEmpty()) {
                try {
                    map = this.a(linkedHashSet, this.y);
                    for (Object e2 : linkedHashSet) {
                        V v2 = map.get(e2);
                        if (v2 == null) {
                            throw new F("loadAll failed to return a value for " + e2);
                        }
                        linkedHashMap.put((Iterator)e2, v2);
                    }
                }
                catch (H var6_7) {
                    for (Object e3 : linkedHashSet) {
                        --n3;
                        linkedHashMap.put((Iterator)e3, this.a(e3, this.y));
                    }
                }
            }
            map = ei.b(linkedHashMap);
            return map;
        }
        finally {
            this.x.a(n2);
            this.x.b(n3);
        }
    }

    Map<K, V> a(Set<? extends K> set, B<? super K, V> b2) throws ExecutionException {
        Map<K, V> map;
        aU.a(b2);
        aU.a(set);
        bD bD2 = bD.b();
        boolean bl2 = false;
        try {
            Map<K, V> map2;
            map = map2 = b2.a(set);
            bl2 = true;
        }
        catch (H var6_6) {
            bl2 = true;
            throw var6_6;
        }
        catch (InterruptedException var6_7) {
            Thread.currentThread().interrupt();
            throw new ExecutionException(var6_7);
        }
        catch (RuntimeException var6_8) {
            throw new dD(var6_8);
        }
        catch (Exception var6_9) {
            throw new ExecutionException(var6_9);
        }
        catch (Error var6_10) {
            throw new bb(var6_10);
        }
        finally {
            if (!bl2) {
                this.x.b(bD2.a(TimeUnit.NANOSECONDS));
            }
        }
        if (map == null) {
            this.x.b(bD2.a(TimeUnit.NANOSECONDS));
            throw new F(b2 + " returned null map from loadAll");
        }
        bD2.e();
        boolean bl3 = false;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k2 = entry.getKey();
            V v2 = entry.getValue();
            if (k2 == null || v2 == null) {
                bl3 = true;
                continue;
            }
            this.put(k2, v2);
        }
        if (bl3) {
            this.x.b(bD2.a(TimeUnit.NANOSECONDS));
            throw new F(b2 + " returned null keys or values from loadAll");
        }
        this.x.a(bD2.a(TimeUnit.NANOSECONDS));
        return map;
    }

    as<K, V> d(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        return this.b(n2).a(object, n2);
    }

    void e(K k2) {
        int n2 = this.a(aU.a(k2));
        this.b(n2).a(k2, n2, this.y, false);
    }

    @Override
    public boolean containsKey(Object object) {
        if (object == null) {
            return false;
        }
        int n2 = this.a(object);
        return this.b(n2).c(object, n2);
    }

    @Override
    public boolean containsValue(Object object) {
        if (object == null) {
            return false;
        }
        long l2 = this.v.a();
        at<K, V>[] arrat = this.i;
        long l3 = -1;
        for (int i2 = 0; i2 < 3; ++i2) {
            long l4 = 0;
            for (at at2 : arrat) {
                int n2 = at2.b;
                AtomicReferenceArray atomicReferenceArray = at2.f;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); ++i3) {
                    for (as as2 = atomicReferenceArray.get((int)i3); as2 != null; as2 = as2.b()) {
                        V v2 = at2.c(as2, l2);
                        if (v2 == null || !this.l.a(object, v2)) continue;
                        return true;
                    }
                }
                l4 += (long)at2.d;
            }
            if (l4 == l3) break;
            l3 = l4;
        }
        return false;
    }

    @Override
    public V put(K k2, V v2) {
        aU.a(k2);
        aU.a(v2);
        int n2 = this.a(k2);
        return this.b(n2).a(k2, n2, v2, false);
    }

    @Override
    public V putIfAbsent(K k2, V v2) {
        aU.a(k2);
        aU.a(v2);
        int n2 = this.a(k2);
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
        int n2 = this.a(object);
        return this.b(n2).d(object, n2);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        if (object == null || object2 == null) {
            return false;
        }
        int n2 = this.a(object);
        return this.b(n2).b(object, n2, object2);
    }

    @Override
    public boolean replace(K k2, V v2, V v3) {
        aU.a(k2);
        aU.a(v3);
        if (v2 == null) {
            return false;
        }
        int n2 = this.a(k2);
        return this.b(n2).a(k2, n2, v2, v3);
    }

    @Override
    public V replace(K k2, V v2) {
        aU.a(k2);
        aU.a(v2);
        int n2 = this.a(k2);
        return this.b(n2).a(k2, n2, v2);
    }

    @Override
    public void clear() {
        for (at<K, V> at2 : this.i) {
            at2.k();
        }
    }

    void c(Iterable<?> iterable) {
        for (Object obj : iterable) {
            this.remove(obj);
        }
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = this.B;
        Set<K> set2 = set != null ? set : (this.B = new aj(this, (ConcurrentMap)this));
        return set2;
    }

    @Override
    public Collection<V> values() {
        aH aH2 = this.C;
        aH aH3 = aH2 != null ? aH2 : (this.C = new aH(this, (ConcurrentMap)this));
        return aH3;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.D;
        Set<Map.Entry<K, V>> set2 = set != null ? set : (this.D = new ag(this, (ConcurrentMap)this));
        return set2;
    }

    private static <E> ArrayList<E> b(Collection<E> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        gb.a(arrayList, collection.iterator());
        return arrayList;
    }

    static /* synthetic */ ArrayList a(Collection collection) {
        return O.b(collection);
    }
}

