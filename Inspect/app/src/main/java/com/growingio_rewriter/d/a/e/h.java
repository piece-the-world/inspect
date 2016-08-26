/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.c.b;
import com.growingio.d.a.e.f;

public class h
extends b {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 4;
    private static final int k = 8;
    private static final int l = 16;
    private static final int m = 32;
    private static final int n = 64;
    private static final int o = 128;
    private static final int p = 256;
    private final int q;
    private int r;
    private boolean s;
    private final b t;

    public h(int n2, b b2) {
        this(327680, n2, b2);
    }

    protected h(int n2, int n3, b b2) {
        super(n2);
        this.q = n3;
        this.r = 1;
        this.t = b2;
    }

    @Override
    public void c(String string) {
        if (this.q == 2 || this.r != 1 && this.r != 2 && this.r != 4) {
            throw new IllegalStateException();
        }
        f.a(string, "formal type parameter");
        this.r = 2;
        if (this.t != null) {
            this.t.c(string);
        }
    }

    @Override
    public b b() {
        if (this.r != 2) {
            throw new IllegalStateException();
        }
        this.r = 4;
        b b2 = this.t == null ? null : this.t.b();
        return new h(2, b2);
    }

    @Override
    public b e() {
        if (this.r != 2 && this.r != 4) {
            throw new IllegalArgumentException();
        }
        b b2 = this.t == null ? null : this.t.e();
        return new h(2, b2);
    }

    @Override
    public b h() {
        if (this.q != 0 || (this.r & 7) == 0) {
            throw new IllegalArgumentException();
        }
        this.r = 8;
        b b2 = this.t == null ? null : this.t.h();
        return new h(2, b2);
    }

    @Override
    public b d() {
        if (this.r != 8) {
            throw new IllegalStateException();
        }
        b b2 = this.t == null ? null : this.t.d();
        return new h(2, b2);
    }

    @Override
    public b f() {
        if (this.q != 1 || (this.r & 23) == 0) {
            throw new IllegalArgumentException();
        }
        this.r = 16;
        b b2 = this.t == null ? null : this.t.f();
        return new h(2, b2);
    }

    @Override
    public b g() {
        if (this.q != 1 || (this.r & 23) == 0) {
            throw new IllegalArgumentException();
        }
        this.r = 32;
        b b2 = this.t == null ? null : this.t.g();
        h h2 = new h(2, b2);
        h2.s = true;
        return h2;
    }

    @Override
    public b c() {
        if (this.r != 32) {
            throw new IllegalStateException();
        }
        b b2 = this.t == null ? null : this.t.c();
        return new h(2, b2);
    }

    @Override
    public void a(char c2) {
        if (this.q != 2 || this.r != 1) {
            throw new IllegalStateException();
        }
        if (c2 == 'V' ? !this.s : "ZCBSIFJD".indexOf(c2) == -1) {
            throw new IllegalArgumentException();
        }
        this.r = 64;
        if (this.t != null) {
            this.t.a(c2);
        }
    }

    @Override
    public void d(String string) {
        if (this.q != 2 || this.r != 1) {
            throw new IllegalStateException();
        }
        f.a(string, "type variable");
        this.r = 64;
        if (this.t != null) {
            this.t.d(string);
        }
    }

    @Override
    public b a() {
        if (this.q != 2 || this.r != 1) {
            throw new IllegalStateException();
        }
        this.r = 64;
        b b2 = this.t == null ? null : this.t.a();
        return new h(2, b2);
    }

    @Override
    public void a(String string) {
        if (this.q != 2 || this.r != 1) {
            throw new IllegalStateException();
        }
        f.b(string, "class name");
        this.r = 128;
        if (this.t != null) {
            this.t.a(string);
        }
    }

    @Override
    public void b(String string) {
        if (this.r != 128) {
            throw new IllegalStateException();
        }
        f.a(string, "inner class name");
        if (this.t != null) {
            this.t.b(string);
        }
    }

    @Override
    public void i() {
        if (this.r != 128) {
            throw new IllegalStateException();
        }
        if (this.t != null) {
            this.t.i();
        }
    }

    @Override
    public b b(char c2) {
        if (this.r != 128) {
            throw new IllegalStateException();
        }
        if ("+-=".indexOf(c2) == -1) {
            throw new IllegalArgumentException();
        }
        b b2 = this.t == null ? null : this.t.b(c2);
        return new h(2, b2);
    }

    @Override
    public void j() {
        if (this.r != 128) {
            throw new IllegalStateException();
        }
        this.r = 256;
        if (this.t != null) {
            this.t.j();
        }
    }
}

