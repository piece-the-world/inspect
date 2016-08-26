/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.Z;
import com.growingio.b.a.as;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.d.d;
import com.growingio.b.g;
import com.growingio.b.n;
import com.growingio.b.o;

public class k
extends d {
    private static String dl = "$1";
    private Z dm;
    private int dn;

    protected k(Z z2, int n2, B b2, o o2, as as2) {
        super(z2.c(n2), b2, o2, as2);
        this.dm = z2;
        this.dn = n2;
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

    @Override
    public o[] e() {
        return super.e();
    }

    public o d() throws ae {
        int n2 = this.dm.d(this.dn);
        if (n2 == 0) {
            return null;
        }
        Q q2 = this.j();
        String string = q2.d(n2);
        return this.c.a().h(string);
    }

    public boolean f() {
        return this.dm.d(this.dn) == 0;
    }

    @Override
    public void a(String string) throws b {
        throw new RuntimeException("not implemented yet");
    }

    public void b(String string) throws b {
        this.e = true;
        Q q2 = this.j();
        y y2 = this.b.c();
        f f2 = new f(this.c);
        com.growingio.b.a.o o2 = f2.a();
        o2.l(1);
        o2.e(y2.h());
        try {
            o o3 = this.d();
            int n2 = f2.a(o3, dl);
            f2.a(o3, false);
            o2.o(n2);
            f2.b(string);
            o2.n(n2);
            int n3 = this.dm.c(this.dn);
            o2.j(167);
            o2.m(n3 - this.b.d() - o2.j() + 1);
            this.dj = o2.h();
            this.di = o2.i();
            int n4 = this.b.c(o2.g());
            this.b.b(o2.d(), n4);
            this.dm.c(this.dn, n4);
        }
        catch (ae var6_7) {
            throw new b(var6_7);
        }
        catch (e var6_8) {
            throw new b(var6_8);
        }
    }
}

