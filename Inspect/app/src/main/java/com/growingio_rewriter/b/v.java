/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.a.Q;
import com.growingio.b.b.a.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.b.w;
import com.growingio.b.o;

class v
extends com.growingio.b.w {
    private String a;

    v(String string) {
        this.a = string;
    }

    @Override
    void a(f f2) throws e {
        f2.c(this.a);
    }

    @Override
    int a(Q q2, o o2) {
        try {
            b b2 = f.a(this.a, new w());
            return this.a(q2, o2, b2);
        }
        catch (e var3_4) {
            return 0;
        }
    }
}

