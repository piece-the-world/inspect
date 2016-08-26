/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jk;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mX;
import java.util.Map;
import java.util.Set;

class mW
extends jk<R, Map<C, V>> {
    final /* synthetic */ mE b;

    mW(mE mE2) {
        this.b = mE2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b.a(object);
    }

    public Map<C, V> a(Object object) {
        return this.b.a(object) ? this.b.e(object) : null;
    }

    public Map<C, V> b(Object object) {
        return object == null ? null : this.b.a.remove(object);
    }

    @Override
    protected Set<Map.Entry<R, Map<C, V>>> a() {
        return new mX(this);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

