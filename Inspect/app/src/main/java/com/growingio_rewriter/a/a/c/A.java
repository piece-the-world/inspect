/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.p;
import java.util.concurrent.TimeUnit;

class A
extends p {
    A() {
    }

    @Override
    protected void a(l l2, long l3, TimeUnit timeUnit) {
        aU.a(l2.i == null, (Object)"expireAfterWrite already set");
        l2.h = l3;
        l2.i = timeUnit;
    }
}

