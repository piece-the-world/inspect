/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.cG;

final class ad {
    final cG a;
    final boolean b;
    final Throwable c;

    ad(cG cG2) {
        this(cG2, false, null);
    }

    ad(cG cG2, boolean bl2, Throwable throwable) {
        aU.a(!bl2 || cG2 == cG.b, "shudownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", (Object)cG2);
        aU.a(!(throwable != null ^ cG2 == cG.f), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", (Object)cG2, (Object)throwable);
        this.a = cG2;
        this.b = bl2;
        this.c = throwable;
    }

    cG a() {
        if (this.b && this.a == cG.b) {
            return cG.d;
        }
        return this.a;
    }

    Throwable b() {
        aU.b(this.a == cG.f, "failureCause() is only valid if the service has failed, service is %s", (Object)this.a);
        return this.c;
    }
}

