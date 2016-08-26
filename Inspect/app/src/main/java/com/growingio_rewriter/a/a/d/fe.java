/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.eX;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.kW;

final class fe
extends ea<kW<C>> {
    private final boolean b;
    private final boolean c;
    private final int d;
    final /* synthetic */ eX a;

    fe(eX eX2) {
        this.a = eX2;
        this.b = ((kW)eX.a(eX2).get(0)).d();
        this.c = ((kW)fL.h(eX.a(eX2))).g();
        int n2 = eX.a(eX2).size() - 1;
        if (this.b) {
            ++n2;
        }
        if (this.c) {
            ++n2;
        }
        this.d = n2;
    }

    @Override
    public int size() {
        return this.d;
    }

    public kW<C> b(int n2) {
        aU.a(n2, this.d);
        bw bw2 = this.b ? (n2 == 0 ? bw.d() : ((kW)eX.a((eX)this.a).get((int)(n2 - 1))).c) : ((kW)eX.a((eX)this.a).get((int)n2)).c;
        bw bw3 = this.c && n2 == this.d - 1 ? bw.e() : ((kW)eX.a((eX)this.a).get((int)(n2 + (this.b != false ? 0 : 1)))).b;
        return kW.a(bw2, bw3);
    }

    @Override
    boolean i_() {
        return true;
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

