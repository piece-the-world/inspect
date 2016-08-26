/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.eT;
import com.growingio.a.a.d.eU;
import com.growingio.a.a.d.eV;
import com.growingio.a.a.d.eW;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lb;
import com.growingio.a.a.d.lw;
import com.growingio.a.a.d.mh;
import com.growingio.a.a.d.mj;
import com.growingio.a.a.d.mn;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class eS<K extends Comparable<?>, V>
implements lb<K, V>,
Serializable {
    private static final eS<Comparable<?>, Object> a = new eS(ea.<kW<K>>d(), ea.d());
    private final transient ea<kW<K>> b;
    private final transient ea<V> c;
    private static final long d = 0;

    public static <K extends Comparable<?>, V> eS<K, V> a() {
        return a;
    }

    public static <K extends Comparable<?>, V> eS<K, V> a(kW<K> kW2, V v2) {
        return new eS<K, V>(ea.a(kW2), ea.a(v2));
    }

    public static <K extends Comparable<?>, V> eS<K, V> a(lb<K, ? extends V> lb2) {
        if (lb2 instanceof eS) {
            return (eS)lb2;
        }
        Map<kW<K>, V> map = lb2.i();
        ec<kW<K>> ec2 = new ec<kW<K>>(map.size());
        ec<V> ec3 = new ec<V>(map.size());
        for (Map.Entry<kW<K>, V> entry : map.entrySet()) {
            ec2.c(entry.getKey());
            ec3.c(entry.getValue());
        }
        return new eS(ec2.b(), ec3.b());
    }

    public static <K extends Comparable<?>, V> eV<K, V> b() {
        return new eV();
    }

    eS(ea<kW<K>> ea2, ea<V> ea3) {
        this.b = ea2;
        this.c = ea3;
    }

    @Override
    public V a(K k2) {
        int n2 = mh.a(this.b, kW.a(), bw.b(k2), mn.a, mj.a);
        if (n2 == -1) {
            return null;
        }
        kW<K> kW2 = this.b.get(n2);
        return kW2.f(k2) ? (V)this.c.get(n2) : null;
    }

    @Override
    public Map.Entry<kW<K>, V> b(K k2) {
        int n2 = mh.a(this.b, kW.a(), bw.b(k2), mn.a, mj.a);
        if (n2 == -1) {
            return null;
        }
        kW<K> kW2 = this.b.get(n2);
        return kW2.f(k2) ? ii.a(kW2, this.c.get(n2)) : null;
    }

    @Override
    public kW<K> c() {
        if (this.b.isEmpty()) {
            throw new NoSuchElementException();
        }
        kW<K> kW2 = this.b.get(0);
        kW<K> kW3 = this.b.get(this.b.size() - 1);
        return kW.a(kW2.b, kW3.c);
    }

    @Override
    public void b(kW<K> kW2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(lb<K, V> lb2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(kW<K> kW2) {
        throw new UnsupportedOperationException();
    }

    public ei<kW<K>, V> e() {
        if (this.b.isEmpty()) {
            return ei.i();
        }
        lw lw2 = new lw(this.b, kW.a);
        return new fp(lw2, this.c);
    }

    public ei<kW<K>, V> f() {
        if (this.b.isEmpty()) {
            return ei.i();
        }
        lw<kW<K>> lw2 = new lw<kW<K>>(this.b.f(), kW.a.a());
        return new fp<kW<K>, V>(lw2, this.c.f());
    }

    @Override
    public eS<K, V> b(kW<K> kW2) {
        int n2;
        if (aU.a(kW2).j()) {
            return eS.a();
        }
        if (this.b.isEmpty() || kW2.a(this.c())) {
            return this;
        }
        int n3 = mh.a(this.b, kW.b(), kW2.b, mn.d, mj.b);
        if (n3 >= (n2 = mh.a(this.b, kW.a(), kW2.c, mn.a, mj.b))) {
            return eS.a();
        }
        int n4 = n3;
        int n5 = n2 - n3;
        eT eT2 = new eT(this, n5, n4, kW2);
        eS eS2 = this;
        return new eU(this, eT2, this.c.a(n3, n2), kW2, eS2);
    }

    @Override
    public int hashCode() {
        return this.e().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lb) {
            lb lb2 = (lb)object;
            return this.e().equals(lb2.i());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.e().toString();
    }

    Object g() {
        return new eW<K, V>(this.e());
    }

    @Override
    public /* synthetic */ lb c(kW kW2) {
        return this.b(kW2);
    }

    @Override
    public /* synthetic */ Map h() {
        return this.f();
    }

    @Override
    public /* synthetic */ Map i() {
        return this.e();
    }

    static /* synthetic */ ea a(eS eS2) {
        return eS2.b;
    }
}

