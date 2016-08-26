/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.V;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.Z;
import com.growingio.b.a.ay;
import com.growingio.b.a.n;
import com.growingio.b.a.y;

public class o
extends n
implements ay,
Cloneable {
    public static final com.growingio.b.o a = Q.s;
    Q b;
    int c;
    int d;
    Z e;
    private int di;

    public o(Q q2, int n2, int n3) {
        this.b = q2;
        this.c = n2;
        this.d = n3;
        this.e = new Z(q2);
        this.di = 0;
    }

    public o(Q q2) {
        this(q2, 0, 0);
    }

    @Override
    public Object clone() {
        try {
            o o2 = (o)super.clone();
            o2.e = (Z)this.e.clone();
            return o2;
        }
        catch (CloneNotSupportedException var1_2) {
            throw new RuntimeException(var1_2);
        }
    }

    public Q c() {
        return this.b;
    }

    public Z d() {
        return this.e;
    }

    public y e() {
        return new y(this.b, this.c, this.d, this.g(), this.e);
    }

    public int f() {
        return this.a();
    }

    public byte[] g() {
        return this.b();
    }

    public int h() {
        return this.c;
    }

    public void d(int n2) {
        this.c = n2;
    }

    public int i() {
        return this.d;
    }

    public void e(int n2) {
        this.d = n2;
    }

    public void a(boolean bl2, com.growingio.b.o[] arro, int n2) {
        if (!bl2) {
            ++n2;
        }
        if (arro != null) {
            com.growingio.b.o o2 = com.growingio.b.o.m;
            com.growingio.b.o o3 = com.growingio.b.o.k;
            for (com.growingio.b.o o4 : arro) {
                if (o4 == o2 || o4 == o3) {
                    n2 += 2;
                    continue;
                }
                ++n2;
            }
        }
        this.d = n2;
    }

    public void f(int n2) {
        this.d += n2;
    }

    public void a(int n2, int n3, int n4, com.growingio.b.o o2) {
        this.b(n2, n3, n4, this.b.a(o2));
    }

    public void a(int n2, int n3, int n4, String string) {
        this.b(n2, n3, n4, this.b.a(string));
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.e.a(n2, n3, n4, n5);
    }

    public int j() {
        return this.a();
    }

    @Override
    public int a(int n2) {
        return super.a(n2);
    }

    public int g(int n2) {
        int n3 = this.a(n2);
        int n4 = this.a(n2 + 1);
        return (n3 << 8) + (n4 & 255);
    }

    public int h(int n2) {
        int n3 = this.g(n2);
        int n4 = this.g(n2 + 2);
        return (n3 << 16) + (n4 & 65535);
    }

    @Override
    public void a(int n2, int n3) {
        super.a(n2, n3);
    }

    public void c(int n2, int n3) {
        this.a(n2, n3 >> 8);
        this.a(n2 + 1, n3);
    }

    public void d(int n2, int n3) {
        this.c(n2, n3 >> 16);
        this.c(n2 + 2, n3);
    }

    @Override
    public void b(int n2) {
        super.b(n2);
    }

    public void i(int n2) {
        this.a(n2 >> 24, n2 >> 16, n2 >> 8, n2);
    }

    @Override
    public void c(int n2) {
        super.c(n2);
    }

    public void j(int n2) {
        this.b(n2);
        this.k(dh[n2]);
    }

    public void k(int n2) {
        this.l(this.di + n2);
    }

    public int k() {
        return this.di;
    }

    public void l(int n2) {
        this.di = n2;
        if (this.di > this.c) {
            this.c = this.di;
        }
    }

    public void m(int n2) {
        this.b(n2 >> 8, n2);
    }

    public void n(int n2) {
        if (n2 < 4) {
            this.j(42 + n2);
        } else if (n2 < 256) {
            this.j(25);
            this.b(n2);
        } else {
            this.j(196);
            this.j(25);
            this.m(n2);
        }
    }

    public void o(int n2) {
        if (n2 < 4) {
            this.j(75 + n2);
        } else if (n2 < 256) {
            this.j(58);
            this.b(n2);
        } else {
            this.j(196);
            this.j(58);
            this.m(n2);
        }
    }

    public void p(int n2) {
        if (n2 < 6 && -2 < n2) {
            this.j(3 + n2);
        } else if (n2 <= 127 && -128 <= n2) {
            this.j(16);
            this.b(n2);
        } else if (n2 <= 32767 && -32768 <= n2) {
            this.j(17);
            this.b(n2 >> 8);
            this.b(n2);
        } else {
            this.y(this.b.L(n2));
        }
    }

    public void a(com.growingio.b.o o2) {
        if (o2.r()) {
            if (o2 == com.growingio.b.o.k) {
                this.j(9);
            } else if (o2 == com.growingio.b.o.l) {
                this.j(11);
            } else if (o2 == com.growingio.b.o.m) {
                this.j(14);
            } else {
                if (o2 == com.growingio.b.o.n) {
                    throw new RuntimeException("void type?");
                }
                this.j(3);
            }
        } else {
            this.j(1);
        }
    }

    public void q(int n2) {
        if (n2 < 4) {
            this.j(26 + n2);
        } else if (n2 < 256) {
            this.j(21);
            this.b(n2);
        } else {
            this.j(196);
            this.j(21);
            this.m(n2);
        }
    }

    public void r(int n2) {
        if (n2 < 4) {
            this.j(59 + n2);
        } else if (n2 < 256) {
            this.j(54);
            this.b(n2);
        } else {
            this.j(196);
            this.j(54);
            this.m(n2);
        }
    }

    public void a(long l2) {
        if (l2 == 0 || l2 == 1) {
            this.j(9 + (int)l2);
        } else {
            this.b(l2);
        }
    }

    public void s(int n2) {
        if (n2 < 4) {
            this.j(30 + n2);
        } else if (n2 < 256) {
            this.j(22);
            this.b(n2);
        } else {
            this.j(196);
            this.j(22);
            this.m(n2);
        }
    }

    public void t(int n2) {
        if (n2 < 4) {
            this.j(63 + n2);
        } else if (n2 < 256) {
            this.j(55);
            this.b(n2);
        } else {
            this.j(196);
            this.j(55);
            this.m(n2);
        }
    }

    public void a(double d2) {
        if (d2 == 0.0 || d2 == 1.0) {
            this.j(14 + (int)d2);
        } else {
            this.b(d2);
        }
    }

    public void u(int n2) {
        if (n2 < 4) {
            this.j(38 + n2);
        } else if (n2 < 256) {
            this.j(24);
            this.b(n2);
        } else {
            this.j(196);
            this.j(24);
            this.m(n2);
        }
    }

    public void v(int n2) {
        if (n2 < 4) {
            this.j(71 + n2);
        } else if (n2 < 256) {
            this.j(57);
            this.b(n2);
        } else {
            this.j(196);
            this.j(57);
            this.m(n2);
        }
    }

    public void a(float f2) {
        if (f2 == 0.0f || f2 == 1.0f || f2 == 2.0f) {
            this.j(11 + (int)f2);
        } else {
            this.y(this.b.a(f2));
        }
    }

    public void w(int n2) {
        if (n2 < 4) {
            this.j(34 + n2);
        } else if (n2 < 256) {
            this.j(23);
            this.b(n2);
        } else {
            this.j(196);
            this.j(23);
            this.m(n2);
        }
    }

    public void x(int n2) {
        if (n2 < 4) {
            this.j(67 + n2);
        } else if (n2 < 256) {
            this.j(56);
            this.b(n2);
        } else {
            this.j(196);
            this.j(56);
            this.m(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2, com.growingio.b.o o2) {
        if (!o2.r()) {
            this.n(n2);
            return 1;
        }
        if (o2 == com.growingio.b.o.f || o2 == com.growingio.b.o.g || o2 == com.growingio.b.o.h || o2 == com.growingio.b.o.i || o2 == com.growingio.b.o.j) {
            this.q(n2);
            return 1;
        }
        if (o2 == com.growingio.b.o.k) {
            this.s(n2);
            return 2;
        }
        if (o2 == com.growingio.b.o.l) {
            this.w(n2);
            return 1;
        }
        if (o2 != com.growingio.b.o.m) throw new RuntimeException("void type?");
        this.u(n2);
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b(int n2, com.growingio.b.o o2) {
        if (!o2.r()) {
            this.o(n2);
            return 1;
        }
        if (o2 == com.growingio.b.o.f || o2 == com.growingio.b.o.g || o2 == com.growingio.b.o.h || o2 == com.growingio.b.o.i || o2 == com.growingio.b.o.j) {
            this.r(n2);
            return 1;
        }
        if (o2 == com.growingio.b.o.k) {
            this.t(n2);
            return 2;
        }
        if (o2 == com.growingio.b.o.l) {
            this.x(n2);
            return 1;
        }
        if (o2 != com.growingio.b.o.m) throw new RuntimeException("void type?");
        this.v(n2);
        return 2;
    }

    public int a(com.growingio.b.o[] arro, int n2) {
        int n3 = 0;
        if (arro != null) {
            int n4 = arro.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                n3 += this.a(n3 + n2, arro[i2]);
            }
        }
        return n3;
    }

    public void b(com.growingio.b.o o2) {
        this.j(192);
        this.m(this.b.a(o2));
    }

    public void a(String string) {
        this.j(192);
        this.m(this.b.a(string));
    }

    public void b(String string) {
        this.j(193);
        this.m(this.b.a(string));
    }

    public void a(com.growingio.b.o o2, String string, String string2) {
        this.b(180);
        int n2 = this.b.a(o2);
        this.m(this.b.a(n2, string, string2));
        this.k(T.h(string2) - 1);
    }

    public void a(String string, String string2, String string3) {
        this.b(180);
        int n2 = this.b.a(string);
        this.m(this.b.a(n2, string2, string3));
        this.k(T.h(string3) - 1);
    }

    public void b(com.growingio.b.o o2, String string, String string2) {
        this.b(178);
        int n2 = this.b.a(o2);
        this.m(this.b.a(n2, string, string2));
        this.k(T.h(string2));
    }

    public void b(String string, String string2, String string3) {
        this.b(178);
        int n2 = this.b.a(string);
        this.m(this.b.a(n2, string2, string3));
        this.k(T.h(string3));
    }

    public void a(com.growingio.b.o o2, String string, com.growingio.b.o o3, com.growingio.b.o[] arro) {
        String string2 = T.a(o3, arro);
        this.c(o2, string, string2);
    }

    public void c(com.growingio.b.o o2, String string, String string2) {
        boolean bl2 = o2 == null ? false : o2.x();
        this.a(bl2, this.b.a(o2), string, string2);
    }

    public void c(String string, String string2, String string3) {
        this.a(false, this.b.a(string), string2, string3);
    }

    public void a(int n2, String string, String string2) {
        this.a(false, n2, string, string2);
    }

    public void a(boolean bl2, int n2, String string, String string2) {
        int n3 = bl2 ? this.b.c(n2, string, string2) : this.b.b(n2, string, string2);
        this.a(n3, string2);
    }

    public void a(int n2, String string) {
        this.b(183);
        this.m(n2);
        this.k(T.h(string) - 1);
    }

    public void b(com.growingio.b.o o2, String string, com.growingio.b.o o3, com.growingio.b.o[] arro) {
        String string2 = T.a(o3, arro);
        this.d(o2, string, string2);
    }

    public void d(com.growingio.b.o o2, String string, String string2) {
        this.b(this.b.a(o2), string, string2);
    }

    public void d(String string, String string2, String string3) {
        this.b(this.b.a(string), string2, string3);
    }

    public void b(int n2, String string, String string2) {
        this.b(184);
        this.m(this.b.b(n2, string, string2));
        this.k(T.h(string2));
    }

    public void c(com.growingio.b.o o2, String string, com.growingio.b.o o3, com.growingio.b.o[] arro) {
        String string2 = T.a(o3, arro);
        this.e(o2, string, string2);
    }

    public void e(com.growingio.b.o o2, String string, String string2) {
        this.c(this.b.a(o2), string, string2);
    }

    public void e(String string, String string2, String string3) {
        this.c(this.b.a(string), string2, string3);
    }

    public void c(int n2, String string, String string2) {
        this.b(182);
        this.m(this.b.b(n2, string, string2));
        this.k(T.h(string2) - 1);
    }

    public void a(com.growingio.b.o o2, String string, com.growingio.b.o o3, com.growingio.b.o[] arro, int n2) {
        String string2 = T.a(o3, arro);
        this.a(o2, string, string2, n2);
    }

    public void a(com.growingio.b.o o2, String string, String string2, int n2) {
        this.a(this.b.a(o2), string, string2, n2);
    }

    public void a(String string, String string2, String string3, int n2) {
        this.a(this.b.a(string), string2, string3, n2);
    }

    public void a(int n2, String string, String string2, int n3) {
        this.b(185);
        this.m(this.b.c(n2, string, string2));
        this.b(n3);
        this.b(0);
        this.k(T.h(string2) - 1);
    }

    public void d(int n2, String string, String string2) {
        int n3 = this.b.a(string, string2);
        int n4 = this.b.f(n2, n3);
        this.b(186);
        this.m(n4);
        this.b(0, 0);
        this.k(T.h(string2));
    }

    public void c(String string) {
        this.y(this.b.b(string));
    }

    public void y(int n2) {
        if (n2 > 255) {
            this.j(19);
            this.m(n2);
        } else {
            this.j(18);
            this.b(n2);
        }
    }

    public void b(long l2) {
        this.j(20);
        this.m(this.b.a(l2));
    }

    public void b(double d2) {
        this.j(20);
        this.m(this.b.a(d2));
    }

    public void c(com.growingio.b.o o2) {
        this.j(187);
        this.m(this.b.a(o2));
    }

    public void d(String string) {
        this.j(187);
        this.m(this.b.a(string));
    }

    public void e(String string) {
        this.j(189);
        this.m(this.b.a(string));
    }

    public void a(com.growingio.b.o o2, int n2) {
        this.p(n2);
        this.j(189);
        this.m(this.b.a(o2));
    }

    public void e(int n2, int n3) {
        this.p(n3);
        this.j(188);
        this.b(n2);
    }

    public int a(com.growingio.b.o o2, int[] arrn) {
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.p(arrn[i2]);
        }
        this.k(n2);
        return this.b(o2, n2);
    }

    public int b(com.growingio.b.o o2, int n2) {
        this.b(197);
        this.m(this.b.a(o2));
        this.b(n2);
        this.k(1 - n2);
        return n2;
    }

    public int a(String string, int n2) {
        this.b(197);
        this.m(this.b.a(string));
        this.b(n2);
        this.k(1 - n2);
        return n2;
    }

    public void f(com.growingio.b.o o2, String string, String string2) {
        this.a(o2, null, string, string2);
    }

    public void f(String string, String string2, String string3) {
        this.a(null, string, string2, string3);
    }

    private void a(com.growingio.b.o o2, String string, String string2, String string3) {
        this.b(181);
        int n2 = string == null ? this.b.a(o2) : this.b.a(string);
        this.m(this.b.a(n2, string2, string3));
        this.k(-1 - T.h(string3));
    }

    public void g(com.growingio.b.o o2, String string, String string2) {
        this.b(o2, null, string, string2);
    }

    public void g(String string, String string2, String string3) {
        this.b(null, string, string2, string3);
    }

    private void b(com.growingio.b.o o2, String string, String string2, String string3) {
        this.b(179);
        int n2 = string == null ? this.b.a(o2) : this.b.a(string);
        this.m(this.b.a(n2, string2, string3));
        this.k(- T.h(string3));
    }

    public void d(com.growingio.b.o o2) {
        if (o2 == null) {
            this.j(177);
        } else if (o2.r()) {
            V v2 = (V)o2;
            this.j(v2.ab());
        } else {
            this.j(176);
        }
    }

    public void z(int n2) {
        if (n2 < 256) {
            this.j(169);
            this.b(n2);
        } else {
            this.j(196);
            this.j(169);
            this.m(n2);
        }
    }

    public void f(String string) {
        this.b("java.lang.System", "err", "Ljava/io/PrintStream;");
        this.c(string);
        this.e("java.io.PrintStream", "println", "(Ljava/lang/String;)V");
    }
}

