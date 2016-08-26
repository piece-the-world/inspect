/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.p;

class n {
    p a;
    p b;
    p c;
    String d;
    int e;
    n f;

    n() {
    }

    static n a(n n2, p p2, p p3) {
        int n3;
        if (n2 == null) {
            return null;
        }
        n2.f = n.a(n2.f, p2, p3);
        int n4 = n2.a.p;
        int n5 = n2.b.p;
        int n6 = p2.p;
        int n7 = n3 = p3 == null ? Integer.MAX_VALUE : p3.p;
        if (n6 < n5 && n3 > n4) {
            if (n6 <= n4) {
                if (n3 >= n5) {
                    n2 = n2.f;
                } else {
                    n2.a = p3;
                }
            } else if (n3 >= n5) {
                n2.b = p2;
            } else {
                n n8 = new n();
                n8.a = p3;
                n8.b = n2.b;
                n8.c = n2.c;
                n8.d = n2.d;
                n8.e = n2.e;
                n8.f = n2.f;
                n2.b = p2;
                n2.f = n8;
            }
        }
        return n2;
    }
}

