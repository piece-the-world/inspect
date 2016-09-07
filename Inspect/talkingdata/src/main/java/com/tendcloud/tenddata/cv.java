/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cw;
import com.tendcloud.tenddata.db;
import java.io.OutputStream;

final class cv {
    private final int f;
    private final int g;
    final int a;
    final int b;
    final byte[] c;
    int d = -1;
    private int h = -1;
    private boolean i = false;
    private int j = 0;
    private int k = 0;
    private final cw l;
    private final int[] m;
    private final db n;
    private final int o;
    private final int p;
    private int q = -1;
    private int r;

    static void a(int[] arrn, int n2) {
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (arrn[i2] <= n2) {
                arrn[i2] = 0;
                continue;
            }
            int[] arrn2 = arrn;
            int n3 = i2;
            arrn2[n3] = arrn2[n3] - n2;
        }
    }

    private static int a(int n2, int n3, int n4, int n5) {
        int n6 = n3 + n2;
        int n7 = n4 + n5;
        int n8 = Math.min(n2 / 2 + 4096, 536870912);
        return n6 + n7 + n8;
    }

    cv(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c = new byte[cv.a(n2, n3, n4, n6)];
        this.f = n3 + n2;
        this.g = n4 + n6;
        this.a = n6;
        this.b = n5;
        this.l = new cw(n2);
        this.p = n2 + 1;
        this.m = new int[this.p];
        this.r = this.p;
        this.n = new db(n5 - 1);
        this.o = n7 > 0 ? n7 : 4 + n5 / 4;
    }

    private int g() {
        int n2 = this.c(4, 4);
        if (n2 != 0) {
            if (++this.r == Integer.MAX_VALUE) {
                int n3 = Integer.MAX_VALUE - this.p;
                this.l.d(n3);
                cv.a(this.m, n3);
                this.r -= n3;
            }
            if (++this.q == this.p) {
                this.q = 0;
            }
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public db a() {
        this.n.c = 0;
        var1_1 = this.a;
        var2_2 = this.b;
        var3_3 = this.g();
        if (var3_3 < var1_1) {
            if (var3_3 == 0) {
                return this.n;
            }
            var1_1 = var3_3;
            if (var2_2 > var3_3) {
                var2_2 = var3_3;
            }
        }
        this.l.a(this.c, this.d);
        var4_4 = this.r - this.l.a();
        var5_5 = this.r - this.l.b();
        var6_6 = this.l.c();
        this.l.c(this.r);
        this.m[this.q] = var6_6;
        var7_7 = 0;
        if (var4_4 < this.p && this.c[this.d - var4_4] == this.c[this.d]) {
            var7_7 = 2;
            this.n.a[0] = 2;
            this.n.b[0] = var4_4 - 1;
            this.n.c = 1;
        }
        if (var4_4 != var5_5 && var5_5 < this.p && this.c[this.d - var5_5] == this.c[this.d]) {
            var7_7 = 3;
            this.n.b[this.n.c++] = var5_5 - 1;
            var4_4 = var5_5;
        }
        if (this.n.c > 0) {
            while (var7_7 < var1_1 && this.c[this.d + var7_7 - var4_4] == this.c[this.d + var7_7]) {
                ++var7_7;
            }
            this.n.a[this.n.c - 1] = var7_7;
            if (var7_7 >= var2_2) {
                return this.n;
            }
        }
        if (var7_7 < 3) {
            var7_7 = 3;
        }
        var8_8 = this.o;
        do lbl-1000: // 4 sources:
        {
            var9_9 = this.r - var6_6;
            if (var8_8-- == 0) return this.n;
            if (var9_9 >= this.p) {
                return this.n;
            }
            var6_6 = this.m[this.q - var9_9 + (var9_9 > this.q ? this.p : 0)];
            if (this.c[this.d + var7_7 - var9_9] != this.c[this.d + var7_7] || this.c[this.d - var9_9] != this.c[this.d]) ** GOTO lbl-1000
            var10_10 = 0;
            while (++var10_10 < var1_1 && this.c[this.d + var10_10 - var9_9] == this.c[this.d + var10_10]) {
            }
            if (var10_10 <= var7_7) ** GOTO lbl-1000
            var7_7 = var10_10;
            this.n.a[this.n.c] = var10_10;
            this.n.b[this.n.c] = var9_9 - 1;
            ++this.n.c;
        } while (var10_10 < var2_2);
        return this.n;
    }

    public void skip(int n2) {
        assert (n2 >= 0);
        while (n2-- > 0) {
            if (this.g() == 0) continue;
            this.l.a(this.c, this.d);
            this.m[this.q] = this.l.c();
            this.l.c(this.r);
        }
    }

    public void a(int n2, byte[] arrby) {
        assert (!this.b());
        assert (this.j == 0);
        if (arrby != null) {
            int n3 = Math.min(arrby.length, n2);
            int n4 = arrby.length - n3;
            System.arraycopy(arrby, n4, this.c, 0, n3);
            this.j += n3;
            this.skip(n3);
        }
    }

    private void h() {
        int n2 = this.d + 1 - this.f & -16;
        int n3 = this.j - n2;
        System.arraycopy(this.c, n2, this.c, 0, n3);
        this.d -= n2;
        this.h -= n2;
        this.j -= n2;
    }

    public int a(byte[] arrby, int n2, int n3) {
        assert (!this.i);
        if (this.d >= this.c.length - this.g) {
            this.h();
        }
        if (n3 > this.c.length - this.j) {
            n3 = this.c.length - this.j;
        }
        System.arraycopy(arrby, n2, this.c, this.j, n3);
        this.j += n3;
        if (this.j >= this.g) {
            this.h = this.j - this.g;
        }
        this.i();
        return n3;
    }

    private void i() {
        if (this.k > 0 && this.d < this.h) {
            this.d -= this.k;
            int n2 = this.k;
            this.k = 0;
            this.skip(n2);
            assert (this.k < n2);
        }
    }

    public boolean b() {
        return this.d != -1;
    }

    public void c() {
        this.h = this.j - 1;
        this.i();
    }

    public void d() {
        this.h = this.j - 1;
        this.i = true;
        this.i();
    }

    public boolean a(int n2) {
        return this.d - n2 < this.h;
    }

    public void a(OutputStream outputStream, int n2, int n3) {
        outputStream.write(this.c, this.d + 1 - n2, n3);
    }

    public int e() {
        assert (this.b());
        return this.j - this.d;
    }

    public int f() {
        return this.d;
    }

    public int b(int n2) {
        return this.c[this.d - n2] & 255;
    }

    public int a(int n2, int n3) {
        return this.c[this.d + n2 - n3] & 255;
    }

    public int b(int n2, int n3) {
        int n4;
        int n5 = this.d - n2 - 1;
        for (n4 = 0; n4 < n3 && this.c[this.d + n4] == this.c[n5 + n4]; ++n4) {
        }
        return n4;
    }

    public int a(int n2, int n3, int n4) {
        int n5;
        int n6 = this.d + n2;
        int n7 = n6 - n3 - 1;
        for (n5 = 0; n5 < n4 && this.c[n6 + n5] == this.c[n7 + n5]; ++n5) {
        }
        return n5;
    }

    public boolean a(db db2) {
        int n2 = Math.min(this.e(), this.a);
        for (int i2 = 0; i2 < db2.c; ++i2) {
            if (this.b(db2.b[i2], n2) == db2.a[i2]) continue;
            return false;
        }
        return true;
    }

    int c(int n2, int n3) {
        assert (n2 >= n3);
        ++this.d;
        int n4 = this.j - this.d;
        if (!(n4 >= n2 || n4 >= n3 && this.i)) {
            ++this.k;
            n4 = 0;
        }
        return n4;
    }
}

