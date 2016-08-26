/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.I;
import com.growingio.a.a.d.J;
import com.growingio.a.a.d.bv;
import com.growingio.a.a.d.kx;
import java.util.Map;

class K
extends kx<E> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ J b;

    K(J j2, Map.Entry entry) {
        this.b = j2;
        this.a = entry;
    }

    @Override
    public E a() {
        return (E)this.a.getKey();
    }

    @Override
    public int b() {
        bv bv2;
        bv bv3 = (bv)this.a.getValue();
        if ((bv3 == null || bv3.a() == 0) && (bv2 = (bv)I.a(this.b.c).get(this.a())) != null) {
            return bv2.a();
        }
        return bv3 == null ? 0 : bv3.a();
    }
}

