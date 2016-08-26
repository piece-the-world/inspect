/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.f;
import com.growingio.d.a.r;

public class A
extends f {
    private String a;
    private r b;
    private final String c;
    private int d;

    public A(String string, f f2) {
        this(327680, string, f2);
    }

    protected A(int n2, String string, f f2) {
        super(n2, f2);
        this.c = string;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.g.a(n2, n3, string, string2, string3, arrstring);
        this.a = string;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        r r2;
        if ("<clinit>".equals(string)) {
            int n3 = 10;
            String string4 = this.c + this.d++;
            r2 = this.g.a(n3, string4, string2, string3, arrstring);
            if (this.b == null) {
                this.b = this.g.a(n3, string, string2, null, null);
            }
            this.b.a(184, this.a, string4, string2, false);
        } else {
            r2 = this.g.a(n2, string, string2, string3, arrstring);
        }
        return r2;
    }

    @Override
    public void a() {
        if (this.b != null) {
            this.b.a_(177);
            this.b.d(0, 0);
        }
        this.g.a();
    }
}

