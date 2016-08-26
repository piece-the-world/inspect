/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.f;
import com.growingio.b.z;

class D
extends z {
    com.growingio.b.o a;
    int[] b;

    D(com.growingio.b.o o2, int[] arrn) {
        this.a = o2;
        this.b = arrn;
    }

    @Override
    void a(String string) throws b {
        if (string.charAt(0) != '[') {
            throw new b("type mismatch");
        }
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        int n2 = o3.a(o2, this.b);
        o3.f(o.a, string, T.b(o2));
        return n2 + 1;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        int n2 = o3.a(o2, this.b);
        o3.g(o.a, string, T.b(o2));
        return n2;
    }
}

