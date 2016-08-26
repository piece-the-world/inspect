/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.as;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.b.v;
import com.growingio.b.d.d;
import com.growingio.b.d.i;
import com.growingio.b.d.j;
import com.growingio.b.g;
import com.growingio.b.n;
import com.growingio.b.o;
import com.growingio.b.t;

public class h
extends d {
    int dl;

    protected h(int n2, B b2, o o2, as as2, int n3) {
        super(n2, b2, o2, as2);
        this.dl = n3;
    }

    @Override
    public n a() {
        return super.a();
    }

    @Override
    public int b() {
        return super.b();
    }

    @Override
    public String c() {
        return super.c();
    }

    public boolean d() {
        return h.a(this.dl);
    }

    static boolean a(int n2) {
        return n2 == 178 || n2 == 179;
    }

    public boolean f() {
        return this.dl == 180 || this.dl == 178;
    }

    public boolean g() {
        return this.dl == 181 || this.dl == 179;
    }

    private o s() throws ae {
        return this.c.a().f(this.h());
    }

    public String h() {
        int n2 = this.b.e(this.a + 1);
        return this.j().k(n2);
    }

    public String p() {
        int n2 = this.b.e(this.a + 1);
        return this.j().m(n2);
    }

    public t q() throws ae {
        o o2 = this.s();
        int n2 = this.b.e(this.a + 1);
        Q q2 = this.j();
        return o2.c(q2.m(n2), q2.n(n2));
    }

    @Override
    public o[] e() {
        return super.e();
    }

    public String r() {
        int n2 = this.b.e(this.a + 1);
        return this.j().n(n2);
    }

    @Override
    public void a(String string) throws b {
        this.c.i();
        Q q2 = this.j();
        int n2 = this.a;
        int n3 = this.b.e(n2 + 1);
        f f2 = new f(this.c);
        y y2 = this.b.c();
        try {
            o o2;
            o[] arro;
            o o3 = T.c(q2.n(n3), this.c.a());
            boolean bl2 = this.f();
            if (bl2) {
                arro = new o[]{};
                o2 = o3;
            } else {
                arro = new o[]{o3};
                o2 = o.n;
            }
            int n4 = y2.h();
            f2.a(q2.k(n3), arro, true, n4, this.n());
            boolean bl3 = h.a(o2, string);
            if (bl2) {
                bl3 = true;
            }
            int n5 = f2.a(o2, bl3);
            if (bl2) {
                f2.a(new i(o2, this.dl, n3, n4));
            } else {
                f2.a(o3);
                f2.a(new j(arro[0], this.dl, n3, n4));
            }
            com.growingio.b.a.o o4 = f2.a();
            h.a(arro, this.d(), n4, o4);
            f2.a(y2, n2);
            if (bl3) {
                if (o2 == o.n) {
                    o4.j(1);
                    o4.o(n5);
                } else {
                    o4.a(o2);
                    o4.b(n5, o2);
                }
            }
            f2.b(string);
            if (bl2) {
                o4.a(n5, o2);
            }
            this.a(n2, o4, 3);
        }
        catch (e var7_10) {
            throw new b(var7_10);
        }
        catch (ae var7_11) {
            throw new b(var7_11);
        }
        catch (com.growingio.b.a.i var7_12) {
            throw new b("broken method");
        }
    }
}

