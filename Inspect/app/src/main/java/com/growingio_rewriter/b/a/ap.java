/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.O;

final class ap {
    static final int a = 128;
    static final int b = 7;
    static final int c = 8;
    private O[][] d;
    private int e;

    public ap() {
        this.d = new O[8][];
        this.e = 0;
    }

    public ap(int n2) {
        int n3 = (n2 >> 7 & -8) + 8;
        this.d = new O[n3][];
        this.e = 0;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.d.length * 128;
    }

    public O a(int n2) {
        if (n2 < 0 || this.e <= n2) {
            return null;
        }
        return this.d[n2 >> 7][n2 & 127];
    }

    public void a(O o2) {
        int n2 = this.e >> 7;
        int n3 = this.e & 127;
        int n4 = this.d.length;
        if (n2 >= n4) {
            O[][] arrarro = new O[n4 + 8][];
            System.arraycopy(this.d, 0, arrarro, 0, n4);
            this.d = arrarro;
        }
        if (this.d[n2] == null) {
            this.d[n2] = new O[128];
        }
        this.d[n2][n3] = o2;
        ++this.e;
    }
}

