/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.V;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oA;
import com.growingio.a.a.d.oF;
import com.growingio.a.a.d.oG;
import com.growingio.a.a.d.ou;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

final class oE<C extends Comparable<?>>
extends V<bw<C>, kW<C>> {
    private final kW<bw<C>> a;
    private final kW<C> b;
    private final NavigableMap<bw<C>, kW<C>> c;
    private final NavigableMap<bw<C>, kW<C>> d;

    private oE(kW<bw<C>> kW2, kW<C> kW3, NavigableMap<bw<C>, kW<C>> navigableMap) {
        this.a = aU.a(kW2);
        this.b = aU.a(kW3);
        this.c = aU.a(navigableMap);
        this.d = new oA<C>(navigableMap);
    }

    private NavigableMap<bw<C>, kW<C>> a(kW<bw<C>> kW2) {
        if (!kW2.b(this.a)) {
            return fp.d();
        }
        return new oE<C>(this.a.c(kW2), this.b, this.c);
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
                if (!this.a.f(bw2) || bw2.a(this.b.b) < 0 || bw2.a(this.b.c) >= 0) {
                    return null;
                }
                if (bw2.equals(this.b.b)) {
                    kW<C> kW2 = ii.c(this.c.floorEntry(bw2));
                    if (kW2 != null && kW2.c.a(this.b.b) > 0) {
                        return kW2.c(this.b);
                    }
                } else {
                    kW<C> kW3 = this.c.get(bw2);
                    if (kW3 != null) {
                        return kW3.c(this.b);
                    }
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
        if (this.b.j()) {
            return gb.a();
        }
        if (this.a.c.a(this.b.b)) {
            return gb.a();
        }
        Iterator<kW<C>> iterator = this.a.b.a(this.b.b) ? this.d.tailMap(this.b.b, false).values().iterator() : this.c.tailMap((bw<C>)this.a.b.c(), this.a.f() == aD.b).values().iterator();
        bw bw2 = kO.d().a(this.a.c, bw.b(this.b.c));
        return new oF(this, iterator, bw2);
    }

    @Override
    Iterator<Map.Entry<bw<C>, kW<C>>> a() {
        bw bw2;
        if (this.b.j()) {
            return gb.a();
        }
        Iterator<kW<C>> iterator = this.c.headMap(bw2.c(), (bw2 = kO.d().a(this.a.c, bw.b(this.b.c))).b() == aD.b).descendingMap().values().iterator();
        return new oG(this, iterator);
    }

    @Override
    public int size() {
        return gb.b(this.b());
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

    static /* synthetic */ kW a(oE oE2) {
        return oE2.b;
    }

    static /* synthetic */ kW b(oE oE2) {
        return oE2.a;
    }

    /* synthetic */ oE(kW kW2, kW kW3, NavigableMap navigableMap, ou ou2) {
        this(kW2, kW3, navigableMap);
    }
}

