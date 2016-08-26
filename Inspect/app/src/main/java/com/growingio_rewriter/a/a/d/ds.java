/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.d.dr.com.growingio.a.a.d.dC
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dC;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.d.dt;
import com.growingio.a.a.d.du;
import java.util.Map;

class ds
extends com.growingio.a.a.d.dr.com.growingio.a.a.d.dC<Map.Entry<K, V>> {
    final /* synthetic */ dr a;

    ds(dr dr2) {
        this.a = dr2;
        super(dr2);
    }

    Map.Entry<K, V> a(du<K, V> du2) {
        return new dt(this, du2);
    }

    /* synthetic */ Object b(du du2) {
        return this.a(du2);
    }
}

