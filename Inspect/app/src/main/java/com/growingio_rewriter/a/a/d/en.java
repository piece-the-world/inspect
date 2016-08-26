/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ej;
import com.growingio.a.a.d.el;
import com.growingio.a.a.d.eo;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class en
extends el<K, fg<V>> {
    final /* synthetic */ ei a;

    private en(ei ei2) {
        this.a = ei2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public fg<K> m() {
        return this.a.m();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    public fg<V> a(Object object) {
        Object v2 = this.a.get(object);
        return v2 == null ? null : fg.d(v2);
    }

    @Override
    boolean b() {
        return this.a.b();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    boolean o() {
        return this.a.o();
    }

    @Override
    oP<Map.Entry<K, fg<V>>> d() {
        oP oP2 = this.a.k().k_();
        return new eo(this, oP2);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.m();
    }

    /* synthetic */ en(ei ei2, ej ej2) {
        this(ei2);
    }
}

