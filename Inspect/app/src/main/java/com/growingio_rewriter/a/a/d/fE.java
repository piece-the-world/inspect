/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fD;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.lx;
import com.growingio.a.a.d.me;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nG;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public final class fE<R, C, V> {
    private final List<nC<R, C, V>> a = gO.a();
    private Comparator<? super R> b;
    private Comparator<? super C> c;

    public fE<R, C, V> a(Comparator<? super R> comparator) {
        this.b = aU.a(comparator);
        return this;
    }

    public fE<R, C, V> b(Comparator<? super C> comparator) {
        this.c = aU.a(comparator);
        return this;
    }

    public fE<R, C, V> a(R r2, C c2, V v2) {
        this.a.add(fD.c(r2, c2, v2));
        return this;
    }

    public fE<R, C, V> a(nC<? extends R, ? extends C, ? extends V> nC2) {
        if (nC2 instanceof nG) {
            aU.a(nC2.a());
            aU.a(nC2.b());
            aU.a(nC2.c());
            nC<R, C, V> nC3 = nC2;
            this.a.add(nC3);
        } else {
            this.a(nC2.a(), nC2.b(), nC2.c());
        }
        return this;
    }

    public fE<R, C, V> a(nB<? extends R, ? extends C, ? extends V> nB2) {
        for (nC<R, C, V> nC2 : nB2.e()) {
            this.a(nC2);
        }
        return this;
    }

    public fD<R, C, V> a() {
        int n2 = this.a.size();
        switch (n2) {
            case 0: {
                return fD.m();
            }
            case 1: {
                return new me<R, C, V>(fL.d(this.a));
            }
        }
        return lx.a(this.a, this.b, this.c);
    }
}

