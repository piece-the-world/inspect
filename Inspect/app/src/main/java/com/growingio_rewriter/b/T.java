/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.L;
import com.growingio.b.U;
import com.growingio.b.a.Q;
import com.growingio.b.a.as;
import com.growingio.b.a.o;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.s;

class T
extends U {
    private static final int a = 0;
    private static final int b = 2;

    T() {
    }

    public static s a(com.growingio.b.o[] arro, com.growingio.b.o[] arro2, int n2, K k2, L l2, com.growingio.b.o o2) throws b {
        try {
            s s2 = new s(arro, o2);
            s2.a(arro2);
            o o3 = T.a(o2, o2.j(), n2, k2, arro, l2);
            s2.c().a(o3.e());
            return s2;
        }
        catch (ae var6_7) {
            throw new b(var6_7);
        }
    }

    protected static o a(com.growingio.b.o o2, p p2, int n2, K k2, com.growingio.b.o[] arro, L l2) throws b {
        int n3;
        int n4;
        int n5 = p2.k();
        o o3 = new o(p2.c(), 0, 0);
        o3.a(false, arro, 0);
        o3.n(0);
        if (n2 == 0) {
            n4 = 1;
            o3.a(n5, "<init>", "()V");
        } else if (n2 == 2) {
            n4 = o3.a(arro, 1) + 1;
            o3.a(n5, "<init>", com.growingio.b.a.T.a(arro));
        } else {
            String string;
            n4 = T.a(o3, arro, 1);
            if (l2 == null) {
                n3 = 2;
                string = L.d();
            } else {
                n3 = l2.a(o3) + 2;
                string = l2.c();
            }
            if (n4 < n3) {
                n4 = n3;
            }
            o3.a(n5, "<init>", string);
        }
        if (k2 == null) {
            o3.b(177);
        } else {
            n3 = T.a(o2, p2, k2, false, arro, com.growingio.b.o.n, l2, o3);
            if (n4 < n3) {
                n4 = n3;
            }
        }
        o3.d(n4);
        return o3;
    }
}

