/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.o;

final class n {
    static final n a = new n(new o("Failure occurred while trying to finish a future."));
    final Throwable b;

    n(Throwable throwable) {
        this.b = aU.a(throwable);
    }
}

