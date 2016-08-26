/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.iZ;
import com.growingio.a.a.d.mB;
import com.growingio.a.a.d.mC;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mW;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class mD
extends mE<R, C, V>
implements SortedMap<R, Map<C, V>> {
    final /* synthetic */ mB a;

    private mD(mB mB2) {
        this.a = mB2;
        super(mB2);
    }

    public SortedSet<R> c() {
        return (SortedSet)super.keySet();
    }

    SortedSet<R> d() {
        return new iZ(this);
    }

    @Override
    public Comparator<? super R> comparator() {
        return mB.a(this.a).comparator();
    }

    @Override
    public R firstKey() {
        return (R)mB.a(this.a).firstKey();
    }

    @Override
    public R lastKey() {
        return (R)mB.a(this.a).lastKey();
    }

    @Override
    public SortedMap<R, Map<C, V>> headMap(R r2) {
        aU.a(r2);
        return new mB(mB.a(this.a).headMap(r2), this.a.b).j();
    }

    @Override
    public SortedMap<R, Map<C, V>> subMap(R r2, R r3) {
        aU.a(r2);
        aU.a(r3);
        return new mB(mB.a(this.a).subMap(r2, r3), this.a.b).j();
    }

    @Override
    public SortedMap<R, Map<C, V>> tailMap(R r2) {
        aU.a(r2);
        return new mB(mB.a(this.a).tailMap(r2), this.a.b).j();
    }

    /* synthetic */ Set h() {
        return this.d();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.c();
    }

    /* synthetic */ mD(mB mB2, mC mC2) {
        this(mB2);
    }
}

