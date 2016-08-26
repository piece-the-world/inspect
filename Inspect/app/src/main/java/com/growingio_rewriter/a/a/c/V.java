/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.T;
import com.growingio.a.a.c.as;
import com.growingio.a.a.d.Z;

class V
extends Z<as<K, V>> {
    final /* synthetic */ T a;

    V(T t2, as as2) {
        this.a = t2;
        super(as2);
    }

    @Override
    protected as<K, V> a(as<K, V> as2) {
        as<K, V> as3 = as2.f();
        return as3 == this.a.a ? null : as3;
    }
}

