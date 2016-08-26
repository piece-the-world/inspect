/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gH;
import com.growingio.a.a.d.gL;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

class gG
extends AbstractSequentialList<V> {
    final /* synthetic */ gC a;

    gG(gC gC2) {
        this.a = gC2;
    }

    @Override
    public int size() {
        return gC.e(this.a);
    }

    @Override
    public ListIterator<V> listIterator(int n2) {
        gL gL2 = new gL(this.a, n2);
        return new gH(this, gL2, gL2);
    }
}

