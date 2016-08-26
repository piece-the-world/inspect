/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.nR;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class nS
implements aq<Map<C, V>, Iterator<C>> {
    final /* synthetic */ nR a;

    nS(nR nR2) {
        this.a = nR2;
    }

    public Iterator<C> a(Map<C, V> map) {
        return map.keySet().iterator();
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map)object);
    }
}

