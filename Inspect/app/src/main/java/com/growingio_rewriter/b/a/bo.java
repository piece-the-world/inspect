/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.u;
import com.growingio.b.a.bq;
import com.growingio.b.a.d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Map;

class bo
extends d {
    bq g;

    bo(byte[] arrby, Q q2, Q q3, Map map) {
        u u2;
        super(arrby, q2, q3, map, false);
        this.b = u2 = new u(this.a, q3);
        this.g = new bq(arrby, q2, q3, map, u2);
    }

    @Override
    int b(int n2, int n3) throws Exception {
        this.b.b(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = this.f[n2] & 255;
            n2 = this.g.g(n2 + 1, n4);
            n2 = this.g.a(n2);
            n2 = this.e(n2);
        }
        return n2;
    }
}

