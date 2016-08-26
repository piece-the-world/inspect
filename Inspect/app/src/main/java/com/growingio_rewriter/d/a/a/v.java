/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.q;
import com.growingio.d.a.c.b;

public class v
extends b {
    private final b e;
    private final q f;
    private String g;

    public v(b b2, q q2) {
        this(327680, b2, q2);
    }

    protected v(int n2, b b2, q q2) {
        super(n2);
        this.e = b2;
        this.f = q2;
    }

    @Override
    public void a(String string) {
        this.g = string;
        this.e.a(this.f.b(string));
    }

    @Override
    public void b(String string) {
        String string2 = this.f.b(this.g) + '$';
        this.g = this.g + '$' + string;
        String string3 = this.f.b(this.g);
        int n2 = string3.startsWith(string2) ? string2.length() : string3.lastIndexOf(36) + 1;
        this.e.b(string3.substring(n2));
    }

    @Override
    public void c(String string) {
        this.e.c(string);
    }

    @Override
    public void d(String string) {
        this.e.d(string);
    }

    @Override
    public b a() {
        this.e.a();
        return this;
    }

    @Override
    public void a(char c2) {
        this.e.a(c2);
    }

    @Override
    public b b() {
        this.e.b();
        return this;
    }

    @Override
    public b c() {
        this.e.c();
        return this;
    }

    @Override
    public b d() {
        this.e.d();
        return this;
    }

    @Override
    public b e() {
        this.e.e();
        return this;
    }

    @Override
    public b f() {
        this.e.f();
        return this;
    }

    @Override
    public b g() {
        this.e.g();
        return this;
    }

    @Override
    public b h() {
        this.e.h();
        return this;
    }

    @Override
    public void i() {
        this.e.i();
    }

    @Override
    public b b(char c2) {
        this.e.b(c2);
        return this;
    }

    @Override
    public void j() {
        this.e.j();
    }
}

