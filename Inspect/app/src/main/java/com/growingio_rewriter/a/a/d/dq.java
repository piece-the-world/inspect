/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.ii;
import java.io.Serializable;
import java.util.Map;

class dq<C, V>
implements bG<Map<C, V>>,
Serializable {
    final int a;
    private static final long b = 0;

    dq(int n2) {
        this.a = n2;
    }

    public Map<C, V> b() {
        return ii.a(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

