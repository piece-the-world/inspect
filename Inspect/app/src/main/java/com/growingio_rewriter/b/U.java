/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.J;
import com.growingio.b.K;
import com.growingio.b.L;
import com.growingio.b.V;
import com.growingio.b.a.Q;
import com.growingio.b.a.a;
import com.growingio.b.a.as;
import com.growingio.b.a.bm;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.k;
import com.growingio.b.d;
import com.growingio.b.r;
import java.util.Hashtable;
import java.util.Map;

class U {
    private static final String a = "_added_m$";

    U() {
    }

    public static K a(com.growingio.b.o o2, String string, com.growingio.b.o[] arro, com.growingio.b.o[] arro2, K k2, L l2, com.growingio.b.o o3) throws b {
        K k3 = new K(o2, string, arro, o3);
        k3.a(k2.d());
        try {
            k3.a(arro2);
        }
        catch (ae var8_8) {
            throw new b(var8_8);
        }
        o o4 = U.a(o3, o3.j(), k2, arro, o2, l2);
        as as2 = k3.c();
        as2.a(o4.e());
        return k3;
    }

    static o a(com.growingio.b.o o2, p p2, K k2, com.growingio.b.o[] arro, com.growingio.b.o o3, L l2) throws b {
        boolean bl2 = ad.e(k2.d());
        o o4 = new o(p2.c(), 0, 0);
        int n2 = U.a(o2, p2, k2, bl2, arro, o3, l2, o4);
        o4.d(n2);
        o4.a(bl2, arro, 0);
        return o4;
    }

    protected static int a(com.growingio.b.o o2, p p2, K k2, boolean bl2, com.growingio.b.o[] arro, com.growingio.b.o o3, L l2, o o4) throws b {
        int n2;
        String string;
        String string2;
        if (!(o2 instanceof r)) {
            throw new b("bad declaring class" + o2.s());
        }
        if (!bl2) {
            o4.n(0);
        }
        int n3 = U.a(o4, arro, bl2 ? 0 : 1);
        if (l2 == null) {
            n2 = 0;
            string = L.b();
        } else {
            n2 = l2.a(o4);
            string = l2.a();
        }
        U.a(k2, string);
        try {
            string2 = U.a((r)o2, p2, k2);
        }
        catch (i var12_12) {
            throw new b(var12_12);
        }
        if (bl2) {
            o4.d(o.a, string2, string);
        } else {
            o4.c(o.a, string2, string);
        }
        U.a(o4, o3);
        if (n3 < n2 + 2) {
            n3 = n2 + 2;
        }
        return n3;
    }

    private static void a(K k2, String string) throws b {
        if (!string.equals(k2.c().g())) {
            throw new b("wrapped method with a bad signature: " + k2.r_().s() + '.' + k2.q());
        }
    }

    private static String a(r r2, p p2, K k2) throws i, b {
        Hashtable hashtable = r2.Z();
        String string = (String)hashtable.get(k2);
        if (string == null) {
            while (p2.d(string = "_added_m$" + r2.aa()) != null) {
            }
            d d2 = new d();
            d2.a(k2.r_().s(), r2.s());
            as as2 = new as(p2.c(), string, k2.c(), d2);
            int n2 = as2.f();
            as2.a(a.c(n2));
            as2.a(new bm(p2.c()));
            p2.a(as2);
            hashtable.put(k2, string);
            J j2 = r2.X();
            if (j2 != null) {
                j2.a(new K(as2, r2));
            }
        }
        return string;
    }

    static int a(o o2, com.growingio.b.o[] arro, int n2) {
        return k.a(o2, arro, n2);
    }

    private static void a(o o2, com.growingio.b.o o3) {
        if (o3.r()) {
            V v2 = (V)o3;
            if (v2 != com.growingio.b.o.n) {
                String string = v2.Y();
                o2.a(string);
                o2.e(string, v2.Z(), v2.aa());
            }
            o2.j(v2.ab());
        } else {
            o2.b(o3);
            o2.j(176);
        }
    }
}

