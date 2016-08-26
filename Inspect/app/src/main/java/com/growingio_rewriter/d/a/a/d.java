/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a;
import com.growingio.d.a.a.c;
import com.growingio.d.a.a.i;
import com.growingio.d.a.a.p;
import com.growingio.d.a.a.q;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import com.growingio.d.a.v;

public class d
extends f {
    protected final q a;
    protected String b;

    public d(f f2, q q2) {
        this(327680, f2, q2);
    }

    protected d(int n2, f f2, q q2) {
        super(n2, f2);
        this.a = q2;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.b = string;
        super.a(n2, n3, this.a.b(string), this.a.a(string2, false), this.a.b(string3), arrstring == null ? null : this.a.a(arrstring));
    }

    @Override
    public a a(String string, boolean bl2) {
        a a2 = super.a(this.a.a(string), bl2);
        return a2 == null ? null : this.a(a2);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        a a2 = super.a(n2, v2, this.a.a(string), bl2);
        return a2 == null ? null : this.a(a2);
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        j j2 = super.a(n2, this.a.b(this.b, string, string2), this.a.a(string2), this.a.a(string3, true), this.a.a(object));
        return j2 == null ? null : this.a(j2);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        String string4 = this.a.c(string2);
        r r2 = super.a(n2, this.a.a(this.b, string, string2), string4, this.a.a(string3, false), arrstring == null ? null : this.a.a(arrstring));
        return r2 == null ? null : this.a(r2);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        super.a(this.a.b(string), string2 == null ? null : this.a.b(string2), string3, n2);
    }

    @Override
    public void a(String string, String string2, String string3) {
        super.a(this.a.b(string), string2 == null ? null : this.a.a(string, string2, string3), string3 == null ? null : this.a.c(string3));
    }

    protected j a(j j2) {
        return new i(j2, this.a);
    }

    protected r a(r r2) {
        return new p(r2, this.a);
    }

    protected a a(a a2) {
        return new c(a2, this.a);
    }
}

