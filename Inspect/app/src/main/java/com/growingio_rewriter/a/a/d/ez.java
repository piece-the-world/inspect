/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eA;
import com.growingio.a.a.d.eB;
import com.growingio.a.a.d.eC;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

final class ez<K, V>
extends dQ<V> {
    private final ei<K, V> a;

    ez(ei<K, V> ei2) {
        this.a = ei2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public oP<V> k_() {
        return new eA(this);
    }

    @Override
    public boolean contains(Object object) {
        return object != null && gb.a(this.k_(), object);
    }

    @Override
    boolean i_() {
        return true;
    }

    @Override
    ea<V> m() {
        ea<Map.Entry<K, V>> ea2 = this.a.k().h();
        return new eB(this, ea2);
    }

    @Override
    Object j_() {
        return new eC<V>(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }

    static /* synthetic */ ei a(ez ez2) {
        return ez2.a;
    }
}

