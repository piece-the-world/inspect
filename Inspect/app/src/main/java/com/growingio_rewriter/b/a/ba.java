/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.bh;
import java.util.Map;

class ba
extends bh {
    private Q a;
    private Q b;
    private Map c;

    public ba(Q q2, byte[] arrby, Q q3, Map map) {
        super(arrby);
        this.a = q2;
        this.b = q3;
        this.c = map;
    }

    @Override
    protected int a(int n2, int n3) {
        if (n2 == 7) {
            return this.a.a(n3, this.b, this.c);
        }
        return n3;
    }

    @Override
    protected int[] a(int[] arrn, int[] arrn2) {
        int[] arrn3 = new int[arrn2.length];
        for (int i2 = 0; i2 < arrn2.length; ++i2) {
            arrn3[i2] = arrn[i2] == 7 ? this.a.a(arrn2[i2], this.b, this.c) : arrn2[i2];
        }
        return arrn3;
    }
}

