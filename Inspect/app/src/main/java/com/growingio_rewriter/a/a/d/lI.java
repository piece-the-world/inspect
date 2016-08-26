/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.dX;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lJ;
import com.growingio.a.a.d.lK;
import com.growingio.a.a.d.lL;
import com.growingio.a.a.d.lM;
import com.growingio.a.a.d.lO;
import com.growingio.a.a.d.lR;
import com.growingio.a.a.d.lS;
import com.growingio.a.a.d.lT;
import com.growingio.a.a.d.lV;
import com.growingio.a.a.d.lX;
import com.growingio.a.a.d.ma;
import com.growingio.a.a.d.na;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public final class lI {
    private lI() {
    }

    public static /* varargs */ <E extends Enum<E>> fg<E> a(E e2, E ... arrE) {
        return dX.a(EnumSet.of(e2, arrE));
    }

    public static <E extends Enum<E>> fg<E> a(Iterable<E> iterable) {
        if (iterable instanceof dX) {
            return (dX)iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            if (collection.isEmpty()) {
                return fg.k();
            }
            return dX.a(EnumSet.copyOf(collection));
        }
        Iterator<E> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            EnumSet<Enum> enumSet = EnumSet.of((Enum)iterator.next());
            gb.a(enumSet, iterator);
            return dX.a(enumSet);
        }
        return fg.k();
    }

    public static <E extends Enum<E>> EnumSet<E> a(Iterable<E> iterable, Class<E> class_) {
        EnumSet<E> enumSet = EnumSet.noneOf(class_);
        fL.a(enumSet, iterable);
        return enumSet;
    }

    public static <E> HashSet<E> a() {
        return new HashSet();
    }

    public static /* varargs */ <E> HashSet<E> a(E ... arrE) {
        HashSet<E> hashSet = lI.a(arrE.length);
        Collections.addAll(hashSet, arrE);
        return hashSet;
    }

    public static <E> HashSet<E> a(int n2) {
        return new HashSet(ii.b(n2));
    }

    public static <E> HashSet<E> b(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<E>(aL.a(iterable)) : lI.a(iterable.iterator());
    }

    public static <E> HashSet<E> a(Iterator<? extends E> iterator) {
        HashSet<E> hashSet = lI.a();
        gb.a(hashSet, iterator);
        return hashSet;
    }

    public static <E> Set<E> b() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> c(Iterable<? extends E> iterable) {
        Set<E> set = lI.b();
        fL.a(set, iterable);
        return set;
    }

    public static <E> LinkedHashSet<E> c() {
        return new LinkedHashSet();
    }

    public static <E> LinkedHashSet<E> b(int n2) {
        return new LinkedHashSet(ii.b(n2));
    }

    public static <E> LinkedHashSet<E> d(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<E>(aL.a(iterable));
        }
        LinkedHashSet<E> linkedHashSet = lI.c();
        fL.a(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> d() {
        return new TreeSet();
    }

    public static <E extends Comparable> TreeSet<E> e(Iterable<? extends E> iterable) {
        TreeSet<E> treeSet = lI.d();
        fL.a(treeSet, iterable);
        return treeSet;
    }

    public static <E> TreeSet<E> a(Comparator<? super E> comparator) {
        return new TreeSet<E>(aU.a(comparator));
    }

    public static <E> Set<E> e() {
        return Collections.newSetFromMap(ii.g());
    }

    public static <E> CopyOnWriteArraySet<E> f() {
        return new CopyOnWriteArraySet();
    }

    public static <E> CopyOnWriteArraySet<E> f(Iterable<? extends E> iterable) {
        Collection<? extends E> collection = iterable instanceof Collection ? aL.a(iterable) : gO.a(iterable);
        return new CopyOnWriteArraySet<E>(collection);
    }

    public static <E extends Enum<E>> EnumSet<E> a(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet)collection);
        }
        aU.a(!collection.isEmpty(), (Object)"collection is empty; use the other version of this method");
        Class class_ = ((Enum)collection.iterator().next()).getDeclaringClass();
        return lI.b(collection, class_);
    }

    public static <E extends Enum<E>> EnumSet<E> a(Collection<E> collection, Class<E> class_) {
        aU.a(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet)collection) : lI.b(collection, class_);
    }

    private static <E extends Enum<E>> EnumSet<E> b(Collection<E> collection, Class<E> class_) {
        EnumSet<E> enumSet = EnumSet.allOf(class_);
        enumSet.removeAll(collection);
        return enumSet;
    }

    public static <E> Set<E> a(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E> lX<E> a(Set<? extends E> set, Set<? extends E> set2) {
        aU.a(set, (Object)"set1");
        aU.a(set2, (Object)"set2");
        lX<? extends E> lX2 = lI.c(set2, set);
        return new lJ(set, lX2, set2);
    }

    public static <E> lX<E> b(Set<E> set, Set<?> set2) {
        aU.a(set, (Object)"set1");
        aU.a(set2, (Object)"set2");
        aV aV2 = aW.a(set2);
        return new lK(set, aV2, set2);
    }

    public static <E> lX<E> c(Set<E> set, Set<?> set2) {
        aU.a(set, (Object)"set1");
        aU.a(set2, (Object)"set2");
        aV aV2 = aW.a(aW.a(set2));
        return new lL(set, aV2, set2);
    }

    public static <E> lX<E> d(Set<? extends E> set, Set<? extends E> set2) {
        aU.a(set, (Object)"set1");
        aU.a(set2, (Object)"set2");
        return new lM(set, set2);
    }

    public static <E> Set<E> a(Set<E> set, aV<? super E> aV2) {
        if (set instanceof SortedSet) {
            return lI.a((SortedSet)set, aV2);
        }
        if (set instanceof lS) {
            lS lS2 = (lS)set;
            aV<? super E> aV3 = aW.a(lS2.b, aV2);
            return new lS<E>((Set)lS2.a, aV3);
        }
        return new lS<E>(aU.a(set), aU.a(aV2));
    }

    public static <E> SortedSet<E> a(SortedSet<E> sortedSet, aV<? super E> aV2) {
        if (sortedSet instanceof lS) {
            lS lS2 = (lS)((Object)sortedSet);
            aV<? super E> aV3 = aW.a(lS2.b, aV2);
            return new lT<E>((SortedSet)lS2.a, aV3);
        }
        return new lT<E>(aU.a(sortedSet), aU.a(aV2));
    }

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet, aV<? super E> aV2) {
        if (navigableSet instanceof lS) {
            lS lS2 = (lS)((Object)navigableSet);
            aV<? super E> aV3 = aW.a(lS2.b, aV2);
            return new lR<E>((NavigableSet)lS2.a, aV3);
        }
        return new lR<E>(aU.a(navigableSet), aU.a(aV2));
    }

    public static <B> Set<List<B>> a(List<? extends Set<? extends B>> list) {
        return lO.a(list);
    }

    public static /* varargs */ <B> Set<List<B>> a(Set<? extends B> ... arrset) {
        return lI.a(Arrays.asList(arrset));
    }

    public static <E> Set<Set<E>> a(Set<E> set) {
        return new lV<E>(set);
    }

    static int b(Set<?> set) {
        int n2 = 0;
        for (Object obj : set) {
            n2 += obj != null ? obj.hashCode() : 0;
            n2 = ~ (~ n2);
        }
        return n2;
    }

    static boolean a(Set<?> set, Object object) {
        if (set == object) {
            return true;
        }
        if (object instanceof Set) {
            Set set2 = (Set)object;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            }
            catch (NullPointerException var3_3) {
                return false;
            }
            catch (ClassCastException var3_4) {
                return false;
            }
        }
        return false;
    }

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet) {
        if (navigableSet instanceof fz || navigableSet instanceof ma) {
            return navigableSet;
        }
        return new ma<E>(navigableSet);
    }

    public static <E> NavigableSet<E> b(NavigableSet<E> navigableSet) {
        return na.a(navigableSet);
    }

    static boolean a(Set<?> set, Iterator<?> iterator) {
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= set.remove(iterator.next());
        }
        return bl2;
    }

    static boolean a(Set<?> set, Collection<?> collection) {
        aU.a(collection);
        if (collection instanceof kl) {
            collection = ((kl)collection).d();
        }
        if (collection instanceof Set && collection.size() > set.size()) {
            return gb.a(set.iterator(), collection);
        }
        return lI.a(set, collection.iterator());
    }

    public static <K extends Comparable<? super K>> NavigableSet<K> a(NavigableSet<K> navigableSet, kW<K> kW2) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != kO.d() && kW2.d() && kW2.g()) {
            aU.a(navigableSet.comparator().compare(kW2.e(), kW2.h()) <= 0, (Object)"set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (kW2.d() && kW2.g()) {
            return navigableSet.subSet(kW2.e(), kW2.f() == aD.b, kW2.h(), kW2.i() == aD.b);
        }
        if (kW2.d()) {
            return navigableSet.tailSet(kW2.e(), kW2.f() == aD.b);
        }
        if (kW2.g()) {
            return navigableSet.headSet(kW2.h(), kW2.i() == aD.b);
        }
        return aU.a(navigableSet);
    }
}

