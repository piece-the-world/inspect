/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.o;
import com.growingio.b.a.c.r;

public class p
extends m {
    int a;
    boolean b;

    p(int n2, String string) {
        super(string);
        this.a = n2;
        this.b = false;
    }

    public p i() {
        return new p(this.a, this.g());
    }

    @Override
    public int a() {
        return 8;
    }

    @Override
    public int a(Q q2) {
        return this.a;
    }

    @Override
    public h b() {
        if (this.b) {
            return new o(new m(this.g()));
        }
        return new r(this.i());
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean a(h h2) {
        if (h2 instanceof p) {
            p p2 = (p)h2;
            return this.a == p2.a && this.g().equals(p2.g());
        }
        return false;
    }

    public String toString() {
        return "uninit:" + this.g() + "@" + this.a;
    }

    public int j() {
        return this.a;
    }

    @Override
    public void b(int n2) {
        if (n2 == this.a) {
            this.b = true;
        }
    }
}

