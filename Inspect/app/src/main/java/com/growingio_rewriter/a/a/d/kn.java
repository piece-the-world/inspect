/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kB;
import com.growingio.a.a.d.kD;
import com.growingio.a.a.d.kE;
import com.growingio.a.a.d.kF;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.ko;
import com.growingio.a.a.d.kq;
import com.growingio.a.a.d.ks;
import com.growingio.a.a.d.ku;
import com.growingio.a.a.d.kw;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.oR;
import com.growingio.a.a.m.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class kn {
    private static final kO<km<?>> a = new kw();

    private kn() {
    }

    public static <E> kl<E> a(kl<? extends E> kl2) {
        if (kl2 instanceof kF || kl2 instanceof eM) {
            kl<? extends E> kl3 = kl2;
            return kl3;
        }
        return new kF<E>(aU.a(kl2));
    }

    public static <E> kl<E> a(eM<E> eM2) {
        return aU.a(eM2);
    }

    public static <E> mu<E> a(mu<E> mu2) {
        return new oR<E>(aU.a(mu2));
    }

    public static <E> km<E> a(E e2, int n2) {
        return new kD<E>(e2, n2);
    }

    public static <E> kl<E> a(kl<E> kl2, aV<? super E> aV2) {
        if (kl2 instanceof kB) {
            kB kB2 = (kB)kl2;
            aV<? super E> aV3 = aW.a(kB2.b, aV2);
            return new kB<E>(kB2.a, aV3);
        }
        return new kB<E>(kl2, aV2);
    }

    static int a(Iterable<?> iterable) {
        if (iterable instanceof kl) {
            return ((kl)iterable).d().size();
        }
        return 11;
    }

    public static <E> kl<E> a(kl<? extends E> kl2, kl<? extends E> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        return new ko(kl2, kl3);
    }

    public static <E> kl<E> b(kl<E> kl2, kl<?> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        return new kq(kl2, kl3);
    }

    public static <E> kl<E> c(kl<? extends E> kl2, kl<? extends E> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        return new ks(kl2, kl3);
    }

    public static <E> kl<E> d(kl<E> kl2, kl<?> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        return new ku(kl2, kl3);
    }

    public static boolean e(kl<?> kl2, kl<?> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        for (km km2 : kl3.a()) {
            int n2 = kl2.a(km2.a());
            if (n2 >= km2.b()) continue;
            return false;
        }
        return true;
    }

    public static boolean f(kl<?> kl2, kl<?> kl3) {
        return kn.h(kl2, kl3);
    }

    private static <E> boolean h(kl<E> kl2, kl<?> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        Iterator<km<E>> iterator = kl2.a().iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            km<E> km2 = iterator.next();
            int n2 = kl3.a(km2.a());
            if (n2 == 0) {
                iterator.remove();
                bl2 = true;
                continue;
            }
            if (n2 >= km2.b()) continue;
            kl2.c(km2.a(), n2);
            bl2 = true;
        }
        return bl2;
    }

    public static boolean a(kl<?> kl2, Iterable<?> iterable) {
        if (iterable instanceof kl) {
            return kn.g(kl2, (kl)iterable);
        }
        aU.a(kl2);
        aU.a(iterable);
        boolean bl2 = false;
        for (Object obj : iterable) {
            bl2 |= kl2.remove(obj);
        }
        return bl2;
    }

    public static boolean g(kl<?> kl2, kl<?> kl3) {
        aU.a(kl2);
        aU.a(kl3);
        boolean bl2 = false;
        Iterator iterator = kl2.a().iterator();
        while (iterator.hasNext()) {
            km km2 = iterator.next();
            int n2 = kl3.a(km2.a());
            if (n2 >= km2.b()) {
                iterator.remove();
                bl2 = true;
                continue;
            }
            if (n2 <= 0) continue;
            kl2.b(km2.a(), n2);
            bl2 = true;
        }
        return bl2;
    }

    static boolean a(kl<?> kl2, Object object) {
        if (object == kl2) {
            return true;
        }
        if (object instanceof kl) {
            kl kl3 = (kl)object;
            if (kl2.size() != kl3.size() || kl2.a().size() != kl3.a().size()) {
                return false;
            }
            for (km km2 : kl3.a()) {
                if (kl2.a(km2.a()) == km2.b()) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    static <E> boolean a(kl<E> kl2, Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        if (collection instanceof kl) {
            kl<E> kl3 = kn.b(collection);
            for (km<E> km2 : kl3.a()) {
                kl2.a(km2.a(), km2.b());
            }
        } else {
            gb.a(kl2, collection.iterator());
        }
        return true;
    }

    static boolean b(kl<?> kl2, Collection<?> collection) {
        Collection collection2 = collection instanceof kl ? ((kl)collection).d() : collection;
        return kl2.d().removeAll(collection2);
    }

    static boolean c(kl<?> kl2, Collection<?> collection) {
        aU.a(collection);
        Collection collection2 = collection instanceof kl ? ((kl)collection).d() : collection;
        return kl2.d().retainAll(collection2);
    }

    static <E> int a(kl<E> kl2, E e2, int n2) {
        aK.a(n2, "count");
        int n3 = kl2.a(e2);
        int n4 = n2 - n3;
        if (n4 > 0) {
            kl2.a(e2, n4);
        } else if (n4 < 0) {
            kl2.b(e2, - n4);
        }
        return n3;
    }

    static <E> boolean a(kl<E> kl2, E e2, int n2, int n3) {
        aK.a(n2, "oldCount");
        aK.a(n3, "newCount");
        if (kl2.a(e2) == n2) {
            kl2.c(e2, n3);
            return true;
        }
        return false;
    }

    static <E> Iterator<E> b(kl<E> kl2) {
        return new kE<E>(kl2, kl2.a().iterator());
    }

    static int c(kl<?> kl2) {
        long l2 = 0;
        for (km km2 : kl2.a()) {
            l2 += (long)km2.b();
        }
        return q.b(l2);
    }

    static <T> kl<T> b(Iterable<T> iterable) {
        return (kl)iterable;
    }

    public static <E> eM<E> d(kl<E> kl2) {
        ea<km<E>> ea2 = a.b(kl2.a());
        return eM.a(ea2);
    }
}

