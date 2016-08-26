/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.G;
import com.growingio.a.a.n.P;
import java.util.Arrays;

final class R
extends P<Class<?>> {
    R() {
        super(null);
    }

    @Override
    Class<?> a(Class<?> class_) {
        return class_;
    }

    @Override
    Iterable<? extends Class<?>> b(Class<?> class_) {
        return Arrays.asList(class_.getInterfaces());
    }

    @Override
    Class<?> c(Class<?> class_) {
        return class_.getSuperclass();
    }

    @Override
    /* synthetic */ Object d(Object object) {
        return this.c((Class)object);
    }

    @Override
    /* synthetic */ Iterable c(Object object) {
        return this.b((Class)object);
    }

    @Override
    /* synthetic */ Class b(Object object) {
        return this.a((Class)object);
    }
}

