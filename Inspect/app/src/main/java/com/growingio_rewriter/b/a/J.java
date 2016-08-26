/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.D;
import com.growingio.b.a.l;

class J
extends D {
    int c;
    boolean d;

    J(int n2, int n3) {
        super(n2);
        this.c = n3;
        this.d = true;
    }

    @Override
    boolean a() {
        if (this.d) {
            this.d = false;
            return true;
        }
        return false;
    }

    @Override
    int c() {
        return 1;
    }

    @Override
    int a(int n2, byte[] arrby, int n3, byte[] arrby2) {
        arrby2[n3] = 19;
        l.a(this.c, arrby2, n3 + 1);
        return 2;
    }
}

