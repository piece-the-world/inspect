/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cv;
import com.tendcloud.tenddata.cz;
import com.tendcloud.tenddata.da;
import com.tendcloud.tenddata.db;
import com.tendcloud.tenddata.dd;
import com.tendcloud.tenddata.de;

public abstract class cy {
    static final int a = 16;
    static final int b = 2;
    static final int c = 273;
    static final int d = 4;
    static final int e = 64;
    static final int f = 4;
    static final int g = 14;
    static final int h = 128;
    static final int i = 4;
    static final int j = 16;
    static final int k = 15;
    static final int l = 4;
    final int m;
    final int[] n = new int[4];
    final de o = new de();
    final short[][] p = new short[12][16];
    final short[] q = new short[12];
    final short[] r = new short[12];
    final short[] s = new short[12];
    final short[] t = new short[12];
    final short[][] u = new short[12][16];
    final short[][] v = new short[4][64];
    final short[][] w = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
    final short[] x = new short[16];
    private static final int G = 2096879;
    private static final int H = 8166;
    private static final int I = 128;
    private static final int J = 16;
    private final dd K;
    final cv y;
    final b z;
    final a A;
    final a B;
    final int C;
    private int L = 0;
    private int M = 0;
    private final int N;
    private final int[][] O;
    private final int[][] P = new int[4][128];
    private final int[] Q = new int[16];
    int D = 0;
    int E = -1;
    private int R = 0;

    static final int a(int n2) {
        return n2 < 6 ? n2 - 2 : 3;
    }

    public static cy a(dd dd2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (Runtime.getRuntime().availableProcessors() <= 2) {
            return new cz(dd2, n2, n3, n4, n5, n6, n7, n8);
        }
        return new da(dd2, n2, n3, n4, n5, n6, n7, n8);
    }

    public static int b(int n2) {
        if (n2 <= 4) {
            return n2;
        }
        int n3 = n2;
        int n4 = 31;
        if ((n3 & -65536) == 0) {
            n3 <<= 16;
            n4 = 15;
        }
        if ((n3 & -16777216) == 0) {
            n3 <<= 8;
            n4 -= 8;
        }
        if ((n3 & -268435456) == 0) {
            n3 <<= 4;
            n4 -= 4;
        }
        if ((n3 & -1073741824) == 0) {
            n3 <<= 2;
            n4 -= 2;
        }
        if ((n3 & Integer.MIN_VALUE) == 0) {
            --n4;
        }
        return (n4 << 1) + (n2 >>> n4 - 1 & 1);
    }

    abstract int a();

    cy(dd dd2, cv cv2, int n2, int n3, int n4, int n5, int n6) {
        this.m = (1 << n4) - 1;
        this.K = dd2;
        this.y = cv2;
        this.C = n6;
        this.z = new b(n2, n3);
        this.A = new a(n4, n6);
        this.B = new a(n4, n6);
        this.N = cy.b(n5 - 1) + 1;
        this.O = new int[4][this.N];
        this.c();
    }

    public cv b() {
        return this.y;
    }

    public void c() {
        int n2;
        this.n[0] = 0;
        this.n[1] = 0;
        this.n[2] = 0;
        this.n[3] = 0;
        this.o.a();
        for (n2 = 0; n2 < this.p.length; ++n2) {
            dd.initProbs(this.p[n2]);
        }
        dd.initProbs(this.q);
        dd.initProbs(this.r);
        dd.initProbs(this.s);
        dd.initProbs(this.t);
        for (n2 = 0; n2 < this.u.length; ++n2) {
            dd.initProbs(this.u[n2]);
        }
        for (n2 = 0; n2 < this.v.length; ++n2) {
            dd.initProbs(this.v[n2]);
        }
        for (n2 = 0; n2 < this.w.length; ++n2) {
            dd.initProbs(this.w[n2]);
        }
        dd.initProbs(this.x);
        this.z.a();
        this.A.a();
        this.B.a();
        this.L = 0;
        this.M = 0;
        this.R += this.E + 1;
        this.E = -1;
    }

    public int d() {
        return this.R;
    }

    public void e() {
        this.R = 0;
    }

    public boolean f() {
        if (!this.y.b() && !this.i()) {
            return false;
        }
        while (this.R <= 2096879 && this.K.b() <= 8166) {
            if (this.j()) continue;
            return false;
        }
        return true;
    }

    private boolean i() {
        assert (this.E == -1);
        if (!this.y.a(0)) {
            return false;
        }
        this.c(1);
        this.K.a(this.p[this.o.b()], 0, 0);
        this.z.b();
        --this.E;
        assert (this.E == -1);
        ++this.R;
        assert (this.R == 1);
        return true;
    }

    private boolean j() {
        if (!this.y.a(this.E + 1)) {
            return false;
        }
        int n2 = this.a();
        assert (this.E >= 0);
        int n3 = this.y.f() - this.E & this.m;
        if (this.D == -1) {
            assert (n2 == 1);
            this.K.a(this.p[this.o.b()], n3, 0);
            this.z.c();
        } else {
            this.K.a(this.p[this.o.b()], n3, 1);
            if (this.D < 4) {
                assert (this.y.a(- this.E, this.n[this.D], n2) == n2);
                this.K.a(this.q, this.o.b(), 1);
                this.b(this.D, n2, n3);
            } else {
                assert (this.y.a(- this.E, this.D - 4, n2) == n2);
                this.K.a(this.q, this.o.b(), 0);
                this.a(this.D - 4, n2, n3);
            }
        }
        this.E -= n2;
        this.R += n2;
        return true;
    }

    private void a(int n2, int n3, int n4) {
        this.o.d();
        this.A.a(n3, n4);
        int n5 = cy.b(n2);
        this.K.a(this.v[cy.a(n3)], n5);
        if (n5 >= 4) {
            int n6 = (n5 >>> 1) - 1;
            int n7 = (2 | n5 & 1) << n6;
            int n8 = n2 - n7;
            if (n5 < 14) {
                this.K.c(this.w[n5 - 4], n8);
            } else {
                this.K.b(n8 >>> 4, n6 - 4);
                this.K.c(this.x, n8 & 15);
                --this.M;
            }
        }
        this.n[3] = this.n[2];
        this.n[2] = this.n[1];
        this.n[1] = this.n[0];
        this.n[0] = n2;
        --this.L;
    }

    private void b(int n2, int n3, int n4) {
        if (n2 == 0) {
            this.K.a(this.r, this.o.b(), 0);
            this.K.a(this.u[this.o.b()], n4, n3 == 1 ? 0 : 1);
        } else {
            int n5 = this.n[n2];
            this.K.a(this.r, this.o.b(), 1);
            if (n2 == 1) {
                this.K.a(this.s, this.o.b(), 0);
            } else {
                this.K.a(this.s, this.o.b(), 1);
                this.K.a(this.t, this.o.b(), n2 - 2);
                if (n2 == 3) {
                    this.n[3] = this.n[2];
                }
                this.n[2] = this.n[1];
            }
            this.n[1] = this.n[0];
            this.n[0] = n5;
        }
        if (n3 == 1) {
            this.o.f();
        } else {
            this.B.a(n3, n4);
            this.o.e();
        }
    }

    db g() {
        ++this.E;
        db db2 = this.y.a();
        assert (this.y.a(db2));
        return db2;
    }

    void c(int n2) {
        this.E += n2;
        this.y.skip(n2);
    }

    int a(de de2, int n2) {
        return dd.a(this.p[de2.b()][n2], 1);
    }

    int a(int n2, de de2) {
        return n2 + dd.a(this.q[de2.b()], 0);
    }

    int b(int n2, de de2) {
        return n2 + dd.a(this.q[de2.b()], 1);
    }

    int a(int n2, de de2, int n3) {
        return n2 + dd.a(this.r[de2.b()], 0) + dd.a(this.u[de2.b()][n3], 0);
    }

    int a(int n2, int n3, de de2, int n4) {
        int n5 = n2;
        if (n3 == 0) {
            n5 += dd.a(this.r[de2.b()], 0) + dd.a(this.u[de2.b()][n4], 1);
        } else {
            n5 += dd.a(this.r[de2.b()], 1);
            n5 = n3 == 1 ? (n5 += dd.a(this.s[de2.b()], 0)) : (n5 += dd.a(this.s[de2.b()], 1) + dd.a(this.t[de2.b()], n3 - 2));
        }
        return n5;
    }

    int b(int n2, int n3, de de2, int n4) {
        int n5 = this.a(de2, n4);
        int n6 = this.b(n5, de2);
        int n7 = this.a(n6, n2, de2, n4);
        return n7 + this.B.b(n3, n4);
    }

    int a(int n2, int n3, int n4, int n5) {
        int n6 = n2 + this.A.b(n4, n5);
        int n7 = cy.a(n4);
        if (n3 < 128) {
            n6 += this.P[n7][n3];
        } else {
            int n8 = cy.b(n3);
            n6 += this.O[n7][n8] + this.Q[n3 & 15];
        }
        return n6;
    }

    private void k() {
        int n2;
        int n3;
        int n4;
        this.L = 128;
        for (n3 = 0; n3 < 4; ++n3) {
            for (n4 = 0; n4 < this.N; ++n4) {
                this.O[n3][n4] = dd.b(this.v[n3], n4);
            }
            n4 = 14;
            while (n4 < this.N) {
                n2 = (n4 >>> 1) - 1 - 4;
                int[] arrn = this.O[n3];
                int n5 = n4++;
                arrn[n5] = arrn[n5] + dd.a(n2);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                this.P[n3][n4] = this.O[n3][n4];
            }
        }
        n3 = 4;
        for (n4 = 4; n4 < 14; ++n4) {
            n2 = (n4 >>> 1) - 1;
            int n6 = (2 | n4 & 1) << n2;
            int n7 = this.w[n4 - 4].length;
            for (int i2 = 0; i2 < n7; ++i2) {
                int n8 = n3 - n6;
                int n9 = dd.d(this.w[n4 - 4], n8);
                for (int i3 = 0; i3 < 4; ++i3) {
                    this.P[i3][n3] = this.O[i3][n4] + n9;
                }
                ++n3;
            }
        }
        assert (n3 == 128);
    }

    private void l() {
        this.M = 16;
        for (int i2 = 0; i2 < 16; ++i2) {
            this.Q[i2] = dd.d(this.x, i2);
        }
    }

    void h() {
        if (this.L <= 0) {
            this.k();
        }
        if (this.M <= 0) {
            this.l();
        }
        this.A.b();
        this.B.b();
    }

    class a {
        static final int a = 8;
        static final int b = 8;
        static final int c = 256;
        final short[] d;
        final short[][] e;
        final short[][] f;
        final short[] g;
        private static final int i = 32;
        private final int[] j;
        private final int[][] k;

        a(int n2, int n3) {
            this.d = new short[2];
            this.e = new short[16][8];
            this.f = new short[16][8];
            this.g = new short[256];
            int n4 = 1 << n2;
            this.j = new int[n4];
            int n5 = Math.max(n3 - 2 + 1, 16);
            this.k = new int[n4][n5];
        }

        void a() {
            int n2;
            dd.initProbs(this.d);
            for (n2 = 0; n2 < this.e.length; ++n2) {
                dd.initProbs(this.e[n2]);
            }
            for (n2 = 0; n2 < this.e.length; ++n2) {
                dd.initProbs(this.f[n2]);
            }
            dd.initProbs(this.g);
            for (n2 = 0; n2 < this.j.length; ++n2) {
                this.j[n2] = 0;
            }
        }

        void a(int n2, int n3) {
            if ((n2 -= 2) < 8) {
                cy.this.K.a(this.d, 0, 0);
                cy.this.K.a(this.e[n3], n2);
            } else {
                cy.this.K.a(this.d, 0, 1);
                if ((n2 -= 8) < 8) {
                    cy.this.K.a(this.d, 1, 0);
                    cy.this.K.a(this.f[n3], n2);
                } else {
                    cy.this.K.a(this.d, 1, 1);
                    cy.this.K.a(this.g, n2 - 8);
                }
            }
            int[] arrn = this.j;
            int n4 = n3;
            arrn[n4] = arrn[n4] - 1;
        }

        int b(int n2, int n3) {
            return this.k[n3][n2 - 2];
        }

        void b() {
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                if (this.j[i2] > 0) continue;
                this.j[i2] = 32;
                this.a(i2);
            }
        }

        private void a(int n2) {
            int n3;
            int n4 = dd.a(this.d[0], 0);
            for (n3 = 0; n3 < 8; ++n3) {
                this.k[n2][n3] = n4 + dd.b(this.e[n2], n3);
            }
            n4 = dd.a(this.d[0], 1);
            int n5 = dd.a(this.d[1], 0);
            while (n3 < 16) {
                this.k[n2][n3] = n4 + n5 + dd.b(this.f[n2], n3 - 8);
                ++n3;
            }
            n5 = dd.a(this.d[1], 1);
            while (n3 < this.k[n2].length) {
                this.k[n2][n3] = n4 + n5 + dd.b(this.g, n3 - 8 - 8);
                ++n3;
            }
        }
    }

    class b {
        private final int d;
        private final int e;
        a[] a;

        b(int n2, int n3) {
            this.d = n2;
            this.e = (1 << n3) - 1;
            this.a = new a[1 << n2 + n3];
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                this.a[i2] = new a();
            }
        }

        final int a(int n2, int n3) {
            int n4 = n2 >> 8 - this.d;
            int n5 = (n3 & this.e) << this.d;
            return n4 + n5;
        }

        void a() {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                this.a[i2].a();
            }
        }

        void b() {
            assert (cy.this.E >= 0);
            this.a[0].b();
        }

        void c() {
            assert (cy.this.E >= 0);
            int n2 = this.a(cy.this.y.b(1 + cy.this.E), cy.this.y.f() - cy.this.E);
            this.a[n2].b();
        }

        int a(int n2, int n3, int n4, int n5, de de2) {
            int n6 = dd.a(cy.this.p[de2.b()][n5 & cy.this.m], 0);
            int n7 = this.a(n4, n5);
            return n6 += de2.g() ? this.a[n7].a(n2) : this.a[n7].a(n2, n3);
        }

        class a {
            final short[] a;

            private a() {
                this.a = new short[768];
            }

            void a() {
                dd.initProbs(this.a);
            }

            void b() {
                int n2 = cy.this.y.b(cy.this.E) | 256;
                if (cy.this.o.g()) {
                    do {
                        int n3 = n2 >>> 8;
                        int n4 = n2 >>> 7 & 1;
                        cy.this.K.a(this.a, n3, n4);
                    } while ((n2 <<= 1) < 65536);
                } else {
                    int n5 = cy.this.y.b(cy.this.n[0] + 1 + cy.this.E);
                    int n6 = 256;
                    do {
                        int n7 = (n5 <<= 1) & n6;
                        int n8 = n6 + n7 + (n2 >>> 8);
                        int n9 = n2 >>> 7 & 1;
                        cy.this.K.a(this.a, n8, n9);
                        n6 &= ~ (n5 ^ (n2 <<= 1));
                    } while (n2 < 65536);
                }
                cy.this.o.c();
            }

            int a(int n2) {
                int n3 = 0;
                n2 |= 256;
                do {
                    int n4 = n2 >>> 8;
                    int n5 = n2 >>> 7 & 1;
                    n3 += dd.a(this.a[n4], n5);
                } while ((n2 <<= 1) < 65536);
                return n3;
            }

            int a(int n2, int n3) {
                int n4 = 0;
                int n5 = 256;
                n2 |= 256;
                do {
                    int n6 = (n3 <<= 1) & n5;
                    int n7 = n5 + n6 + (n2 >>> 8);
                    int n8 = n2 >>> 7 & 1;
                    n4 += dd.a(this.a[n7], n8);
                    n5 &= ~ (n3 ^ (n2 <<= 1));
                } while (n2 < 65536);
                return n4;
            }
        }

    }

}

