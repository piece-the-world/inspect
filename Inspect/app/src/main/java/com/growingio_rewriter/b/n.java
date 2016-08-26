/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.V;
import com.growingio.b.a.A;
import com.growingio.b.a.B;
import com.growingio.b.a.F;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.Z;
import com.growingio.b.a.a;
import com.growingio.b.a.aA;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ab;
import com.growingio.b.a.ak;
import com.growingio.b.a.al;
import com.growingio.b.a.am;
import com.growingio.b.a.an;
import com.growingio.b.a.as;
import com.growingio.b.a.az;
import com.growingio.b.a.c;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.f;
import com.growingio.b.d;
import com.growingio.b.d.e;
import com.growingio.b.g;
import com.growingio.b.j;
import com.growingio.b.r;
import com.growingio.b.t;
import com.growingio.b.z;
import java.util.List;
import java.util.Map;

public abstract class n
extends I {
    protected as a;

    protected n(com.growingio.b.o o2, as as2) {
        super(o2);
        this.a = as2;
    }

    void a(n n2, boolean bl2, d d2) throws b {
        com.growingio.b.o o2 = this.d;
        as as2 = n2.a;
        com.growingio.b.o o3 = n2.r_();
        Q q2 = o2.j().c();
        d2 = new d(d2);
        d2.a(o3.s(), o2.s());
        try {
            String string;
            boolean bl3 = false;
            com.growingio.b.o o4 = o3.f();
            com.growingio.b.o o5 = o2.f();
            String string2 = null;
            if (o4 != null && o5 != null && !(string = o4.s()).equals(string2 = o5.s())) {
                if (string.equals("java.lang.Object")) {
                    bl3 = true;
                } else {
                    d2.b(string, string2);
                }
            }
            this.a = new as(q2, as2.a(), as2, d2);
            if (bl2 && bl3) {
                this.a.d(string2);
            }
        }
        catch (ae var8_9) {
            throw new b(var8_9);
        }
        catch (i var8_10) {
            throw new b(var8_10);
        }
    }

    @Override
    protected void a(StringBuffer stringBuffer) {
        stringBuffer.append(' ');
        stringBuffer.append(this.q());
        stringBuffer.append(' ');
        stringBuffer.append(this.a.g());
    }

    public abstract String a();

    public as b() {
        this.d.p();
        return this.a;
    }

    public as c() {
        return this.a;
    }

    @Override
    public int d() {
        return a.j(this.a.f());
    }

    @Override
    public void a(int n2) {
        this.d.p();
        this.a.a(a.i(n2));
    }

    @Override
    public boolean a(String string) {
        as as2 = this.c();
        c c2 = (c)as2.c("RuntimeInvisibleAnnotations");
        c c3 = (c)as2.c("RuntimeVisibleAnnotations");
        return r.a(string, this.r_().a(), c2, c3);
    }

    @Override
    public Object a(Class class_) throws ClassNotFoundException {
        as as2 = this.c();
        c c2 = (c)as2.c("RuntimeInvisibleAnnotations");
        c c3 = (c)as2.c("RuntimeVisibleAnnotations");
        return r.b(class_, this.r_().a(), c2, c3);
    }

    @Override
    public Object[] e() throws ClassNotFoundException {
        return this.b(false);
    }

    @Override
    public Object[] f() {
        try {
            return this.b(true);
        }
        catch (ClassNotFoundException var1_1) {
            throw new RuntimeException("Unexpected exception", var1_1);
        }
    }

    private Object[] b(boolean bl2) throws ClassNotFoundException {
        as as2 = this.c();
        c c2 = (c)as2.c("RuntimeInvisibleAnnotations");
        c c3 = (c)as2.c("RuntimeVisibleAnnotations");
        return r.a(bl2, this.r_().a(), c2, c3);
    }

    public Object[][] g() throws ClassNotFoundException {
        return this.a(false);
    }

    public Object[][] h() {
        try {
            return this.a(true);
        }
        catch (ClassNotFoundException var1_1) {
            throw new RuntimeException("Unexpected exception", var1_1);
        }
    }

    Object[][] a(boolean bl2) throws ClassNotFoundException {
        as as2 = this.c();
        az az2 = (az)as2.c("RuntimeInvisibleParameterAnnotations");
        az az3 = (az)as2.c("RuntimeVisibleParameterAnnotations");
        return r.a(bl2, this.r_().a(), az2, az3, as2);
    }

    public com.growingio.b.o[] i() throws ae {
        return T.a(this.a.g(), this.d.a());
    }

    com.growingio.b.o j() throws ae {
        return T.b(this.a.g(), this.d.a());
    }

    @Override
    public String k() {
        return this.a.g();
    }

    @Override
    public String l() {
        aA aA2 = (aA)this.a.c("Signature");
        return aA2 == null ? null : aA2.a();
    }

    @Override
    public void b(String string) {
        this.d.p();
        this.a.a(new aA(this.a.c(), string));
    }

    public com.growingio.b.o[] m() throws ae {
        ab ab2 = this.a.i();
        String[] arrstring = ab2 == null ? null : ab2.b();
        return this.d.a().a(arrstring);
    }

    public void a(com.growingio.b.o[] arro) throws ae {
        this.d.p();
        if (arro == null || arro.length == 0) {
            this.a.k();
            return;
        }
        String[] arrstring = new String[arro.length];
        for (int i2 = 0; i2 < arro.length; ++i2) {
            arrstring[i2] = arro[i2].s();
        }
        ab ab2 = this.a.i();
        if (ab2 == null) {
            ab2 = new ab(this.a.c());
            this.a.a(ab2);
        }
        ab2.a(arrstring);
    }

    public abstract boolean n();

    public void c(String string) throws b {
        this.a(string, (String)null, (String)null);
    }

    public void a(String string, String string2, String string3) throws b {
        com.growingio.b.o o2 = this.d;
        o2.p();
        try {
            f f2 = new f(o2);
            if (string3 != null) {
                f2.a(string2, string3);
            }
            o o3 = f2.a(this, string);
            this.a.a(o3.e());
            this.a.a(this.a.f() & -1025);
            this.a.a(o2.a(), o2.j());
            this.d.S();
        }
        catch (com.growingio.b.b.e var5_6) {
            throw new b(var5_6);
        }
        catch (i var5_7) {
            throw new b(var5_7);
        }
    }

    static void a(com.growingio.b.o o2, as as2, com.growingio.b.o o3, as as3, d d2) throws b {
        o3.p();
        d2 = new d(d2);
        d2.a(o2.s(), o3.s());
        try {
            y y2 = as2.j();
            if (y2 != null) {
                Q q2 = as3.c();
                y y3 = (y)y2.a(q2, d2);
                as3.a(y3);
            }
        }
        catch (A var5_6) {
            throw new b(var5_6);
        }
        as3.a(as3.f() & -1025);
        o3.S();
    }

    @Override
    public byte[] d(String string) {
        h h2 = this.a.c(string);
        if (h2 == null) {
            return null;
        }
        return h2.f();
    }

    @Override
    public void a(String string, byte[] arrby) {
        this.d.p();
        this.a.a(new h(this.a.c(), string, arrby));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void e(String string) throws b {
        com.growingio.b.o o2 = this.d;
        o2.p();
        g g2 = o2.a();
        int n2 = 0;
        do {
            String string2 = "_cflow$" + n2++;
            try {
                o2.e(string2);
                continue;
            }
            catch (ae var6_6) {
                g2.a(string, this.d.s(), string2);
                try {
                    com.growingio.b.o o3 = g2.f("Cflow");
                    t t2 = new t(o3, string2, o2);
                    t2.a(9);
                    o2.a(t2, z.a(o3));
                    this.b(string2 + ".enter();", false);
                    String string3 = string2 + ".exit();";
                    this.a(string3, true);
                    return;
                }
                catch (ae var6_8) {
                    throw new b(var6_8);
                }
                continue;
            }
            break;
        } while (true);
    }

    public void a(String string, com.growingio.b.o o2) throws b {
        this.d.p();
        Q q2 = this.a.c();
        y y2 = this.a.j();
        if (y2 == null) {
            throw new b("no method body");
        }
        am am2 = (am)y2.a("LocalVariableTable");
        if (am2 == null) {
            am2 = new am(q2);
            y2.m().add(am2);
        }
        int n2 = y2.h();
        String string2 = T.b(o2);
        am2.a(0, y2.i(), q2.c(string), q2.c(string2), n2);
        y2.b(n2 + T.h(string2));
    }

    public void a(com.growingio.b.o o2) throws b {
        this.d.p();
        String string = this.a.g();
        String string2 = T.b(o2, string);
        try {
            this.a(ad.e(this.d()) ? 0 : 1, o2, string);
        }
        catch (i var4_4) {
            throw new b(var4_4);
        }
        this.a.b(string2);
    }

    public void b(com.growingio.b.o o2) throws b {
        this.d.p();
        String string = this.a.g();
        String string2 = T.a(o2, string);
        int n2 = ad.e(this.d()) ? 0 : 1;
        try {
            this.a(n2 + T.i(string), o2, string);
        }
        catch (i var5_5) {
            throw new b(var5_5);
        }
        this.a.b(string2);
    }

    private void a(int n2, com.growingio.b.o o2, String string) throws i {
        y y2 = this.a.j();
        if (y2 != null) {
            aP aP2;
            aZ aZ2;
            an an2;
            Object object;
            int n3 = 1;
            char c2 = 'L';
            int n4 = 0;
            if (o2.r()) {
                object = (V)o2;
                n3 = object.ad();
                c2 = object.X();
            } else {
                n4 = this.a.c().a(o2);
            }
            y2.a(n2, n3);
            object = (am)y2.a("LocalVariableTable");
            if (object != null) {
                object.a(n2, n3);
            }
            if ((an2 = (an)y2.a("LocalVariableTypeTable")) != null) {
                an2.a(n2, n3);
            }
            if ((aZ2 = (aZ)y2.a("StackMapTable")) != null) {
                aZ2.a(n2, aZ.a(c2), n4);
            }
            if ((aP2 = (aP)y2.a("StackMap")) != null) {
                aP2.a(n2, aZ.a(c2), n4);
            }
        }
    }

    public void a(j j2) throws b {
        this.d.p();
        Q q2 = this.a.c();
        j2.a(this.r_(), this.a, q2);
    }

    public void a(e e2) throws b {
        if (this.d.n()) {
            this.d.p();
        }
        if (e2.a(this.d, this.a)) {
            this.d.p();
        }
    }

    public void f(String string) throws b {
        this.b(string, true);
    }

    private void b(String string, boolean bl2) throws b {
        com.growingio.b.o o2 = this.d;
        o2.p();
        y y2 = this.a.j();
        if (y2 == null) {
            throw new b("no method body");
        }
        B b2 = y2.k();
        f f2 = new f(o2);
        try {
            int n2 = f2.a(this.i(), ad.e(this.d()));
            f2.b(y2, n2);
            f2.a(y2, 0);
            f2.a(this.j());
            f2.b(string);
            o o3 = f2.a();
            int n3 = o3.h();
            int n4 = o3.i();
            if (n3 > y2.b()) {
                y2.a(n3);
            }
            if (n4 > y2.h()) {
                y2.b(n4);
            }
            int n5 = b2.b(o3.g());
            b2.a(o3.d(), n5);
            if (bl2) {
                this.a.a(o2.a(), o2.j());
            }
        }
        catch (ae var7_8) {
            throw new b(var7_8);
        }
        catch (com.growingio.b.b.e var7_9) {
            throw new b(var7_9);
        }
        catch (i var7_10) {
            throw new b(var7_10);
        }
    }

    public void g(String string) throws b {
        this.a(string, false);
    }

    public void a(String string, boolean bl2) throws b {
        com.growingio.b.o o2 = this.d;
        o2.p();
        Q q2 = this.a.c();
        y y2 = this.a.j();
        if (y2 == null) {
            throw new b("no method body");
        }
        B b2 = y2.k();
        int n2 = y2.h();
        o o3 = new o(q2, 0, n2 + 1);
        o3.l(y2.b() + 1);
        f f2 = new f(o3, o2);
        try {
            int n3;
            int n4 = f2.a(this.i(), ad.e(this.d()));
            f2.b(y2, n4);
            com.growingio.b.o o4 = this.j();
            int n5 = f2.a(o4, true);
            f2.a(y2, 0);
            int n6 = this.a(bl2, o3, o4, n5, f2, string);
            int n7 = b2.d();
            if (bl2) {
                y2.l().a(this.a(y2), n7, n7, 0);
            }
            int n8 = 0;
            int n9 = 0;
            boolean bl3 = true;
            while (b2.e() && (n3 = b2.f()) < n7) {
                int n10 = b2.c(n3);
                if (n10 != 176 && n10 != 172 && n10 != 174 && n10 != 173 && n10 != 175 && n10 != 177) continue;
                if (bl3) {
                    n8 = this.a(o3, f2, string, q2, o4, n5);
                    n7 = b2.c(o3.g());
                    b2.b(o3.d(), n7);
                    n9 = b2.d() - n8;
                    n6 = n9 - n7;
                    bl3 = false;
                }
                this.a(b2, n9, n3);
                n9 = b2.d() - n8;
                n7 = n9 - n6;
            }
            if (bl3) {
                n7 = b2.c(o3.g());
                b2.b(o3.d(), n7);
            }
            y2.a(o3.h());
            y2.b(o3.i());
            this.a.a(o2.a(), o2.j());
        }
        catch (ae var10_11) {
            throw new b(var10_11);
        }
        catch (com.growingio.b.b.e var10_12) {
            throw new b(var10_12);
        }
        catch (i var10_13) {
            throw new b(var10_13);
        }
    }

    private int a(o o2, f f2, String string, Q q2, com.growingio.b.o o3, int n2) throws com.growingio.b.b.e {
        int n3 = o2.j();
        if (o3 == com.growingio.b.o.n) {
            o2.j(1);
            o2.o(n2);
            f2.b(string);
            o2.j(177);
            if (o2.i() < 1) {
                o2.e(1);
            }
        } else {
            o2.b(n2, o3);
            f2.b(string);
            o2.a(n2, o3);
            if (o3.r()) {
                o2.j(((V)o3).ab());
            } else {
                o2.j(176);
            }
        }
        return o2.j() - n3;
    }

    private void a(B b2, int n2, int n3) throws i {
        b2.b(n2);
        b2.a(0, n3);
        boolean bl2 = n2 + 2 - n3 > 32767;
        int n4 = bl2 ? 4 : 2;
        F f2 = b2.a(n3, n4, false);
        n3 = f2.a + f2.b - n4;
        int n5 = b2.b() - n3;
        if (bl2) {
            b2.a(200, n3);
            b2.c(n5, n3 + 1);
        } else if (n5 <= 32767) {
            b2.a(167, n3);
            b2.b(n5, n3 + 1);
        } else {
            if (f2.b < 4) {
                F f3 = b2.a(f2.a, 2, false);
                n3 = f3.a + f3.b + f2.b - 4;
            }
            b2.a(200, n3);
            b2.c(b2.b() - n3, n3 + 1);
        }
    }

    private int a(boolean bl2, o o2, com.growingio.b.o o3, int n2, f f2, String string) throws com.growingio.b.b.e {
        if (!bl2) {
            return 0;
        }
        int n3 = o2.i();
        o2.f(1);
        int n4 = o2.j();
        o2.o(n3);
        if (o3.r()) {
            char c2 = ((V)o3).X();
            if (c2 == 'D') {
                o2.a(0.0);
                o2.v(n2);
            } else if (c2 == 'F') {
                o2.a(0.0f);
                o2.x(n2);
            } else if (c2 == 'J') {
                o2.a(0);
                o2.t(n2);
            } else if (c2 == 'V') {
                o2.j(1);
                o2.o(n2);
            } else {
                o2.p(0);
                o2.r(n2);
            }
        } else {
            o2.j(1);
            o2.o(n2);
        }
        f2.b(string);
        o2.n(n3);
        o2.j(191);
        return o2.j() - n4;
    }

    public void b(String string, com.growingio.b.o o2) throws b {
        this.a(string, o2, "$e");
    }

    public void a(String string, com.growingio.b.o o2, String string2) throws b {
        com.growingio.b.o o3 = this.d;
        o3.p();
        Q q2 = this.a.c();
        y y2 = this.a.j();
        B b2 = y2.k();
        o o4 = new o(q2, y2.b(), y2.h());
        o4.l(1);
        f f2 = new f(o4, o3);
        try {
            f2.a(this.i(), ad.e(this.d()));
            int n2 = f2.a(o2, string2);
            o4.o(n2);
            f2.b(string);
            int n3 = o4.h();
            int n4 = o4.i();
            if (n3 > y2.b()) {
                y2.a(n3);
            }
            if (n4 > y2.h()) {
                y2.b(n4);
            }
            int n5 = b2.d();
            int n6 = b2.c(o4.g());
            y2.l().a(this.a(y2), n5, n5, q2.a(o2));
            b2.b(o4.d(), n6);
            this.a.a(o3.a(), o3.j());
        }
        catch (ae var10_11) {
            throw new b(var10_11);
        }
        catch (com.growingio.b.b.e var10_12) {
            throw new b(var10_12);
        }
        catch (i var10_13) {
            throw new b(var10_13);
        }
    }

    int a(y y2) throws b {
        return 0;
    }

    public int a(int n2, String string) throws b {
        return this.a(n2, true, string);
    }

    public int a(int n2, boolean bl2, String string) throws b {
        y y2 = this.a.j();
        if (y2 == null) {
            throw new b("no method body");
        }
        ak ak2 = (ak)y2.a("LineNumberTable");
        if (ak2 == null) {
            throw new b("no line number info");
        }
        al al2 = ak2.e(n2);
        n2 = al2.b;
        int n3 = al2.a;
        if (!bl2) {
            return n2;
        }
        com.growingio.b.o o2 = this.d;
        o2.p();
        B b2 = y2.k();
        f f2 = new f(o2);
        try {
            f2.a(y2, n3);
            f2.a(this.i(), ad.e(this.d()));
            f2.a(y2.h());
            f2.b(string);
            o o3 = f2.a();
            int n4 = o3.i();
            int n5 = o3.h();
            y2.b(n4);
            if (n5 > y2.b()) {
                y2.a(n5);
            }
            n3 = b2.b(n3, o3.g());
            b2.a(o3.d(), n3);
            this.a.a(o2.a(), o2.j());
            return n2;
        }
        catch (ae var11_12) {
            throw new b(var11_12);
        }
        catch (com.growingio.b.b.e var11_13) {
            throw new b(var11_13);
        }
        catch (i var11_14) {
            throw new b(var11_14);
        }
    }
}

