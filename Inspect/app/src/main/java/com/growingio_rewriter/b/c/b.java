/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.i;
import com.growingio.b.ae;
import com.growingio.b.c.c;
import com.growingio.b.c.j;

public class b
extends c {
    public b(j j2, K k2, K k3) throws ae {
        super(j2, k2, k3);
    }

    @Override
    protected int a(int n2, B b2) throws i {
        b2.a(n2);
        b2.a(this.d);
        b2.a(this.e);
        int n3 = b2.h(3);
        b2.b(n3);
        b2.a(this.e);
        n2 = b2.f();
        n3 = b2.b();
        b2.a(b2.c(n2), n3);
        b2.b(b2.e(n2 + 1), n3 + 1);
        b2.a(184, n2);
        b2.b(this.do, n2 + 1);
        b2.a(n3);
        return b2.f();
    }
}

