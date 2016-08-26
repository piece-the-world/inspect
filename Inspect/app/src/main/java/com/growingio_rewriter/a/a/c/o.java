/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.r;

class o
extends r {
    o() {
    }

    @Override
    protected void a(l l2, int n2) {
        aU.a(l2.d == null, "concurrency level was already set to ", (Object)l2.d);
        l2.d = n2;
    }
}

