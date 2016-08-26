/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.ot;
import java.util.Collection;
import java.util.Set;

final class ov
extends cC<kW<C>>
implements Set<kW<C>> {
    final Collection<kW<C>> a;
    final /* synthetic */ ot b;

    ov(Collection<kW<C>> var1_1) {
        this.b = var1_1;
        this.a = collection;
    }

    @Override
    protected Collection<kW<C>> b() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }

    @Override
    public boolean equals(Object object) {
        return lI.a(this, object);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

