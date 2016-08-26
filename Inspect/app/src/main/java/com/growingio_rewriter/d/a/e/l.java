/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.e.i;

public final class l
extends a {
    private final i a;

    public l(i i2) {
        this(null, i2);
    }

    public l(a a2, i i2) {
        super(327680, a2);
        this.a = i2;
    }

    @Override
    public void a(String string, Object object) {
        this.a.a(string, object);
        super.a(string, object);
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.a.b(string, string2, string3);
        super.a(string, string2, string3);
    }

    @Override
    public a a(String string, String string2) {
        i i2 = this.a.c(string, string2);
        a a2 = this.d == null ? null : this.d.a(string, string2);
        return new l(a2, i2);
    }

    @Override
    public a a(String string) {
        i i2 = this.a.b(string);
        a a2 = this.d == null ? null : this.d.a(string);
        return new l(a2, i2);
    }

    @Override
    public void b_() {
        this.a.b();
        super.b_();
    }
}

