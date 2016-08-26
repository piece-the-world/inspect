/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.D;
import com.growingio.b.a.L;
import com.growingio.b.a.i;
import com.growingio.b.a.l;

abstract class M
extends D {
    int d;
    int e;
    int[] f;
    L g;

    M(int n2, int n3, int[] arrn, L l2) {
        super(n2);
        this.d = 3 - (n2 & 3);
        this.e = n3;
        this.f = arrn;
        this.g = l2;
    }

    @Override
    void a(int n2, int n3, boolean bl2) {
        int n4 = this.a;
        this.e = M.a(n4, this.e, n2, n3, bl2);
        int n5 = this.f.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            this.f[i2] = M.a(n4, this.f[i2], n2, n3, bl2);
        }
        super.a(n2, n3, bl2);
    }

    @Override
    int b() {
        int n2 = 3 - (this.a & 3);
        if (n2 > this.d) {
            int n3 = n2 - this.d;
            this.d = n2;
            return n3;
        }
        return 0;
    }

    @Override
    int c() {
        return this.d - (3 - (this.b & 3));
    }

    @Override
    int a(int n2, byte[] arrby, int n3, byte[] arrby2) throws i {
        int n4 = 3 - (this.a & 3);
        int n5 = this.d - n4;
        int n6 = 5 + (3 - (this.b & 3)) + this.d();
        if (n5 > 0) {
            this.a(n6, n5);
        }
        arrby2[n3++] = arrby[n2];
        while (n4-- > 0) {
            arrby2[n3++] = 0;
        }
        l.b(this.e, arrby2, n3);
        int n7 = this.a(n3 + 4, arrby2);
        n3 += n7 + 4;
        while (n5-- > 0) {
            arrby2[n3++] = 0;
        }
        return 5 + (3 - (this.b & 3)) + n7;
    }

    abstract int a(int var1, byte[] var2);

    abstract int d();

    void a(int n2, int n3) throws i {
        this.g.a(this.a + n2, n3);
        if (this.e == n2) {
            this.e -= n3;
        }
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            if (this.f[i2] != n2) continue;
            int[] arrn = this.f;
            int n4 = i2;
            arrn[n4] = arrn[n4] - n3;
        }
    }
}

