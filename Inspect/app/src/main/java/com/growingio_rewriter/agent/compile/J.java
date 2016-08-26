/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.K;
import com.growingio.agent.compile.l;
import com.growingio.d.a.a;
import com.growingio.d.a.a.j;
import com.growingio.d.a.r;
import com.growingio.d.a.u;

abstract class J
extends com.growingio.d.a.a.a {
    protected final K b;
    protected final String c;

    protected J(r r2, int n2, String string, String string2) {
        super(327680, r2, n2, string, string2);
        this.b = new K(this);
        this.c = string;
    }

    @Override
    public void b() {
        super.a(u.c(l.class), false);
        super.b();
    }
}

