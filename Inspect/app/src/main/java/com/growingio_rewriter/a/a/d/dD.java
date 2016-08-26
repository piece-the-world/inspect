/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dE;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.du;
import com.growingio.a.a.d.iU;
import java.util.Iterator;
import java.util.Map;

final class dD
extends iU<K, V> {
    final /* synthetic */ dr a;

    dD(dr dr2) {
        this.a = dr2;
        super(dr2);
    }

    @Override
    public Iterator<K> iterator() {
        return new dE(this);
    }

    @Override
    public boolean remove(Object object) {
        du du2 = dr.a(this.a, object, dH.a(object));
        if (du2 == null) {
            return false;
        }
        dr.a(this.a, du2);
        du2.f = null;
        du2.e = null;
        return true;
    }
}

