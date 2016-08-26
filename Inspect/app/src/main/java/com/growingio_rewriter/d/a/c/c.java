/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.c;

import com.growingio.d.a.c.b;

public class c
extends b {
    private final StringBuilder e = new StringBuilder();
    private boolean f;
    private boolean g;
    private int h;

    public c() {
        super(327680);
    }

    @Override
    public void c(String string) {
        if (!this.f) {
            this.f = true;
            this.e.append('<');
        }
        this.e.append(string);
        this.e.append(':');
    }

    @Override
    public b b() {
        return this;
    }

    @Override
    public b e() {
        this.e.append(':');
        return this;
    }

    @Override
    public b h() {
        this.k();
        return this;
    }

    @Override
    public b d() {
        return this;
    }

    @Override
    public b f() {
        this.k();
        if (!this.g) {
            this.g = true;
            this.e.append('(');
        }
        return this;
    }

    @Override
    public b g() {
        this.k();
        if (!this.g) {
            this.e.append('(');
        }
        this.e.append(')');
        return this;
    }

    @Override
    public b c() {
        this.e.append('^');
        return this;
    }

    @Override
    public void a(char c2) {
        this.e.append(c2);
    }

    @Override
    public void d(String string) {
        this.e.append('T');
        this.e.append(string);
        this.e.append(';');
    }

    @Override
    public b a() {
        this.e.append('[');
        return this;
    }

    @Override
    public void a(String string) {
        this.e.append('L');
        this.e.append(string);
        this.h *= 2;
    }

    @Override
    public void b(String string) {
        this.l();
        this.e.append('.');
        this.e.append(string);
        this.h *= 2;
    }

    @Override
    public void i() {
        if (this.h % 2 == 0) {
            ++this.h;
            this.e.append('<');
        }
        this.e.append('*');
    }

    @Override
    public b b(char c2) {
        if (this.h % 2 == 0) {
            ++this.h;
            this.e.append('<');
        }
        if (c2 != '=') {
            this.e.append(c2);
        }
        return this;
    }

    @Override
    public void j() {
        this.l();
        this.e.append(';');
    }

    public String toString() {
        return this.e.toString();
    }

    private void k() {
        if (this.f) {
            this.f = false;
            this.e.append('>');
        }
    }

    private void l() {
        if (this.h % 2 != 0) {
            this.e.append('>');
        }
        this.h /= 2;
    }
}

