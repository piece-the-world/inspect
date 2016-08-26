/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.d.d;
import com.growingio.b.g;
import com.growingio.b.o;

public class n
extends d {
    protected n(int n2, B b2, o o2, as as2) {
        super(n2, b2, o2, as2);
    }

    private int a(Q q2) {
        int n2 = this.a;
        int n3 = this.b.c(n2);
        int n4 = this.b.e(n2 + 1);
        if (n3 == 185) {
            return q2.v(n4);
        }
        return q2.q(n4);
    }

    @Override
    public com.growingio.b.n a() {
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

    protected o p() throws ae {
        return this.c.a().f(this.q());
    }

    public String q() {
        Q q2 = this.j();
        int n2 = this.a;
        int n3 = this.b.c(n2);
        int n4 = this.b.e(n2 + 1);
        String string = n3 == 185 ? q2.u(n4) : q2.p(n4);
        if (string.charAt(0) == '[') {
            string = T.c(string);
        }
        return string;
    }

    public String d() {
        Q q2 = this.j();
        int n2 = this.a(q2);
        return q2.E(q2.f(n2));
    }

    public K f() throws ae {
        return this.p().a(this.d(), this.r());
    }

    public String r() {
        Q q2 = this.j();
        int n2 = this.a(q2);
        return q2.E(q2.g(n2));
    }

    @Override
    public o[] e() {
        return super.e();
    }

    public boolean h() {
        return this.b.c(this.a) == 183 && !this.a().r_().s().equals(this.q());
    }

    @Override
    public void a(String string) throws b {
        String string2;
        String string3;
        String string4;
        int n2;
        this.c.i();
        Q q2 = this.j();
        int n3 = this.a;
        int n4 = this.b.e(n3 + 1);
        int n5 = this.b.c(n3);
        if (n5 == 185) {
            n2 = 5;
            string4 = q2.u(n4);
            string2 = q2.w(n4);
            string3 = q2.x(n4);
        } else if (n5 == 184 || n5 == 183 || n5 == 182) {
            n2 = 3;
            string4 = q2.p(n4);
            string2 = q2.r(n4);
            string3 = q2.s(n4);
        } else {
            throw new b("not method invocation");
        }
        f f2 = new f(this.c);
        g g2 = this.c.a();
        y y2 = this.b.c();
        try {
            o[] arro = T.a(string3, g2);
            o o2 = T.b(string3, g2);
            int n6 = y2.h();
            f2.a(string4, arro, true, n6, this.n());
            int n7 = f2.a(o2, true);
            if (n5 == 184) {
                f2.b(string4, string2);
            } else if (n5 == 183) {
                f2.a("$0", string4, string2, string3, n4);
            } else {
                f2.a("$0", string2);
            }
            n.a(o2, string);
            com.growingio.b.a.o o3 = f2.a();
            n.a(arro, n5 == 184, n6, o3);
            f2.a(y2, n3);
            if (o2 != o.n) {
                o3.a(o2);
                o3.b(n7, o2);
            }
            f2.b(string);
            if (o2 != o.n) {
                o3.a(n7, o2);
            }
            this.a(n3, o3, n2);
        }
        catch (e var13_14) {
            throw new b(var13_14);
        }
        catch (ae var13_15) {
            throw new b(var13_15);
        }
        catch (i var13_16) {
            throw new b("broken method");
        }
    }
}

