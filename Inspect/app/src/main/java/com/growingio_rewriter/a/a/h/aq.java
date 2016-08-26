/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class aq
implements PrivilegedExceptionAction<Unsafe> {
    aq() {
    }

    public Unsafe a() throws Exception {
        reference var1_1 = Unsafe.class;
        for (Field field : var1_1.getDeclaredFields()) {
            field.setAccessible(true);
            Object object = field.get(null);
            if (!var1_1.isInstance(object)) continue;
            return (Unsafe)var1_1.cast(object);
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override
    public /* synthetic */ Object run() throws Exception {
        return this.a();
    }
}

