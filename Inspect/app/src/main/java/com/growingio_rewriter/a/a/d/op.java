/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oo;
import java.util.Collection;
import java.util.Map;

class op
extends iU<kW<K>, V> {
    final /* synthetic */ oo a;

    op(oo oo2, Map map) {
        this.a = oo2;
        super(map);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return oo.a(this.a, aW.a(aW.a(aW.a(collection)), ii.a()));
    }
}

