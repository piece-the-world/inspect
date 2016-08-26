/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.eS;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.kW;

class eT
extends ea<kW<K>> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ kW c;
    final /* synthetic */ eS d;

    eT(eS eS2, int n2, int n3, kW kW2) {
        this.d = eS2;
        this.a = n2;
        this.b = n3;
        this.c = kW2;
    }

    @Override
    public int size() {
        return this.a;
    }

    public kW<K> b(int n2) {
        aU.a(n2, this.a);
        if (n2 == 0 || n2 == this.a - 1) {
            return ((kW)eS.a(this.d).get(n2 + this.b)).c(this.c);
        }
        return (kW)eS.a(this.d).get(n2 + this.b);
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

