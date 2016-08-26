/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kx;
import com.growingio.a.a.d.nX;
import com.growingio.a.a.d.of;

class nY
extends kx<E> {
    final /* synthetic */ of a;
    final /* synthetic */ nX b;

    nY(nX nX2, of of2) {
        this.b = nX2;
        this.a = of2;
    }

    @Override
    public E a() {
        return this.a.a();
    }

    @Override
    public int b() {
        int n2 = this.a.b();
        if (n2 == 0) {
            return this.b.a(this.a());
        }
        return n2;
    }
}

