/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.e.i;
import com.growingio.d.a.e.l;
import com.growingio.d.a.j;
import com.growingio.d.a.v;

public final class n
extends j {
    public final i c;

    public n(i i2) {
        this(null, i2);
    }

    public n(j j2, i i2) {
        super(327680, j2);
        this.c = i2;
    }

    @Override
    public a a(String string, boolean bl2) {
        i i2 = this.c.f(string, bl2);
        a a2 = this.b == null ? null : this.b.a(string, bl2);
        return new l(a2, i2);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        i i2 = this.c.j(n2, v2, string, bl2);
        a a2 = this.b == null ? null : this.b.a(n2, v2, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void a(c c2) {
        this.c.b(c2);
        super.a(c2);
    }

    @Override
    public void a() {
        this.c.c();
        super.a();
    }
}

