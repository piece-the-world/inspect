/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.D;
import com.growingio.b.a.l;

abstract class E
extends D {
    int c;
    int d;
    static final int e = 0;
    static final int f = 1;
    static final int g = 2;

    E(int n2, int n3) {
        super(n2);
        this.c = n3;
        this.d = 0;
    }

    @Override
    void a(int n2, int n3, boolean bl2) {
        this.c = E.a(this.a, this.c, n2, n3, bl2);
        super.a(n2, n3, bl2);
        if (this.d == 0 && (this.c < -32768 || 32767 < this.c)) {
            this.d = 1;
        }
    }

    @Override
    boolean a() {
        if (this.d == 1) {
            this.d = 2;
            return true;
        }
        return false;
    }

    @Override
    abstract int c();

    abstract void b(int var1, byte[] var2, int var3, byte[] var4);

    @Override
    int a(int n2, byte[] arrby, int n3, byte[] arrby2) {
        if (this.d == 2) {
            this.b(n2, arrby, n3, arrby2);
        } else {
            arrby2[n3] = arrby[n2];
            l.a(this.c, arrby2, n3 + 1);
        }
        return 3;
    }
}

