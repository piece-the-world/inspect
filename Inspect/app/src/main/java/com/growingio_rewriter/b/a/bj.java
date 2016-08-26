/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aZ;
import com.growingio.b.a.i;
import com.growingio.b.a.l;

public class bj {
    byte[] f;
    int g;

    public bj(aZ aZ2) {
        this(aZ2.f());
    }

    public bj(byte[] arrby) {
        this.f = arrby;
        this.g = l.a(arrby, 0);
    }

    public final int b() {
        return this.g;
    }

    public void c() throws i {
        int n2 = this.g;
        int n3 = 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = this.c(n3, i2);
        }
    }

    int c(int n2, int n3) throws i {
        int n4 = this.f[n2] & 255;
        if (n4 < 64) {
            this.a_(n2, n4);
            ++n2;
        } else if (n4 < 128) {
            n2 = this.b(n2, n4);
        } else {
            if (n4 < 247) {
                throw new i("bad frame_type in StackMapTable");
            }
            if (n4 == 247) {
                n2 = this.b(n2, n4);
            } else if (n4 < 251) {
                int n5 = l.a(this.f, n2 + 1);
                this.b(n2, n5, 251 - n4);
                n2 += 3;
            } else if (n4 == 251) {
                int n6 = l.a(this.f, n2 + 1);
                this.a_(n2, n6);
                n2 += 3;
            } else {
                n2 = n4 < 255 ? this.d(n2, n4) : this.a(n2);
            }
        }
        return n2;
    }

    public void a_(int n2, int n3) throws i {
    }

    private int b(int n2, int n3) throws i {
        int n4;
        int n5 = n2;
        if (n3 < 128) {
            n4 = n3 - 64;
        } else {
            n4 = l.a(this.f, n2 + 1);
            n2 += 2;
        }
        int n6 = this.f[n2 + 1] & 255;
        int n7 = 0;
        if (n6 == 7 || n6 == 8) {
            n7 = l.a(this.f, n2 + 2);
            this.a(n6, n7, n2 + 2);
            n2 += 2;
        }
        this.a(n5, n4, n6, n7);
        return n2 + 2;
    }

    public void a(int n2, int n3, int n4, int n5) throws i {
    }

    public void b(int n2, int n3, int n4) throws i {
    }

    private int d(int n2, int n3) throws i {
        int n4 = n3 - 251;
        int n5 = l.a(this.f, n2 + 1);
        int[] arrn = new int[n4];
        int[] arrn2 = new int[n4];
        int n6 = n2 + 3;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n7;
            arrn[i2] = n7 = this.f[n6] & 255;
            if (n7 == 7 || n7 == 8) {
                arrn2[i2] = l.a(this.f, n6 + 1);
                this.a(n7, arrn2[i2], n6 + 1);
                n6 += 3;
                continue;
            }
            arrn2[i2] = 0;
            ++n6;
        }
        this.a(n2, n5, arrn, arrn2);
        return n6;
    }

    public void a(int n2, int n3, int[] arrn, int[] arrn2) throws i {
    }

    private int a(int n2) throws i {
        int n3 = l.a(this.f, n2 + 1);
        int n4 = l.a(this.f, n2 + 3);
        int[] arrn = new int[n4];
        int[] arrn2 = new int[n4];
        int n5 = this.b(n2 + 5, n4, arrn, arrn2);
        int n6 = l.a(this.f, n5);
        int[] arrn3 = new int[n6];
        int[] arrn4 = new int[n6];
        n5 = this.b(n5 + 2, n6, arrn3, arrn4);
        this.a(n2, n3, arrn, arrn2, arrn3, arrn4);
        return n5;
    }

    public void a(int n2, int n3, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) throws i {
    }

    private int b(int n2, int n3, int[] arrn, int[] arrn2) {
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            arrn[i2] = n4 = this.f[n2++] & 255;
            if (n4 != 7 && n4 != 8) continue;
            arrn2[i2] = l.a(this.f, n2);
            this.a(n4, arrn2[i2], n2);
            n2 += 2;
        }
        return n2;
    }

    public void a(int n2, int n3, int n4) {
    }
}

