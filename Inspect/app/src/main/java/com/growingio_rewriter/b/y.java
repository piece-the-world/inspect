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

class y
extends z {
    float a;

    y(float f2) {
        this.a = f2;
    }

    @Override
    void a(String string) throws b {
        if (!string.equals("F")) {
            throw new b("type mismatch");
        }
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        o3.a(this.a);
        o3.f(o.a, string, T.b(o2));
        return 3;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        o3.a(this.a);
        o3.g(o.a, string, T.b(o2));
        return 2;
    }

    @Override
    int a(Q q2, com.growingio.b.o o2) {
        if (o2 == com.growingio.b.o.l) {
            return q2.a(this.a);
        }
        return 0;
    }
}

