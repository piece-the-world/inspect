/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.r;

class q
extends r {
    q() {
    }

    @Override
    protected void a(l l2, int n2) {
        aU.a(l2.a == null, "initial capacity was already set to ", (Object)l2.a);
        l2.a = n2;
    }
}

