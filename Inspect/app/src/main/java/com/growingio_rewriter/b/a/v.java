/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.bk;
import com.growingio.b.a.m;
import com.growingio.b.a.r;
import com.growingio.b.a.s;
import com.growingio.b.a.t;
import java.io.IOException;
import java.io.OutputStream;

public final class v {
    protected m a = new m(256);
    protected t b;
    private int f;
    protected int c;
    protected int d;
    protected int e;
    private int g;
    private boolean h;
    private int i;
    private int j;

    v(t t2) {
        this.b = t2;
        this.f = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public void a(int n2, String string, String string2, String[] arrstring, s s2) {
        int n3 = this.b.c(string);
        int n4 = this.b.c(string2);
        int[] arrn = arrstring == null ? null : this.b.a(arrstring);
        this.a(n2, n3, n4, arrn, s2);
    }

    public void a(int n2, int n3, int n4, int[] arrn, s s2) {
        int n5;
        ++this.f;
        this.a.b(n2);
        this.a.b(n3);
        this.a.b(n4);
        this.h = (n2 & 1024) != 0;
        int n6 = n5 = this.h ? 0 : 1;
        if (arrn != null) {
            ++n5;
        }
        r.a(this.a, s2, n5);
        if (arrn != null) {
            this.a(arrn);
        }
        if (!this.h) {
            if (this.c == 0) {
                this.c = this.b.c("Code");
            }
            this.g = this.a.a();
            this.a.b(this.c);
            this.a.a(12);
        }
        this.i = -1;
        this.j = 0;
    }

    private void a(int[] arrn) {
        if (this.d == 0) {
            this.d = this.b.c("Exceptions");
        }
        this.a.b(this.d);
        this.a.c(arrn.length * 2 + 2);
        this.a.b(arrn.length);
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            this.a.b(arrn[i2]);
        }
    }

    public void a(int n2) {
        this.a.write(n2);
    }

    public void b(int n2) {
        this.a.b(n2);
    }

    public void c(int n2) {
        this.a.c(n2);
    }

    public void a(int n2, String string, String string2, String string3) {
        int n3 = this.b.a(string);
        int n4 = this.b.a(string2, string3);
        int n5 = this.b.c(n3, n4);
        this.a(n2);
        this.b(n5);
    }

    public void a(int n2, int n3) {
        if (!this.h) {
            this.a.b(this.g + 6, n2);
            this.a.b(this.g + 8, n3);
            this.a.c(this.g + 10, this.a.a() - this.g - 14);
            this.i = this.a.a();
            this.j = 0;
            this.a.b(0);
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        ++this.j;
        this.a.b(n2);
        this.a.b(n3);
        this.a.b(n4);
        this.a.b(n5);
    }

    public void a(bk bk2, s s2) {
        if (this.h) {
            return;
        }
        this.a.b(this.i, this.j);
        int n2 = bk2 == null ? 0 : 1;
        r.a(this.a, s2, n2);
        if (bk2 != null) {
            if (this.e == 0) {
                this.e = this.b.c("StackMapTable");
            }
            this.a.b(this.e);
            byte[] arrby = bk2.a();
            this.a.c(arrby.length);
            this.a.write(arrby);
        }
        this.a.c(this.g + 2, this.a.a() - this.g - 6);
    }

    public int a() {
        return this.a.a() - this.g - 14;
    }

    int b() {
        return this.f;
    }

    int c() {
        return this.a.b();
    }

    void a(OutputStream outputStream) throws IOException {
        this.a.a(outputStream);
    }
}

