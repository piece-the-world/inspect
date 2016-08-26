/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.li;
import com.growingio.a.a.d.lj;
import com.growingio.a.a.d.ll;
import com.growingio.a.a.d.ln;
import java.util.Map;

final class lk
extends dK<V, K> {
    final /* synthetic */ li a;

    private lk(li li2) {
        this.a = li2;
    }

    @Override
    public int size() {
        return this.e().size();
    }

    @Override
    public dK<K, V> e() {
        return this.a;
    }

    @Override
    public K get(Object object) {
        if (object == null || li.a(this.a) == null) {
            return null;
        }
        int n2 = dH.a(object.hashCode()) & li.b(this.a);
        for (er er2 = li.a((li)this.a)[n2]; er2 != null; er2 = er2.b()) {
            if (!object.equals(er2.getValue())) continue;
            return er2.getKey();
        }
        return null;
    }

    @Override
    fg<Map.Entry<V, K>> l() {
        return new ll(this);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    Object g() {
        return new ln(this.a);
    }

    @Override
    public /* synthetic */ av m_() {
        return this.e();
    }

    /* synthetic */ lk(li li2, lj lj2) {
        this(li2);
    }
}

