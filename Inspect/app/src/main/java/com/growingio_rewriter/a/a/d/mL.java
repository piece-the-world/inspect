/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mH;
import java.util.Collection;
import java.util.Map;

class mL
extends iU<R, V> {
    final /* synthetic */ mH a;

    mL(mH mH2) {
        this.a = mH2;
        super(mH2);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.b.a(object, this.a.a);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.b.c(object, this.a.a) != null;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a.a(ii.a(aW.a(aW.a(collection))));
    }
}

