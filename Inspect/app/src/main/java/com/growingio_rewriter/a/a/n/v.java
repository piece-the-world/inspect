/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class v<T> {
    v() {
    }

    final Type a() {
        Type type = this.getClass().getGenericSuperclass();
        aU.a(type instanceof ParameterizedType, "%s isn't parameterized", (Object)type);
        return ((ParameterizedType)type).getActualTypeArguments()[0];
    }
}

