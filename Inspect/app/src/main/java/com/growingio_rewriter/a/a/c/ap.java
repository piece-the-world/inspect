/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.B;
import com.growingio.a.a.c.ao;
import java.util.concurrent.Callable;

class ap
extends B<Object, V> {
    final /* synthetic */ Callable a;
    final /* synthetic */ ao b;

    ap(ao ao2, Callable callable) {
        this.b = ao2;
        this.a = callable;
    }

    @Override
    public V a(Object object) throws Exception {
        return this.a.call();
    }
}

