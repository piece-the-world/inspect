/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.g.i;
import java.util.Map;

class j
implements aV<Map.Entry<E, N>> {
    final /* synthetic */ Object a;
    final /* synthetic */ i b;

    j(i i2, Object object) {
        this.b = i2;
        this.a = object;
    }

    @Override
    public boolean a(Map.Entry<E, N> entry) {
        return entry.getValue().equals(this.a);
    }
}

