/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cv;
import com.tendcloud.tenddata.cy;
import com.tendcloud.tenddata.db;
import com.tendcloud.tenddata.dd;

final class cz
extends cy {
    private static int G = 1;
    private static int H = 272;
    private db I = null;

    cz(dd dd2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        super(dd2, new cv(n5, Math.max(n6, G), H, n7, 273, n8), n2, n3, n4, n5, n7);
    }

    private boolean a(int n2, int n3) {
        return n2 < n3 >>> 7;
    }

    @Override
    int a() {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.E == -1) {
            this.I = this.g();
        }
        this.D = -1;
        int n6 = Math.min(this.y.e(), 273);
        if (n6 < 2) {
            return 1;
        }
        int n7 = 0;
        int n8 = 0;
        for (n5 = 0; n5 < 4; ++n5) {
            n4 = this.y.b(this.n[n5], n6);
            if (n4 < 2) continue;
            if (n4 >= this.C) {
                this.D = n5;
                this.c(n4 - 1);
                return n4;
            }
            if (n4 <= n7) continue;
            n8 = n5;
            n7 = n4;
        }
        n5 = 0;
        n4 = 0;
        if (this.I.c > 0) {
            n5 = this.I.a[this.I.c - 1];
            n4 = this.I.b[this.I.c - 1];
            if (n5 >= this.C) {
                this.D = n4 + 4;
                this.c(n5 - 1);
                return n5;
            }
            while (this.I.c > 1 && n5 == this.I.a[this.I.c - 2] + 1 && this.a(this.I.b[this.I.c - 2], n4)) {
                --this.I.c;
                n5 = this.I.a[this.I.c - 1];
                n4 = this.I.b[this.I.c - 1];
            }
            if (n5 == 2 && n4 >= 128) {
                n5 = 1;
            }
        }
        if (n7 >= 2 && (n7 + 1 >= n5 || n7 + 2 >= n5 && n4 >= 512 || n7 + 3 >= n5 && n4 >= 32768)) {
            this.D = n8;
            this.c(n7 - 1);
            return n7;
        }
        if (n5 < 2 || n6 <= 2) {
            return 1;
        }
        this.I = this.g();
        if (this.I.c > 0) {
            n3 = this.I.a[this.I.c - 1];
            n2 = this.I.b[this.I.c - 1];
            if (n3 >= n5 && n2 < n4 || n3 == n5 + 1 && !this.a(n4, n2) || n3 > n5 + 1 || n3 + 1 >= n5 && n5 >= 3 && this.a(n2, n4)) {
                return 1;
            }
        }
        n3 = Math.max(n5 - 1, 2);
        for (n2 = 0; n2 < 4; ++n2) {
            if (this.y.b(this.n[n2], n3) != n3) continue;
            return 1;
        }
        this.D = n4 + 4;
        this.c(n5 - 2);
        return n5;
    }
}

