/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.mU;
import java.util.Map;

class mV
extends cR<C, V> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ mU b;

    mV(mU mU2, Map.Entry entry) {
        this.b = mU2;
        this.a = entry;
    }

    @Override
    protected Map.Entry<C, V> a() {
        return this.a;
    }

    @Override
    public V setValue(V v2) {
        return super.setValue(aU.a(v2));
    }

    @Override
    public boolean equals(Object object) {
        return this.a(object);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

