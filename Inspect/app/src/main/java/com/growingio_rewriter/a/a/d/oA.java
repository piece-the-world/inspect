/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.V;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oB;
import com.growingio.a.a.d.oC;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

final class oA<C extends Comparable<?>>
extends V<bw<C>, kW<C>> {
    private final NavigableMap<bw<C>, kW<C>> a;
    private final kW<bw<C>> b;

    oA(NavigableMap<bw<C>, kW<C>> navigableMap) {
        this.a = navigableMap;
        this.b = kW.c();
    }

    private oA(NavigableMap<bw<C>, kW<C>> navigableMap, kW<bw<C>> kW2) {
        this.a = navigableMap;
        this.b = kW2;
    }

    private NavigableMap<bw<C>, kW<C>> a(kW<bw<C>> kW2) {
        if (kW2.b(this.b)) {
            return new oA<C>(this.a, kW2.c(this.b));
        }
        return fp.d();
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
    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    public kW<C> a(Object object) {
        if (object instanceof bw) {
            try {
                bw bw2 = (bw)object;
                if (!this.b.f(bw2)) {
                    return null;
                }
                Map.Entry<bw, kW<C>> entry = this.a.lowerEntry(bw2);
                if (entry != null && entry.getValue().c.equals(bw2)) {
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
    Iterator<Map.Entry<bw<C>, kW<C>>> b() {
        Map.Entry<bw<C>, kW<C>> entry;
        Iterator<kW<C>> iterator = !this.b.d() ? this.a.values().iterator() : ((entry = this.a.lowerEntry(this.b.e())) == null ? this.a.values().iterator() : (this.b.b.a(entry.getValue().c) ? this.a.tailMap(entry.getKey(), true).values().iterator() : this.a.tailMap(this.b.e(), true).values().iterator()));
        return new oB(this, iterator);
    }

    @Override
    Iterator<Map.Entry<bw<C>, kW<C>>> a() {
        Collection<kW<C>> collection = this.b.g() ? this.a.headMap(this.b.h(), false).descendingMap().values() : this.a.descendingMap().values();
        kT<kW<C>> kT2 = gb.k(collection.iterator());
        if (kT2.hasNext() && this.b.c.a(kT2.a().c)) {
            kT2.next();
        }
        return new oC(this, kT2);
    }

    @Override
    public int size() {
        if (this.b.equals(kW.c())) {
            return this.a.size();
        }
        return gb.b(this.b());
    }

    @Override
    public boolean isEmpty() {
        return this.b.equals(kW.c()) ? this.a.isEmpty() : !this.b().hasNext();
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

    static /* synthetic */ kW a(oA oA2) {
        return oA2.b;
    }
}

