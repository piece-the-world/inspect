/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.B;
import com.growingio.d.a.a.n;
import com.growingio.d.a.a.o;
import com.growingio.d.a.f;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class j
extends n {
    private static final String a = "Ljava/lang/Class;";
    private static final u b = u.b("java/lang/Byte");
    private static final u c = u.b("java/lang/Boolean");
    private static final u dm = u.b("java/lang/Short");
    private static final u dn = u.b("java/lang/Character");
    private static final u do = u.b("java/lang/Integer");
    private static final u dp = u.b("java/lang/Float");
    private static final u dq = u.b("java/lang/Long");
    private static final u dr = u.b("java/lang/Double");
    private static final u ds = u.b("java/lang/Number");
    private static final u dt = u.b("java/lang/Object");
    private static final o du = o.a("boolean booleanValue()");
    private static final o dv = o.a("char charValue()");
    private static final o dw = o.a("int intValue()");
    private static final o dx = o.a("float floatValue()");
    private static final o dy = o.a("long longValue()");
    private static final o dz = o.a("double doubleValue()");
    public static final int f = 96;
    public static final int g = 100;
    public static final int h = 104;
    public static final int i = 108;
    public static final int j = 112;
    public static final int k = 116;
    public static final int l = 120;
    public static final int m = 122;
    public static final int a_ = 124;
    public static final int b_ = 126;
    public static final int c_ = 128;
    public static final int d_ = 130;
    public static final int e_ = 153;
    public static final int f_ = 154;
    public static final int g_ = 155;
    public static final int h_ = 156;
    public static final int i_ = 157;
    public static final int j_ = 158;
    private final int dA;
    private final u dB;
    private final u[] dC;
    private final List<u> dD = new ArrayList<u>();

    public j(r r2, int n2, String string, String string2) {
        this(327680, r2, n2, string, string2);
        if (this.getClass() != j.class) {
            // empty if block
        }
    }

    protected j(int n2, r r2, int n3, String string, String string2) {
        super(n2, n3, string2, r2);
        this.dA = n3;
        this.dB = u.e(string2);
        this.dC = u.d(string2);
    }

    public j(int n2, o o2, r r2) {
        this(r2, n2, null, o2.b());
    }

    public j(int n2, o o2, String string, u[] arru, f f2) {
        this(n2, o2, f2.a(n2, o2.a(), o2.b(), string, j.a(arru)));
    }

    private static String[] a(u[] arru) {
        if (arru == null) {
            return null;
        }
        String[] arrstring = new String[arru.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring[i2] = arru[i2].e();
        }
        return arrstring;
    }

    public void a(boolean bl2) {
        this.b(bl2 ? 1 : 0);
    }

    public void b(int n2) {
        if (n2 >= -1 && n2 <= 5) {
            this.n_.a_(3 + n2);
        } else if (n2 >= -128 && n2 <= 127) {
            this.n_.a(16, n2);
        } else if (n2 >= -32768 && n2 <= 32767) {
            this.n_.a(17, n2);
        } else {
            this.n_.a(n2);
        }
    }

    public void a(long l2) {
        if (l2 == 0 || l2 == 1) {
            this.n_.a_(9 + (int)l2);
        } else {
            this.n_.a(l2);
        }
    }

    public void a(float f2) {
        int n2 = Float.floatToIntBits(f2);
        if ((long)n2 == 0 || n2 == 1065353216 || n2 == 1073741824) {
            this.n_.a_(11 + (int)f2);
        } else {
            this.n_.a(Float.valueOf(f2));
        }
    }

    public void a(double d2) {
        long l2 = Double.doubleToLongBits(d2);
        if (l2 == 0 || l2 == 4607182418800017408L) {
            this.n_.a_(14 + (int)d2);
        } else {
            this.n_.a(d2);
        }
    }

    public void a(String string) {
        if (string == null) {
            this.n_.a_(1);
        } else {
            this.n_.a(string);
        }
    }

    public void a(u u2) {
        if (u2 == null) {
            this.n_.a_(1);
        } else {
            switch (u2.a()) {
                case 1: {
                    this.n_.b(178, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 2: {
                    this.n_.b(178, "java/lang/Character", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 3: {
                    this.n_.b(178, "java/lang/Byte", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 4: {
                    this.n_.b(178, "java/lang/Short", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 5: {
                    this.n_.b(178, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 6: {
                    this.n_.b(178, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 7: {
                    this.n_.b(178, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                case 8: {
                    this.n_.b(178, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
                    break;
                }
                default: {
                    this.n_.a(u2);
                }
            }
        }
    }

    public void a(m m2) {
        this.n_.a(m2);
    }

    private int i(int n2) {
        int n3 = (this.dA & 8) == 0 ? 1 : 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += this.dC[i2].j();
        }
        return n3;
    }

    private void a(u u2, int n2) {
        this.n_.b(u2.a(21), n2);
    }

    private void b(u u2, int n2) {
        this.n_.b(u2.a(54), n2);
    }

    public void d() {
        if ((this.dA & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.n_.b(25, 0);
    }

    public void c(int n2) {
        this.a(this.dC[n2], this.i(n2));
    }

    public void e(int n2, int n3) {
        int n4 = this.i(n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            u u2 = this.dC[n2 + i2];
            this.a(u2, n4);
            n4 += u2.j();
        }
    }

    public void e() {
        this.e(0, this.dC.length);
    }

    public void f() {
        this.b(this.dC.length);
        this.h(dt);
        for (int i2 = 0; i2 < this.dC.length; ++i2) {
            this.i();
            this.b(i2);
            this.c(i2);
            this.d(this.dC[i2]);
            this.c(dt);
        }
    }

    public void d(int n2) {
        this.b(this.dC[n2], this.i(n2));
    }

    public u e(int n2) {
        return this.dD.get(n2 - this.k_);
    }

    @Override
    protected void a(int n2, u u2) {
        int n3 = n2 - this.k_;
        while (this.dD.size() < n3 + 1) {
            this.dD.add(null);
        }
        this.dD.set(n3, u2);
    }

    public void f(int n2) {
        this.a(this.e(n2), n2);
    }

    public void b(int n2, u u2) {
        this.a(n2, u2);
        this.a(u2, n2);
    }

    public void g(int n2) {
        this.b(this.e(n2), n2);
    }

    public void c(int n2, u u2) {
        this.a(n2, u2);
        this.b(u2, n2);
    }

    public void b(u u2) {
        this.n_.a_(u2.a(46));
    }

    public void c(u u2) {
        this.n_.a_(u2.a(79));
    }

    public void g() {
        this.n_.a_(87);
    }

    public void h() {
        this.n_.a_(88);
    }

    public void i() {
        this.n_.a_(89);
    }

    public void j() {
        this.n_.a_(92);
    }

    public void k() {
        this.n_.a_(90);
    }

    public void l() {
        this.n_.a_(91);
    }

    public void m() {
        this.n_.a_(93);
    }

    public void n() {
        this.n_.a_(94);
    }

    public void o() {
        this.n_.a_(95);
    }

    public void a(u u2, u u3) {
        if (u3.j() == 1) {
            if (u2.j() == 1) {
                this.o();
            } else {
                this.l();
                this.g();
            }
        } else if (u2.j() == 1) {
            this.m();
            this.h();
        } else {
            this.n();
            this.h();
        }
    }

    public void d(int n2, u u2) {
        this.n_.a_(u2.a(n2));
    }

    public void p() {
        this.n_.a_(4);
        this.n_.a_(130);
    }

    public void f(int n2, int n3) {
        this.n_.c(n2, n3);
    }

    public void b(u u2, u u3) {
        if (u2 != u3) {
            if (u2 == u.u) {
                if (u3 == u.s) {
                    this.n_.a_(144);
                } else if (u3 == u.t) {
                    this.n_.a_(143);
                } else {
                    this.n_.a_(142);
                    this.b(u.r, u3);
                }
            } else if (u2 == u.s) {
                if (u3 == u.u) {
                    this.n_.a_(141);
                } else if (u3 == u.t) {
                    this.n_.a_(140);
                } else {
                    this.n_.a_(139);
                    this.b(u.r, u3);
                }
            } else if (u2 == u.t) {
                if (u3 == u.u) {
                    this.n_.a_(138);
                } else if (u3 == u.s) {
                    this.n_.a_(137);
                } else {
                    this.n_.a_(136);
                    this.b(u.r, u3);
                }
            } else if (u3 == u.p) {
                this.n_.a_(145);
            } else if (u3 == u.o) {
                this.n_.a_(146);
            } else if (u3 == u.u) {
                this.n_.a_(135);
            } else if (u3 == u.s) {
                this.n_.a_(134);
            } else if (u3 == u.t) {
                this.n_.a_(133);
            } else if (u3 == u.q) {
                this.n_.a_(147);
            }
        }
    }

    private static u m(u u2) {
        switch (u2.a()) {
            case 3: {
                return b;
            }
            case 1: {
                return c;
            }
            case 4: {
                return dm;
            }
            case 2: {
                return dn;
            }
            case 5: {
                return do;
            }
            case 6: {
                return dp;
            }
            case 7: {
                return dq;
            }
            case 8: {
                return dr;
            }
        }
        return u2;
    }

    public void d(u u2) {
        if (u2.a() == 10 || u2.a() == 9) {
            return;
        }
        if (u2 == u.m) {
            this.a((String)null);
        } else {
            u u3 = j.m(u2);
            this.g(u3);
            if (u2.j() == 2) {
                this.l();
                this.l();
                this.g();
            } else {
                this.k();
                this.o();
            }
            this.b(u3, new o("<init>", u.m, new u[]{u2}));
        }
    }

    public void e(u u2) {
        if (u2.a() == 10 || u2.a() == 9) {
            return;
        }
        if (u2 == u.m) {
            this.a((String)null);
        } else {
            u u3 = j.m(u2);
            this.c(u3, new o("valueOf", u3, new u[]{u2}));
        }
    }

    public void f(u u2) {
        u u3 = ds;
        o o2 = null;
        switch (u2.a()) {
            case 0: {
                return;
            }
            case 2: {
                u3 = dn;
                o2 = dv;
                break;
            }
            case 1: {
                u3 = c;
                o2 = du;
                break;
            }
            case 8: {
                o2 = dz;
                break;
            }
            case 6: {
                o2 = dx;
                break;
            }
            case 7: {
                o2 = dy;
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                o2 = dw;
            }
        }
        if (o2 == null) {
            this.i(u2);
        } else {
            this.i(u3);
            this.a(u3, o2);
        }
    }

    public p q() {
        return new p();
    }

    public void b(p p2) {
        this.n_.a(p2);
    }

    public p r() {
        p p2 = new p();
        this.n_.a(p2);
        return p2;
    }

    public void a(u u2, int n2, p p2) {
        switch (u2.a()) {
            case 7: {
                this.n_.a_(148);
                break;
            }
            case 8: {
                this.n_.a_(n2 == 156 || n2 == 157 ? 151 : 152);
                break;
            }
            case 6: {
                this.n_.a_(n2 == 156 || n2 == 157 ? 149 : 150);
                break;
            }
            case 9: 
            case 10: {
                switch (n2) {
                    case 153: {
                        this.n_.a(165, p2);
                        return;
                    }
                    case 154: {
                        this.n_.a(166, p2);
                        return;
                    }
                }
                throw new IllegalArgumentException("Bad comparison for type " + u2);
            }
            default: {
                int n3 = -1;
                switch (n2) {
                    case 153: {
                        n3 = 159;
                        break;
                    }
                    case 154: {
                        n3 = 160;
                        break;
                    }
                    case 156: {
                        n3 = 162;
                        break;
                    }
                    case 155: {
                        n3 = 161;
                        break;
                    }
                    case 158: {
                        n3 = 164;
                        break;
                    }
                    case 157: {
                        n3 = 163;
                    }
                }
                this.n_.a(n3, p2);
                return;
            }
        }
        this.n_.a(n2, p2);
    }

    public void c(int n2, p p2) {
        this.a(u.r, n2, p2);
    }

    public void d(int n2, p p2) {
        this.n_.a(n2, p2);
    }

    public void c(p p2) {
        this.n_.a(198, p2);
    }

    public void d(p p2) {
        this.n_.a(199, p2);
    }

    public void e(p p2) {
        this.n_.a(167, p2);
    }

    public void h(int n2) {
        this.n_.b(169, n2);
    }

    public void a(int[] arrn, B b2) {
        float f2 = arrn.length == 0 ? 0.0f : (float)arrn.length / (float)(arrn[arrn.length - 1] - arrn[0] + 1);
        this.a(arrn, b2, f2 >= 0.5f);
    }

    public void a(int[] arrn, B b2, boolean bl2) {
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] >= arrn[i2 - 1]) continue;
            throw new IllegalArgumentException("keys must be sorted ascending");
        }
        p p2 = this.q();
        p p3 = this.q();
        if (arrn.length > 0) {
            int n2 = arrn.length;
            int n3 = arrn[0];
            int n4 = arrn[n2 - 1];
            int n5 = n4 - n3 + 1;
            if (bl2) {
                int n6;
                Object[] arrobject = new p[n5];
                Arrays.fill(arrobject, p2);
                for (n6 = 0; n6 < n2; ++n6) {
                    arrobject[arrn[n6] - n3] = this.q();
                }
                this.n_.a(n3, n4, p2, (p[])arrobject);
                for (n6 = 0; n6 < n5; ++n6) {
                    Object object = arrobject[n6];
                    if (object == p2) continue;
                    this.b((p)object);
                    b2.a(n6 + n3, p3);
                }
            } else {
                int n7;
                p[] arrp = new p[n2];
                for (n7 = 0; n7 < n2; ++n7) {
                    arrp[n7] = this.q();
                }
                this.n_.a(p2, arrn, arrp);
                for (n7 = 0; n7 < n2; ++n7) {
                    this.b(arrp[n7]);
                    b2.a(arrn[n7], p3);
                }
            }
        }
        this.b(p2);
        b2.a();
        this.b(p3);
    }

    public void s() {
        this.n_.a_(this.dB.a(172));
    }

    private void a(int n2, u u2, String string, u u3) {
        this.n_.b(n2, u2.e(), string, u3.i());
    }

    public void a(u u2, String string, u u3) {
        this.a(178, u2, string, u3);
    }

    public void b(u u2, String string, u u3) {
        this.a(179, u2, string, u3);
    }

    public void c(u u2, String string, u u3) {
        this.a(180, u2, string, u3);
    }

    public void d(u u2, String string, u u3) {
        this.a(181, u2, string, u3);
    }

    private void a(int n2, u u2, o o2, boolean bl2) {
        String string = u2.a() == 9 ? u2.i() : u2.e();
        this.n_.a(n2, string, o2.a(), o2.b(), bl2);
    }

    public void a(u u2, o o2) {
        this.a(182, u2, o2, false);
    }

    public void b(u u2, o o2) {
        this.a(183, u2, o2, false);
    }

    public void c(u u2, o o2) {
        this.a(184, u2, o2, false);
    }

    public void d(u u2, o o2) {
        this.a(185, u2, o2, true);
    }

    public /* varargs */ void b(String string, String string2, m m2, Object ... arrobject) {
        this.n_.a(string, string2, m2, arrobject);
    }

    private void e(int n2, u u2) {
        this.n_.a(n2, u2.e());
    }

    public void g(u u2) {
        this.e(187, u2);
    }

    public void h(u u2) {
        int n2;
        switch (u2.a()) {
            case 1: {
                n2 = 4;
                break;
            }
            case 2: {
                n2 = 5;
                break;
            }
            case 3: {
                n2 = 8;
                break;
            }
            case 4: {
                n2 = 9;
                break;
            }
            case 5: {
                n2 = 10;
                break;
            }
            case 6: {
                n2 = 6;
                break;
            }
            case 7: {
                n2 = 11;
                break;
            }
            case 8: {
                n2 = 7;
                break;
            }
            default: {
                this.e(189, u2);
                return;
            }
        }
        this.n_.a(188, n2);
    }

    public void t() {
        this.n_.a_(190);
    }

    public void u() {
        this.n_.a_(191);
    }

    public void a(u u2, String string) {
        this.g(u2);
        this.i();
        this.a(string);
        this.b(u2, o.a("void <init> (String)"));
        this.u();
    }

    public void i(u u2) {
        if (!u2.equals(dt)) {
            this.e(192, u2);
        }
    }

    public void j(u u2) {
        this.e(193, u2);
    }

    public void v() {
        this.n_.a_(194);
    }

    public void w() {
        this.n_.a_(195);
    }

    public void x() {
        if ((this.dA & 1024) == 0) {
            this.n_.d(0, 0);
        }
        this.n_.b();
    }

    public void a(p p2, p p3, u u2) {
        p p4 = new p();
        if (u2 == null) {
            this.n_.a(p2, p3, p4, null);
        } else {
            this.n_.a(p2, p3, p4, u2.e());
        }
        this.b(p4);
    }
}

