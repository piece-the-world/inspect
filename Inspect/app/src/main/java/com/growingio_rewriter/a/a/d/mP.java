/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jk;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mQ;
import com.growingio.a.a.d.mS;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class mP
extends jk<C, Map<R, V>> {
    final /* synthetic */ mE a;

    private mP(mE mE2) {
        this.a = mE2;
    }

    public Map<R, V> a(Object object) {
        return this.a.b(object) ? this.a.d(object) : null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.b(object);
    }

    public Map<R, V> b(Object object) {
        return this.a.b(object) ? mE.a(this.a, object) : null;
    }

    @Override
    public Set<Map.Entry<C, Map<R, V>>> a() {
        return new mQ(this);
    }

    @Override
    public Set<C> keySet() {
        return this.a.b();
    }

    @Override
    Collection<Map<R, V>> b() {
        return new mS(this);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    /* synthetic */ mP(mE mE2, mF mF2) {
        this(mE2);
    }
}

