/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fq;
import com.growingio.a.a.d.fs;
import com.growingio.a.a.d.ft;
import com.growingio.a.a.d.fu;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.lo;
import com.growingio.a.a.d.lw;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public final class fp<K, V>
extends fu<K, V>
implements NavigableMap<K, V> {
    private static final Comparator<Comparable> a = kO.d();
    private static final fp<Comparable, Object> c = new fp(fz.a(kO.d()), ea.d());
    private final transient lw<K> d;
    private final transient ea<V> e;
    private transient fp<K, V> f;
    private static final long g = 0;

    static <K, V> fp<K, V> a(Comparator<? super K> comparator) {
        if (kO.d().equals(comparator)) {
            return fp.d();
        }
        return new fp(fz.a(comparator), ea.d());
    }

    public static <K, V> fp<K, V> d() {
        return c;
    }

    public static <K extends Comparable<? super K>, V> fp<K, V> a(K k2, V v2) {
        return fp.b(kO.d(), k2, v2);
    }

    private static <K, V> fp<K, V> b(Comparator<? super K> comparator, K k2, V v2) {
        return new fp<K, V>(new lw<K>(ea.a(k2), aU.a(comparator)), ea.a(v2));
    }

    private static /* varargs */ <K extends Comparable<? super K>, V> fp<K, V> a(er<K, V> ... arrer) {
        return fp.b(kO.d(), false, arrer, arrer.length);
    }

    public static <K extends Comparable<? super K>, V> fp<K, V> a(K k2, V v2, K k3, V v3) {
        return fp.a(new er[]{fp.d(k2, v2), fp.d(k3, v3)});
    }

    public static <K extends Comparable<? super K>, V> fp<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4) {
        return fp.a(new er[]{fp.d(k2, v2), fp.d(k3, v3), fp.d(k4, v4)});
    }

    public static <K extends Comparable<? super K>, V> fp<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return fp.a(new er[]{fp.d(k2, v2), fp.d(k3, v3), fp.d(k4, v4), fp.d(k5, v5)});
    }

    public static <K extends Comparable<? super K>, V> fp<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return fp.a(new er[]{fp.d(k2, v2), fp.d(k3, v3), fp.d(k4, v4), fp.d(k5, v5), fp.d(k6, v6)});
    }

    public static <K, V> fp<K, V> a(Map<? extends K, ? extends V> map) {
        kO kO2 = (kO)a;
        return fp.b(map, kO2);
    }

    public static <K, V> fp<K, V> a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return fp.b(map, aU.a(comparator));
    }

    public static <K, V> fp<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        kO kO2 = (kO)a;
        return fp.a(iterable, kO2);
    }

    public static <K, V> fp<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return fp.a(aU.a(comparator), false, iterable);
    }

    public static <K, V> fp<K, V> a(SortedMap<K, ? extends V> sortedMap) {
        fp fp2;
        Comparator comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = a;
        }
        if (sortedMap instanceof fp && !(fp2 = (fp)sortedMap).b()) {
            return fp2;
        }
        return fp.a(comparator, true, sortedMap.entrySet());
    }

    private static <K, V> fp<K, V> b(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        SortedMap sortedMap;
        boolean bl2 = false;
        if (map instanceof SortedMap) {
            sortedMap = (SortedMap)map;
            Comparator comparator2 = sortedMap.comparator();
            boolean bl3 = comparator2 == null ? comparator == a : (bl2 = comparator.equals(comparator2));
        }
        if (bl2 && map instanceof fp && !(sortedMap = (fp)map).b()) {
            return sortedMap;
        }
        return fp.a(comparator, bl2, map.entrySet());
    }

    private static <K, V> fp<K, V> a(Comparator<? super K> comparator, boolean bl2, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] arrentry = fL.a(iterable, b);
        return fp.b(comparator, bl2, arrentry, arrentry.length);
    }

    private static <K, V> fp<K, V> b(Comparator<? super K> comparator, boolean bl2, Map.Entry<K, V>[] arrentry, int n2) {
        switch (n2) {
            case 0: {
                return fp.a(comparator);
            }
            case 1: {
                return fp.b(comparator, arrentry[0].getKey(), arrentry[0].getValue());
            }
        }
        Object[] arrobject = new Object[n2];
        Object[] arrobject2 = new Object[n2];
        if (bl2) {
            for (int i2 = 0; i2 < n2; ++i2) {
                K k2 = arrentry[i2].getKey();
                V v2 = arrentry[i2].getValue();
                aK.a(k2, v2);
                arrobject[i2] = k2;
                arrobject2[i2] = v2;
            }
        } else {
            K k3;
            Arrays.sort(arrentry, 0, n2, kO.a(comparator).h());
            arrobject[0] = k3 = arrentry[0].getKey();
            arrobject2[0] = arrentry[0].getValue();
            for (int i3 = 1; i3 < n2; ++i3) {
                K k4 = arrentry[i3].getKey();
                V v3 = arrentry[i3].getValue();
                aK.a(k4, v3);
                arrobject[i3] = k4;
                arrobject2[i3] = v3;
                fp.a(comparator.compare(k3, k4) != 0, "key", arrentry[i3 - 1], arrentry[i3]);
                k3 = k4;
            }
        }
        return new fp(new lw<K>(new lo(arrobject), comparator), new lo(arrobject2));
    }

    public static <K extends Comparable<?>, V> fs<K, V> e() {
        return new fs(kO.d());
    }

    public static <K, V> fs<K, V> b(Comparator<K> comparator) {
        return new fs(comparator);
    }

    public static <K extends Comparable<?>, V> fs<K, V> f() {
        return new fs(kO.d().a());
    }

    fp(lw<K> lw2, ea<V> ea2) {
        this(lw2, ea2, null);
    }

    fp(lw<K> lw2, ea<V> ea2, fp<K, V> fp2) {
        this.d = lw2;
        this.e = ea2;
        this.f = fp2;
    }

    @Override
    public int size() {
        return this.e.size();
    }

    @Override
    public V get(Object object) {
        int n2 = this.d.c(object);
        return n2 == -1 ? null : (V)this.e.get(n2);
    }

    @Override
    boolean b() {
        return this.d.i_() || this.e.i_();
    }

    @Override
    public fg<Map.Entry<K, V>> k() {
        return super.k();
    }

    @Override
    fg<Map.Entry<K, V>> l() {
        return this.isEmpty() ? fg.k() : new fq(this);
    }

    public fz<K> p() {
        return this.d;
    }

    @Override
    public dQ<V> h() {
        return this.e;
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.p().comparator();
    }

    @Override
    public K firstKey() {
        return this.p().first();
    }

    @Override
    public K lastKey() {
        return this.p().last();
    }

    private fp<K, V> a(int n2, int n3) {
        if (n2 == 0 && n3 == this.size()) {
            return this;
        }
        if (n2 == n3) {
            return fp.a(this.comparator());
        }
        return new fp<K, V>(this.d.a(n2, n3), this.e.a(n2, n3));
    }

    public fp<K, V> a(K k2) {
        return this.a(k2, (K)false);
    }

    public fp<K, V> a(K k2, boolean bl2) {
        return this.a(false, this.d.e(aU.a(k2), bl2));
    }

    public fp<K, V> a(K k2, K k3) {
        return this.a(k2, true, k3, false);
    }

    @Override
    public fp<K, V> a(K k2, boolean bl2, K k3, boolean bl3) {
        aU.a(k2);
        aU.a(k3);
        aU.a(this.comparator().compare(k2, k3) <= 0, "expected fromKey <= toKey but %s > %s", k2, k3);
        return this.a(k3, (K)bl3).b((boolean)k2, bl2);
    }

    public fp<K, V> b(K k2) {
        return this.b(k2, true);
    }

    @Override
    public fp<K, V> b(K k2, boolean bl2) {
        return this.a((K)this.d.f(aU.a(k2), bl2), (K)this.size());
    }

    @Override
    public Map.Entry<K, V> lowerEntry(K k2) {
        return this.a(k2, (K)false).lastEntry();
    }

    @Override
    public K lowerKey(K k2) {
        return ii.b(this.lowerEntry(k2));
    }

    @Override
    public Map.Entry<K, V> floorEntry(K k2) {
        return this.a(k2, (K)true).lastEntry();
    }

    @Override
    public K floorKey(K k2) {
        return ii.b(this.floorEntry(k2));
    }

    @Override
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return this.b(k2, true).firstEntry();
    }

    @Override
    public K ceilingKey(K k2) {
        return ii.b(this.ceilingEntry(k2));
    }

    @Override
    public Map.Entry<K, V> higherEntry(K k2) {
        return this.b(k2, false).firstEntry();
    }

    @Override
    public K higherKey(K k2) {
        return ii.b(this.higherEntry(k2));
    }

    @Override
    public Map.Entry<K, V> firstEntry() {
        return this.isEmpty() ? null : this.k().h().get(0);
    }

    @Override
    public Map.Entry<K, V> lastEntry() {
        return this.isEmpty() ? null : this.k().h().get(this.size() - 1);
    }

    @Override
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public fp<K, V> q() {
        fp fp2 = this.f;
        if (fp2 == null) {
            if (this.isEmpty()) {
                fp2 = fp.a(kO.a(this.comparator()).a());
                return fp2;
            }
            fp2 = new fp<K, V>((lw)this.d.g_(), this.e.f(), this);
            return fp2;
        }
        return fp2;
    }

    public fz<K> r() {
        return this.d;
    }

    public fz<K> s() {
        return this.d.g_();
    }

    @Override
    Object g() {
        return new ft(this);
    }

    @Override
    public /* synthetic */ fg m() {
        return this.p();
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.k();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.h();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.p();
    }

    @Override
    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ NavigableMap tailMap(Object object, boolean bl2) {
        return this.b(object, bl2);
    }

    @Override
    public /* synthetic */ NavigableMap headMap(Object object, boolean bl2) {
        return this.a((K)object, (K)bl2);
    }

    @Override
    public /* synthetic */ NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a(object, bl2, object2, bl3);
    }

    @Override
    public /* synthetic */ NavigableSet descendingKeySet() {
        return this.s();
    }

    @Override
    public /* synthetic */ NavigableSet navigableKeySet() {
        return this.r();
    }

    @Override
    public /* synthetic */ NavigableMap descendingMap() {
        return this.q();
    }

    static /* synthetic */ fp a(Comparator comparator, Object object, Object object2) {
        return fp.b(comparator, object, object2);
    }

    static /* synthetic */ fp a(Comparator comparator, boolean bl2, Map.Entry[] arrentry, int n2) {
        return fp.b(comparator, bl2, arrentry, n2);
    }

    static /* synthetic */ lw a(fp fp2) {
        return fp2.d;
    }

    static /* synthetic */ ea b(fp fp2) {
        return fp2.e;
    }
}

