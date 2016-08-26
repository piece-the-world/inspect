/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.S;
import com.growingio.a.a.o.a.bY;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;

class X
extends bY<cF> {
    final /* synthetic */ cG a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ S c;

    X(S s2, String string, cG cG2, Throwable throwable) {
        this.c = s2;
        this.a = cG2;
        this.b = throwable;
        super(string);
    }

    @Override
    void a(cF cF2) {
        cF2.a(this.a, this.b);
    }
}

