/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.lI;
import java.io.Serializable;
import java.util.Set;

final class jA<V>
implements bG<Set<V>>,
Serializable {
    private final int a;

    jA(int n2) {
        this.a = aK.a(n2, "expectedValuesPerKey");
    }

    public Set<V> b() {
        return lI.b(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

