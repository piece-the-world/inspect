/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a;
import com.growingio.d.a.a.q;

public class r
extends a {
    protected final q a;

    public r(a a2, q q2) {
        this(327680, a2, q2);
    }

    protected r(int n2, a a2, q q2) {
        super(n2, a2);
        this.a = q2;
    }

    @Override
    public void a(String string, Object object) {
        this.d.a(string, this.a.a(object));
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.d.a(string, this.a.a(string2), string3);
    }

    @Override
    public a a(String string, String string2) {
        a a2 = this.d.a(string, this.a.a(string2));
        return a2 == null ? null : (a2 == this.d ? this : new r(a2, this.a));
    }

    @Override
    public a a(String string) {
        a a2 = this.d.a(string);
        return a2 == null ? null : (a2 == this.d ? this : new r(a2, this.a));
    }
}

