/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aU;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.kX;
import java.io.Serializable;

class la
extends kO<kW<?>>
implements Serializable {
    private static final long a = 0;

    private la() {
    }

    @Override
    public int a(kW<?> kW2, kW<?> kW3) {
        return aU.a().a(kW2.b, kW3.b).a(kW2.c, kW3.c).b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((kW)object, (kW)object2);
    }

    /* synthetic */ la(kX kX2) {
        this();
    }
}

