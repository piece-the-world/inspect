/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.aV;
import com.growingio.b.a.aY;

class aR
extends aV {
    private int a;
    private int c;
    private int d;

    aR(aP aP2, int n2, int n3, int n4) {
        super(aP2);
        this.a = n2;
        this.c = n3;
        this.d = n4;
    }

    @Override
    public int a(int n2, int n3, int n4, boolean bl2) {
        if (!bl2 || n4 < this.a) {
            return super.a(n2, n3, n4, bl2);
        }
        this.b.a(n4 + 1);
        for (int i2 = 0; i2 < n4; ++i2) {
            if (i2 == this.a) {
                this.c();
            }
            n2 = this.c(i2, n2);
        }
        if (n4 == this.a) {
            this.c();
        }
        return n2;
    }

    private void c() {
        if (this.c == 7) {
            this.b.a(7, this.d);
        } else if (this.c == 8) {
            this.b.a(8, this.d);
        } else {
            this.b.a(this.c, 0);
        }
    }
}

