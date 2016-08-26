/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
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
import com.growingio.b.g;
import com.growingio.b.n;
import com.growingio.b.o;

public class a
extends d {
    protected a(int n2, B b2, o o2, as as2) {
        super(n2, b2, o2, as2);
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

    public o d() throws ae {
        Q q2 = this.j();
        int n2 = this.a;
        int n3 = this.b.e(n2 + 1);
        String string = q2.d(n3);
        return this.c.a().h(string);
    }

    @Override
    public o[] e() {
        return super.e();
    }

    @Override
    public void a(String string) throws b {
        this.c.i();
        Q q2 = this.j();
        int n2 = this.a;
        int n3 = this.b.e(n2 + 1);
        f f2 = new f(this.c);
        g g2 = this.c.a();
        y y2 = this.b.c();
        try {
            o[] arro = new o[]{g2.f("java.lang.Object")};
            o o2 = this.d();
            int n4 = y2.h();
            f2.a("java.lang.Object", arro, true, n4, this.n());
            int n5 = f2.a(o2, true);
            f2.a(new com.growingio.b.d.b(n3, o2));
            a.a(o2, string);
            com.growingio.b.a.o o3 = f2.a();
            a.a(arro, true, n4, o3);
            f2.a(y2, n2);
            o3.a(o2);
            o3.b(n5, o2);
            f2.b(string);
            o3.a(n5, o2);
            this.a(n2, o3, 3);
        }
        catch (e var8_9) {
            throw new b(var8_9);
        }
        catch (ae var8_10) {
            throw new b(var8_10);
        }
        catch (i var8_11) {
            throw new b("broken method");
        }
    }
}

