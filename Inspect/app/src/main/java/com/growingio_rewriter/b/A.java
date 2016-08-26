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

class A
extends z {
    int a;

    A(int n2) {
        this.a = n2;
    }

    @Override
    void a(String string) throws b {
        char c2 = string.charAt(0);
        if (c2 != 'I' && c2 != 'S' && c2 != 'B' && c2 != 'C' && c2 != 'Z') {
            throw new b("type mismatch");
        }
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        o3.p(this.a);
        o3.f(o.a, string, T.b(o2));
        return 2;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        o3.p(this.a);
        o3.g(o.a, string, T.b(o2));
        return 1;
    }

    @Override
    int a(Q q2, com.growingio.b.o o2) {
        return q2.L(this.a);
    }
}

