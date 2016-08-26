/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.Y;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lc;
import com.growingio.a.a.d.oD;
import com.growingio.a.a.d.ou;
import com.growingio.a.a.d.ov;
import com.growingio.a.a.d.ow;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ot<C extends Comparable<?>>
extends Y<C>
implements Serializable {
    final NavigableMap<bw<C>, kW<C>> a;
    private transient Set<kW<C>> b;
    private transient Set<kW<C>> c;
    private transient lc<C> d;

    public static <C extends Comparable<?>> ot<C> c() {
        return new ot<C>(new TreeMap<bw<C>, kW<C>>());
    }

    public static <C extends Comparable<?>> ot<C> d(lc<C> lc2) {
        ot<C> ot2 = ot.c();
        ot2.b(lc2);
        return ot2;
    }

    private ot(NavigableMap<bw<C>, kW<C>> navigableMap) {
        this.a = navigableMap;
    }

    @Override
    public Set<kW<C>> n() {
        ov ov2 = this.b;
        ov ov3 = ov2 == null ? (this.b = new ov(this, this.a.values())) : ov2;
        return ov3;
    }

    @Override
    public Set<kW<C>> m() {
        ov ov2 = this.c;
        ov ov3 = ov2 == null ? (this.c = new ov(this, this.a.descendingMap().values())) : ov2;
        return ov3;
    }

    @Override
    public kW<C> b(C c2) {
        aU.a(c2);
        Map.Entry<bw<C>, kW<C>> entry = this.a.floorEntry(bw.b(c2));
        if (entry != null && entry.getValue().f(c2)) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public boolean c(kW<C> kW2) {
        aU.a(kW2);
        Map.Entry entry = this.a.ceilingEntry(kW2.b);
        if (entry != null && entry.getValue().b(kW2) && !entry.getValue().c(kW2).j()) {
            return true;
        }
        Map.Entry entry2 = this.a.lowerEntry(kW2.b);
        return entry2 != null && entry2.getValue().b(kW2) && !entry2.getValue().c(kW2).j();
    }

    @Override
    public boolean d(kW<C> kW2) {
        aU.a(kW2);
        Map.Entry entry = this.a.floorEntry(kW2.b);
        return entry != null && entry.getValue().a(kW2);
    }

    private kW<C> e(kW<C> kW2) {
        aU.a(kW2);
        Map.Entry entry = this.a.floorEntry(kW2.b);
        return entry != null && entry.getValue().a(kW2) ? entry.getValue() : null;
    }

    @Override
    public kW<C> e() {
        Map.Entry<bw<C>, kW<C>> entry = this.a.firstEntry();
        Map.Entry<bw<C>, kW<C>> entry2 = this.a.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return kW.a(entry.getValue().b, entry2.getValue().c);
    }

    @Override
    public void a(kW<C> kW2) {
        Object object;
        aU.a(kW2);
        if (kW2.j()) {
            return;
        }
        bw bw2 = kW2.b;
        bw bw3 = kW2.c;
        Map.Entry entry = this.a.lowerEntry(bw2);
        if (entry != null) {
            object = entry.getValue();
            if (object.c.a(bw2) >= 0) {
                if (object.c.a(bw3) >= 0) {
                    bw3 = object.c;
                }
                bw2 = object.b;
            }
        }
        if ((object = this.a.floorEntry(bw3)) != null) {
            kW kW3 = (kW)object.getValue();
            if (kW3.c.a(bw3) >= 0) {
                bw3 = kW3.c;
            }
        }
        this.a.subMap(bw2, bw3).clear();
        this.f(kW.a(bw2, bw3));
    }

    @Override
    public void b(kW<C> kW2) {
        Object object;
        aU.a(kW2);
        if (kW2.j()) {
            return;
        }
        Map.Entry entry = this.a.lowerEntry(kW2.b);
        if (entry != null) {
            object = entry.getValue();
            if (object.c.a(kW2.b) >= 0) {
                if (kW2.g() && object.c.a(kW2.c) >= 0) {
                    this.f(kW.a(kW2.c, object.c));
                }
                this.f(kW.a(object.b, kW2.b));
            }
        }
        if ((object = this.a.floorEntry(kW2.c)) != null) {
            kW kW3 = (kW)object.getValue();
            if (kW2.g() && kW3.c.a(kW2.c) >= 0) {
                this.f(kW.a(kW2.c, kW3.c));
            }
        }
        this.a.subMap(kW2.b, kW2.c).clear();
    }

    private void f(kW<C> kW2) {
        if (kW2.j()) {
            this.a.remove(kW2.b);
        } else {
            this.a.put(kW2.b, kW2);
        }
    }

    @Override
    public lc<C> l() {
        ow ow2 = this.d;
        ow ow3 = ow2 == null ? (this.d = new ow(this)) : ow2;
        return ow3;
    }

    @Override
    public lc<C> g(kW<C> kW2) {
        return kW2.equals(kW.c()) ? this : new oD(this, kW2);
    }

    /* synthetic */ ot(NavigableMap navigableMap, ou ou2) {
        this(navigableMap);
    }

    static /* synthetic */ kW a(ot ot2, kW kW2) {
        return ot2.e(kW2);
    }
}

