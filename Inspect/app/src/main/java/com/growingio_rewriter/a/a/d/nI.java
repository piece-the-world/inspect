/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nD;
import com.growingio.a.a.d.nH;

class nI
implements aq<nC<R, C, V1>, nC<R, C, V2>> {
    final /* synthetic */ nH a;

    nI(nH nH2) {
        this.a = nH2;
    }

    public nC<R, C, V2> a(nC<R, C, V1> nC2) {
        return nD.a(nC2.a(), nC2.b(), this.a.b.f(nC2.c()));
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((nC)object);
    }
}

