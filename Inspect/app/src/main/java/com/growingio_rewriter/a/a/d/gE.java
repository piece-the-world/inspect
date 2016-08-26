/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gL;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

class gE
extends AbstractSequentialList<Map.Entry<K, V>> {
    final /* synthetic */ gC a;

    gE(gC gC2) {
        this.a = gC2;
    }

    @Override
    public int size() {
        return gC.e(this.a);
    }

    @Override
    public ListIterator<Map.Entry<K, V>> listIterator(int n2) {
        return new gL(this.a, n2);
    }
}

