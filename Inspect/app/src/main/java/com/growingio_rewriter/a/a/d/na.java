/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.eg;
import com.growingio.a.a.d.fl;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import com.growingio.a.a.d.nA;
import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.ni;
import com.growingio.a.a.d.nj;
import com.growingio.a.a.d.nk;
import com.growingio.a.a.d.nl;
import com.growingio.a.a.d.nm;
import com.growingio.a.a.d.nn;
import com.growingio.a.a.d.no;
import com.growingio.a.a.d.np;
import com.growingio.a.a.d.nq;
import com.growingio.a.a.d.nr;
import com.growingio.a.a.d.ns;
import com.growingio.a.a.d.nu;
import com.growingio.a.a.d.nv;
import com.growingio.a.a.d.nw;
import com.growingio.a.a.d.nx;
import com.growingio.a.a.d.ny;
import com.growingio.a.a.d.nz;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class na {
    private na() {
    }

    private static <E> Collection<E> c(Collection<E> collection, Object object) {
        return new nj(collection, object, null);
    }

    static <E> Set<E> a(Set<E> set, Object object) {
        return new nw<E>(set, object);
    }

    private static <E> SortedSet<E> b(SortedSet<E> sortedSet, Object object) {
        return new nz<E>(sortedSet, object);
    }

    private static <E> List<E> b(List<E> list, Object object) {
        return list instanceof RandomAccess ? new nv<E>(list, object) : new nm<E>(list, object);
    }

    static <E> kl<E> a(kl<E> kl2, Object object) {
        if (kl2 instanceof nq || kl2 instanceof eM) {
            return kl2;
        }
        return new nq<E>(kl2, object);
    }

    static <K, V> jr<K, V> a(jr<K, V> jr2, Object object) {
        if (jr2 instanceof np || jr2 instanceof eD) {
            return jr2;
        }
        return new np<K, V>(jr2, object);
    }

    static <K, V> gN<K, V> a(gN<K, V> gN2, Object object) {
        if (gN2 instanceof nn || gN2 instanceof eg) {
            return gN2;
        }
        return new nn<K, V>(gN2, object);
    }

    static <K, V> lH<K, V> a(lH<K, V> lH2, Object object) {
        if (lH2 instanceof nx || lH2 instanceof fl) {
            return lH2;
        }
        return new nx<K, V>(lH2, object);
    }

    static <K, V> mz<K, V> a(mz<K, V> mz2, Object object) {
        if (mz2 instanceof nA) {
            return mz2;
        }
        return new nA<K, V>(mz2, object);
    }

    private static <E> Collection<E> d(Collection<E> collection, Object object) {
        if (collection instanceof SortedSet) {
            return na.b((SortedSet)collection, object);
        }
        if (collection instanceof Set) {
            return na.a((Set)collection, object);
        }
        if (collection instanceof List) {
            return na.b((List)collection, object);
        }
        return na.c(collection, object);
    }

    private static <E> Set<E> c(Set<E> set, Object object) {
        if (set instanceof SortedSet) {
            return na.b((SortedSet)set, object);
        }
        return na.a(set, object);
    }

    static <K, V> Map<K, V> a(Map<K, V> map, Object object) {
        return new no<K, V>(map, object);
    }

    static <K, V> SortedMap<K, V> a(SortedMap<K, V> sortedMap, Object object) {
        return new ny<K, V>(sortedMap, object);
    }

    static <K, V> av<K, V> a(av<K, V> av2, Object object) {
        if (av2 instanceof ni || av2 instanceof dK) {
            return av2;
        }
        return new ni(av2, object, null, null);
    }

    static <E> NavigableSet<E> a(NavigableSet<E> navigableSet, Object object) {
        return new ns<E>(navigableSet, object);
    }

    static <E> NavigableSet<E> a(NavigableSet<E> navigableSet) {
        return na.a(navigableSet, (Object)null);
    }

    static <K, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap) {
        return na.a(navigableMap, (Object)null);
    }

    static <K, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap, Object object) {
        return new nr<K, V>(navigableMap, object);
    }

    private static <K, V> Map.Entry<K, V> b(Map.Entry<K, V> entry, Object object) {
        if (entry == null) {
            return null;
        }
        return new nl<K, V>(entry, object);
    }

    static <E> Queue<E> a(Queue<E> nu2, Object object) {
        return nu2 instanceof nu ? nu2 : new nu(nu2, object);
    }

    static <E> Deque<E> a(Deque<E> deque, Object object) {
        return new nk<E>(deque, object);
    }

    static /* synthetic */ SortedSet a(SortedSet sortedSet, Object object) {
        return na.b(sortedSet, object);
    }

    static /* synthetic */ List a(List list, Object object) {
        return na.b(list, object);
    }

    static /* synthetic */ Set b(Set set, Object object) {
        return na.c(set, object);
    }

    static /* synthetic */ Collection a(Collection collection, Object object) {
        return na.d(collection, object);
    }

    static /* synthetic */ Collection b(Collection collection, Object object) {
        return na.c(collection, object);
    }

    static /* synthetic */ Map.Entry a(Map.Entry entry, Object object) {
        return na.b(entry, object);
    }
}

