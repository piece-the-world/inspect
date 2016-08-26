/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ey;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fi;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

final class ex<K, V>
extends fi<K> {
    private final ei<K, V> a;

    ex(ei<K, V> ei2) {
        this.a = ei2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public oP<K> k_() {
        return this.a.a();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    K a(int n2) {
        return this.a.k().h().get(n2).getKey();
    }

    @Override
    boolean i_() {
        return true;
    }

    @Override
    Object j_() {
        return new ey<K>(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

