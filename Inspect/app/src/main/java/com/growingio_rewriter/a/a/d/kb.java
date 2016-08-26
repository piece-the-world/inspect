/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ka;
import com.growingio.a.a.d.kc;
import com.growingio.a.a.d.lU;
import java.util.Iterator;
import java.util.Map;

class kb
extends lU<V> {
    final /* synthetic */ Object a;
    final /* synthetic */ ka b;

    kb(ka ka2, Object object) {
        this.b = ka2;
        this.a = object;
    }

    @Override
    public Iterator<V> iterator() {
        return new kc(this);
    }

    @Override
    public int size() {
        return this.b.a.containsKey(this.a) ? 1 : 0;
    }
}

