/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.g;
import com.growingio.b.a.l;
import java.util.Map;

class f
extends g {
    Q a;
    Map b;

    f(byte[] arrby, Q q2, Map map) {
        super(arrby);
        this.a = q2;
        this.b = map;
    }

    @Override
    int a(int n2, int n3, int n4) throws Exception {
        this.g(n2 - 4, n3);
        return super.a(n2, n3, n4);
    }

    @Override
    void b(int n2, int n3, int n4) throws Exception {
        this.g(n2 + 1, n3);
        super.b(n2, n3, n4);
    }

    @Override
    void e(int n2, int n3) throws Exception {
        this.g(n2 + 1, n3);
        super.e(n2, n3);
    }

    private void g(int n2, int n3) {
        String string;
        String string2 = this.a.E(n3);
        if (!string2.equals(string = T.a(string2, this.b))) {
            int n4 = this.a.c(string);
            l.a(n4, this.f, n2);
        }
    }
}

