/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.oT;
import com.growingio.a.a.d.oU;
import com.growingio.a.a.d.oW;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class oV
extends iD<K, V> {
    final /* synthetic */ oT a;

    private oV(oT oT2) {
        this.a = oT2;
    }

    @Override
    Map<K, V> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new oW(this, this.a.keySet().iterator());
    }

    /* synthetic */ oV(oT oT2, oU oU2) {
        this(oT2);
    }
}

