/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.u;
import com.growingio.b.a.br;
import java.util.Map;

class bq
extends br {
    Q a;
    Q b;
    Map c;
    u d;

    bq(byte[] arrby, Q q2, Q q3, Map map, u u2) {
        super(arrby);
        this.a = q2;
        this.b = q3;
        this.c = map;
        this.d = u2;
    }

    @Override
    void a(int n2, int n3, int n4) throws Exception {
        this.d.d(n3, n4);
    }

    @Override
    void a(int n2, int n3) throws Exception {
        this.d.h(n3);
    }

    @Override
    void a(int n2, int n3, int n4, int n5) throws Exception {
        this.d.a(n3, n4, n5);
    }

    @Override
    void b(int n2, int n3) throws Exception {
        this.d.i(n3);
    }

    @Override
    void c(int n2, int n3) throws Exception {
        this.d.j(n3);
    }

    @Override
    void d(int n2, int n3) throws Exception {
        this.d.k(n3);
    }

    @Override
    int b(int n2, int n3, int n4) throws Exception {
        this.d.e(n3, n4);
        return super.b(n2, n3, n4);
    }

    @Override
    void a(int n2, int n3, int n4, int n5, int n6) throws Exception {
        this.d.b(n4, n5, n6);
    }

    @Override
    void e(int n2, int n3) throws Exception {
        this.d.l(n3);
    }

    @Override
    void c(int n2, int n3, int n4) throws Exception {
        this.d.f(n3, n4);
    }

    @Override
    void b(int n2, int n3, int n4, int n5) throws Exception {
        this.d.c(n3, n4, n5);
    }

    @Override
    int f(int n2, int n3) throws Exception {
        this.d.m(n3);
        return super.f(n2, n3);
    }

    @Override
    void d(int n2, int n3, int n4) throws Exception {
        this.d.g(n3, n4);
    }
}

