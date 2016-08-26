/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bu;
import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fa;
import com.growingio.a.a.d.fb;
import com.growingio.a.a.d.fc;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.m.q;
import java.util.Comparator;
import java.util.Iterator;

final class eZ
extends fz<C> {
    private final bO<C> e;
    private transient Integer f;
    final /* synthetic */ eX a;

    eZ(bO<C> var1_1) {
        this.a = var1_1;
        super(kO.d());
        this.e = bO2;
    }

    @Override
    public int size() {
        Integer n2 = this.f;
        if (n2 == null) {
            kW kW2;
            long l2 = 0;
            oP oP2 = eX.a(this.a).k_();
            while (oP2.hasNext() && (l2 += (long)bu.a(kW2 = (kW)oP2.next(), this.e).size()) < Integer.MAX_VALUE) {
            }
            n2 = this.f = Integer.valueOf(q.b(l2));
        }
        return n2;
    }

    @Override
    public oP<C> k_() {
        return new fa(this);
    }

    @Override
    public oP<C> d() {
        return new fb(this);
    }

    @Override
    fz<C> a(kW<C> kW2) {
        return this.a.f(kW2).a(this.e);
    }

    @Override
    fz<C> a(C c2, boolean bl2) {
        return this.a(kW.a(c2, aD.a(bl2)));
    }

    @Override
    fz<C> a(C c2, boolean bl2, C c3, boolean bl3) {
        if (!bl2 && !bl3 && kW.e(c2, c3) == 0) {
            return eZ.n();
        }
        return this.a(kW.a(c2, aD.a(bl2), c3, aD.a(bl3)));
    }

    @Override
    fz<C> b(C c2, boolean bl2) {
        return this.a(kW.b(c2, aD.a(bl2)));
    }

    @Override
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        try {
            Comparable comparable = (Comparable)object;
            return this.a.a(comparable);
        }
        catch (ClassCastException var2_3) {
            return false;
        }
    }

    @Override
    int c(Object object) {
        if (this.contains(object)) {
            Comparable comparable = (Comparable)object;
            long l2 = 0;
            oP oP2 = eX.a(this.a).k_();
            while (oP2.hasNext()) {
                kW kW2 = (kW)oP2.next();
                if (kW2.f(comparable)) {
                    return q.b(l2 + (long)bu.a(kW2, this.e).c(comparable));
                }
                l2 += (long)bu.a(kW2, this.e).size();
            }
            throw new AssertionError((Object)"impossible");
        }
        return -1;
    }

    @Override
    boolean i_() {
        return eX.a(this.a).i_();
    }

    @Override
    public String toString() {
        return eX.a(this.a).toString();
    }

    @Override
    Object j_() {
        return new fc<C>(eX.a(this.a), this.e);
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2) {
        return this.b((C)((Comparable)object), bl2);
    }

    @Override
    /* synthetic */ fz b(Object object, boolean bl2) {
        return this.a((C)((Comparable)object), bl2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    static /* synthetic */ bO a(eZ eZ2) {
        return eZ2.e;
    }
}

