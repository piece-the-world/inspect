/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.oP;
import java.io.Serializable;
import java.util.Map;

class eq
implements Serializable {
    private final Object[] a;
    private final Object[] b;
    private static final long c = 0;

    eq(ei<?, ?> ei2) {
        this.a = new Object[ei2.size()];
        this.b = new Object[ei2.size()];
        int n2 = 0;
        oP oP2 = ei2.k().k_();
        while (oP2.hasNext()) {
            Map.Entry entry = oP2.next();
            this.a[n2] = entry.getKey();
            this.b[n2] = entry.getValue();
            ++n2;
        }
    }

    Object a() {
        ek<Object, Object> ek2 = new ek<Object, Object>(this.a.length);
        return this.a(ek2);
    }

    Object a(ek<Object, Object> ek2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            ek2.b(this.a[i2], this.b[i2]);
        }
        return ek2.b();
    }
}

