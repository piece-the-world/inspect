/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.iS;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jb<K, V1, V2>
extends iS<K, V2> {
    final Map<K, V1> a;
    final iE<? super K, ? super V1, V2> b;

    jb(Map<K, V1> map, iE<? super K, ? super V1, V2> iE2) {
        this.a = aU.a(map);
        this.b = aU.a(iE2);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public V2 get(Object object) {
        V1 V1 = this.a.get(object);
        return V1 != null || this.a.containsKey(object) ? this.b.a(object, V1) : null;
    }

    @Override
    public V2 remove(Object object) {
        return this.a.containsKey(object) ? (V2)this.b.a((K)object, (V1)this.a.remove(object)) : null;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Set<K> keySet() {
        return this.a.keySet();
    }

    @Override
    Iterator<Map.Entry<K, V2>> b() {
        return gb.a(this.a.entrySet().iterator(), ii.b(this.b));
    }

    @Override
    public Collection<V2> values() {
        return new jj(this);
    }
}

