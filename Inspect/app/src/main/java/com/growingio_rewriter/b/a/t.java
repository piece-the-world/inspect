/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.m;

public final class t {
    m a;
    protected int b;
    protected int c;

    t(m m2) {
        this.a = m2;
        this.b = m2.a();
        this.c = 1;
        this.a.b(1);
    }

    public int[] a(String[] arrstring) {
        int n2 = arrstring.length;
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrn[i2] = this.a(arrstring[i2]);
        }
        return arrn;
    }

    public int a(String string) {
        int n2 = this.c(string);
        this.a.write(7);
        this.a.b(n2);
        return this.c++;
    }

    public int a(int n2) {
        this.a.write(7);
        this.a.b(n2);
        return this.c++;
    }

    public int a(String string, String string2) {
        return this.a(this.c(string), this.c(string2));
    }

    public int a(int n2, int n3) {
        this.a.write(12);
        this.a.b(n2);
        this.a.b(n3);
        return this.c++;
    }

    public int b(int n2, int n3) {
        this.a.write(9);
        this.a.b(n2);
        this.a.b(n3);
        return this.c++;
    }

    public int c(int n2, int n3) {
        this.a.write(10);
        this.a.b(n2);
        this.a.b(n3);
        return this.c++;
    }

    public int d(int n2, int n3) {
        this.a.write(11);
        this.a.b(n2);
        this.a.b(n3);
        return this.c++;
    }

    public int e(int n2, int n3) {
        this.a.write(15);
        this.a.write(n2);
        this.a.b(n3);
        return this.c++;
    }

    public int b(int n2) {
        this.a.write(16);
        this.a.b(n2);
        return this.c++;
    }

    public int f(int n2, int n3) {
        this.a.write(18);
        this.a.b(n2);
        this.a.b(n3);
        return this.c++;
    }

    public int b(String string) {
        int n2 = this.c(string);
        this.a.write(8);
        this.a.b(n2);
        return this.c++;
    }

    public int c(int n2) {
        this.a.write(3);
        this.a.c(n2);
        return this.c++;
    }

    public int a(float f2) {
        this.a.write(4);
        this.a.a(f2);
        return this.c++;
    }

    public int a(long l2) {
        this.a.write(5);
        this.a.a(l2);
        int n2 = this.c;
        this.c += 2;
        return n2;
    }

    public int a(double d2) {
        this.a.write(6);
        this.a.a(d2);
        int n2 = this.c;
        this.c += 2;
        return n2;
    }

    public int c(String string) {
        this.a.write(1);
        this.a.a(string);
        return this.c++;
    }

    void a() {
        this.a.b(this.b, this.c);
    }
}

