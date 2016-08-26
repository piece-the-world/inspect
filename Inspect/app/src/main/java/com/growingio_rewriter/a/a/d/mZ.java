/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.lU;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import java.util.Map;

abstract class mZ<T>
extends lU<T> {
    final /* synthetic */ mE b;

    private mZ(mE mE2) {
        this.b = mE2;
    }

    @Override
    public boolean isEmpty() {
        return this.b.a.isEmpty();
    }

    @Override
    public void clear() {
        this.b.a.clear();
    }

    /* synthetic */ mZ(mE mE2, mF mF2) {
        this(mE2);
    }
}

