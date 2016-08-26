/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.a;
import com.growingio.a.a.d.c;
import com.growingio.a.a.d.cR;
import com.growingio.a.a.d.d;
import java.util.Map;

class e
extends cR<K, V> {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ d b;

    e(d d2, Map.Entry entry) {
        this.b = d2;
        this.a = entry;
    }

    @Override
    protected Map.Entry<K, V> a() {
        return this.a;
    }

    @Override
    public V setValue(V v2) {
        aU.b(this.b.c.contains(this), "entry no longer in map");
        if (aL.a(v2, this.getValue())) {
            return v2;
        }
        aU.a(!this.b.c.b.containsValue(v2), "value already present: %s", v2);
        V v3 = this.a.setValue(v2);
        aU.b(aL.a(v2, this.b.c.b.get(this.getKey())), "entry no longer in map");
        a.a(this.b.c.b, this.getKey(), true, v3, v2);
        return v3;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

