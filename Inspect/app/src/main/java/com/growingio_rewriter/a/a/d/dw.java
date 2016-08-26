/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dv;
import com.growingio.a.a.d.dx;
import com.growingio.a.a.d.iD;
import java.util.Iterator;
import java.util.Map;

class dw
extends iD<V, K> {
    final /* synthetic */ dv a;

    dw(dv dv2) {
        this.a = dv2;
    }

    @Override
    Map<V, K> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<V, K>> iterator() {
        return new dx(this);
    }
}

