/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.p;
import java.util.concurrent.TimeUnit;

class n
extends p {
    n() {
    }

    @Override
    protected void a(l l2, long l3, TimeUnit timeUnit) {
        aU.a(l2.k == null, (Object)"expireAfterAccess already set");
        l2.j = l3;
        l2.k = timeUnit;
    }
}

