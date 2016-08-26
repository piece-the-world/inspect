/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.K;
import com.growingio.b.L;
import com.growingio.b.T;
import com.growingio.b.a.as;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.d;
import com.growingio.b.s;

public class Q {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public static s a(String string, com.growingio.b.o o2) throws b {
        f f2 = new f(o2);
        try {
            I i2 = f2.a(string);
            if (i2 instanceof s) {
                return (s)i2;
            }
        }
        catch (e var3_4) {
            throw new b(var3_4);
        }
        throw new b("not a constructor");
    }

    public static s a(com.growingio.b.o[] arro, com.growingio.b.o[] arro2, String string, com.growingio.b.o o2) throws b {
        try {
            s s2 = new s(arro, o2);
            s2.a(arro2);
            s2.c(string);
            return s2;
        }
        catch (ae var4_5) {
            throw new b(var4_5);
        }
    }

    public static s a(s s2, com.growingio.b.o o2, d d2) throws b {
        return new s(s2, o2, d2);
    }

    public static s a(com.growingio.b.o o2) throws b {
        s s2 = new s((com.growingio.b.o[])null, o2);
        com.growingio.b.a.Q q2 = o2.j().c();
        o o3 = new o(q2, 1, 1);
        o3.n(0);
        try {
            o3.c(o2.f(), "<init>", "()V");
        }
        catch (ae var4_4) {
            throw new b(var4_4);
        }
        o3.b(177);
        s2.c().a(o3.e());
        return s2;
    }

    public static s a(com.growingio.b.o[] arro, com.growingio.b.o[] arro2, com.growingio.b.o o2) throws b {
        return Q.a(arro, arro2, 0, null, null, o2);
    }

    public static s b(com.growingio.b.o[] arro, com.growingio.b.o[] arro2, com.growingio.b.o o2) throws b {
        return Q.a(arro, arro2, 2, null, null, o2);
    }

    public static s a(com.growingio.b.o[] arro, com.growingio.b.o[] arro2, int n2, K k2, L l2, com.growingio.b.o o2) throws b {
        return T.a(arro, arro2, n2, k2, l2, o2);
    }
}

