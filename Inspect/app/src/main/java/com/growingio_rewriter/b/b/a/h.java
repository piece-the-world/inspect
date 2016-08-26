/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class h
extends a {
    public h(b b2, b b3, b b4) {
        super(b2, new a(b3, new a(b4)));
    }

    public b g() {
        return this.c();
    }

    public void d(b b2) {
        this.c(b2);
    }

    public b h() {
        return this.d().c();
    }

    public void e(b b2) {
        this.d().c(b2);
    }

    public b i() {
        return this.d().d().c();
    }

    public void f(b b2) {
        this.d().d().c(b2);
    }

    @Override
    public String f() {
        return "?:";
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

