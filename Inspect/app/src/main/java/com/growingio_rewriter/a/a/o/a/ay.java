/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.ap;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bZ;
import java.util.concurrent.Callable;

final class ay
implements ap<T> {
    final /* synthetic */ bZ a;
    final /* synthetic */ Callable b;

    ay(bZ bZ2, Callable callable) {
        this.a = bZ2;
        this.b = callable;
    }

    @Override
    public bU<T> a() throws Exception {
        return this.a.a(this.b);
    }
}

