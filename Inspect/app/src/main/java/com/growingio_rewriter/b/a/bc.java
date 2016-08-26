/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.bh;

class bc
extends bh {
    int a;

    public bc(byte[] arrby, int n2) {
        super(arrby);
        this.a = n2;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5) {
        if (n4 == 8 && n5 == this.a) {
            super.a_(n2, n3);
        } else {
            super.a(n2, n3, n4, n5);
        }
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n4 = arrn3.length - 1;
        for (int i2 = 0; i2 < n4; ++i2) {
            if (arrn3[i2] != 8 || arrn4[i2] != this.a || arrn3[i2 + 1] != 8 || arrn4[i2 + 1] != this.a) continue;
            int[] arrn5 = new int[++n4 - 2];
            int[] arrn6 = new int[n4 - 2];
            int n5 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                if (i3 == i2) {
                    ++i3;
                    continue;
                }
                arrn5[n5] = arrn3[i3];
                arrn6[n5++] = arrn4[i3];
            }
            arrn3 = arrn5;
            arrn4 = arrn6;
            break;
        }
        super.a(n2, n3, arrn, arrn2, arrn3, arrn4);
    }
}

