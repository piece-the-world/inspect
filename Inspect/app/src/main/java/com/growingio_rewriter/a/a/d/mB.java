/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.lD;
import com.growingio.a.a.d.mC;
import com.growingio.a.a.d.mD;
import com.growingio.a.a.d.mE;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class mB<R, C, V>
extends mE<R, C, V>
implements lD<R, C, V> {
    private static final long c = 0;

    mB(SortedMap<R, Map<C, V>> sortedMap, bG<? extends Map<C, V>> bG2) {
        super(sortedMap, bG2);
    }

    private SortedMap<R, Map<C, V>> o() {
        return (SortedMap)this.a;
    }

    @Override
    public SortedSet<R> p_() {
        return (SortedSet)this.j().keySet();
    }

    @Override
    public SortedMap<R, Map<C, V>> j() {
        return (SortedMap)super.r();
    }

    SortedMap<R, Map<C, V>> k() {
        return new mD(this, null);
    }

    @Override
    /* synthetic */ Map l() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.j();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.p_();
    }

    static /* synthetic */ SortedMap a(mB mB2) {
        return mB2.o();
    }
}

