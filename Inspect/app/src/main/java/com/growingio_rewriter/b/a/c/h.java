/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.c.j;
import com.growingio.b.a.c.k;
import com.growingio.b.a.c.l;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.o;
import com.growingio.b.a.c.s;
import com.growingio.b.a.i;
import com.growingio.b.ae;
import com.growingio.b.g;
import java.util.ArrayList;

public abstract class h {
    public static h[] a(int n2) {
        h[] arrh = new h[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrh[i2] = s.h;
        }
        return arrh;
    }

    protected h() {
    }

    private static void a(h h2, String string, g g2) throws i {
        h2.a(string, g2);
    }

    public abstract int a();

    public abstract int a(Q var1);

    public h b() {
        return new o(this);
    }

    public abstract l c();

    public abstract boolean d();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean a(h var1);

    public abstract String g();

    public abstract void a(String var1, g var2) throws i;

    public int a(ArrayList arrayList, int n2, g g2) throws ae {
        return n2;
    }

    protected o h() {
        return null;
    }

    public void b(int n2) {
    }

    public static com.growingio.b.o a(com.growingio.b.o o2, com.growingio.b.o o3) throws ae {
        if (o2 == o3) {
            return o2;
        }
        if (o2.b() && o3.b()) {
            com.growingio.b.o o4;
            com.growingio.b.o o5 = o2.e();
            com.growingio.b.o o6 = h.a(o5, o4 = o3.e());
            if (o6 == o5) {
                return o2;
            }
            if (o6 == o4) {
                return o3;
            }
            return o2.a().f(o6 == null ? "java.lang.Object" : o6.s() + "[]");
        }
        if (o2.r() || o3.r()) {
            return null;
        }
        if (o2.b() || o3.b()) {
            return o2.a().f("java.lang.Object");
        }
        return h.b(o2, o3);
    }

    public static com.growingio.b.o b(com.growingio.b.o o2, com.growingio.b.o o3) throws ae {
        com.growingio.b.o o4;
        com.growingio.b.o o5 = o2;
        com.growingio.b.o o6 = o4 = o3;
        com.growingio.b.o o7 = o5;
        do {
            if (h.c(o5, o4) && o5.f() != null) {
                return o5;
            }
            com.growingio.b.o o8 = o5.f();
            com.growingio.b.o o9 = o4.f();
            if (o9 == null) {
                o4 = o6;
                break;
            }
            if (o8 == null) {
                o5 = o7;
                o7 = o6;
                o6 = o5;
                o5 = o4;
                o4 = o6;
                break;
            }
            o5 = o8;
            o4 = o9;
        } while (true);
        while ((o5 = o5.f()) != null) {
            o7 = o7.f();
        }
        o5 = o7;
        while (!h.c(o5, o4)) {
            o5 = o5.f();
            o4 = o4.f();
        }
        return o5;
    }

    static boolean c(com.growingio.b.o o2, com.growingio.b.o o3) {
        return o2 == o3 || o2 != null && o3 != null && o2.s().equals(o3.s());
    }

    public static void a(h h2, h h3, g g2) throws i {
        if (h2 instanceof com.growingio.b.a.c.i && !h3.e()) {
            ((com.growingio.b.a.c.i)h2).b(k.c(h3));
        }
        if (h3 instanceof com.growingio.b.a.c.i) {
            if (h2 instanceof com.growingio.b.a.c.i) {
                j.c(h2);
            } else if (h2 instanceof m) {
                if (!h2.e()) {
                    String string = j.a(h2.g());
                    h3.a(string, g2);
                }
            } else {
                throw new i("bad AASTORE: " + h2);
            }
        }
    }
}

