/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.B;
import com.growingio.a.a.c.C;
import com.growingio.a.a.o.a.bU;
import java.util.concurrent.Callable;

class D
implements Callable<V> {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ C c;

    D(C c2, Object object, Object object2) {
        this.c = c2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public V call() throws Exception {
        return (V)this.c.a.a(this.a, this.b).get();
    }
}

