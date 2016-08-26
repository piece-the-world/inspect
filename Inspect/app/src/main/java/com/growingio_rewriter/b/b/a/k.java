/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.z;

public class k
extends a
implements z {
    protected int a;

    k(int n2, b b2, a a2) {
        super(b2, a2);
        this.a = n2;
    }

    k(int n2, b b2) {
        super(b2);
        this.a = n2;
    }

    public static k b(int n2, b b2, b b3) {
        return new k(n2, b2, new a(b3));
    }

    public static k a(int n2, b b2) {
        return new k(n2, b2);
    }

    public int h() {
        return this.a;
    }

    public void b(int n2) {
        this.a = n2;
    }

    public b i() {
        return this.a();
    }

    public void d(b b2) {
        this.a(b2);
    }

    public b j() {
        return this.b().a();
    }

    public void e(b b2) {
        this.b().a(b2);
    }

    @Override
    public void a(x x2) throws e {
        x2.c(this);
    }

    public String k() {
        int n2 = this.a;
        if (n2 < 128) {
            return String.valueOf((char)n2);
        }
        if (350 <= n2 && n2 <= 371) {
            return aX_[n2 - 350];
        }
        if (n2 == 323) {
            return "instanceof";
        }
        return String.valueOf(n2);
    }

    @Override
    protected String f() {
        return "op:" + this.k();
    }
}

