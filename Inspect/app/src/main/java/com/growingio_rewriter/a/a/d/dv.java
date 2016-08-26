/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dB;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.ds;
import com.growingio.a.a.d.du;
import com.growingio.a.a.d.dw;
import com.growingio.a.a.d.dz;
import com.growingio.a.a.d.ii;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class dv
extends AbstractMap<V, K>
implements av<V, K>,
Serializable {
    final /* synthetic */ dr a;

    private dv(dr dr2) {
        this.a = dr2;
    }

    av<K, V> a() {
        return this.a;
    }

    @Override
    public int size() {
        return dr.c(this.a);
    }

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a().containsValue(object);
    }

    @Override
    public K get(Object object) {
        return ii.b(dr.b(this.a, object, dH.a(object)));
    }

    @Override
    public K put(V v2, K k2) {
        return (K)dr.a(this.a, v2, k2, false);
    }

    @Override
    public K a(V v2, K k2) {
        return (K)dr.a(this.a, v2, k2, true);
    }

    @Override
    public K remove(Object object) {
        du du2 = dr.b(this.a, object, dH.a(object));
        if (du2 == null) {
            return null;
        }
        dr.a(this.a, du2);
        du2.f = null;
        du2.e = null;
        return (K)du2.g;
    }

    @Override
    public av<K, V> m_() {
        return this.a();
    }

    @Override
    public Set<V> keySet() {
        return new dz(this);
    }

    @Override
    public Set<K> o_() {
        return this.a().keySet();
    }

    @Override
    public Set<Map.Entry<V, K>> entrySet() {
        return new dw(this);
    }

    Object d() {
        return new dB(this.a);
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }

    /* synthetic */ dv(dr dr2, ds ds2) {
        this(dr2);
    }
}

