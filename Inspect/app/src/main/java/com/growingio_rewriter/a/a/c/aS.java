/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aQ;
import com.growingio.a.a.c.as;
import com.growingio.a.a.d.Z;

class aS
extends Z<as<K, V>> {
    final /* synthetic */ aQ a;

    aS(aQ aQ2, as as2) {
        this.a = aQ2;
        super(as2);
    }

    @Override
    protected as<K, V> a(as<K, V> as2) {
        as<K, V> as3 = as2.i();
        return as3 == this.a.a ? null : as3;
    }
}

