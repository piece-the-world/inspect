/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bS;
import com.growingio.a.a.d.bu;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.le;
import com.growingio.a.a.d.lf;
import com.growingio.a.a.d.lg;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Iterator;

final class ld<C extends Comparable>
extends bu<C> {
    private final kW<C> e;
    private static final long f = 0;

    ld(kW<C> kW2, bO<C> bO2) {
        super(bO2);
        this.e = kW2;
    }

    @Override
    private bu<C> a(kW<C> kW2) {
        return this.e.b(kW2) ? bu.a(this.e.c(kW2), this.a) : new bS(this.a);
    }

    @Override
    bu<C> c(C c2, boolean bl2) {
        return this.a(kW.a(c2, aD.a(bl2)));
    }

    @Override
    bu<C> b(C c2, boolean bl2, C c3, boolean bl3) {
        if (c2.compareTo(c3) == 0 && !bl2 && !bl3) {
            return new bS(this.a);
        }
        return this.a(kW.a(c2, aD.a(bl2), c3, aD.a(bl3)));
    }

    @Override
    bu<C> d(C c2, boolean bl2) {
        return this.a(kW.b(c2, aD.a(bl2)));
    }

    @Override
    int c(Object object) {
        return this.contains(object) ? (int)this.a.a(this.f(), (Comparable)object) : -1;
    }

    @Override
    public oP<C> k_() {
        return new le(this, (Comparable)this.f());
    }

    @Override
    public oP<C> d() {
        return new lf(this, (Comparable)this.g());
    }

    private static boolean d(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable2 != null && kW.e(comparable, comparable2) == 0;
    }

    @Override
    boolean i_() {
        return false;
    }

    public C f() {
        return this.e.b.a(this.a);
    }

    public C g() {
        return this.e.c.b(this.a);
    }

    @Override
    public int size() {
        long l2 = this.a.a(this.f(), this.g());
        return l2 >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2 + 1;
    }

    @Override
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        try {
            return this.e.f((Comparable)object);
        }
        catch (ClassCastException var2_2) {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return aL.a(this, collection);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public bu<C> a(bu<C> bu2) {
        Comparable comparable;
        aU.a(bu2);
        aU.a(this.a.equals(bu2.a));
        if (bu2.isEmpty()) {
            return bu2;
        }
        Comparable comparable2 = (Comparable)kO.d().b(this.f(), bu2.first());
        return comparable2.compareTo(comparable = (Comparable)kO.d().a(this.g(), bu2.last())) <= 0 ? bu.a(kW.b(comparable2, comparable), this.a) : new bS(this.a);
    }

    @Override
    public kW<C> f_() {
        return this.a(aD.b, aD.b);
    }

    @Override
    public kW<C> a(aD aD2, aD aD3) {
        return kW.a(this.e.b.a(aD2, this.a), this.e.c.b(aD3, this.a));
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ld) {
            ld ld2 = (ld)object;
            if (this.a.equals(ld2.a)) {
                return this.f().equals(ld2.f()) && this.g().equals(ld2.g());
            }
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }

    @Override
    Object j_() {
        return new lg(this.e, this.a, null);
    }

    @Override
    public /* synthetic */ Object last() {
        return this.g();
    }

    @Override
    public /* synthetic */ Object first() {
        return this.f();
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2) {
        return this.d((Comparable)object, bl2);
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b((Comparable)object, bl2, (Comparable)object2, bl3);
    }

    @Override
    /* synthetic */ fz b(Object object, boolean bl2) {
        return this.c((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    static /* synthetic */ boolean c(Comparable comparable, Comparable comparable2) {
        return ld.d(comparable, comparable2);
    }
}

