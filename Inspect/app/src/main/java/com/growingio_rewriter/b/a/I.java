/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.D;
import com.growingio.b.a.l;

class I
extends D {
    int c;

    I(int n2, int n3) {
        super(n2);
        this.c = n3;
    }

    @Override
    void a(int n2, int n3, boolean bl2) {
        this.c = I.a(this.a, this.c, n2, n3, bl2);
        super.a(n2, n3, bl2);
    }

    @Override
    int a(int n2, byte[] arrby, int n3, byte[] arrby2) {
        arrby2[n3] = arrby[n2];
        l.b(this.c, arrby2, n3 + 1);
        return 5;
    }
}

