/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.as;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.c.a;
import com.growingio.b.c.c;
import com.growingio.b.c.d;
import com.growingio.b.c.e;
import com.growingio.b.c.f;
import com.growingio.b.c.g;
import com.growingio.b.c.h;
import com.growingio.b.c.i;
import com.growingio.b.k;
import com.growingio.b.o;
import com.growingio.b.t;

public class j {
    protected com.growingio.b.c.j a = null;

    public void a(o o2, o o3, String string) {
        this.a = new f(this.a, o2.s(), o3.s(), string);
    }

    public void a(o o2, o o3) {
        this.a = new g(this.a, o2.s(), o3.s());
    }

    public void a(t t2, o o2, String string) {
        this.a = new e(this.a, t2, o2.s(), string);
    }

    public void b(t t2, o o2, String string) {
        this.a = new h(this.a, t2, o2.s(), string);
    }

    public void c(t t2, o o2, String string) {
        this.a = new i(this.a, t2, o2.s(), string);
    }

    public void a(o o2, k k2) throws ae {
        this.a = new a(this.a, o2.s(), k2);
    }

    public void a(K k2, K k3) throws b {
        String string;
        String string2 = k2.c().g();
        if (!string2.equals(string = k3.c().g())) {
            throw new b("signature mismatch: " + k3.a());
        }
        int n2 = k2.d();
        int n3 = k3.d();
        if (ad.e(n2) != ad.e(n3) || ad.b(n2) && !ad.b(n3) || k2.r_().x() != k3.r_().x()) {
            throw new b("invoke-type mismatch " + k3.a());
        }
        this.a = new d(this.a, k2, k3);
    }

    public void a(String string, K k2) throws b {
        this.a = new d(this.a, string, k2);
    }

    public void b(K k2, K k3) throws b {
        try {
            this.a = new c(this.a, k2, k3);
        }
        catch (ae var3_3) {
            throw new b(var3_3);
        }
    }

    public void c(K k2, K k3) throws b {
        try {
            this.a = new com.growingio.b.c.b(this.a, k2, k3);
        }
        catch (ae var3_3) {
            throw new b(var3_3);
        }
    }

    protected void a(o o2, as as2, Q q2) throws b {
        int n2;
        com.growingio.b.c.j j2;
        y y2 = as2.j();
        if (y2 == null || this.a == null) {
            return;
        }
        for (j2 = this.a; j2 != null; j2 = j2.c()) {
            j2.a(q2, o2, as2);
        }
        B b2 = y2.k();
        while (b2.e()) {
            try {
                n2 = b2.f();
                for (j2 = this.a; j2 != null; j2 = j2.c()) {
                    n2 = j2.a(o2, n2, b2, q2);
                }
                continue;
            }
            catch (com.growingio.b.a.i var7_8) {
                throw new b(var7_8);
            }
        }
        n2 = 0;
        int n3 = 0;
        for (j2 = this.a; j2 != null; j2 = j2.c()) {
            int n4 = j2.b();
            if (n4 > n2) {
                n2 = n4;
            }
            if ((n4 = j2.d()) <= n3) continue;
            n3 = n4;
        }
        for (j2 = this.a; j2 != null; j2 = j2.c()) {
            j2.a();
        }
        if (n2 > 0) {
            y2.b(y2.h() + n2);
        }
        if (n3 > 0) {
            y2.a(y2.b() + n3);
        }
        try {
            as2.a(o2.a(), o2.j());
        }
        catch (com.growingio.b.a.i var9_11) {
            throw new b(var9_11.getMessage(), var9_11);
        }
    }
}

