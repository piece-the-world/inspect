/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lb;
import com.growingio.a.a.d.oi;
import com.growingio.a.a.d.oj;
import com.growingio.a.a.d.ok;
import com.growingio.a.a.d.ol;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

public final class oh<K extends Comparable, V>
implements lb<K, V> {
    private final NavigableMap<bw<K>, ok<K, V>> a = ii.f();
    private static final lb b = new oi();

    public static <K extends Comparable, V> oh<K, V> a() {
        return new oh<K, V>();
    }

    private oh() {
    }

    @Override
    public V a(K k2) {
        Map.Entry<kW<K>, V> entry = this.b(k2);
        return entry == null ? null : (V)entry.getValue();
    }

    @Override
    public Map.Entry<kW<K>, V> b(K k2) {
        Map.Entry<bw<K>, ok<K, V>> entry = this.a.floorEntry(bw.b(k2));
        if (entry != null && entry.getValue().a(k2)) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public void b(kW<K> kW2, V v2) {
        if (!kW2.j()) {
            aU.a(v2);
            this.a(kW2);
            this.a.put(kW2.b, new ok<K, V>(kW2, v2));
        }
    }

    @Override
    public void b(lb<K, V> lb2) {
        for (Map.Entry<kW<K>, V> entry : lb2.i().entrySet()) {
            this.b(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void d() {
        this.a.clear();
    }

    @Override
    public kW<K> c() {
        Map.Entry<bw<K>, ok<K, V>> entry = this.a.firstEntry();
        Map.Entry<bw<K>, ok<K, V>> entry2 = this.a.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return kW.a(entry.getValue().a().b, entry2.getValue().a().c);
    }

    private void a(bw<K> bw2, bw<K> bw3, V v2) {
        this.a.put(bw2, new ok<K, V>(bw2, bw3, v2));
    }

    @Override
    public void a(kW<K> kW2) {
        Map.Entry entry;
        ok ok2;
        if (kW2.j()) {
            return;
        }
        Map.Entry entry2 = this.a.lowerEntry(kW2.b);
        if (entry2 != null && (entry = entry2.getValue()).c().a(kW2.b) > 0) {
            if (entry.c().a(kW2.c) > 0) {
                this.a(kW2.c, entry.c(), entry2.getValue().getValue());
            }
            this.a(entry.b(), kW2.b, entry2.getValue().getValue());
        }
        if ((entry = this.a.lowerEntry(kW2.c)) != null && (ok2 = (ok)entry.getValue()).c().a(kW2.c) > 0) {
            this.a(kW2.c, ok2.c(), ((ok)entry.getValue()).getValue());
            this.a.remove(kW2.b);
        }
        this.a.subMap(kW2.b, kW2.c).clear();
    }

    @Override
    public Map<kW<K>, V> i() {
        return new oj(this, this.a.values());
    }

    @Override
    public Map<kW<K>, V> h() {
        return new oj(this, this.a.descendingMap().values());
    }

    @Override
    public lb<K, V> c(kW<K> kW2) {
        if (kW2.equals(kW.c())) {
            return this;
        }
        return new ol(this, kW2);
    }

    private lb<K, V> b() {
        return b;
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
        return this.a.values().toString();
    }

    static /* synthetic */ NavigableMap a(oh oh2) {
        return oh2.a;
    }

    static /* synthetic */ lb b(oh oh2) {
        return oh2.b();
    }
}

