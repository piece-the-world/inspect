/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

final class de {
    static final int a = 12;
    private static final int b = 7;
    private static final int c = 0;
    private static final int d = 3;
    private static final int e = 7;
    private static final int f = 8;
    private static final int g = 9;
    private static final int h = 10;
    private static final int i = 11;
    private int j;

    de() {
    }

    de(de de2) {
        this.j = de2.j;
    }

    void a() {
        this.j = 0;
    }

    int b() {
        return this.j;
    }

    void a(de de2) {
        this.j = de2.j;
    }

    void c() {
        this.j = this.j <= 3 ? 0 : (this.j <= 9 ? (this.j -= 3) : (this.j -= 6));
    }

    void d() {
        this.j = this.j < 7 ? 7 : 10;
    }

    void e() {
        this.j = this.j < 7 ? 8 : 11;
    }

    void f() {
        this.j = this.j < 7 ? 9 : 11;
    }

    boolean g() {
        return this.j < 7;
    }
}

