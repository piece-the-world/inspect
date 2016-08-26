/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.t;

class u
extends t {
    u() {
    }

    @Override
    protected void a(l l2, long l3) {
        aU.a(l2.b == null, "maximum size was already set to ", (Object)l2.b);
        aU.a(l2.c == null, "maximum weight was already set to ", (Object)l2.c);
        l2.b = l3;
    }
}

