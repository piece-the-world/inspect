/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.f;
import com.growingio.b.z;

class H
extends z {
    String a;

    H(String string) {
        this.a = string;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        o3.c(this.a);
        o3.f(o.a, string, T.b(o2));
        return 2;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        o3.c(this.a);
        o3.g(o.a, string, T.b(o2));
        return 1;
    }

    @Override
    int a(Q q2, com.growingio.b.o o2) {
        if (o2.s().equals("java.lang.String")) {
            return q2.b(this.a);
        }
        return 0;
    }
}

