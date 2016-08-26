/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.b.e;
import com.growingio.b.a.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

class d
extends g {
    ByteArrayOutputStream a = new ByteArrayOutputStream();
    e b;
    Q c;
    Q d;
    Map e;

    d(byte[] arrby, Q q2, Q q3, Map map) {
        this(arrby, q2, q3, map, true);
    }

    d(byte[] arrby, Q q2, Q q3, Map map, boolean bl2) {
        super(arrby);
        if (bl2) {
            this.b = new e(this.a, q3);
        }
        this.c = q2;
        this.d = q3;
        this.e = map;
    }

    byte[] a() throws IOException {
        this.b.b();
        return this.a.toByteArray();
    }

    @Override
    void a(int n2, int n3) throws Exception {
        this.b.a(n2);
        super.a(n2, n3);
    }

    @Override
    int b(int n2, int n3) throws Exception {
        this.b.b(n3);
        return super.b(n2, n3);
    }

    @Override
    int a(int n2, int n3, int n4) throws Exception {
        this.b.a(this.c(n3), n4);
        return super.a(n2, n3, n4);
    }

    @Override
    int c(int n2, int n3) throws Exception {
        this.b.c(this.b(n3));
        return super.c(n2, n3);
    }

    @Override
    void d(int n2, int n3) throws Exception {
        this.b.b(n2, this.b(n3));
        super.d(n2, n3);
    }

    @Override
    void b(int n2, int n3, int n4) throws Exception {
        this.b.c(this.c(n3), this.b(n4));
        super.b(n2, n3, n4);
    }

    @Override
    void e(int n2, int n3) throws Exception {
        this.b.e(this.c(n3));
        super.e(n2, n3);
    }

    @Override
    int a(int n2) throws Exception {
        this.b.c();
        return super.a(n2);
    }

    @Override
    int f(int n2, int n3) throws Exception {
        this.b.f(n3);
        return super.f(n2, n3);
    }

    int b(int n2) {
        return this.c.a(n2, this.d, this.e);
    }

    int c(int n2) {
        String string = this.c.E(n2);
        String string2 = T.a(string, this.e);
        return this.d.c(string2);
    }
}

