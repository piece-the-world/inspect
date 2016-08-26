/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.gB;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.io.Serializable;
import java.util.Set;

class eR
implements Serializable {
    final Object[] a;
    final int[] b;
    private static final long c = 0;

    eR(kl<?> kl2) {
        int n2 = kl2.a().size();
        this.a = new Object[n2];
        this.b = new int[n2];
        int n3 = 0;
        for (km km2 : kl2.a()) {
            this.a[n3] = km2.a();
            this.b[n3] = km2.b();
            ++n3;
        }
    }

    Object a() {
        gB gB2 = gB.a(this.a.length);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            gB2.a(this.a[i2], this.b[i2]);
        }
        return eM.a(gB2);
    }
}

