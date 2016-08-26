/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aZ;
import com.growingio.b.a.bj;
import com.growingio.b.a.i;
import com.growingio.b.a.l;

class bg
extends bj {
    private aZ h;
    int a;
    int b;
    int c;
    byte[] d;
    boolean e;

    public bg(aZ aZ2, int n2, int n3, boolean bl2) {
        super(aZ2);
        this.h = aZ2;
        this.a = n2;
        this.b = n3;
        this.c = 0;
        this.d = null;
        this.e = bl2;
    }

    public void a() throws i {
        this.c();
        if (this.d != null) {
            this.h.a(this.d);
        }
    }

    @Override
    public void a_(int n2, int n3) {
        this.b(n2, n3, 0, 251);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5) {
        this.b(n2, n3, 64, 247);
    }

    void b(int n2, int n3, int n4, int n5) {
        int n6;
        boolean bl2;
        this.c = n6 + n3 + ((n6 = this.c) == 0 ? 0 : 1);
        if (this.e) {
            bl2 = n6 < this.a && this.a <= this.c;
        } else {
            boolean bl3 = bl2 = n6 <= this.a && this.a < this.c;
        }
        if (bl2) {
            int n7 = n3 + this.b;
            this.c += this.b;
            if (n7 < 64) {
                this.f[n2] = (byte)(n7 + n4);
            } else if (n3 < 64) {
                byte[] arrby = bg.a(this.f, n2, 2);
                arrby[n2] = (byte)n5;
                l.a(n7, arrby, n2 + 1);
                this.d = arrby;
            } else {
                l.a(n7, this.f, n2 + 1);
            }
        }
    }

    static byte[] a(byte[] arrby, int n2, int n3) {
        int n4 = arrby.length;
        byte[] arrby2 = new byte[n4 + n3];
        for (int i2 = 0; i2 < n4; ++i2) {
            arrby2[i2 + (i2 < n2 ? 0 : n3)] = arrby[i2];
        }
        return arrby2;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.b(n2, n3);
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2) {
        this.b(n2, n3);
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        this.b(n2, n3);
    }

    void b(int n2, int n3) {
        boolean bl2;
        int n4;
        this.c = n4 + n3 + ((n4 = this.c) == 0 ? 0 : 1);
        if (this.e) {
            bl2 = n4 < this.a && this.a <= this.c;
        } else {
            boolean bl3 = bl2 = n4 <= this.a && this.a < this.c;
        }
        if (bl2) {
            int n5 = n3 + this.b;
            l.a(n5, this.f, n2 + 1);
            this.c += this.b;
        }
    }
}

