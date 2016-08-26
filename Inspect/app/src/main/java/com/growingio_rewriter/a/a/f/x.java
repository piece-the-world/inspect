/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aL;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

final class x {
    private final String a;
    private final List<Class<?>> b;

    x(Method method) {
        this.a = method.getName();
        this.b = Arrays.asList(method.getParameterTypes());
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b});
    }

    public boolean equals(Object object) {
        if (object instanceof x) {
            x x2 = (x)object;
            return this.a.equals(x2.a) && this.b.equals(x2.b);
        }
        return false;
    }
}

