/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.br;
import com.growingio.b.a.g;

class bs
extends g {
    br a;

    bs(byte[] arrby) {
        super(arrby);
        this.a = new br(arrby);
    }

    @Override
    int b(int n2, int n3) throws Exception {
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = this.f[n2] & 255;
            n2 = this.a.g(n2 + 1, n4);
            n2 = this.a.a(n2);
            n2 = this.e(n2);
        }
        return n2;
    }
}

