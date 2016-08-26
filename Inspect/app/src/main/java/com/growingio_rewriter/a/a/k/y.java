/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.n;
import com.growingio.a.a.k.v;
import com.growingio.a.a.k.w;
import com.growingio.a.a.m.i;
import java.math.RoundingMode;
import java.util.Collection;

public final class y {
    private final int a;
    private final int b;

    private y(int n2, int n3) {
        v.a(n3, n2);
        this.a = n2;
        this.b = n3;
    }

    public double a(Collection<? extends Number> collection) {
        return this.b(i.a(collection));
    }

    public /* varargs */ double a(double ... arrd) {
        return this.b((double[])arrd.clone());
    }

    public /* varargs */ double a(long ... arrl) {
        return this.b(v.a(arrl));
    }

    public /* varargs */ double a(int ... arrn) {
        return this.b(v.a(arrn));
    }

    public /* varargs */ double b(double ... arrd) {
        aU.a(arrd.length > 0, (Object)"Cannot calculate quantiles of an empty dataset");
        if (v.a(arrd)) {
            return Double.NaN;
        }
        long l2 = (long)this.b * (long)(arrd.length - 1);
        int n2 = (int)n.a(l2, (long)this.a, RoundingMode.DOWN);
        int n3 = (int)(l2 - (long)n2 * (long)this.a);
        v.a(n2, arrd, 0, arrd.length - 1);
        if (n3 == 0) {
            return arrd[n2];
        }
        v.a(n2 + 1, arrd, n2 + 1, arrd.length - 1);
        return v.a(arrd[n2], arrd[n2 + 1], (double)n3, (double)this.a);
    }

    /* synthetic */ y(int n2, int n3, w w2) {
        this(n2, n3);
    }
}

