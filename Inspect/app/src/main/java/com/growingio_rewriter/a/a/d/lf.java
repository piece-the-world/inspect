/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.Z;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.ld;

class lf
extends Z<C> {
    final C a;
    final /* synthetic */ ld b;

    lf(ld ld2, Comparable comparable) {
        this.b = ld2;
        super(comparable);
        this.a = this.b.f();
    }

    @Override
    protected C a(C c2) {
        return ld.c(c2, this.a) ? null : (C)this.b.a.b(c2);
    }
}

