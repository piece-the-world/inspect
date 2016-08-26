/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dA;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.du;
import com.growingio.a.a.d.dv;
import com.growingio.a.a.d.iU;
import java.util.Iterator;
import java.util.Map;

final class dz
extends iU<V, K> {
    final /* synthetic */ dv a;

    dz(dv dv2) {
        this.a = dv2;
        super(dv2);
    }

    @Override
    public boolean remove(Object object) {
        du du2 = dr.b(this.a.a, object, dH.a(object));
        if (du2 == null) {
            return false;
        }
        dr.a(this.a.a, du2);
        return true;
    }

    @Override
    public Iterator<V> iterator() {
        return new dA(this);
    }
}

