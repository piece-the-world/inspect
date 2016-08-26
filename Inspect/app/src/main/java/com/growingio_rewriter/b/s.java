/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.F;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.U;
import com.growingio.b.a.Z;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.d;
import com.growingio.b.g;
import com.growingio.b.n;

public final class s
extends n {
    protected s(as as2, com.growingio.b.o o2) {
        super(o2, as2);
    }

    public s(com.growingio.b.o[] arro, com.growingio.b.o o2) {
        this((as)null, o2);
        Q q2 = o2.j().c();
        String string = T.a(arro);
        this.a = new as(q2, "<init>", string);
        this.a(1);
    }

    public s(s s2, com.growingio.b.o o2, d d2) throws b {
        this((as)null, o2);
        this.a(s2, true, d2);
    }

    public boolean o() {
        return this.a.d();
    }

    public boolean p() {
        return this.a.e();
    }

    @Override
    public String a() {
        return this.r_().s() + (this.o() ? T.j(this.k()) : ".<clinit>()");
    }

    @Override
    public String q() {
        if (this.a.e()) {
            return "<clinit>";
        }
        return this.d.t();
    }

    @Override
    public boolean n() {
        y y2 = this.c().j();
        if (y2 == null) {
            return false;
        }
        Q q2 = y2.d();
        B b2 = y2.k();
        try {
            int n2;
            int n3;
            int n4 = b2.c(b2.f());
            return n4 == 177 || n4 == 42 && b2.c(n3 = b2.f()) == 183 && (n2 = q2.a(this.u(), b2.e(n3 + 1))) != 0 && "()V".equals(q2.E(n2)) && b2.c(b2.f()) == 177 && !b2.e();
        }
        catch (i var4_6) {
            return false;
        }
    }

    private String u() {
        p p2 = this.d.j();
        return p2.j();
    }

    public boolean r() throws b {
        y y2 = this.a.j();
        if (y2 != null) {
            B b2 = y2.k();
            try {
                int n2 = b2.i();
                return n2 >= 0;
            }
            catch (i var3_4) {
                throw new b(var3_4);
            }
        }
        return false;
    }

    @Override
    public void c(String string) throws b {
        if (string == null) {
            string = this.p() ? ";" : "super();";
        }
        super.c(string);
    }

    public void a(s s2, d d2) throws b {
        s.a(s2.d, s2.a, this.d, this.a, d2);
    }

    public void h(String string) throws b {
        com.growingio.b.o o2 = this.d;
        o2.p();
        if (this.p()) {
            throw new b("class initializer");
        }
        y y2 = this.a.j();
        B b2 = y2.k();
        o o3 = new o(this.a.c(), y2.b(), y2.h());
        o3.l(y2.b());
        f f2 = new f(o3, o2);
        try {
            f2.a(this.i(), false);
            f2.b(string);
            y2.a(o3.h());
            y2.b(o3.i());
            b2.h();
            int n2 = b2.b(o3.g());
            b2.a(o3.d(), n2);
            this.a.a(o2.a(), o2.j());
        }
        catch (ae var7_8) {
            throw new b(var7_8);
        }
        catch (e var7_9) {
            throw new b(var7_9);
        }
        catch (i var7_10) {
            throw new b(var7_10);
        }
    }

    @Override
    int a(y y2) throws b {
        B b2 = y2.k();
        try {
            b2.h();
            return b2.f();
        }
        catch (i var3_3) {
            throw new b(var3_3);
        }
    }

    public K c(String string, com.growingio.b.o o2) throws b {
        return this.a(string, o2, null);
    }

    public K a(String string, com.growingio.b.o o2, d d2) throws b {
        as as2;
        y y2;
        K k2 = new K(null, o2);
        k2.a(this, false, d2);
        if (this.o() && (y2 = (as2 = k2.c()).j()) != null) {
            s.b(y2);
            try {
                this.a.a(o2.a(), o2.j());
            }
            catch (i var7_7) {
                throw new b(var7_7);
            }
        }
        k2.h(string);
        return k2;
    }

    private static void b(y y2) throws b {
        B b2 = y2.k();
        try {
            int n2 = b2.h();
            if (n2 >= 0) {
                int n3 = b2.e(n2 + 1);
                String string = y2.d().s(n3);
                int n4 = T.f(string) + 1;
                if (n4 > 3) {
                    n2 = b2.a((int)n2, (int)(n4 - 3), (boolean)false).a;
                }
                b2.a(87, n2++);
                b2.a(0, n2);
                b2.a(0, n2 + 1);
                U u2 = new U(string);
                do {
                    u2.e();
                    if (u2.b()) {
                        b2.a(u2.d() ? 88 : 87, n2++);
                        continue;
                    }
                    break;
                    break;
                } while (true);
            }
        }
        catch (i var2_3) {
            throw new b(var2_3);
        }
    }
}

