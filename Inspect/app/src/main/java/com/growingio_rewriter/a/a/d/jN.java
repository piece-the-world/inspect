/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cm;
import com.growingio.a.a.d.cn;
import com.growingio.a.a.d.co;
import com.growingio.a.a.d.cs;
import com.growingio.a.a.d.cu;
import com.growingio.a.a.d.cw;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eg;
import com.growingio.a.a.d.eh;
import com.growingio.a.a.d.fl;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jR;
import com.growingio.a.a.d.jS;
import com.growingio.a.a.d.jT;
import com.growingio.a.a.d.jU;
import com.growingio.a.a.d.jf;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.ka;
import com.growingio.a.a.d.kd;
import com.growingio.a.a.d.ke;
import com.growingio.a.a.d.kg;
import com.growingio.a.a.d.kh;
import com.growingio.a.a.d.kj;
import com.growingio.a.a.d.kk;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import com.growingio.a.a.d.na;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public final class jN {
    private jN() {
    }

    public static <K, V> jr<K, V> a(Map<K, Collection<V>> map, bG<? extends Collection<V>> bG2) {
        return new jS<K, V>(map, bG2);
    }

    public static <K, V> gN<K, V> b(Map<K, Collection<V>> map, bG<? extends List<V>> bG2) {
        return new jR<K, V>(map, bG2);
    }

    public static <K, V> lH<K, V> c(Map<K, Collection<V>> map, bG<? extends Set<V>> bG2) {
        return new jT<K, V>(map, bG2);
    }

    public static <K, V> mz<K, V> d(Map<K, Collection<V>> map, bG<? extends SortedSet<V>> bG2) {
        return new jU<K, V>(map, bG2);
    }

    public static <K, V, M extends jr<K, V>> M a(jr<? extends V, ? extends K> jr2, M m2) {
        aU.a(m2);
        for (Map.Entry<V, K> entry : jr2.l()) {
            m2.a(entry.getValue(), entry.getKey());
        }
        return m2;
    }

    public static <K, V> jr<K, V> a(jr<K, V> jr2) {
        return na.a(jr2, (Object)null);
    }

    public static <K, V> jr<K, V> b(jr<K, V> jr2) {
        if (jr2 instanceof kh || jr2 instanceof eD) {
            return jr2;
        }
        return new kh<K, V>(jr2);
    }

    public static <K, V> jr<K, V> a(eD<K, V> eD2) {
        return aU.a(eD2);
    }

    public static <K, V> lH<K, V> a(lH<K, V> lH2) {
        return na.a(lH2, (Object)null);
    }

    public static <K, V> lH<K, V> b(lH<K, V> lH2) {
        if (lH2 instanceof kj || lH2 instanceof fl) {
            return lH2;
        }
        return new kj<K, V>(lH2);
    }

    public static <K, V> lH<K, V> a(fl<K, V> fl2) {
        return aU.a(fl2);
    }

    public static <K, V> mz<K, V> a(mz<K, V> mz2) {
        return na.a(mz2, (Object)null);
    }

    public static <K, V> mz<K, V> b(mz<K, V> mz2) {
        if (mz2 instanceof kk) {
            return mz2;
        }
        return new kk<K, V>(mz2);
    }

    public static <K, V> gN<K, V> a(gN<K, V> gN2) {
        return na.a(gN2, (Object)null);
    }

    public static <K, V> gN<K, V> b(gN<K, V> gN2) {
        if (gN2 instanceof kg || gN2 instanceof eg) {
            return gN2;
        }
        return new kg<K, V>(gN2);
    }

    public static <K, V> gN<K, V> a(eg<K, V> eg2) {
        return aU.a(eg2);
    }

    private static <V> Collection<V> c(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List)collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    private static <K, V> Collection<Map.Entry<K, V>> d(Collection<Map.Entry<K, V>> collection) {
        if (collection instanceof Set) {
            return ii.a((Set)collection);
        }
        return new jf<K, V>(Collections.unmodifiableCollection(collection));
    }

    public static <K, V> Map<K, List<V>> c(gN<K, V> gN2) {
        return gN2.c();
    }

    public static <K, V> Map<K, Set<V>> c(lH<K, V> lH2) {
        return lH2.c();
    }

    public static <K, V> Map<K, SortedSet<V>> c(mz<K, V> mz2) {
        return mz2.c();
    }

    public static <K, V> Map<K, Collection<V>> c(jr<K, V> jr2) {
        return jr2.c();
    }

    public static <K, V> lH<K, V> a(Map<K, V> map) {
        return new ka<K, V>(map);
    }

    public static <K, V1, V2> jr<K, V2> a(jr<K, V1> jr2, aq<? super V1, V2> aq2) {
        aU.a(aq2);
        iE iE2 = ii.a(aq2);
        return jN.a(jr2, iE2);
    }

    public static <K, V1, V2> jr<K, V2> a(jr<K, V1> jr2, iE<? super K, ? super V1, V2> iE2) {
        return new ke<K, V1, V2>(jr2, iE2);
    }

    public static <K, V1, V2> gN<K, V2> a(gN<K, V1> gN2, aq<? super V1, V2> aq2) {
        aU.a(aq2);
        iE iE2 = ii.a(aq2);
        return jN.a(gN2, iE2);
    }

    public static <K, V1, V2> gN<K, V2> a(gN<K, V1> gN2, iE<? super K, ? super V1, V2> iE2) {
        return new kd<K, V1, V2>(gN2, iE2);
    }

    public static <K, V> eg<K, V> a(Iterable<V> iterable, aq<? super V, K> aq2) {
        return jN.a(iterable.iterator(), aq2);
    }

    public static <K, V> eg<K, V> a(Iterator<V> iterator, aq<? super V, K> aq2) {
        aU.a(aq2);
        eh<K, V> eh2 = eg.b();
        while (iterator.hasNext()) {
            V v2 = iterator.next();
            aU.a(v2, iterator);
            eh2.a(aq2.f(v2), v2);
        }
        return eh2.a();
    }

    public static <K, V> jr<K, V> a(jr<K, V> jr2, aV<? super K> aV2) {
        if (jr2 instanceof lH) {
            return jN.a((lH)jr2, aV2);
        }
        if (jr2 instanceof gN) {
            return jN.a((gN)jr2, aV2);
        }
        if (jr2 instanceof co) {
            co co2 = (co)jr2;
            return new co(co2.a, aW.a(co2.b, aV2));
        }
        if (jr2 instanceof cu) {
            cu cu2 = (cu)jr2;
            return jN.a(cu2, ii.a(aV2));
        }
        return new co<K, V>(jr2, aV2);
    }

    public static <K, V> lH<K, V> a(lH<K, V> lH2, aV<? super K> aV2) {
        if (lH2 instanceof cs) {
            cs cs2 = (cs)lH2;
            return new cs(cs2.e(), aW.a(cs2.b, aV2));
        }
        if (lH2 instanceof cw) {
            cw cw2 = (cw)lH2;
            return jN.a(cw2, ii.a(aV2));
        }
        return new cs<K, V>(lH2, aV2);
    }

    public static <K, V> gN<K, V> a(gN<K, V> gN2, aV<? super K> aV2) {
        if (gN2 instanceof cn) {
            cn cn2 = (cn)gN2;
            return new cn(cn2.d(), aW.a(cn2.b, aV2));
        }
        return new cn<K, V>(gN2, aV2);
    }

    public static <K, V> jr<K, V> b(jr<K, V> jr2, aV<? super V> aV2) {
        return jN.c(jr2, ii.b(aV2));
    }

    public static <K, V> lH<K, V> b(lH<K, V> lH2, aV<? super V> aV2) {
        return jN.c(lH2, ii.b(aV2));
    }

    public static <K, V> jr<K, V> c(jr<K, V> jr2, aV<? super Map.Entry<K, V>> aV2) {
        aU.a(aV2);
        if (jr2 instanceof lH) {
            return jN.c((lH)jr2, aV2);
        }
        return jr2 instanceof cu ? jN.a((cu)jr2, aV2) : new cc<K, V>(aU.a(jr2), aV2);
    }

    public static <K, V> lH<K, V> c(lH<K, V> lH2, aV<? super Map.Entry<K, V>> aV2) {
        aU.a(aV2);
        return lH2 instanceof cw ? jN.a((cw)lH2, aV2) : new cm<K, V>(aU.a(lH2), aV2);
    }

    private static <K, V> jr<K, V> a(cu<K, V> cu2, aV<? super Map.Entry<K, V>> aV2) {
        aV<? super Map.Entry<K, V>> aV3 = aW.a(cu2.b(), aV2);
        return new cc<K, V>(cu2.a(), aV3);
    }

    private static <K, V> lH<K, V> a(cw<K, V> cw2, aV<? super Map.Entry<K, V>> aV2) {
        aV<? super Map.Entry<K, V>> aV3 = aW.a(cw2.b(), aV2);
        return new cm<K, V>(cw2.e(), aV3);
    }

    static boolean a(jr<?, ?> jr2, Object object) {
        if (object == jr2) {
            return true;
        }
        if (object instanceof jr) {
            jr jr3 = (jr)object;
            return jr2.c().equals(jr3.c());
        }
        return false;
    }

    static /* synthetic */ Collection a(Collection collection) {
        return jN.c(collection);
    }

    static /* synthetic */ Collection b(Collection collection) {
        return jN.d(collection);
    }
}

