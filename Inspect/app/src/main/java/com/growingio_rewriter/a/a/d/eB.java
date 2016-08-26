/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dI;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ez;
import java.util.Map;

class eB
extends dI<V> {
    final /* synthetic */ ea a;
    final /* synthetic */ ez b;

    eB(ez ez2, ea ea2) {
        this.b = ez2;
        this.a = ea2;
    }

    @Override
    public V get(int n2) {
        return ((Map.Entry)this.a.get(n2)).getValue();
    }

    @Override
    dQ<V> c() {
        return this.b;
    }
}

