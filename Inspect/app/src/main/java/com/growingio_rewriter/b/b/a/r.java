/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.c;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.z;

public class r
extends a
implements z {
    protected boolean a;
    protected int b;

    public r(a a2, a a3) {
        super(a2, new a(a3));
        this.a = false;
        this.b = 307;
    }

    public r(int n2, a a2, c c2) {
        super(null, new a(a2));
        this.a = true;
        this.b = n2;
        if (c2 != null) {
            r.a((a)this, (b)c2);
        }
    }

    public static r a(a a2, a a3, c c2) {
        r r2 = new r(a2, a3);
        r2.a = true;
        if (c2 != null) {
            r.a((a)r2, (b)c2);
        }
        return r2;
    }

    public boolean g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public a i() {
        return (a)this.a();
    }

    public a j() {
        return (a)this.b().a();
    }

    public a k() {
        return this.j();
    }

    public c l() {
        b b2 = this.b().b();
        if (b2 == null) {
            return null;
        }
        return (c)b2.a();
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }

    @Override
    protected String f() {
        return this.a ? "new[]" : "new";
    }
}

