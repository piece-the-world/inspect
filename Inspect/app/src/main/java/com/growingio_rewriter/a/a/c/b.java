/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.I;
import com.growingio.a.a.c.aU;
import com.growingio.a.a.c.aV;
import com.growingio.a.a.c.c;

public final class b
implements c {
    private final aU a = aV.a();
    private final aU b = aV.a();
    private final aU c = aV.a();
    private final aU d = aV.a();
    private final aU e = aV.a();
    private final aU f = aV.a();

    @Override
    public void a(int n2) {
        this.a.a(n2);
    }

    @Override
    public void b(int n2) {
        this.b.a(n2);
    }

    @Override
    public void a(long l2) {
        this.c.a();
        this.e.a(l2);
    }

    @Override
    public void b(long l2) {
        this.d.a();
        this.e.a(l2);
    }

    @Override
    public void a() {
        this.f.a();
    }

    @Override
    public I b() {
        return new I(this.a.b(), this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b());
    }

    public void a(c c2) {
        I i2 = c2.b();
        this.a.a(i2.b());
        this.b.a(i2.d());
        this.c.a(i2.g());
        this.d.a(i2.h());
        this.e.a(i2.j());
        this.f.a(i2.l());
    }
}

