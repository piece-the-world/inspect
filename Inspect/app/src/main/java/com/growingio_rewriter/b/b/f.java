/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.I;
import com.growingio.b.K;
import com.growingio.b.V;
import com.growingio.b.a.Q;
import com.growingio.b.a.am;
import com.growingio.b.a.as;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.l;
import com.growingio.b.b.a.q;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.g;
import com.growingio.b.b.h;
import com.growingio.b.b.i;
import com.growingio.b.b.j;
import com.growingio.b.b.k;
import com.growingio.b.b.n;
import com.growingio.b.b.r;
import com.growingio.b.b.u;
import com.growingio.b.b.v;
import com.growingio.b.b.w;
import com.growingio.b.o;
import com.growingio.b.s;
import com.growingio.b.t;

public class f {
    k a;
    w b;
    private com.growingio.b.a.o f;
    public static final String c = "$0";
    public static final String d = "$_";
    public static final String e = "$proceed";

    public f(o o2) {
        this(new com.growingio.b.a.o(o2.j().c(), 0, 0), o2);
    }

    public f(com.growingio.b.a.o o2, o o3) {
        this.a = new k(o2, o3, o3.a());
        this.b = new w();
        this.f = o2;
    }

    public com.growingio.b.a.o a() {
        return this.f;
    }

    public I a(String string) throws e {
        u u2 = new u(new n(string));
        a a2 = u2.b(this.b);
        try {
            if (a2 instanceof l) {
                return this.a((l)a2);
            }
            com.growingio.b.n n2 = this.a(u2, (q)a2);
            o o2 = n2.r_();
            n2.c().a(o2.a(), o2.j());
            return n2;
        }
        catch (com.growingio.b.a.i var4_5) {
            throw new e(var4_5.getMessage());
        }
        catch (b var4_6) {
            throw new e(var4_6.getMessage());
        }
    }

    private t a(l l2) throws e, b {
        com.growingio.b.b.a.i i2 = l2.h();
        j j2 = new j(this.a.dE.a(i2), i2.j().d(), this.a.i());
        j2.a(r.c(l2.g()));
        if (l2.i() != null) {
            j2.a(l2.i());
        }
        return j2;
    }

    private com.growingio.b.n a(u u2, q q2) throws e {
        int n2 = r.c(q2.h());
        o[] arro = this.a.b(q2);
        o[] arro2 = this.a.c(q2);
        this.a(arro, ad.e(n2));
        q2 = u2.a(this.b, q2);
        try {
            if (q2.g()) {
                s s2 = new s(arro, this.a.i());
                s2.a(n2);
                q2.a(this.a);
                s2.b().a(this.f.e());
                s2.a(arro2);
                return s2;
            }
            com.growingio.b.b.a.i i2 = q2.i();
            o o2 = this.a.dE.a(i2);
            this.a(o2, false);
            K k2 = new K(o2, i2.j().d(), arro, this.a.i());
            k2.a(n2);
            this.a.a(k2);
            q2.a(this.a);
            if (q2.l() != null) {
                k2.b().a(this.f.e());
            } else {
                k2.a(n2 | 1024);
            }
            k2.a(arro2);
            return k2;
        }
        catch (ae var6_8) {
            throw new e(var6_8.toString());
        }
    }

    public com.growingio.b.a.o a(com.growingio.b.n n2, String string) throws e {
        try {
            boolean bl2;
            o o2;
            int n3 = n2.d();
            this.a(n2.i(), ad.e(n3));
            if (n2 instanceof K) {
                this.a.a((K)n2);
                o2 = ((K)n2).p();
            } else {
                o2 = o.n;
            }
            this.a(o2, false);
            boolean bl3 = bl2 = o2 == o.n;
            if (string == null) {
                f.a(this.f, o2);
            } else {
                u u2 = new u(new n(string));
                w w2 = new w(this.b);
                com.growingio.b.b.a.t t2 = u2.c(w2);
                if (u2.a()) {
                    throw new e("the method/constructor body must be surrounded by {}");
                }
                boolean bl4 = false;
                if (n2 instanceof s) {
                    bl4 = !((s)n2).p();
                }
                this.a.a(t2, bl4, bl2);
            }
            return this.f;
        }
        catch (ae var3_4) {
            throw new e(var3_4.toString());
        }
    }

    private static void a(com.growingio.b.a.o o2, o o3) {
        int n2;
        int n3;
        if (o3 instanceof V) {
            V v2 = (V)o3;
            n3 = v2.ab();
            n2 = n3 == 175 ? 14 : (n3 == 174 ? 11 : (n3 == 173 ? 9 : (n3 == 177 ? 0 : 3)));
        } else {
            n3 = 176;
            n2 = 1;
        }
        if (n2 != 0) {
            o2.j(n2);
        }
        o2.j(n3);
    }

    public boolean a(y y2, int n2) throws e {
        am am2 = (am)y2.a("LocalVariableTable");
        if (am2 == null) {
            return false;
        }
        int n3 = am2.a();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = am2.a(i2);
            int n5 = am2.b(i2);
            if (n4 > n2 || n2 >= n4 + n5) continue;
            this.a.a(am2.g(i2), am2.d(i2), am2.i(i2), this.b);
        }
        return true;
    }

    public boolean b(y y2, int n2) throws e {
        am am2 = (am)y2.a("LocalVariableTable");
        if (am2 == null) {
            return false;
        }
        int n3 = am2.a();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = am2.i(i2);
            if (n4 >= n2) continue;
            this.a.a(am2.g(i2), am2.d(i2), n4, this.b);
        }
        return true;
    }

    public int a(o[] arro, boolean bl2) throws e {
        return this.a.a(arro, bl2, "$", "$args", "$$", this.b);
    }

    public int a(String string, o[] arro, boolean bl2, int n2, boolean bl3) throws e {
        return this.a.a(arro, bl3, "$", "$args", "$$", bl2, n2, string, this.b);
    }

    public void a(int n2) {
        this.a.a(n2);
    }

    public int a(o o2, boolean bl2) throws e {
        this.a.a(o2);
        return this.a.a(o2, "$r", bl2 ? "$_" : null, this.b);
    }

    public void a(o o2) {
        this.a.a(o2);
    }

    public int a(o o2, String string) throws e {
        return this.a.a(o2, string, this.b);
    }

    public void a(String string, String string2) throws e {
        u u2 = new u(new n(string));
        com.growingio.b.b.a.b b2 = u2.d(this.b);
        String string3 = string2;
        g g2 = new g(this, string3, b2);
        this.a.a(g2, "$proceed");
    }

    public void b(String string, String string2) throws e {
        String string3 = string;
        String string4 = string2;
        h h2 = new h(this, string3, string4);
        this.a.a(h2, "$proceed");
    }

    public void a(String string, String string2, String string3, String string4, int n2) throws e {
        u u2 = new u(new n(string));
        com.growingio.b.b.a.b b2 = u2.d(this.b);
        i i2 = new i(this, b2, n2, string4, string2, string3);
        this.a.a(i2, "$proceed");
    }

    public void a(v v2) {
        this.a.a(v2, "$proceed");
    }

    public void b(String string) throws e {
        u u2 = new u(new n(string));
        w w2 = new w(this.b);
        while (u2.a()) {
            com.growingio.b.b.a.t t2 = u2.c(w2);
            if (t2 == null) continue;
            t2.a(this.a);
        }
    }

    public void c(String string) throws e {
        com.growingio.b.b.a.b b2 = f.a(string, this.b);
        this.a(b2);
    }

    public static com.growingio.b.b.a.b a(String string, w w2) throws e {
        u u2 = new u(new n(string));
        return u2.d(w2);
    }

    public void a(com.growingio.b.b.a.b b2) throws e {
        if (b2 != null) {
            this.a.a(b2);
        }
    }
}

