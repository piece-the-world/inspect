/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.s;
import com.growingio.b.a.i;
import com.growingio.b.g;

public class l
extends h {
    private String a;
    private int b;

    public l(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public int a(Q q2) {
        return 0;
    }

    @Override
    public h b() {
        if (this == s.h) {
            return this;
        }
        return super.b();
    }

    @Override
    public l c() {
        return this;
    }

    @Override
    public boolean d() {
        return this.b == 4 || this.b == 3;
    }

    @Override
    public boolean a(h h2) {
        return this == h2;
    }

    @Override
    public String g() {
        return this.a;
    }

    @Override
    public void a(String string, g g2) throws i {
        throw new i("conflict: " + this.a + " and " + string);
    }

    public String toString() {
        return this.a;
    }
}

