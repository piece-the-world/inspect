/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gJ;
import com.growingio.a.a.d.gM;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

class gD
extends AbstractSequentialList<V> {
    final /* synthetic */ Object a;
    final /* synthetic */ gC b;

    gD(gC gC2, Object object) {
        this.b = gC2;
        this.a = object;
    }

    @Override
    public int size() {
        gJ gJ2 = (gJ)gC.d(this.b).get(this.a);
        return gJ2 == null ? 0 : gJ2.c;
    }

    @Override
    public ListIterator<V> listIterator(int n2) {
        return new gM(this.b, this.a, n2);
    }
}

