/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.l;
import java.io.IOException;
import java.io.OutputStream;

public class e {
    protected OutputStream a;
    private Q b;

    public e(OutputStream outputStream, Q q2) {
        this.a = outputStream;
        this.b = q2;
    }

    public Q a() {
        return this.b;
    }

    public void b() throws IOException {
        this.a.close();
    }

    public void a(int n2) throws IOException {
        this.a.write(n2);
    }

    public void b(int n2) throws IOException {
        this.g(n2);
    }

    public void a(String string, int n2) throws IOException {
        this.a(this.b.c(string), n2);
    }

    public void a(int n2, int n3) throws IOException {
        this.g(n2);
        this.g(n3);
    }

    public void a(String string) throws IOException {
        this.c(this.b.c(string));
    }

    public void c(int n2) throws IOException {
        this.g(n2);
    }

    public void a(boolean bl2) throws IOException {
        this.b(90, this.b.L(bl2 ? 1 : 0));
    }

    public void a(byte by2) throws IOException {
        this.b(66, this.b.L(by2));
    }

    public void a(char c2) throws IOException {
        this.b(67, this.b.L(c2));
    }

    public void a(short s2) throws IOException {
        this.b(83, this.b.L(s2));
    }

    public void d(int n2) throws IOException {
        this.b(73, this.b.L(n2));
    }

    public void a(long l2) throws IOException {
        this.b(74, this.b.a(l2));
    }

    public void a(float f2) throws IOException {
        this.b(70, this.b.a(f2));
    }

    public void a(double d2) throws IOException {
        this.b(68, this.b.a(d2));
    }

    public void b(String string) throws IOException {
        this.b(115, this.b.c(string));
    }

    public void b(int n2, int n3) throws IOException {
        this.a.write(n2);
        this.g(n3);
    }

    public void a(String string, String string2) throws IOException {
        this.c(this.b.c(string), this.b.c(string2));
    }

    public void c(int n2, int n3) throws IOException {
        this.a.write(101);
        this.g(n2);
        this.g(n3);
    }

    public void c(String string) throws IOException {
        this.e(this.b.c(string));
    }

    public void e(int n2) throws IOException {
        this.a.write(99);
        this.g(n2);
    }

    public void c() throws IOException {
        this.a.write(64);
    }

    public void f(int n2) throws IOException {
        this.a.write(91);
        this.g(n2);
    }

    protected void g(int n2) throws IOException {
        byte[] arrby = new byte[2];
        l.a(n2, arrby, 0);
        this.a.write(arrby);
    }
}

