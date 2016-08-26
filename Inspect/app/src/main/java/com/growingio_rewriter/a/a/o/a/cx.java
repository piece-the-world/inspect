/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bD;
import com.growingio.a.a.o.a.cw;
import com.growingio.a.a.o.a.dF;
import java.util.concurrent.TimeUnit;

final class cx
extends cw {
    final bD a = bD.b();

    cx() {
    }

    @Override
    protected long a() {
        return this.a.a(TimeUnit.MICROSECONDS);
    }

    @Override
    protected void a(long l2) {
        if (l2 > 0) {
            dF.a(l2, TimeUnit.MICROSECONDS);
        }
    }
}

