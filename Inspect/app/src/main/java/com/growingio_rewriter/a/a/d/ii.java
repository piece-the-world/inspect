/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aG;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dT;
import com.growingio.a.a.d.dU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.hC;
import com.growingio.a.a.d.hD;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.iA;
import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.iF;
import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iM;
import com.growingio.a.a.d.iO;
import com.growingio.a.a.d.iQ;
import com.growingio.a.a.d.iV;
import com.growingio.a.a.d.iW;
import com.growingio.a.a.d.iY;
import com.growingio.a.a.d.ij;
import com.growingio.a.a.d.ik;
import com.growingio.a.a.d.il;
import com.growingio.a.a.d.im;
import com.growingio.a.a.d.in;
import com.growingio.a.a.d.io;
import com.growingio.a.a.d.ip;
import com.growingio.a.a.d.iq;
import com.growingio.a.a.d.ir;
import com.growingio.a.a.d.is;
import com.growingio.a.a.d.it;
import com.growingio.a.a.d.iu;
import com.growingio.a.a.d.iv;
import com.growingio.a.a.d.ix;
import com.growingio.a.a.d.ja;
import com.growingio.a.a.d.jb;
import com.growingio.a.a.d.jc;
import com.growingio.a.a.d.jd;
import com.growingio.a.a.d.je;
import com.growingio.a.a.d.jg;
import com.growingio.a.a.d.jh;
import com.growingio.a.a.d.ji;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.mt;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

public final class ii {
    static final aG a = aL.a.c("=");

    private ii() {
    }

    static <K> aq<Map.Entry<K, ?>, K> a() {
        return iA.a;
    }

    static <V> aq<Map.Entry<?, V>, V> b() {
        return iA.b;
    }

    static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> iterator) {
        return gb.a(iterator, ii.<K>a());
    }

    static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> iterator) {
        return gb.a(iterator, ii.<V>b());
    }

    public static <K extends Enum<K>, V> ei<K, V> a(Map<K, ? extends V> map) {
        if (map instanceof dU) {
            dU dU2 = (dU)map;
            return dU2;
        }
        if (map.isEmpty()) {
            return ei.i();
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            aU.a(entry.getKey());
            aU.a(entry.getValue());
        }
        return dU.a(new EnumMap<K, V>(map));
    }

    public static <K, V> HashMap<K, V> c() {
        return new HashMap();
    }

    public static <K, V> HashMap<K, V> a(int n2) {
        return new HashMap(ii.b(n2));
    }

    static int b(int n2) {
        if (n2 < 3) {
            aK.a(n2, "expectedSize");
            return n2 + 1;
        }
        if (n2 < 1073741824) {
            return (int)((float)n2 / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> HashMap<K, V> b(Map<? extends K, ? extends V> map) {
        return new HashMap<K, V>(map);
    }

    public static <K, V> LinkedHashMap<K, V> d() {
        return new LinkedHashMap();
    }

    public static <K, V> LinkedHashMap<K, V> c(int n2) {
        return new LinkedHashMap(ii.b(n2));
    }

    public static <K, V> LinkedHashMap<K, V> c(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<K, V>(map);
    }

    public static <K, V> ConcurrentMap<K, V> e() {
        return new hE().h();
    }

    public static <K extends Comparable, V> TreeMap<K, V> f() {
        return new TreeMap();
    }

    public static <K, V> TreeMap<K, V> a(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<K, V>(sortedMap);
    }

    public static <C, K extends C, V> TreeMap<K, V> a(Comparator<C> comparator) {
        return new TreeMap(comparator);
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> a(Class<K> class_) {
        return new EnumMap(aU.a(class_));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> d(Map<K, ? extends V> map) {
        return new EnumMap<K, V>(map);
    }

    public static <K, V> IdentityHashMap<K, V> g() {
        return new IdentityHashMap();
    }

    public static <K, V> hC<K, V> a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        if (map instanceof SortedMap) {
            SortedMap sortedMap = (SortedMap)map;
            mt<? extends K, ? extends V> mt2 = ii.a(sortedMap, map2);
            return mt2;
        }
        return ii.a(map, map2, ab.b());
    }

    public static <K, V> hC<K, V> a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, ab<? super V> ab2) {
        aU.a(ab2);
        LinkedHashMap<K, V> linkedHashMap = ii.d();
        LinkedHashMap<? extends K, ? extends V> linkedHashMap2 = new LinkedHashMap<K, V>(map2);
        LinkedHashMap<K, V> linkedHashMap3 = ii.d();
        LinkedHashMap<K, V> linkedHashMap4 = ii.d();
        ii.a(map, map2, ab2, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        return new iV<K, V>(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
    }

    private static <K, V> void a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, ab<? super V> ab2, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, hD<V>> map6) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k2 = entry.getKey();
            V v2 = entry.getValue();
            if (map2.containsKey(k2)) {
                V v3 = map4.remove(k2);
                if (ab2.a(v2, v3)) {
                    map5.put(k2, v2);
                    continue;
                }
                map6.put(k2, ji.a(v2, v3));
                continue;
            }
            map3.put(k2, v2);
        }
    }

    private static <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap)map);
        }
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> mt<K, V> a(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        aU.a(sortedMap);
        aU.a(map);
        Comparator<K> comparator = ii.b(sortedMap.comparator());
        TreeMap<K, V> treeMap = ii.a(comparator);
        TreeMap<? extends K, ? extends V> treeMap2 = ii.a(comparator);
        treeMap2.putAll(map);
        TreeMap<K, V> treeMap3 = ii.a(comparator);
        TreeMap<K, V> treeMap4 = ii.a(comparator);
        ii.a(sortedMap, map, ab.b(), treeMap, treeMap2, treeMap3, treeMap4);
        return new ja<K, V>(treeMap, treeMap2, treeMap3, treeMap4);
    }

    static <E> Comparator<? super E> b(Comparator<? super E> comparator) {
        if (comparator != null) {
            return comparator;
        }
        return kO.d();
    }

    public static <K, V> Map<K, V> a(Set<K> set, aq<? super K, V> aq2) {
        return new iv<K, V>(set, aq2);
    }

    public static <K, V> SortedMap<K, V> a(SortedSet<K> sortedSet, aq<? super K, V> aq2) {
        return new iY<K, V>(sortedSet, aq2);
    }

    public static <K, V> NavigableMap<K, V> a(NavigableSet<K> navigableSet, aq<? super K, V> aq2) {
        return new iW<K, V>(navigableSet, aq2);
    }

    static <K, V> Iterator<Map.Entry<K, V>> b(Set<K> set, aq<? super K, V> aq2) {
        return new ij(set.iterator(), aq2);
    }

    private static <E> Set<E> c(Set<E> set) {
        return new im(set);
    }

    private static <E> SortedSet<E> b(SortedSet<E> sortedSet) {
        return new in(sortedSet);
    }

    private static <E> NavigableSet<E> b(NavigableSet<E> navigableSet) {
        return new io(navigableSet);
    }

    public static <K, V> ei<K, V> a(Iterable<K> iterable, aq<? super K, V> aq2) {
        return ii.a(iterable.iterator(), aq2);
    }

    public static <K, V> ei<K, V> a(Iterator<K> iterator, aq<? super K, V> aq2) {
        aU.a(aq2);
        LinkedHashMap<K, V> linkedHashMap = ii.d();
        while (iterator.hasNext()) {
            K k2 = iterator.next();
            linkedHashMap.put(k2, aq2.f(k2));
        }
        return ei.b(linkedHashMap);
    }

    public static <K, V> ei<K, V> b(Iterable<V> iterable, aq<? super V, K> aq2) {
        return ii.b(iterable.iterator(), aq2);
    }

    public static <K, V> ei<K, V> b(Iterator<V> iterator, aq<? super V, K> aq2) {
        aU.a(aq2);
        ek<K, V> ek2 = ei.j();
        while (iterator.hasNext()) {
            V v2 = iterator.next();
            ek2.b(aq2.f(v2), v2);
        }
        try {
            return ek2.b();
        }
        catch (IllegalArgumentException var3_4) {
            throw new IllegalArgumentException(var3_4.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static ei<String, String> a(Properties properties) {
        ek<String, String> ek2 = ei.j();
        Enumeration enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            ek2.b(string, properties.getProperty(string));
        }
        return ek2.b();
    }

    public static <K, V> Map.Entry<K, V> a(K k2, V v2) {
        return new dT<K, V>(k2, v2);
    }

    static <K, V> Set<Map.Entry<K, V>> a(Set<Map.Entry<K, V>> set) {
        return new jg<K, V>(Collections.unmodifiableSet(set));
    }

    static <K, V> Map.Entry<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
        aU.a(entry);
        return new ip(entry);
    }

    static <K, V> oP<Map.Entry<K, V>> c(Iterator<Map.Entry<K, V>> iterator) {
        return new iq(iterator);
    }

    public static <A, B> R<A, B> a(av<A, B> av2) {
        return new ix<A, B>(av2);
    }

    public static <K, V> av<K, V> b(av<K, V> av2) {
        return na.a(av2, (Object)null);
    }

    public static <K, V> av<K, V> c(av<? extends K, ? extends V> av2) {
        return new je<K, V>(av2, null);
    }

    public static <K, V1, V2> Map<K, V2> a(Map<K, V1> map, aq<? super V1, V2> aq2) {
        return ii.a(map, ii.a(aq2));
    }

    public static <K, V1, V2> SortedMap<K, V2> a(SortedMap<K, V1> sortedMap, aq<? super V1, V2> aq2) {
        return ii.a(sortedMap, ii.a(aq2));
    }

    public static <K, V1, V2> NavigableMap<K, V2> a(NavigableMap<K, V1> navigableMap, aq<? super V1, V2> aq2) {
        return ii.a(navigableMap, ii.a(aq2));
    }

    public static <K, V1, V2> Map<K, V2> a(Map<K, V1> map, iE<? super K, ? super V1, V2> iE2) {
        return new jb<K, V1, V2>(map, iE2);
    }

    public static <K, V1, V2> SortedMap<K, V2> a(SortedMap<K, V1> sortedMap, iE<? super K, ? super V1, V2> iE2) {
        return new jd<K, V1, V2>(sortedMap, iE2);
    }

    public static <K, V1, V2> NavigableMap<K, V2> a(NavigableMap<K, V1> navigableMap, iE<? super K, ? super V1, V2> iE2) {
        return new jc<K, V1, V2>(navigableMap, iE2);
    }

    static <K, V1, V2> iE<K, V1, V2> a(aq<? super V1, V2> aq2) {
        aU.a(aq2);
        return new ir(aq2);
    }

    static <K, V1, V2> aq<V1, V2> a(iE<? super K, V1, V2> iE2, K k2) {
        aU.a(iE2);
        return new is(iE2, k2);
    }

    static <K, V1, V2> aq<Map.Entry<K, V1>, V2> a(iE<? super K, ? super V1, V2> iE2) {
        aU.a(iE2);
        return new it(iE2);
    }

    static <V2, K, V1> Map.Entry<K, V2> a(iE<? super K, ? super V1, V2> iE2, Map.Entry<K, V1> entry) {
        aU.a(iE2);
        aU.a(entry);
        return new ik(entry, iE2);
    }

    static <K, V1, V2> aq<Map.Entry<K, V1>, Map.Entry<K, V2>> b(iE<? super K, ? super V1, V2> iE2) {
        aU.a(iE2);
        return new il(iE2);
    }

    static <K> aV<Map.Entry<K, ?>> a(aV<? super K> aV2) {
        return aW.a(aV2, ii.<K>a());
    }

    static <V> aV<Map.Entry<?, V>> b(aV<? super V> aV2) {
        return aW.a(aV2, ii.<V>b());
    }

    public static <K, V> Map<K, V> a(Map<K, V> map, aV<? super K> aV2) {
        aU.a(aV2);
        aV aV3 = ii.a(aV2);
        return map instanceof iu ? ii.a((iu)map, aV3) : new iQ<K, V>(aU.a(map), aV2, aV3);
    }

    public static <K, V> SortedMap<K, V> a(SortedMap<K, V> sortedMap, aV<? super K> aV2) {
        return ii.c(sortedMap, ii.a(aV2));
    }

    public static <K, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap, aV<? super K> aV2) {
        return ii.c(navigableMap, ii.a(aV2));
    }

    public static <K, V> av<K, V> a(av<K, V> av2, aV<? super K> aV2) {
        aU.a(aV2);
        return ii.c(av2, ii.a(aV2));
    }

    public static <K, V> Map<K, V> b(Map<K, V> map, aV<? super V> aV2) {
        return ii.c(map, ii.b(aV2));
    }

    public static <K, V> SortedMap<K, V> b(SortedMap<K, V> sortedMap, aV<? super V> aV2) {
        return ii.c(sortedMap, ii.b(aV2));
    }

    public static <K, V> NavigableMap<K, V> b(NavigableMap<K, V> navigableMap, aV<? super V> aV2) {
        return ii.c(navigableMap, ii.b(aV2));
    }

    public static <K, V> av<K, V> b(av<K, V> av2, aV<? super V> aV2) {
        return ii.c(av2, ii.b(aV2));
    }

    public static <K, V> Map<K, V> c(Map<K, V> map, aV<? super Map.Entry<K, V>> aV2) {
        aU.a(aV2);
        return map instanceof iu ? ii.a((iu)map, aV2) : new iH<K, V>(aU.a(map), aV2);
    }

    public static <K, V> SortedMap<K, V> c(SortedMap<K, V> sortedMap, aV<? super Map.Entry<K, V>> aV2) {
        aU.a(aV2);
        return sortedMap instanceof iO ? ii.a((iO)sortedMap, aV2) : new iO<K, V>(aU.a(sortedMap), aV2);
    }

    public static <K, V> NavigableMap<K, V> c(NavigableMap<K, V> navigableMap, aV<? super Map.Entry<K, V>> aV2) {
        aU.a(aV2);
        return navigableMap instanceof iM ? ii.a((iM)navigableMap, aV2) : new iM<K, V>(aU.a(navigableMap), aV2);
    }

    public static <K, V> av<K, V> c(av<K, V> av2, aV<? super Map.Entry<K, V>> aV2) {
        aU.a(av2);
        aU.a(aV2);
        return av2 instanceof iF ? ii.a((iF)av2, aV2) : new iF<K, V>(av2, aV2);
    }

    private static <K, V> Map<K, V> a(iu<K, V> iu2, aV<? super Map.Entry<K, V>> aV2) {
        return new iH(iu2.a, aW.a(iu2.b, aV2));
    }

    private static <K, V> SortedMap<K, V> a(iO<K, V> iO2, aV<? super Map.Entry<K, V>> aV2) {
        aV<? super Map.Entry<K, V>> aV3 = aW.a(iO2.b, aV2);
        return new iO<K, V>(iO2.c(), aV3);
    }

    private static <K, V> NavigableMap<K, V> a(iM<K, V> iM2, aV<? super Map.Entry<K, V>> aV2) {
        aV<? super Map.Entry<K, V>> aV3 = aW.a(iM.a(iM2), aV2);
        return new iM(iM.b(iM2), aV3);
    }

    private static <K, V> av<K, V> a(iF<K, V> iF2, aV<? super Map.Entry<K, V>> aV2) {
        aV<? super Map.Entry<K, V>> aV3 = aW.a(iF2.b, aV2);
        return new iF<K, V>(iF2.d(), aV3);
    }

    public static <K, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap) {
        aU.a(navigableMap);
        if (navigableMap instanceof jh) {
            return navigableMap;
        }
        return new jh<K, V>(navigableMap);
    }

    private static <K, V> Map.Entry<K, V> e(Map.Entry<K, V> entry) {
        return entry == null ? null : ii.a(entry);
    }

    public static <K, V> NavigableMap<K, V> b(NavigableMap<K, V> navigableMap) {
        return na.a(navigableMap);
    }

    static <V> V a(Map<?, V> map, Object object) {
        aU.a(map);
        try {
            return map.get(object);
        }
        catch (ClassCastException var2_2) {
            return null;
        }
        catch (NullPointerException var2_3) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, Object object) {
        aU.a(map);
        try {
            return map.containsKey(object);
        }
        catch (ClassCastException var2_2) {
            return false;
        }
        catch (NullPointerException var2_3) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object object) {
        aU.a(map);
        try {
            return map.remove(object);
        }
        catch (ClassCastException var2_2) {
            return null;
        }
        catch (NullPointerException var2_3) {
            return null;
        }
    }

    static boolean d(Map<?, ?> map, Object object) {
        return gb.a(ii.a(map.entrySet().iterator()), object);
    }

    static boolean e(Map<?, ?> map, Object object) {
        return gb.a(ii.b(map.entrySet().iterator()), object);
    }

    static <K, V> boolean a(Collection<Map.Entry<K, V>> collection, Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(ii.a((Map.Entry)object));
    }

    static <K, V> boolean b(Collection<Map.Entry<K, V>> collection, Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(ii.a((Map.Entry)object));
    }

    static boolean f(Map<?, ?> map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            Map map2 = (Map)object;
            return map.entrySet().equals(map2.entrySet());
        }
        return false;
    }

    static String e(Map<?, ?> map) {
        StringBuilder stringBuilder = aL.a(map.size()).append('{');
        a.a(stringBuilder, map);
        return stringBuilder.append('}').toString();
    }

    static <K, V> void b(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<K, V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static <K> K b(Map.Entry<K, ?> entry) {
        return entry == null ? null : (K)entry.getKey();
    }

    static <V> V c(Map.Entry<?, V> entry) {
        return entry == null ? null : (V)entry.getValue();
    }

    static <E> ei<E, Integer> a(Collection<E> collection) {
        ek<E, Integer> ek2 = new ek<E, Integer>(collection.size());
        int n2 = 0;
        for (E e2 : collection) {
            ek2.b(e2, n2++);
        }
        return ek2.b();
    }

    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap, kW<K> kW2) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != kO.d() && kW2.d() && kW2.g()) {
            aU.a(navigableMap.comparator().compare(kW2.e(), kW2.h()) <= 0, (Object)"map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (kW2.d() && kW2.g()) {
            return navigableMap.subMap(kW2.e(), kW2.f() == aD.b, kW2.h(), kW2.i() == aD.b);
        }
        if (kW2.d()) {
            return navigableMap.tailMap(kW2.e(), kW2.f() == aD.b);
        }
        if (kW2.g()) {
            return navigableMap.headMap(kW2.h(), kW2.i() == aD.b);
        }
        return aU.a(navigableMap);
    }

    static /* synthetic */ Map f(Map map) {
        return ii.g(map);
    }

    static /* synthetic */ Set b(Set set) {
        return ii.c(set);
    }

    static /* synthetic */ SortedSet a(SortedSet sortedSet) {
        return ii.b(sortedSet);
    }

    static /* synthetic */ NavigableSet a(NavigableSet navigableSet) {
        return ii.b(navigableSet);
    }

    static /* synthetic */ Map.Entry d(Map.Entry entry) {
        return ii.e(entry);
    }
}

