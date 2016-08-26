/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aZ;
import com.growingio.b.a.bg;
import com.growingio.b.a.l;

class bi
extends bg {
    bi(aZ aZ2, int n2, int n3) {
        super(aZ2, n2, n3, false);
    }

    @Override
    void b(int n2, int n3, int n4, int n5) {
        int n6;
        this.c = n6 + n3 + ((n6 = this.c) == 0 ? 0 : 1);
        int n7 = n3;
        if (this.a == this.c) {
            n7 = n3 - this.b;
        } else if (this.a == n6) {
            n7 = n3 + this.b;
        } else {
            return;
        }
        if (n3 < 64) {
            if (n7 < 64) {
                this.f[n2] = (byte)(n7 + n4);
            } else {
                byte[] arrby = bi.a(this.f, n2, 2);
                arrby[n2] = (byte)n5;
                l.a(n7, arrby, n2 + 1);
                this.d = arrby;
            }
        } else if (n7 < 64) {
            byte[] arrby = bi.b(this.f, n2, 2);
            arrby[n2] = (byte)(n7 + n4);
            this.d = arrby;
        } else {
            l.a(n7, this.f, n2 + 1);
        }
    }

    static byte[] b(byte[] arrby, int n2, int n3) {
        n2 += n3;
        int n4 = arrby.length;
        byte[] arrby2 = new byte[n4 - n3];
        for (int i2 = 0; i2 < n4; ++i2) {
            arrby2[i2 - (i2 < n2 ? 0 : n3)] = arrby[i2];
        }
        return arrby2;
    }

    @Override
    void b(int n2, int n3) {
        int n4;
        this.c = n4 + n3 + ((n4 = this.c) == 0 ? 0 : 1);
        int n5 = n3;
        if (this.a == this.c) {
            n5 = n3 - this.b;
        } else if (this.a == n4) {
            n5 = n3 + this.b;
        } else {
            return;
        }
        l.a(n5, this.f, n2 + 1);
    }
}

