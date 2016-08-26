/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.oP;
import java.util.Map;

class ej
extends oP<K> {
    final /* synthetic */ oP a;
    final /* synthetic */ ei b;

    ej(ei ei2, oP oP2) {
        this.b = ei2;
        this.a = oP2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public K next() {
        return ((Map.Entry)this.a.next()).getKey();
    }
}

