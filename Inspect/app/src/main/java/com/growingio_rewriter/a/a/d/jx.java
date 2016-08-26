/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.aK;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

final class jx<V>
implements bG<List<V>>,
Serializable {
    private final int a;

    jx(int n2) {
        this.a = aK.a(n2, "expectedValuesPerKey");
    }

    public List<V> b() {
        return new ArrayList(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

