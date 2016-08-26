/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.K;
import com.growingio.b.L;
import com.growingio.b.U;
import com.growingio.b.a.Q;
import com.growingio.b.a.ab;
import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.a.h;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.d;
import com.growingio.b.t;
import java.util.Map;

public class R {
    public static K a(String string, com.growingio.b.o o2) throws b {
        return R.a(string, o2, null, null);
    }

    public static K a(String string, com.growingio.b.o o2, String string2, String string3) throws b {
        f f2 = new f(o2);
        try {
            I i2;
            if (string3 != null) {
                f2.a(string2, string3);
            }
            if ((i2 = f2.a(string)) instanceof K) {
                return (K)i2;
            }
        }
        catch (e var5_6) {
            throw new b(var5_6);
        }
        throw new b("not a method");
    }

    public static K a(com.growingio.b.o o2, String string, com.growingio.b.o[] arro, com.growingio.b.o[] arro2, String string2, com.growingio.b.o o3) throws b {
        return R.a(1, o2, string, arro, arro2, string2, o3);
    }

    public static K a(int n2, com.growingio.b.o o2, String string, com.growingio.b.o[] arro, com.growingio.b.o[] arro2, String string2, com.growingio.b.o o3) throws b {
        try {
            K k2 = new K(o2, string, arro, o3);
            k2.a(n2);
            k2.a(arro2);
            k2.c(string2);
            return k2;
        }
        catch (ae var7_8) {
            throw new b(var7_8);
        }
    }

    public static K a(K k2, com.growingio.b.o o2, d d2) throws b {
        return new K(k2, o2, d2);
    }

    public static K a(K k2, String string, com.growingio.b.o o2, d d2) throws b {
        K k3 = new K(k2, o2, d2);
        k3.h(string);
        return k3;
    }

    public static K a(com.growingio.b.o o2, String string, com.growingio.b.o[] arro, com.growingio.b.o[] arro2, com.growingio.b.o o3) throws ae {
        K k2 = new K(o2, string, arro, o3);
        k2.a(arro2);
        return k2;
    }

    public static K a(String string, t t2) throws b {
        Object object;
        ac ac2 = t2.g();
        String string2 = ac2.d();
        String string3 = "()" + string2;
        Q q2 = ac2.a();
        as as2 = new as(q2, string, string3);
        as2.a(1);
        o o2 = new o(q2, 2, 1);
        try {
            object = ac2.b();
            if ((ac2.c() & 8) == 0) {
                o2.n(0);
                o2.a(o.a, (String)object, string2);
            } else {
                o2.b(o.a, (String)object, string2);
            }
            o2.d(t2.i());
        }
        catch (ae var8_9) {
            throw new b(var8_9);
        }
        as2.a(o2.e());
        object = t2.r_();
        return new K(as2, (com.growingio.b.o)object);
    }

    public static K b(String string, t t2) throws b {
        Object object;
        ac ac2 = t2.g();
        String string2 = ac2.d();
        String string3 = "(" + string2 + ")V";
        Q q2 = ac2.a();
        as as2 = new as(q2, string, string3);
        as2.a(1);
        o o2 = new o(q2, 3, 3);
        try {
            object = ac2.b();
            if ((ac2.c() & 8) == 0) {
                o2.n(0);
                o2.a(1, t2.i());
                o2.f(o.a, (String)object, string2);
            } else {
                o2.a(1, t2.i());
                o2.g(o.a, (String)object, string2);
            }
            o2.d((com.growingio.b.o)null);
        }
        catch (ae var8_9) {
            throw new b(var8_9);
        }
        as2.a(o2.e());
        object = t2.r_();
        return new K(as2, (com.growingio.b.o)object);
    }

    public static K a(K k2, com.growingio.b.o o2) throws b {
        try {
            return R.b(k2, o2);
        }
        catch (ae var2_2) {
            throw new b(var2_2);
        }
    }

    private static K b(K k2, com.growingio.b.o o2) throws b, ae {
        int n2;
        as as2 = k2.c();
        String string = as2.a();
        String string2 = as2.g();
        Q q2 = o2.j().c();
        as as3 = new as(q2, string, string2);
        as3.a(as2.f());
        ab ab2 = as2.i();
        if (ab2 != null) {
            as3.a((ab)ab2.a(q2, null));
        }
        o o3 = new o(q2, 0, 0);
        boolean bl2 = ad.e(k2.d());
        com.growingio.b.o o4 = k2.r_();
        com.growingio.b.o[] arro = k2.i();
        if (bl2) {
            n2 = o3.a(arro, 0);
            o3.d(o4, string, string2);
        } else {
            o3.a(0, o4);
            n2 = o3.a(arro, 1);
            o3.c(o4, string, string2);
        }
        o3.d(k2.p());
        o3.e(++n2);
        o3.d(n2 < 2 ? 2 : n2);
        as3.a(o3.e());
        return new K(as3, o2);
    }

    public static K a(com.growingio.b.o o2, String string, com.growingio.b.o[] arro, com.growingio.b.o[] arro2, K k2, L l2, com.growingio.b.o o3) throws b {
        return U.a(o2, string, arro, arro2, k2, l2, o3);
    }
}

