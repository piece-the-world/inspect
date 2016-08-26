/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.l;
import com.growingio.b.a.c.o;
import com.growingio.b.a.c.p;
import com.growingio.b.a.c.s;
import com.growingio.b.a.i;
import com.growingio.b.g;

public class r
extends com.growingio.b.a.c.i {
    protected h a;

    public r(p p2) {
        this.a = p2;
    }

    @Override
    public int a() {
        return this.a.a();
    }

    @Override
    public int a(Q q2) {
        return this.a.a(q2);
    }

    @Override
    public l c() {
        return this.a.c();
    }

    @Override
    public boolean d() {
        return this.a.d();
    }

    @Override
    public boolean f() {
        return this.a.f();
    }

    @Override
    public boolean a(h h2) {
        return this.a.a(h2);
    }

    @Override
    public String g() {
        return this.a.g();
    }

    @Override
    protected o h() {
        return null;
    }

    @Override
    public h b() {
        return this.a.b();
    }

    @Override
    public void a(String string, g g2) throws i {
        this.a.a(string, g2);
    }

    @Override
    public void b(h h2) {
        if (!h2.a(this.a)) {
            this.a = s.h;
        }
    }

    @Override
    public void b(int n2) {
        this.a.b(n2);
    }

    public int i() {
        if (this.a instanceof p) {
            return ((p)this.a).a;
        }
        throw new RuntimeException("not available");
    }
}

