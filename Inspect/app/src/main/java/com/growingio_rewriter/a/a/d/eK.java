/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class eK
extends eM<K> {
    final /* synthetic */ eD a;

    eK(eD eD2) {
        this.a = eD2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.f(object);
    }

    @Override
    public int a(Object object) {
        Collection collection = this.a.b.get(object);
        return collection == null ? 0 : collection.size();
    }

    @Override
    public Set<K> d() {
        return this.a.x();
    }

    @Override
    public int size() {
        return this.a.l_();
    }

    @Override
    km<K> a(int n2) {
        Map.Entry entry = this.a.b.k().h().get(n2);
        return kn.a(entry.getKey(), ((Collection)entry.getValue()).size());
    }

    @Override
    boolean i_() {
        return true;
    }
}

