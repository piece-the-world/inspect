/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bD;
import com.growingio.a.a.d.bF;
import com.growingio.a.a.d.bJ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lx;
import com.growingio.a.a.d.nC;
import java.util.Map;

final class bC<R, C, V>
extends lx<R, C, V> {
    private final ei<R, Integer> a;
    private final ei<C, Integer> b;
    private final ei<R, Map<C, V>> c;
    private final ei<C, Map<R, V>> d;
    private final int[] e;
    private final int[] f;
    private final V[][] g;
    private final int[] h;
    private final int[] i;

    bC(ea<nC<R, C, V>> ea2, fg<R> fg2, fg<C> fg3) {
        Object[][] arrobject;
        this.g = arrobject = new Object[fg2.size()][fg3.size()];
        this.a = ii.a(fg2);
        this.b = ii.a(fg3);
        this.e = new int[this.a.size()];
        this.f = new int[this.b.size()];
        int[] arrn = new int[ea2.size()];
        int[] arrn2 = new int[ea2.size()];
        for (int i2 = 0; i2 < ea2.size(); ++i2) {
            int n2;
            nC<R, C, V> nC2 = ea2.get(i2);
            R r2 = nC2.a();
            C c2 = nC2.b();
            int n3 = this.a.get(r2);
            V v2 = this.g[n3][n2 = this.b.get(c2).intValue()];
            aU.a(v2 == null, "duplicate key: (%s, %s)", r2, c2);
            this.g[n3][n2] = nC2.c();
            int[] arrn3 = this.e;
            int n4 = n3;
            arrn3[n4] = arrn3[n4] + 1;
            int[] arrn4 = this.f;
            int n5 = n2;
            arrn4[n5] = arrn4[n5] + 1;
            arrn[i2] = n3;
            arrn2[i2] = n2;
        }
        this.h = arrn;
        this.i = arrn2;
        this.c = new bJ(this, null);
        this.d = new bF(this, null);
    }

    @Override
    public ei<C, Map<R, V>> k() {
        return this.d;
    }

    @Override
    public ei<R, Map<C, V>> l() {
        return this.c;
    }

    @Override
    public V b(Object object, Object object2) {
        Integer n2 = this.a.get(object);
        Integer n3 = this.b.get(object2);
        return n2 == null || n3 == null ? null : (V)this.g[n2][n3];
    }

    @Override
    public int n() {
        return this.h.length;
    }

    @Override
    nC<R, C, V> a(int n2) {
        int n3 = this.h[n2];
        int n4 = this.i[n2];
        Object r2 = this.x().h().get(n3);
        Object c2 = this.w().h().get(n4);
        V v2 = this.g[n3][n4];
        return bC.c(r2, c2, v2);
    }

    @Override
    V b(int n2) {
        return this.g[this.h[n2]][this.i[n2]];
    }

    @Override
    public /* synthetic */ Map p() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.l();
    }

    static /* synthetic */ int[] a(bC bC2) {
        return bC2.e;
    }

    static /* synthetic */ ei b(bC bC2) {
        return bC2.b;
    }

    static /* synthetic */ Object[][] c(bC bC2) {
        return bC2.g;
    }

    static /* synthetic */ int[] d(bC bC2) {
        return bC2.f;
    }

    static /* synthetic */ ei e(bC bC2) {
        return bC2.a;
    }
}

