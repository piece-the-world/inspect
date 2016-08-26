/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.l;

public class aX {
    byte[] e;

    public aX(aP aP2) {
        this.e = aP2.f();
    }

    public void a() {
        int n2 = l.a(this.e, 0);
        int n3 = 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = l.a(this.e, n3);
            int n5 = l.a(this.e, n3 + 2);
            n3 = this.a(n3 + 4, n4, n5);
            int n6 = l.a(this.e, n3);
            n3 = this.b(n3 + 2, n4, n6);
        }
    }

    public int a(int n2, int n3, int n4) {
        return this.a(n2, n3, n4, true);
    }

    public int b(int n2, int n3, int n4) {
        return this.a(n2, n3, n4, false);
    }

    public int a(int n2, int n3, int n4, boolean bl2) {
        for (int i2 = 0; i2 < n4; ++i2) {
            n2 = this.c(i2, n2);
        }
        return n2;
    }

    int c(int n2, int n3) {
        byte by2 = this.e[n3];
        if (by2 == 7) {
            int n4 = l.a(this.e, n3 + 1);
            this.a(n3, n4);
            n3 += 3;
        } else if (by2 == 8) {
            int n5 = l.a(this.e, n3 + 1);
            this.b(n3, n5);
            n3 += 3;
        } else {
            this.a(n3, by2);
            ++n3;
        }
        return n3;
    }

    public void a(int n2, byte by2) {
    }

    public void a(int n2, int n3) {
    }

    public void b(int n2, int n3) {
    }
}

