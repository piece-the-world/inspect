/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.e.i;
import com.growingio.d.a.e.k;
import com.growingio.d.a.e.l;
import com.growingio.d.a.e.n;
import com.growingio.d.a.e.o;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import com.growingio.d.a.v;
import java.io.PrintWriter;

public final class m
extends f {
    private final PrintWriter b;
    public final i a;

    public m(PrintWriter printWriter) {
        this(null, printWriter);
    }

    public m(f f2, PrintWriter printWriter) {
        this(f2, new k(), printWriter);
    }

    public m(f f2, i i2, PrintWriter printWriter) {
        super(327680, f2);
        this.b = printWriter;
        this.a = i2;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.a.a(n2, n3, string, string2, string3, arrstring);
        super.a(n2, n3, string, string2, string3, arrstring);
    }

    @Override
    public void a_(String string, String string2) {
        this.a.a(string, string2);
        super.a_(string, string2);
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.a.a(string, string2, string3);
        super.a(string, string2, string3);
    }

    @Override
    public a a(String string, boolean bl2) {
        i i2 = this.a.g(string, bl2);
        a a2 = this.g == null ? null : this.g.a(string, bl2);
        return new l(a2, i2);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        i i2 = this.a.k(n2, v2, string, bl2);
        a a2 = this.g == null ? null : this.g.a(n2, v2, string, bl2);
        return new l(a2, i2);
    }

    @Override
    public void a(c c2) {
        this.a.a(c2);
        super.a(c2);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        this.a.a(string, string2, string3, n2);
        super.a(string, string2, string3, n2);
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        i i2 = this.a.b(n2, string, string2, string3, object);
        j j2 = this.g == null ? null : this.g.a(n2, string, string2, string3, object);
        return new n(j2, i2);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        i i2 = this.a.b(n2, string, string2, string3, arrstring);
        r r2 = this.g == null ? null : this.g.a(n2, string, string2, string3, arrstring);
        return new o(r2, i2);
    }

    @Override
    public void a() {
        this.a.a();
        if (this.b != null) {
            this.a.a(this.b);
            this.b.flush();
        }
        super.a();
    }
}

