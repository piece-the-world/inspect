/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.g.Q;
import java.util.Map;

class R
implements aV<Map.Entry<E, N>> {
    final /* synthetic */ Object a;
    final /* synthetic */ Q b;

    R(Q q2, Object object) {
        this.b = q2;
        this.a = object;
    }

    @Override
    public boolean a(Map.Entry<E, N> entry) {
        return entry.getValue().equals(this.a);
    }
}

