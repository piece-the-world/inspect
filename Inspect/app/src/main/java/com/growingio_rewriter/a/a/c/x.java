/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.p;
import java.util.concurrent.TimeUnit;

class x
extends p {
    x() {
    }

    @Override
    protected void a(l l2, long l3, TimeUnit timeUnit) {
        aU.a(l2.m == null, (Object)"refreshAfterWrite already set");
        l2.l = l3;
        l2.m = timeUnit;
    }
}

