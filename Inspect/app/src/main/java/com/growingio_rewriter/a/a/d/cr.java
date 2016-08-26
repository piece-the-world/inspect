/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.co;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.Map;

class cr
extends cC<Map.Entry<K, V>> {
    final /* synthetic */ co a;

    cr(co co2) {
        this.a = co2;
    }

    @Override
    protected Collection<Map.Entry<K, V>> b() {
        return aL.a(this.a.a.l(), this.a.b());
    }

    @Override
    public boolean remove(Object object) {
        Map.Entry entry;
        if (object instanceof Map.Entry && this.a.a.f((entry = (Map.Entry)object).getKey()) && this.a.b.a(entry.getKey())) {
            return this.a.a.c(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

