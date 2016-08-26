/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a;
import com.growingio.d.a.a.c;
import com.growingio.d.a.a.q;
import com.growingio.d.a.j;
import com.growingio.d.a.v;

public class i
extends j {
    private final q c;

    public i(j j2, q q2) {
        this(327680, j2, q2);
    }

    protected i(int n2, j j2, q q2) {
        super(n2, j2);
        this.c = q2;
    }

    @Override
    public a a(String string, boolean bl2) {
        a a2 = this.b.a(this.c.a(string), bl2);
        return a2 == null ? null : new c(a2, this.c);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        a a2 = super.a(n2, v2, this.c.a(string), bl2);
        return a2 == null ? null : new c(a2, this.c);
    }
}

