/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nP;
import com.growingio.a.a.d.oV;
import com.growingio.a.a.d.oX;
import java.util.Iterator;
import java.util.Map;

class oW
extends nP<K, Map.Entry<K, V>> {
    final /* synthetic */ oV a;

    oW(oV oV2, Iterator iterator) {
        this.a = oV2;
        super(iterator);
    }

    Map.Entry<K, V> b(K k2) {
        return new oX(this, k2);
    }

    @Override
    /* synthetic */ Object a(Object object) {
        return this.b(object);
    }
}

