/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.d.V;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oA;
import com.growingio.a.a.d.oy;
import com.growingio.a.a.d.oz;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

final class ox<C extends Comparable<?>>
extends V<bw<C>, kW<C>> {
    private final NavigableMap<bw<C>, kW<C>> a;
    private final NavigableMap<bw<C>, kW<C>> b;
    private final kW<bw<C>> c;

    ox(NavigableMap<bw<C>, kW<C>> navigableMap) {
        this(navigableMap, kW.c());
    }

    private ox(NavigableMap<bw<C>, kW<C>> navigableMap, kW<bw<C>> kW2) {
        this.a = navigableMap;
        this.b = new oA<C>(navigableMap);
        this.c = kW2;
    }

    private NavigableMap<bw<C>, kW<C>> a(kW<bw<C>> kW2) {
        if (!this.c.b(kW2)) {
            return fp.d();
        }
        kW2 = kW2.c(this.c);
        return new ox<C>(this.a, kW2);
    }

    public NavigableMap<bw<C>, kW<C>> a(bw<C> bw2, boolean bl2, bw<C> bw3, boolean bl3) {
        return this.a(kW.a(bw2, aD.a(bl2), bw3, aD.a(bl3)));
    }

    public NavigableMap<bw<C>, kW<C>> a(bw<C> bw2, boolean bl2) {
        return this.a(kW.a(bw2, aD.a(bl2)));
    }

    public NavigableMap<bw<C>, kW<C>> b(bw<C> bw2, boolean bl2) {
        return this.a(kW.b(bw2, aD.a(bl2)));
    }

    @Override
    public Comparator<? super bw<C>> comparator() {
        return kO.d();
    }

    @Override
    Iterator<Map.Entry<bw<C>, kW<C>>> b() {
        bw bw2;
        Collection<kW<C>> collection = this.c.d() ? this.b.tailMap(this.c.e(), this.c.f() == aD.b).values() : this.b.values();
        kT<kW<C>> kT2 = gb.k(collection.iterator());
        if (this.c.f(bw.d()) && (!kT2.hasNext() || kT2.a().b != bw.d())) {
            bw2 = bw.d();
        } else if (kT2.hasNext()) {
            bw2 = kT2.next().c;
        } else {
            return gb.a();
        }
        return new oy(this, bw2, kT2);
    }

    @Override
    Iterator<Map.Entry<bw<C>, kW<C>>> a() {
        bw bw2;
        boolean bl2;
        bw bw3 = this.c.g() ? this.c.h() : bw.e();
        kT<kW<C>> kT2 = gb.k(this.b.headMap(bw3, bl2 = this.c.g() && this.c.i() == aD.b).descendingMap().values().iterator());
        if (kT2.hasNext()) {
            bw2 = kT2.a().c == bw.e() ? kT2.next().b : this.a.higherKey(kT2.a().c);
        } else {
            if (!this.c.f(bw.d()) || this.a.containsKey(bw.d())) {
                return gb.a();
            }
            bw2 = this.a.higherKey(bw.d());
        }
        bw bw4 = aH.a(bw2, bw.e());
        return new oz(this, bw4, kT2);
    }

    @Override
    public int size() {
        return gb.b(this.b());
    }

    public kW<C> a(Object object) {
        if (object instanceof bw) {
            try {
                bw bw2 = (bw)object;
                Map.Entry<bw<C>, kW<C>> entry = this.b(bw2, true).firstEntry();
                if (entry != null && entry.getKey().equals(bw2)) {
                    return entry.getValue();
                }
            }
            catch (ClassCastException var2_3) {
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ NavigableMap tailMap(Object object, boolean bl2) {
        return this.b((bw)object, bl2);
    }

    @Override
    public /* synthetic */ NavigableMap headMap(Object object, boolean bl2) {
        return this.a((bw)object, bl2);
    }

    @Override
    public /* synthetic */ NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a((bw)object, bl2, (bw)object2, bl3);
    }

    static /* synthetic */ kW a(ox ox2) {
        return ox2.c;
    }
}

