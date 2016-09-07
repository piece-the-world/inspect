/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cv;
import com.tendcloud.tenddata.cy;
import com.tendcloud.tenddata.db;
import com.tendcloud.tenddata.dc;
import com.tendcloud.tenddata.dd;
import com.tendcloud.tenddata.de;

final class da
extends cy {
    private static final int H = 4096;
    private static int I = 4096;
    private static int J = 4096;
    private final dc[] K = new dc[4096];
    private int L = 0;
    private int M = 0;
    private db N;
    private final int[] O = new int[4];
    private final de P = new de();

    da(dd dd2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        super(dd2, new cv(n5, Math.max(n6, I), J, n7, 273, n8), n2, n3, n4, n5, n7);
        for (int i2 = 0; i2 < 4096; ++i2) {
            this.K[i2] = new dc();
        }
    }

    @Override
    public void c() {
        this.L = 0;
        this.M = 0;
        super.c();
    }

    private int i() {
        this.M = this.L;
        int n2 = this.K[this.L].d;
        do {
            dc dc2 = this.K[this.L];
            if (dc2.f) {
                this.K[n2].d = this.L;
                this.K[n2].e = -1;
                this.L = n2--;
                if (dc2.g) {
                    this.K[n2].d = n2 + 1;
                    this.K[n2].e = dc2.i;
                    this.L = n2;
                    n2 = dc2.h;
                }
            }
            int n3 = this.K[n2].d;
            this.K[n2].d = this.L;
            this.L = n2;
            n2 = n3;
        } while (this.L > 0);
        this.L = this.K[0].d;
        this.D = this.K[this.L].e;
        return this.L;
    }

    @Override
    int a() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.L < this.M) {
            int n8 = this.K[this.L].d - this.L;
            this.L = this.K[this.L].d;
            this.D = this.K[this.L].e;
            return n8;
        }
        assert (this.L == this.M);
        this.L = 0;
        this.M = 0;
        this.D = -1;
        if (this.E == -1) {
            this.N = this.g();
        }
        if ((n4 = Math.min(this.y.e(), 273)) < 2) {
            return 1;
        }
        int n9 = 0;
        for (n5 = 0; n5 < 4; ++n5) {
            this.O[n5] = this.y.b(this.n[n5], n4);
            if (this.O[n5] < 2) {
                this.O[n5] = 0;
                continue;
            }
            if (this.O[n5] <= this.O[n9]) continue;
            n9 = n5;
        }
        if (this.O[n9] >= this.C) {
            this.D = n9;
            this.c(this.O[n9] - 1);
            return this.O[n9];
        }
        n5 = 0;
        int n10 = 0;
        if (this.N.c > 0) {
            n5 = this.N.a[this.N.c - 1];
            n10 = this.N.b[this.N.c - 1];
            if (n5 >= this.C) {
                this.D = n10 + 4;
                this.c(n5 - 1);
                return n5;
            }
        }
        int n11 = this.y.b(0);
        int n12 = this.y.b(this.n[0] + 1);
        if (n5 < 2 && n11 != n12 && this.O[n9] < 2) {
            return 1;
        }
        int n13 = this.y.f();
        int n14 = n13 & this.m;
        int n15 = this.y.b(1);
        int n16 = this.z.a(n11, n12, n15, n13, this.o);
        this.K[1].a(n16, 0, -1);
        n15 = this.a(this.o, n14);
        n16 = this.b(n15, this.o);
        if (n12 == n11 && (n3 = this.a(n16, this.o, n14)) < this.K[1].c) {
            this.K[1].a(n3, 0, 0);
        }
        this.M = Math.max(n5, this.O[n9]);
        if (this.M < 2) {
            assert (this.M == 0);
            this.D = this.K[1].e;
            return 1;
        }
        this.h();
        this.K[0].a.a(this.o);
        System.arraycopy(this.n, 0, this.K[0].b, 0, 4);
        for (n3 = this.M; n3 >= 2; --n3) {
            this.K[n3].a();
        }
        for (n3 = 0; n3 < 4; ++n3) {
            n6 = this.O[n3];
            if (n6 < 2) continue;
            n7 = this.a(n16, n3, this.o, n14);
            do {
                if ((n2 = n7 + this.B.b(n6, n14)) >= this.K[n6].c) continue;
                this.K[n6].a(n2, 0, n3);
            } while (--n6 >= 2);
        }
        n3 = Math.max(this.O[0] + 1, 2);
        if (n3 <= n5) {
            n6 = this.a(n15, this.o);
            n7 = 0;
            while (n3 > this.N.a[n7]) {
                ++n7;
            }
            do {
                int n17;
                if ((n17 = this.a(n6, n2 = this.N.b[n7], n3, n14)) < this.K[n3].c) {
                    this.K[n3].a(n17, 0, n2 + 4);
                }
                if (n3 == this.N.a[n7] && ++n7 == this.N.c) break;
                ++n3;
            } while (true);
        }
        n4 = Math.min(this.y.e(), 4095);
        while (++this.L < this.M) {
            this.N = this.g();
            if (this.N.c > 0 && this.N.a[this.N.c - 1] >= this.C) break;
            n14 = ++n13 & this.m;
            this.j();
            n15 = this.K[this.L].c + this.a(this.K[this.L].a, n14);
            n16 = this.b(n15, this.K[this.L].a);
            this.b(n13, n14, --n4, n16);
            if (n4 < 2) continue;
            n3 = this.c(n13, n14, n4, n16);
            if (this.N.c <= 0) continue;
            this.a(n13, n14, n4, n15, n3);
        }
        return this.i();
    }

    private void j() {
        int n2 = this.K[this.L].d;
        assert (n2 < this.L);
        if (this.K[this.L].f) {
            --n2;
            if (this.K[this.L].g) {
                this.K[this.L].a.a(this.K[this.K[this.L].h].a);
                if (this.K[this.L].i < 4) {
                    this.K[this.L].a.e();
                } else {
                    this.K[this.L].a.d();
                }
            } else {
                this.K[this.L].a.a(this.K[n2].a);
            }
            this.K[this.L].a.c();
        } else {
            this.K[this.L].a.a(this.K[n2].a);
        }
        if (n2 == this.L - 1) {
            assert (this.K[this.L].e == 0 || this.K[this.L].e == -1);
            if (this.K[this.L].e == 0) {
                this.K[this.L].a.f();
            } else {
                this.K[this.L].a.c();
            }
            System.arraycopy(this.K[n2].b, 0, this.K[this.L].b, 0, 4);
        } else {
            int n3;
            if (this.K[this.L].f && this.K[this.L].g) {
                n2 = this.K[this.L].h;
                n3 = this.K[this.L].i;
                this.K[this.L].a.e();
            } else {
                n3 = this.K[this.L].e;
                if (n3 < 4) {
                    this.K[this.L].a.e();
                } else {
                    this.K[this.L].a.d();
                }
            }
            if (n3 < 4) {
                int n4;
                this.K[this.L].b[0] = this.K[n2].b[n3];
                for (n4 = 1; n4 <= n3; ++n4) {
                    this.K[this.L].b[n4] = this.K[n2].b[n4 - 1];
                }
                while (n4 < 4) {
                    this.K[this.L].b[n4] = this.K[n2].b[n4];
                    ++n4;
                }
            } else {
                this.K[this.L].b[0] = n3 - 4;
                System.arraycopy(this.K[n2].b, 0, this.K[this.L].b, 1, 3);
            }
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        boolean bl2 = false;
        int n9 = this.y.b(0);
        int n10 = this.K[this.L].c + this.z.a(n9, n6 = this.y.b(this.K[this.L].b[0] + 1), this.y.b(1), n2, this.K[this.L].a);
        if (n10 < this.K[this.L + 1].c) {
            this.K[this.L + 1].a(n10, this.L, -1);
            bl2 = true;
        }
        if (n6 == n9 && (this.K[this.L + 1].d == this.L || this.K[this.L + 1].e != 0) && (n7 = this.a(n5, this.K[this.L].a, n3)) <= this.K[this.L + 1].c) {
            this.K[this.L + 1].a(n7, this.L, 0);
            bl2 = true;
        }
        if (!bl2 && n6 != n9 && n4 > 2 && (n8 = this.y.a(1, this.K[this.L].b[0], n7 = Math.min(this.C, n4 - 1))) >= 2) {
            this.P.a(this.K[this.L].a);
            this.P.c();
            int n11 = n2 + 1 & this.m;
            int n12 = n10 + this.b(0, n8, this.P, n11);
            int n13 = this.L + 1 + n8;
            while (this.M < n13) {
                this.K[++this.M].a();
            }
            if (n12 < this.K[n13].c) {
                this.K[n13].b(n12, this.L, 0);
            }
        }
    }

    private int c(int n2, int n3, int n4, int n5) {
        int n6 = 2;
        int n7 = Math.min(n4, this.C);
        for (int i2 = 0; i2 < 4; ++i2) {
            int n8;
            int n9;
            int n10 = this.y.b(this.K[this.L].b[i2], n7);
            if (n10 < 2) continue;
            while (this.M < this.L + n10) {
                this.K[++this.M].a();
            }
            int n11 = this.a(n5, i2, this.K[this.L].a, n3);
            for (n9 = n10; n9 >= 2; --n9) {
                n8 = n11 + this.B.b(n9, n3);
                if (n8 >= this.K[this.L + n9].c) continue;
                this.K[this.L + n9].a(n8, this.L, i2);
            }
            if (i2 == 0) {
                n6 = n10 + 1;
            }
            if ((n8 = this.y.a(n10 + 1, this.K[this.L].b[i2], n9 = Math.min(this.C, n4 - n10 - 1))) < 2) continue;
            int n12 = n11 + this.B.b(n10, n3);
            this.P.a(this.K[this.L].a);
            this.P.e();
            int n13 = this.y.a(n10, 0);
            int n14 = this.y.b(0);
            int n15 = this.y.a(n10, 1);
            n12 += this.z.a(n13, n14, n15, n2 + n10, this.P);
            this.P.c();
            int n16 = n2 + n10 + 1 & this.m;
            n12 += this.b(0, n8, this.P, n16);
            int n17 = this.L + n10 + 1 + n8;
            while (this.M < n17) {
                this.K[++this.M].a();
            }
            if (n12 >= this.K[n17].c) continue;
            this.K[n17].a(n12, this.L, i2, n10, 0);
        }
        return n6;
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        if (this.N.a[this.N.c - 1] > n4) {
            this.N.c = 0;
            while (this.N.a[this.N.c] < n4) {
                ++this.N.c;
            }
            this.N.a[this.N.c++] = n4;
        }
        if (this.N.a[this.N.c - 1] < n6) {
            return;
        }
        while (this.M < this.L + this.N.a[this.N.c - 1]) {
            this.K[++this.M].a();
        }
        int n7 = this.a(n5, this.K[this.L].a);
        int n8 = 0;
        while (n6 > this.N.a[n8]) {
            ++n8;
        }
        int n9 = n6;
        do {
            int n10;
            int n11;
            if ((n10 = this.a(n7, n11 = this.N.b[n8], n9, n3)) < this.K[this.L + n9].c) {
                this.K[this.L + n9].a(n10, this.L, n11 + 4);
            }
            if (n9 == this.N.a[n8]) {
                int n12 = Math.min(this.C, n4 - n9 - 1);
                int n13 = this.y.a(n9 + 1, n11, n12);
                if (n13 >= 2) {
                    this.P.a(this.K[this.L].a);
                    this.P.d();
                    int n14 = this.y.a(n9, 0);
                    int n15 = this.y.b(0);
                    int n16 = this.y.a(n9, 1);
                    int n17 = n10 + this.z.a(n14, n15, n16, n2 + n9, this.P);
                    this.P.c();
                    int n18 = n2 + n9 + 1 & this.m;
                    n17 += this.b(0, n13, this.P, n18);
                    int n19 = this.L + n9 + 1 + n13;
                    while (this.M < n19) {
                        this.K[++this.M].a();
                    }
                    if (n17 < this.K[n19].c) {
                        this.K[n19].a(n17, this.L, n11 + 4, n9, 0);
                    }
                }
                if (++n8 == this.N.c) break;
            }
            ++n9;
        } while (true);
    }
}

