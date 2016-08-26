/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.i;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.c.j;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.t;

public class h
extends j {
    protected String a;
    protected o b;
    protected boolean c;
    protected String d;
    protected String e;

    public h(j j2, t t2, String string, String string2) {
        super(j2);
        this.b = t2.r_();
        this.a = t2.q();
        this.d = string;
        this.e = string2;
        this.c = ad.b(t2.d());
    }

    static String a(g g2, Q q2, o o2, String string, boolean bl2, int n2) {
        if (!q2.m(n2).equals(string)) {
            return null;
        }
        try {
            o o3 = g2.f(q2.k(n2));
            if (o3 == o2 || !bl2 && h.a(o3, o2, string)) {
                return q2.n(n2);
            }
        }
        catch (ae var6_7) {
            // empty catch block
        }
        return null;
    }

    static boolean a(o o2, o o3, String string) {
        if (!o2.b(o3)) {
            return false;
        }
        try {
            t t2 = o2.d(string);
            return t2.r_() == o3;
        }
        catch (ae var3_4) {
            return false;
        }
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) throws i {
        int n3 = b2.c(n2);
        if (n3 == 180 || n3 == 178) {
            int n4 = b2.e(n2 + 1);
            String string = h.a(o2.a(), q2, this.b, this.a, this.c, n4);
            if (string != null) {
                if (n3 == 178) {
                    b2.a(n2);
                    n2 = b2.h(1);
                    b2.a(1, n2);
                    n2 = b2.f();
                }
                String string2 = "(Ljava/lang/Object;)" + string;
                int n5 = q2.a(this.d);
                int n6 = q2.b(n5, this.e, string2);
                b2.a(184, n2);
                b2.b(n6, n2 + 1);
                return n2;
            }
        }
        return n2;
    }
}

