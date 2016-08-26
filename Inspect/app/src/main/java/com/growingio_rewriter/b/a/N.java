/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.L;
import com.growingio.b.a.M;
import com.growingio.b.a.l;

class N
extends M {
    int c;
    int h;

    N(int n2, int n3, int n4, int n5, int[] arrn, L l2) {
        super(n2, n3, arrn, l2);
        this.c = n4;
        this.h = n5;
    }

    @Override
    int a(int n2, byte[] arrby) {
        l.b(this.c, arrby, n2);
        l.b(this.h, arrby, n2 + 4);
        int n3 = this.f.length;
        n2 += 8;
        for (int i2 = 0; i2 < n3; ++i2) {
            l.b(this.f[i2], arrby, n2);
            n2 += 4;
        }
        return 8 + 4 * n3;
    }

    @Override
    int d() {
        return 8 + 4 * this.f.length;
    }
}

