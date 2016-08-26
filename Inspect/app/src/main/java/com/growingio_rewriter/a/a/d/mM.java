/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jj;
import com.growingio.a.a.d.mH;
import java.util.Collection;
import java.util.Map;

class mM
extends jj<R, V> {
    final /* synthetic */ mH a;

    mM(mH mH2) {
        this.a = mH2;
        super(mH2);
    }

    @Override
    public boolean remove(Object object) {
        return object != null && this.a.a(ii.b(aW.a(object)));
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.a.a(ii.b(aW.a(collection)));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a.a(ii.b(aW.a(aW.a(collection))));
    }
}

