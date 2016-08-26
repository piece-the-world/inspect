/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.V;
import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.f;
import com.growingio.b.z;

class u
extends z {
    com.growingio.b.o a;
    int b;

    u(com.growingio.b.o o2, int n2) {
        this.a = o2;
        this.b = n2;
    }

    private void a(o o2) {
        if (this.a.r()) {
            o2.e(((V)this.a).ac(), this.b);
        } else {
            o2.a(this.a, this.b);
        }
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        this.a(o3);
        o3.f(o.a, string, T.b(o2));
        return 2;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        this.a(o3);
        o3.g(o.a, string, T.b(o2));
        return 1;
    }
}

