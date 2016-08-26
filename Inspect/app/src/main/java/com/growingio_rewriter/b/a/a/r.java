/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.s;
import com.growingio.b.a.a.v;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;

public class r
extends v {
    private s r;
    private int s;

    public r(s s2, int n2) {
        super(null);
        this.r = s2;
        this.s = n2;
    }

    @Override
    public o a() {
        o o2 = this.r.a();
        if (o2 == null) {
            return null;
        }
        g g2 = o2.a();
        if (g2 == null) {
            g2 = g.a();
        }
        String string = this.a(o2.s(), this.s);
        try {
            return g2.f(string);
        }
        catch (ae var4_4) {
            throw new RuntimeException(var4_4);
        }
    }

    @Override
    boolean b() {
        return this.r.b();
    }

    @Override
    public int c() {
        return this.s;
    }

    @Override
    public v d() {
        return this.s == 1 ? this.r : new r(this.r, this.s - 1);
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean a(v v2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean g() {
        return true;
    }

    public boolean b(v v2) {
        if (r.a(v2.a(), v.n.a())) {
            return true;
        }
        if (r.a(v2.a(), v.p.a())) {
            return true;
        }
        if (r.a(v2.a(), v.o.a())) {
            return true;
        }
        if (!v2.f()) {
            return false;
        }
        v v3 = this.d(v2);
        int n2 = v2.c();
        if (n2 > this.s) {
            return false;
        }
        if (n2 < this.s) {
            if (r.a(v3.a(), v.n.a())) {
                return true;
            }
            if (r.a(v3.a(), v.p.a())) {
                return true;
            }
            if (r.a(v3.a(), v.o.a())) {
                return true;
            }
            return false;
        }
        return this.r.b(v3);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof r)) {
            return false;
        }
        r r2 = (r)object;
        return this.r.equals(r2.r) && this.s == r2.s;
    }

    @Override
    public String toString() {
        return this.a(this.r.toString(), this.s);
    }
}

