/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.E;
import com.growingio.b.a.l;

class H
extends E {
    H(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    int c() {
        return this.d == 2 ? 2 : 0;
    }

    @Override
    void b(int n2, byte[] arrby, int n3, byte[] arrby2) {
        arrby2[n3] = (byte)((arrby[n2] & 255) == 167 ? 200 : 201);
        l.b(this.c, arrby2, n3 + 1);
    }
}

