/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.bh;

class bb
extends bh {
    private int a;
    private int b;
    private int c;

    public bb(byte[] arrby, int n2, int n3, int n4) {
        super(arrby);
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n4 = arrn.length;
        if (n4 < this.a) {
            super.a(n2, n3, arrn, arrn2, arrn3, arrn4);
            return;
        }
        int n5 = this.b == 4 || this.b == 3 ? 2 : 1;
        int[] arrn5 = new int[n4 + n5];
        int[] arrn6 = new int[n4 + n5];
        int n6 = this.a;
        int n7 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            if (n7 == n6) {
                n7 += n5;
            }
            arrn5[n7] = arrn[i2];
            arrn6[n7++] = arrn2[i2];
        }
        arrn5[n6] = this.b;
        arrn6[n6] = this.c;
        if (n5 > 1) {
            arrn5[n6 + 1] = 0;
            arrn6[n6 + 1] = 0;
        }
        super.a(n2, n3, arrn5, arrn6, arrn3, arrn4);
    }
}

