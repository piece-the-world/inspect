/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cd;
import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Map;

class cg
extends iU<K, Collection<V>> {
    final /* synthetic */ cd a;

    cg(cd cd2) {
        this.a = cd2;
        super(cd2);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.a.a.a(ii.a(aW.a(collection)));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a.a.a(ii.a(aW.a(aW.a(collection))));
    }

    @Override
    public boolean remove(Object object) {
        return this.a.b(object) != null;
    }
}

