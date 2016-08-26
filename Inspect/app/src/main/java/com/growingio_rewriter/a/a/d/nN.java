/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lD;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nD;
import com.growingio.a.a.d.nO;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class nN<R, C, V>
extends nO<R, C, V>
implements lD<R, C, V> {
    private static final long b = 0;

    public nN(lD<R, ? extends C, ? extends V> lD2) {
        super(lD2);
    }

    protected lD<R, C, V> k() {
        return (lD)super.f();
    }

    @Override
    public SortedMap<R, Map<C, V>> j() {
        aq aq2 = nD.a();
        return Collections.unmodifiableSortedMap(ii.a(this.k().j(), aq2));
    }

    @Override
    public SortedSet<R> p_() {
        return Collections.unmodifiableSortedSet(this.k().p_());
    }

    @Override
    public /* synthetic */ Map r() {
        return this.j();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.p_();
    }

    @Override
    protected /* synthetic */ nB f() {
        return this.k();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.k();
    }
}

