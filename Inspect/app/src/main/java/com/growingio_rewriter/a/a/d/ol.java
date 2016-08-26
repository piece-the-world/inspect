/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lb;
import com.growingio.a.a.d.oh;
import com.growingio.a.a.d.ok;
import com.growingio.a.a.d.om;
import com.growingio.a.a.d.oo;
import java.util.Map;
import java.util.NoSuchElementException;

class ol
implements lb<K, V> {
    private final kW<K> b;
    final /* synthetic */ oh a;

    ol(kW<K> var1_1) {
        this.a = var1_1;
        this.b = kW2;
    }

    @Override
    public V a(K k2) {
        return this.b.f(k2) ? (V)this.a.a(k2) : null;
    }

    @Override
    public Map.Entry<kW<K>, V> b(K k2) {
        Map.Entry entry;
        if (this.b.f(k2) && (entry = this.a.b(k2)) != null) {
            return ii.a(entry.getKey().c(this.b), entry.getValue());
        }
        return null;
    }

    @Override
    public kW<K> c() {
        bw bw2;
        Map.Entry entry = oh.a(this.a).floorEntry(this.b.b);
        if (entry != null && ((ok)entry.getValue()).c().a(this.b.b) > 0) {
            bw2 = this.b.b;
        } else {
            bw2 = oh.a(this.a).ceilingKey(this.b.b);
            if (bw2 == null || bw2.a(this.b.c) >= 0) {
                throw new NoSuchElementException();
            }
        }
        Map.Entry entry2 = oh.a(this.a).lowerEntry(this.b.c);
        if (entry2 == null) {
            throw new NoSuchElementException();
        }
        bw bw3 = ((ok)entry2.getValue()).c().a(this.b.c) >= 0 ? this.b.c : ((ok)entry2.getValue()).c();
        return kW.a(bw2, bw3);
    }

    @Override
    public void b(kW<K> kW2, V v2) {
        aU.a(this.b.a(kW2), "Cannot put range %s into a subRangeMap(%s)", kW2, this.b);
        this.a.b(kW2, v2);
    }

    @Override
    public void b(lb<K, V> lb2) {
        if (lb2.i().isEmpty()) {
            return;
        }
        kW<K> kW2 = lb2.c();
        aU.a(this.b.a(kW2), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", kW2, this.b);
        this.a.b(lb2);
    }

    @Override
    public void d() {
        this.a.a(this.b);
    }

    @Override
    public void a(kW<K> kW2) {
        if (kW2.b(this.b)) {
            this.a.a(kW2.c(this.b));
        }
    }

    @Override
    public lb<K, V> c(kW<K> kW2) {
        if (!kW2.b(this.b)) {
            return oh.b(this.a);
        }
        return this.a.c(kW2.c(this.b));
    }

    @Override
    public Map<kW<K>, V> i() {
        return new oo(this);
    }

    @Override
    public Map<kW<K>, V> h() {
        return new om(this);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lb) {
            lb lb2 = (lb)object;
            return this.i().equals(lb2.i());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.i().hashCode();
    }

    @Override
    public String toString() {
        return this.i().toString();
    }

    static /* synthetic */ kW a(ol ol2) {
        return ol2.b;
    }
}

