/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.de;

final class dc {
    private static final int j = 1073741824;
    final de a = new de();
    final int[] b = new int[4];
    int c;
    int d;
    int e;
    boolean f;
    boolean g;
    int h;
    int i;

    dc() {
    }

    void a() {
        this.c = 1073741824;
    }

    void a(int n2, int n3, int n4) {
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = false;
    }

    void b(int n2, int n3, int n4) {
        this.c = n2;
        this.d = n3 + 1;
        this.e = n4;
        this.f = true;
        this.g = false;
    }

    void a(int n2, int n3, int n4, int n5, int n6) {
        this.c = n2;
        this.d = n3 + n5 + 1;
        this.e = n6;
        this.f = true;
        this.g = true;
        this.h = n3;
        this.i = n4;
    }
}

