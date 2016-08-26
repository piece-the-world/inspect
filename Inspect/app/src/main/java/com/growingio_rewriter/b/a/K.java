/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.L;
import com.growingio.b.a.M;
import com.growingio.b.a.l;

class K
extends M {
    int[] c;

    K(int n2, int n3, int[] arrn, int[] arrn2, L l2) {
        super(n2, n3, arrn2, l2);
        this.c = arrn;
    }

    @Override
    int a(int n2, byte[] arrby) {
        int n3 = this.c.length;
        l.b(n3, arrby, n2);
        n2 += 4;
        for (int i2 = 0; i2 < n3; ++i2) {
            l.b(this.c[i2], arrby, n2);
            l.b(this.f[i2], arrby, n2 + 4);
            n2 += 8;
        }
        return 4 + 8 * n3;
    }

    @Override
    int d() {
        return 4 + 8 * this.c.length;
    }
}

