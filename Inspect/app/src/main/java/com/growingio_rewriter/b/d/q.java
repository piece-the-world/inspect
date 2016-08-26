/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

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
import com.growingio.b.b.v;
import com.growingio.b.d.d;
import com.growingio.b.d.r;
import com.growingio.b.g;
import com.growingio.b.n;
import com.growingio.b.o;
import com.growingio.b.s;

public class q
extends d {
    String dl;
    int dm;

    protected q(int n2, B b2, o o2, as as2, String string, int n3) {
        super(n2, b2, o2, as2);
        this.dl = string;
        this.dm = n3;
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

    private o h() throws ae {
        return this.c.a().f(this.dl);
    }

    public String d() {
        return this.dl;
    }

    public String f() {
        Q q2 = this.j();
        int n2 = this.b.e(this.a + 1);
        return q2.s(n2);
    }

    public s g() throws ae {
        Q q2 = this.j();
        int n2 = this.b.e(this.a + 1);
        String string = q2.s(n2);
        return this.h().f(string);
    }

    @Override
    public o[] e() {
        return super.e();
    }

    private int p() throws b {
        int n2 = this.b.c(this.dm + 3);
        if (n2 == 89) {
            return this.b.c(this.dm + 4) == 94 && this.b.c(this.dm + 5) == 88 ? 6 : 4;
        }
        if (n2 == 90 && this.b.c(this.dm + 4) == 95) {
            return 5;
        }
        return 3;
    }

    @Override
    public void a(String string) throws b {
        this.c.i();
        int n2 = 3;
        int n3 = this.dm;
        int n4 = this.b.e(n3 + 1);
        int n5 = this.p();
        int n6 = n3 + n5;
        for (int i2 = n3; i2 < n6; ++i2) {
            this.b.a(0, i2);
        }
        Q q2 = this.j();
        n3 = this.a;
        int n7 = this.b.e(n3 + 1);
        String string2 = q2.s(n7);
        f f2 = new f(this.c);
        g g2 = this.c.a();
        y y2 = this.b.c();
        try {
            o[] arro = T.a(string2, g2);
            o o2 = g2.f(this.dl);
            int n8 = y2.h();
            f2.a(this.dl, arro, true, n8, this.n());
            int n9 = f2.a(o2, true);
            f2.a(new r(o2, n4, n7));
            q.a(o2, string);
            com.growingio.b.a.o o3 = f2.a();
            q.a(arro, true, n8, o3);
            f2.a(y2, n3);
            o3.a(o2);
            o3.b(n9, o2);
            f2.b(string);
            if (n5 > 3) {
                o3.n(n9);
            }
            this.a(n3, o3, 3);
        }
        catch (e var13_15) {
            throw new b(var13_15);
        }
        catch (ae var13_16) {
            throw new b(var13_16);
        }
        catch (i var13_17) {
            throw new b("broken method");
        }
    }
}

