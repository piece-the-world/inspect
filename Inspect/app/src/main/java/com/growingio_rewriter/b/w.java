/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.a.j;
import com.growingio.b.b.a.n;
import com.growingio.b.b.a.u;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.z;

abstract class w
extends z {
    w() {
    }

    abstract void a(f var1) throws e;

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        try {
            o3.n(0);
            this.a(f2);
            o3.f(o.a, string, T.b(o2));
            return o3.h();
        }
        catch (e var6_6) {
            throw new b(var6_6);
        }
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        try {
            this.a(f2);
            o3.g(o.a, string, T.b(o2));
            return o3.h();
        }
        catch (e var5_5) {
            throw new b(var5_5);
        }
    }

    int a(Q q2, com.growingio.b.o o2, com.growingio.b.b.a.b b2) {
        if (o2.r()) {
            if (b2 instanceof n) {
                long l2 = ((n)b2).c();
                if (o2 == com.growingio.b.o.m) {
                    return q2.a((double)l2);
                }
                if (o2 == com.growingio.b.o.l) {
                    return q2.a((float)l2);
                }
                if (o2 == com.growingio.b.o.k) {
                    return q2.a(l2);
                }
                if (o2 != com.growingio.b.o.n) {
                    return q2.L((int)l2);
                }
            } else if (b2 instanceof j) {
                double d2 = ((j)b2).c();
                if (o2 == com.growingio.b.o.l) {
                    return q2.a((float)d2);
                }
                if (o2 == com.growingio.b.o.m) {
                    return q2.a(d2);
                }
            }
        } else if (b2 instanceof u && o2.s().equals("java.lang.String")) {
            return q2.b(((u)b2).c());
        }
        return 0;
    }
}

