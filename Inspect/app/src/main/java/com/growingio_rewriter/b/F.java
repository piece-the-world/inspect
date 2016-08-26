/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.f;
import com.growingio.b.z;

class F
extends z {
    int a;

    F() {
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        if (arro != null && this.a < arro.length) {
            o3.n(0);
            int n2 = F.a(this.a, arro, false);
            int n3 = o3.a(n2, o2) + 1;
            o3.f(o.a, string, T.b(o2));
            return n3;
        }
        return 0;
    }

    static int a(int n2, com.growingio.b.o[] arro, boolean bl2) {
        com.growingio.b.o o2 = com.growingio.b.o.k;
        com.growingio.b.o o3 = com.growingio.b.o.m;
        int n3 = bl2 ? 0 : 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            com.growingio.b.o o4 = arro[i2];
            if (o4 == o2 || o4 == o3) {
                n3 += 2;
                continue;
            }
            ++n3;
        }
        return n3;
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        return 0;
    }
}

