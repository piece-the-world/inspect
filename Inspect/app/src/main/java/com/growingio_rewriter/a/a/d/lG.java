/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.lF;
import java.lang.reflect.Field;

final class lG<T> {
    private final Field a;

    private lG(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    void a(T t2, Object object) {
        try {
            this.a.set(t2, object);
        }
        catch (IllegalAccessException var3_3) {
            throw new AssertionError(var3_3);
        }
    }

    void a(T t2, int n2) {
        try {
            this.a.set(t2, n2);
        }
        catch (IllegalAccessException var3_3) {
            throw new AssertionError(var3_3);
        }
    }

    /* synthetic */ lG(Field field, lF lF2) {
        this(field);
    }
}

