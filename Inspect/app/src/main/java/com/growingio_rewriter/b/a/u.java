/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.m;
import com.growingio.b.a.r;
import com.growingio.b.a.s;
import com.growingio.b.a.t;
import java.io.IOException;
import java.io.OutputStream;

public final class u {
    protected m a = new m(128);
    protected t b;
    private int c;

    u(t t2) {
        this.b = t2;
        this.c = 0;
    }

    public void a(int n2, String string, String string2, s s2) {
        int n3 = this.b.c(string);
        int n4 = this.b.c(string2);
        this.a(n2, n3, n4, s2);
    }

    public void a(int n2, int n3, int n4, s s2) {
        ++this.c;
        this.a.b(n2);
        this.a.b(n3);
        this.a.b(n4);
        r.a(this.a, s2, 0);
    }

    int a() {
        return this.c;
    }

    int b() {
        return this.a.b();
    }

    void a(OutputStream outputStream) throws IOException {
        this.a.a(outputStream);
    }
}

