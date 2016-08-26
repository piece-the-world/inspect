/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.l;

class g {
    byte[] f;

    g(byte[] arrby) {
        this.f = arrby;
    }

    final void d() throws Exception {
        int n2 = this.f[0] & 255;
        this.a(n2, 1);
    }

    void a(int n2, int n3) throws Exception {
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = this.d(n3);
        }
    }

    final void e() throws Exception {
        this.d(0);
    }

    final int d(int n2) throws Exception {
        int n3 = l.a(this.f, n2);
        return this.b(n2 + 2, n3);
    }

    int b(int n2, int n3) throws Exception {
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = this.e(n2);
        }
        return n2;
    }

    final int e(int n2) throws Exception {
        int n3 = l.a(this.f, n2);
        int n4 = l.a(this.f, n2 + 2);
        return this.a(n2 + 4, n3, n4);
    }

    int a(int n2, int n3, int n4) throws Exception {
        for (int i2 = 0; i2 < n4; ++i2) {
            n2 = this.f(n2);
        }
        return n2;
    }

    final int f(int n2) throws Exception {
        int n3 = l.a(this.f, n2);
        return this.c(n2 + 2, n3);
    }

    int c(int n2, int n3) throws Exception {
        return this.g(n2);
    }

    final int g(int n2) throws Exception {
        int n3 = this.f[n2] & 255;
        if (n3 == 101) {
            int n4 = l.a(this.f, n2 + 1);
            int n5 = l.a(this.f, n2 + 3);
            this.b(n2, n4, n5);
            return n2 + 5;
        }
        if (n3 == 99) {
            int n6 = l.a(this.f, n2 + 1);
            this.e(n2, n6);
            return n2 + 3;
        }
        if (n3 == 64) {
            return this.a(n2 + 1);
        }
        if (n3 == 91) {
            int n7 = l.a(this.f, n2 + 1);
            return this.f(n2 + 3, n7);
        }
        int n8 = l.a(this.f, n2 + 1);
        this.d(n3, n8);
        return n2 + 3;
    }

    void d(int n2, int n3) throws Exception {
    }

    void b(int n2, int n3, int n4) throws Exception {
    }

    void e(int n2, int n3) throws Exception {
    }

    int a(int n2) throws Exception {
        return this.e(n2);
    }

    int f(int n2, int n3) throws Exception {
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = this.g(n2);
        }
        return n2;
    }
}

