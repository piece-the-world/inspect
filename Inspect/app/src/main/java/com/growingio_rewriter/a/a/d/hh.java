/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.hB;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hi;
import com.growingio.a.a.d.hj;
import com.growingio.a.a.d.hl;
import com.growingio.a.a.d.hp;
import com.growingio.a.a.d.hq;
import com.growingio.a.a.d.hs;
import com.growingio.a.a.d.ht;
import com.growingio.a.a.d.hu;
import com.growingio.a.a.d.hv;
import com.growingio.a.a.d.hy;
import com.growingio.a.a.d.hz;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class hh {
    private hh() {
    }

    public static hg<Object, Object> a() {
        return hB.a;
    }

    public static <K, V> Map<K, V> a(Map<K, V> map, hg<? super K, ? super V> hg2) {
        return new hu<K, V>(map, hg2);
    }

    public static <K, V> jr<K, V> a(jr<K, V> jr2, hg<? super K, ? super V> hg2) {
        return new hv<K, V>(jr2, hg2);
    }

    public static <K, V> gN<K, V> a(gN<K, V> gN2, hg<? super K, ? super V> hg2) {
        return new ht<K, V>(gN2, hg2);
    }

    public static <K, V> lH<K, V> a(lH<K, V> lH2, hg<? super K, ? super V> hg2) {
        return new hy<K, V>(lH2, hg2);
    }

    public static <K, V> mz<K, V> a(mz<K, V> mz2, hg<? super K, ? super V> hg2) {
        return new hz<K, V>(mz2, hg2);
    }

    private static <K, V> Map.Entry<K, V> c(Map.Entry<K, V> entry, hg<? super K, ? super V> hg2) {
        aU.a(entry);
        aU.a(hg2);
        return new hi(entry, hg2);
    }

    private static <K, V> Map.Entry<K, Collection<V>> d(Map.Entry<K, Collection<V>> entry, hg<? super K, ? super V> hg2) {
        aU.a(entry);
        aU.a(hg2);
        return new hj(entry, hg2);
    }

    private static <K, V> Set<Map.Entry<K, Collection<V>>> c(Set<Map.Entry<K, Collection<V>>> set, hg<? super K, ? super V> hg2) {
        return new hl<K, V>(set, hg2);
    }

    private static <K, V> Collection<Map.Entry<K, V>> b(Collection<Map.Entry<K, V>> collection, hg<? super K, ? super V> hg2) {
        if (collection instanceof Set) {
            return hh.d((Set)collection, hg2);
        }
        return new hq<K, V>(collection, hg2);
    }

    private static <K, V> Set<Map.Entry<K, V>> d(Set<Map.Entry<K, V>> set, hg<? super K, ? super V> hg2) {
        return new hs<K, V>(set, hg2);
    }

    public static <K, V> av<K, V> a(av<K, V> av2, hg<? super K, ? super V> hg2) {
        return new hp<K, V>(av2, null, hg2);
    }

    private static <K, V> Collection<V> b(K k2, Iterable<? extends V> iterable, hg<? super K, ? super V> hg2) {
        ArrayList<V> arrayList = gO.a(iterable);
        for (V v2 : arrayList) {
            hg2.a(k2, v2);
        }
        return arrayList;
    }

    private static <K, V> Map<K, V> c(Map<? extends K, ? extends V> map, hg<? super K, ? super V> hg2) {
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<K, V>(map);
        for (Map.Entry<K, V> entry : linkedHashMap.entrySet()) {
            hg2.a(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    static /* synthetic */ Set a(Set set, hg hg2) {
        return hh.d(set, hg2);
    }

    static /* synthetic */ Map b(Map map, hg hg2) {
        return hh.c(map, hg2);
    }

    static /* synthetic */ Set b(Set set, hg hg2) {
        return hh.c(set, hg2);
    }

    static /* synthetic */ Collection a(Collection collection, hg hg2) {
        return hh.b(collection, hg2);
    }

    static /* synthetic */ Collection a(Object object, Iterable iterable, hg hg2) {
        return hh.b(object, iterable, hg2);
    }

    static /* synthetic */ Map.Entry a(Map.Entry entry, hg hg2) {
        return hh.c(entry, hg2);
    }

    static /* synthetic */ Map.Entry b(Map.Entry entry, hg hg2) {
        return hh.d(entry, hg2);
    }
}

