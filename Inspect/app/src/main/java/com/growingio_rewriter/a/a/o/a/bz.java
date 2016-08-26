/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aq;
import java.lang.reflect.Constructor;
import java.util.Arrays;

final class bz
implements aq<Constructor<?>, Boolean> {
    bz() {
    }

    public Boolean a(Constructor<?> constructor) {
        return Arrays.asList(constructor.getParameterTypes()).contains(String.class);
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Constructor)object);
    }
}

