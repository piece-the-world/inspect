/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cU;
import java.util.Map;

class cV
implements aq<Map.Entry<cD, Long>, Long> {
    final /* synthetic */ cU a;

    cV(cU cU2) {
        this.a = cU2;
    }

    public Long a(Map.Entry<cD, Long> entry) {
        return entry.getValue();
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map.Entry)object);
    }
}

