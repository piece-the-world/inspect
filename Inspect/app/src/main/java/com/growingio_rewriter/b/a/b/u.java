/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.e;
import java.io.IOException;
import java.io.OutputStream;

public class u
extends e {
    public u(OutputStream outputStream, Q q2) {
        super(outputStream, q2);
    }

    @Override
    public void b(int n2) throws IOException {
        super.b(n2);
    }

    public void d(int n2, int n3) throws IOException {
        this.a.write(n2);
        this.a.write(n3);
    }

    public void h(int n2) throws IOException {
        this.a.write(16);
        this.g(n2);
    }

    public void a(int n2, int n3, int n4) throws IOException {
        this.a.write(n2);
        this.a.write(n3);
        this.a.write(n4);
    }

    public void i(int n2) throws IOException {
        this.a.write(n2);
    }

    public void j(int n2) throws IOException {
        this.a.write(22);
        this.a.write(n2);
    }

    public void k(int n2) throws IOException {
        this.a.write(23);
        this.g(n2);
    }

    public void e(int n2, int n3) throws IOException {
        this.a.write(n2);
        this.g(n3);
    }

    public void b(int n2, int n3, int n4) throws IOException {
        this.g(n2);
        this.g(n3);
        this.g(n4);
    }

    public void l(int n2) throws IOException {
        this.a.write(66);
        this.g(n2);
    }

    public void f(int n2, int n3) throws IOException {
        this.a.write(n2);
        this.g(n3);
    }

    public void c(int n2, int n3, int n4) throws IOException {
        this.a.write(n2);
        this.g(n3);
        this.a.write(n4);
    }

    public void m(int n2) throws IOException {
        this.a.write(n2);
    }

    public void g(int n2, int n3) throws IOException {
        this.a.write(n2);
        this.a.write(n3);
    }
}

