/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.dw;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class be
implements dw {
    @Override
    public <T> T a(T t2, Class<T> class_, long l2, TimeUnit timeUnit) {
        aU.a(t2);
        aU.a(class_);
        aU.a(timeUnit);
        return t2;
    }

    @Override
    public <T> T a(Callable<T> callable, long l2, TimeUnit timeUnit, boolean bl2) throws Exception {
        aU.a(timeUnit);
        return callable.call();
    }
}

