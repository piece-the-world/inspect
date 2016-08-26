/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iI;
import com.growingio.a.a.d.iJ;
import java.util.Map;

class iK
extends cR<K, V> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ iJ b;

    iK(iJ iJ2, Map.Entry entry) {
        this.b = iJ2;
        this.a = entry;
    }

    @Override
    protected Map.Entry<K, V> a() {
        return this.a;
    }

    @Override
    public V setValue(V v2) {
        aU.a(this.b.a.a.b(this.getKey(), v2));
        return super.setValue(v2);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

