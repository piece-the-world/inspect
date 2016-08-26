/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bS;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.fA;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.ld;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public abstract class bu<C extends Comparable>
extends fz<C> {
    final bO<C> a;

    public static <C extends Comparable> bu<C> a(kW<C> kW2, bO<C> bO2) {
        aU.a(kW2);
        aU.a(bO2);
        kW<C> kW3 = kW2;
        try {
            if (!kW2.d()) {
                kW3 = kW3.c(kW.d(bO2.d()));
            }
            if (!kW2.g()) {
                kW3 = kW3.c(kW.b(bO2.e()));
            }
        }
        catch (NoSuchElementException var3_3) {
            throw new IllegalArgumentException(var3_3);
        }
        boolean bl2 = kW3.j() || kW.e(kW2.b.a(bO2), kW2.c.b(bO2)) > 0;
        return bl2 ? new bS<C>(bO2) : new ld<C>(kW3, bO2);
    }

    bu(bO<C> bO2) {
        super(kO.d());
        this.a = bO2;
    }

    @Override
    public bu<C> a(C c2) {
        return this.c((C)((Comparable)aU.a(c2)), false);
    }

    @Override
    public bu<C> a(C c2, boolean bl2) {
        return this.c((C)((Comparable)aU.a(c2)), bl2);
    }

    @Override
    public bu<C> a(C c2, C c3) {
        aU.a(c2);
        aU.a(c3);
        aU.a(this.comparator().compare(c2, c3) <= 0);
        return this.b(c2, true, c3, false);
    }

    @Override
    public bu<C> a(C c2, boolean bl2, C c3, boolean bl3) {
        aU.a(c2);
        aU.a(c3);
        aU.a(this.comparator().compare(c2, c3) <= 0);
        return this.b(c2, bl2, c3, bl3);
    }

    @Override
    public bu<C> b(C c2) {
        return this.d((C)((Comparable)aU.a(c2)), true);
    }

    @Override
    public bu<C> b(C c2, boolean bl2) {
        return this.d((C)((Comparable)aU.a(c2)), bl2);
    }

    @Override
    abstract bu<C> c(C var1, boolean var2);

    @Override
    abstract bu<C> b(C var1, boolean var2, C var3, boolean var4);

    @Override
    abstract bu<C> d(C var1, boolean var2);

    @Override
    public abstract bu<C> a(bu<C> var1);

    public abstract kW<C> f_();

    @Override
    public abstract kW<C> a(aD var1, aD var2);

    @Override
    public String toString() {
        return this.f_().toString();
    }

    public static <E> fA<E> c() {
        throw new UnsupportedOperationException();
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2) {
        return this.d((C)((Comparable)object), bl2);
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b((C)((Comparable)object), bl2, (C)((Comparable)object2), bl3);
    }

    @Override
    /* synthetic */ fz b(Object object, boolean bl2) {
        return this.c((C)((Comparable)object), bl2);
    }

    @Override
    public /* synthetic */ fz c(Object object, boolean bl2) {
        return this.b((C)((Comparable)object), bl2);
    }

    @Override
    public /* synthetic */ fz a(Object object) {
        return this.b((C)((Comparable)object));
    }

    @Override
    public /* synthetic */ fz b(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a((C)((Comparable)object), bl2, (C)((Comparable)object2), bl3);
    }

    @Override
    public /* synthetic */ fz d(Object object, boolean bl2) {
        return this.a((C)((Comparable)object), (C)bl2);
    }

    @Override
    public /* synthetic */ fz b(Object object) {
        return this.a((C)((Comparable)object));
    }

    @Override
    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.b((C)((Comparable)object));
    }

    @Override
    public /* synthetic */ SortedSet headSet(Object object) {
        return this.a((C)((Comparable)object));
    }

    @Override
    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((C)((Comparable)object), (C)((Comparable)object2));
    }

    @Override
    public /* synthetic */ NavigableSet tailSet(Object object, boolean bl2) {
        return this.b((C)((Comparable)object), bl2);
    }

    @Override
    public /* synthetic */ NavigableSet headSet(Object object, boolean bl2) {
        return this.a((C)((Comparable)object), (C)bl2);
    }

    @Override
    public /* synthetic */ NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a((C)((Comparable)object), bl2, (C)((Comparable)object2), bl3);
    }
}

