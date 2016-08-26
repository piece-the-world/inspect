/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.C;
import com.growingio.b.a.D;
import com.growingio.b.a.E;
import com.growingio.b.a.F;
import com.growingio.b.a.G;
import com.growingio.b.a.H;
import com.growingio.b.a.I;
import com.growingio.b.a.J;
import com.growingio.b.a.K;
import com.growingio.b.a.L;
import com.growingio.b.a.N;
import com.growingio.b.a.Q;
import com.growingio.b.a.Z;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ak;
import com.growingio.b.a.am;
import com.growingio.b.a.ay;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.l;
import com.growingio.b.a.y;
import com.growingio.b.a.z;
import java.util.ArrayList;

public class B
implements ay {
    protected y a;
    protected byte[] b;
    protected int c;
    protected int d;
    protected int e;
    private static final int[] di = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 0, 0, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 5, 5, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5};

    protected B(y y2) {
        this.a = y2;
        this.b = y2.j();
        this.a();
    }

    public void a() {
        this.e = 0;
        this.d = 0;
        this.c = this.d();
    }

    public void a(int n2) {
        this.d = n2;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public int b() {
        return this.e;
    }

    public y c() {
        return this.a;
    }

    public int d() {
        return this.b.length;
    }

    public int c(int n2) {
        return this.b[n2] & 255;
    }

    public int d(int n2) {
        return this.b[n2];
    }

    public void a(int n2, int n3) {
        this.b[n3] = (byte)n2;
    }

    public int e(int n2) {
        return l.a(this.b, n2);
    }

    public int f(int n2) {
        return l.b(this.b, n2);
    }

    public void b(int n2, int n3) {
        l.a(n2, this.b, n3);
    }

    public int g(int n2) {
        return l.c(this.b, n2);
    }

    public void c(int n2, int n3) {
        l.b(n2, this.b, n3);
    }

    public void a(byte[] arrby, int n2) {
        for (byte this.b[n2++] : arrby) {
        }
    }

    public boolean e() {
        return this.d < this.c;
    }

    public int f() throws i {
        int n2 = this.d;
        this.d = B.b(this.b, n2);
        return n2;
    }

    public int g() {
        return this.d;
    }

    public int h() throws i {
        return this.k(-1);
    }

    public int i() throws i {
        return this.k(0);
    }

    public int j() throws i {
        return this.k(1);
    }

    private int k(int n2) throws i {
        this.a();
        Q q2 = this.a.d();
        String string = this.a.a();
        int n3 = 0;
        while (this.e()) {
            int n4;
            int n5 = this.f();
            int n6 = this.c(n5);
            if (n6 == 187) {
                ++n3;
                continue;
            }
            if (n6 != 183 || !q2.r(n4 = l.a(this.b, n5 + 1)).equals("<init>") || --n3 >= 0) continue;
            if (n2 < 0) {
                return n5;
            }
            String string2 = q2.p(n4);
            if (string2.equals(string) != n2 > 0) break;
            return n5;
        }
        this.a();
        return -1;
    }

    public int a(byte[] arrby) throws i {
        return this.a(this.d, arrby, false);
    }

    public void a(int n2, byte[] arrby) throws i {
        this.a(n2, arrby, false);
    }

    public int b(int n2, byte[] arrby) throws i {
        return this.a(n2, arrby, false);
    }

    public int b(byte[] arrby) throws i {
        return this.a(this.d, arrby, true);
    }

    public void c(int n2, byte[] arrby) throws i {
        this.a(n2, arrby, true);
    }

    public int d(int n2, byte[] arrby) throws i {
        return this.a(n2, arrby, true);
    }

    private int a(int n2, byte[] arrby, boolean bl2) throws i {
        int n3 = arrby.length;
        if (n3 <= 0) {
            return n2;
        }
        int n4 = n2 = this.a((int)n2, (int)n3, (boolean)bl2).a;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b[n4++] = arrby[i2];
        }
        return n2;
    }

    public int h(int n2) throws i {
        return this.a((int)this.d, (int)n2, (boolean)false).a;
    }

    public int d(int n2, int n3) throws i {
        return this.a((int)n2, (int)n3, (boolean)false).b;
    }

    public int i(int n2) throws i {
        return this.a((int)this.d, (int)n2, (boolean)true).a;
    }

    public int e(int n2, int n3) throws i {
        return this.a((int)n2, (int)n3, (boolean)true).b;
    }

    public F a(int n2, int n3, boolean bl2) throws i {
        int n4;
        byte[] arrby;
        F f2 = new F();
        if (n3 <= 0) {
            f2.a = n2;
            f2.b = 0;
            return f2;
        }
        if (this.b.length + n3 > 32767) {
            arrby = this.a(this.b, n2, n3, bl2, this.c().l(), this.a, f2);
            n2 = f2.a;
            n4 = n3;
        } else {
            int n5 = this.d;
            arrby = B.a(this.b, n2, n3, bl2, this.c().l(), this.a);
            n4 = arrby.length - this.b.length;
            f2.a = n2;
            f2.b = n4;
            if (n5 >= n2) {
                this.d = n5 + n4;
            }
            if (this.e > n2 || this.e == n2 && bl2) {
                this.e += n4;
            }
        }
        this.a.b(arrby);
        this.b = arrby;
        this.c = this.d();
        this.f(n2, n4);
        return f2;
    }

    protected void f(int n2, int n3) {
    }

    public void a(Z z2, int n2) {
        this.a.l().a(0, z2, n2);
    }

    public int c(byte[] arrby) {
        int n2 = this.d();
        int n3 = arrby.length;
        if (n3 <= 0) {
            return n2;
        }
        this.j(n3);
        byte[] arrby2 = this.b;
        for (int i2 = 0; i2 < n3; ++i2) {
            arrby2[i2 + n2] = arrby[i2];
        }
        return n2;
    }

    public void j(int n2) {
        int n3;
        byte[] arrby = this.b;
        int n4 = arrby.length;
        byte[] arrby2 = new byte[n4 + n2];
        for (n3 = 0; n3 < n4; ++n3) {
            arrby2[n3] = arrby[n3];
        }
        for (n3 = n4; n3 < n4 + n2; ++n3) {
            arrby2[n3] = 0;
        }
        this.a.b(arrby2);
        this.b = arrby2;
        this.c = this.d();
    }

    public void b(Z z2, int n2) {
        Z z3 = this.a.l();
        z3.a(z3.a(), z2, n2);
    }

    static int b(byte[] arrby, int n2) throws i {
        int n3;
        try {
            n3 = arrby[n2] & 255;
        }
        catch (IndexOutOfBoundsException var3_3) {
            throw new i("invalid opcode address");
        }
        try {
            int n4 = di[n3];
            if (n4 > 0) {
                return n2 + n4;
            }
            if (n3 == 196) {
                if (arrby[n2 + 1] == -124) {
                    return n2 + 6;
                }
                return n2 + 4;
            }
            int n5 = (n2 & -4) + 8;
            if (n3 == 171) {
                int n6 = l.c(arrby, n5);
                return n5 + n6 * 8 + 4;
            }
            if (n3 == 170) {
                int n7 = l.c(arrby, n5);
                int n8 = l.c(arrby, n5 + 4);
                return n5 + (n8 - n7 + 1) * 4 + 8;
            }
        }
        catch (IndexOutOfBoundsException var3_5) {
            // empty catch block
        }
        throw new i(n3);
    }

    static byte[] a(byte[] arrby, int n2, int n3, boolean bl2, Z z2, y y2) throws i {
        if (n3 <= 0) {
            return arrby;
        }
        try {
            return B.b(arrby, n2, n3, bl2, z2, y2);
        }
        catch (C var6_6) {
            try {
                return B.b(arrby, n2, n3 + 3 & -4, bl2, z2, y2);
            }
            catch (C var7_7) {
                throw new RuntimeException("fatal error?");
            }
        }
    }

    private static byte[] b(byte[] arrby, int n2, int n3, boolean bl2, Z z2, y y2) throws i, C {
        am am2;
        am am3;
        aP aP2;
        aZ aZ2;
        int n4 = arrby.length;
        byte[] arrby2 = new byte[n4 + n3];
        B.a(arrby, n2, n3, n4, arrby2, bl2);
        z2.a(n2, n3, bl2);
        ak ak2 = (ak)y2.a("LineNumberTable");
        if (ak2 != null) {
            ak2.a(n2, n3, bl2);
        }
        if ((am3 = (am)y2.a("LocalVariableTable")) != null) {
            am3.a(n2, n3, bl2);
        }
        if ((am2 = (am)y2.a("LocalVariableTypeTable")) != null) {
            am2.a(n2, n3, bl2);
        }
        if ((aZ2 = (aZ)y2.a("StackMapTable")) != null) {
            aZ2.a(n2, n3, bl2);
        }
        if ((aP2 = (aP)y2.a("StackMap")) != null) {
            aP2.a(n2, n3, bl2);
        }
        return arrby2;
    }

    private static void a(byte[] arrby, int n2, int n3, int n4, byte[] arrby2, boolean bl2) throws i, C {
        int n5 = 0;
        int n6 = 0;
        while (n5 < n4) {
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            if (n5 == n2) {
                n7 = n6 + n3;
                while (n6 < n7) {
                    arrby2[n6++] = 0;
                }
            }
            int n13 = B.b(arrby, n5);
            n7 = arrby[n5] & 255;
            if (153 <= n7 && n7 <= 168 || n7 == 198 || n7 == 199) {
                n9 = arrby[n5 + 1] << 8 | arrby[n5 + 2] & 255;
                n9 = B.a(n5, n9, n2, n3, bl2);
                arrby2[n6] = arrby[n5];
                l.a(n9, arrby2, n6 + 1);
                n6 += 3;
            } else if (n7 == 200 || n7 == 201) {
                n9 = l.c(arrby, n5 + 1);
                n9 = B.a(n5, n9, n2, n3, bl2);
                arrby2[n6++] = arrby[n5];
                l.b(n9, arrby2, n6);
                n6 += 4;
            } else if (n7 == 170) {
                if (n5 != n6 && (n3 & 3) != 0) {
                    throw new C();
                }
                n9 = (n5 & -4) + 4;
                n6 = B.a(arrby2, n6, arrby, n5, n9);
                n11 = B.a(n5, l.c(arrby, n9), n2, n3, bl2);
                l.b(n11, arrby2, n6);
                n8 = l.c(arrby, n9 + 4);
                l.b(n8, arrby2, n6 + 4);
                n10 = l.c(arrby, n9 + 8);
                l.b(n10, arrby2, n6 + 8);
                n6 += 12;
                n12 = n9 + 12;
                n9 = n12 + (n10 - n8 + 1) * 4;
                while (n12 < n9) {
                    int n14 = B.a(n5, l.c(arrby, n12), n2, n3, bl2);
                    l.b(n14, arrby2, n6);
                    n6 += 4;
                    n12 += 4;
                }
            } else if (n7 == 171) {
                if (n5 != n6 && (n3 & 3) != 0) {
                    throw new C();
                }
                n9 = (n5 & -4) + 4;
                n6 = B.a(arrby2, n6, arrby, n5, n9);
                n11 = B.a(n5, l.c(arrby, n9), n2, n3, bl2);
                l.b(n11, arrby2, n6);
                n8 = l.c(arrby, n9 + 4);
                l.b(n8, arrby2, n6 + 4);
                n6 += 8;
                n10 = n9 + 8;
                n9 = n10 + n8 * 8;
                while (n10 < n9) {
                    l.a(arrby, n10, arrby2, n6);
                    n12 = B.a(n5, l.c(arrby, n10 + 4), n2, n3, bl2);
                    l.b(n12, arrby2, n6 + 4);
                    n6 += 8;
                    n10 += 8;
                }
            } else {
                while (n5 < n13) {
                    arrby2[n6++] = arrby[n5++];
                }
            }
            n5 = n13;
        }
    }

    private static int a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        switch (n4 - n3) {
            case 4: {
                arrby[n2++] = arrby2[n3++];
            }
            case 3: {
                arrby[n2++] = arrby2[n3++];
            }
            case 2: {
                arrby[n2++] = arrby2[n3++];
            }
            case 1: {
                arrby[n2++] = arrby2[n3++];
            }
        }
        return n2;
    }

    private static int a(int n2, int n3, int n4, int n5, boolean bl2) {
        int n6 = n2 + n3;
        if (n2 < n4) {
            if (n4 < n6 || bl2 && n4 == n6) {
                n3 += n5;
            }
        } else if (n2 == n4) {
            if (n6 < n4) {
                n3 -= n5;
            }
        } else if (n6 < n4 || !bl2 && n4 == n6) {
            n3 -= n5;
        }
        return n3;
    }

    static byte[] a(byte[] arrby, Z z2, y y2, z z3) throws i {
        L l2 = new L(0, 0, 0, z2, y2);
        ArrayList arrayList = B.a(arrby, arrby.length, l2);
        while (z3 != null) {
            B.a(z3, arrayList);
            z3 = z3.a;
        }
        byte[] arrby2 = B.a(arrby, 0, 0, false, arrayList, l2);
        return arrby2;
    }

    private static void a(z z2, ArrayList arrayList) {
        int n2 = z2.b;
        J j2 = new J(n2, z2.c);
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            if (n2 >= ((D)arrayList.get((int)i2)).b) continue;
            arrayList.add(i2, j2);
            return;
        }
        arrayList.add(j2);
    }

    private byte[] a(byte[] arrby, int n2, int n3, boolean bl2, Z z2, y y2, F f2) throws i {
        if (n3 <= 0) {
            return arrby;
        }
        L l2 = new L(this.d, this.e, n2, z2, y2);
        ArrayList arrayList = B.a(arrby, arrby.length, l2);
        byte[] arrby2 = B.a(arrby, n2, n3, bl2, arrayList, l2);
        this.d = l2.a;
        this.e = l2.c;
        int n4 = l2.b;
        if (n4 == this.d && !bl2) {
            this.d += n3;
        }
        if (bl2) {
            n4 -= n3;
        }
        f2.a = n4;
        f2.b = n3;
        return arrby2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static byte[] a(byte[] var0, int var1_1, int var2_2, boolean var3_3, ArrayList var4_4, L var5_5) throws i {
        var6_6 = var4_4.size();
        if (var2_2 > 0) {
            var5_5.a(var1_1, var2_2, var3_3);
            for (var7_7 = 0; var7_7 < var6_6; ++var7_7) {
                ((D)var4_4.get(var7_7)).a(var1_1, var2_2, var3_3);
            }
        }
        var7_7 = 1;
        do lbl-1000: // 3 sources:
        {
            if (var7_7 != 0) ** GOTO lbl11
            ** GOTO lbl26
lbl11: // 1 sources:
            var7_7 = 0;
            var8_8 = 0;
            do {
                if (var8_8 >= var6_6) ** GOTO lbl-1000
                var9_9 = (D)var4_4.get(var8_8);
                if (var9_9.a()) {
                    var7_7 = 1;
                    var10_10 = var9_9.a;
                    var11_11 = var9_9.c();
                    var5_5.a(var10_10, var11_11, false);
                    for (var12_12 = 0; var12_12 < var6_6; ++var12_12) {
                        ((D)var4_4.get(var12_12)).a(var10_10, var11_11, false);
                    }
                }
                ++var8_8;
            } while (true);
lbl26: // 3 sources:
            for (var8_8 = 0; var8_8 < var6_6; ++var8_8) {
                var9_9 = (D)var4_4.get(var8_8);
                var10_10 = var9_9.b();
                if (var10_10 <= 0) continue;
                var7_7 = 1;
                var11_11 = var9_9.a;
                var5_5.a(var11_11, var10_10, false);
                for (var12_12 = 0; var12_12 < var6_6; ++var12_12) {
                    ((D)var4_4.get(var12_12)).a(var11_11, var10_10, false);
                }
            }
        } while (var7_7 != 0);
        return B.a(var0, var4_4, var1_1, var2_2);
    }

    private static ArrayList a(byte[] arrby, int n2, L l2) throws i {
        ArrayList<D> arrayList = new ArrayList<D>();
        int n3 = 0;
        while (n3 < n2) {
            int n4;
            int n5;
            int n6;
            int n7 = B.b(arrby, n3);
            int n8 = arrby[n3] & 255;
            if (153 <= n8 && n8 <= 168 || n8 == 198 || n8 == 199) {
                n5 = arrby[n3 + 1] << 8 | arrby[n3 + 2] & 255;
                E e2 = n8 == 167 || n8 == 168 ? new H(n3, n5) : new G(n3, n5);
                arrayList.add(e2);
            } else if (n8 == 200 || n8 == 201) {
                n5 = l.c(arrby, n3 + 1);
                arrayList.add(new I(n3, n5));
            } else if (n8 == 170) {
                n5 = (n3 & -4) + 4;
                int n9 = l.c(arrby, n5);
                n4 = l.c(arrby, n5 + 4);
                n6 = l.c(arrby, n5 + 8);
                int n10 = n5 + 12;
                int n11 = n6 - n4 + 1;
                int[] arrn = new int[n11];
                for (int i2 = 0; i2 < n11; ++i2) {
                    arrn[i2] = l.c(arrby, n10);
                    n10 += 4;
                }
                arrayList.add(new N(n3, n9, n4, n6, arrn, l2));
            } else if (n8 == 171) {
                n5 = (n3 & -4) + 4;
                int n12 = l.c(arrby, n5);
                n4 = l.c(arrby, n5 + 4);
                n6 = n5 + 8;
                int[] arrn = new int[n4];
                int[] arrn2 = new int[n4];
                for (int i3 = 0; i3 < n4; ++i3) {
                    arrn[i3] = l.c(arrby, n6);
                    arrn2[i3] = l.c(arrby, n6 + 4);
                    n6 += 8;
                }
                arrayList.add(new K(n3, n12, arrn, arrn2, l2));
            }
            n3 = n7;
        }
        return arrayList;
    }

    private static byte[] a(byte[] arrby, ArrayList arrayList, int n2, int n3) throws i {
        D d2;
        int n4;
        int n5 = arrayList.size();
        int n6 = arrby.length + n3;
        for (int i2 = 0; i2 < n5; ++i2) {
            D d3 = (D)arrayList.get(i2);
            n6 += d3.c();
        }
        byte[] arrby2 = new byte[n6];
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = arrby.length;
        if (0 < n5) {
            d2 = (D)arrayList.get(0);
            n4 = d2.b;
        } else {
            d2 = null;
            n4 = n10;
        }
        while (n7 < n10) {
            int n11;
            if (n7 == n2) {
                n11 = n8 + n3;
                while (n8 < n11) {
                    arrby2[n8++] = 0;
                }
            }
            if (n7 != n4) {
                arrby2[n8++] = arrby[n7++];
                continue;
            }
            n11 = d2.a(n7, arrby, n8, arrby2);
            n7 += n11;
            n8 += n11 + d2.c();
            if (++n9 < n5) {
                d2 = (D)arrayList.get(n9);
                n4 = d2.b;
                continue;
            }
            d2 = null;
            n4 = n10;
        }
        return arrby2;
    }
}

