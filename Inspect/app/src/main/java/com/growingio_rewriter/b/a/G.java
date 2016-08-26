/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.E;
import com.growingio.b.a.l;

class G
extends E {
    G(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    int c() {
        return this.d == 2 ? 5 : 0;
    }

    @Override
    void b(int n2, byte[] arrby, int n3, byte[] arrby2) {
        arrby2[n3] = (byte)this.a(arrby[n2] & 255);
        arrby2[n3 + 1] = 0;
        arrby2[n3 + 2] = 8;
        arrby2[n3 + 3] = -56;
        l.b(this.c - 3, arrby2, n3 + 4);
    }

    int a(int n2) {
        if (n2 == 198) {
            return 199;
        }
        if (n2 == 199) {
            return 198;
        }
        if ((n2 - 153 & 1) == 0) {
            return n2 + 1;
        }
        return n2 - 1;
    }
}

