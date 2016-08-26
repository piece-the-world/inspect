/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.i;

abstract class D {
    int a;
    int b;

    D(int n2) {
        this.a = this.b = n2;
    }

    void a(int n2, int n3, boolean bl2) {
        if (n2 < this.a || n2 == this.a && bl2) {
            this.a += n3;
        }
    }

    static int a(int n2, int n3, int n4, int n5, boolean bl2) {
        int n6 = n2 + n3;
        if (n2 < n4) {
            if (n4 < n6 || bl2 && n4 == n6) {
                n3 += n5;
            }
        } else if (n2 == n4) {
            if (n6 < n4 && bl2) {
                n3 -= n5;
            } else if (n4 < n6 && !bl2) {
                n3 += n5;
            }
        } else if (n6 < n4 || !bl2 && n4 == n6) {
            n3 -= n5;
        }
        return n3;
    }

    boolean a() {
        return false;
    }

    int b() {
        return 0;
    }

    int c() {
        return 0;
    }

    abstract int a(int var1, byte[] var2, int var3, byte[] var4) throws i;
}

