/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.F;
import com.growingio.a.a.n.Z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

class I
extends Z {
    final /* synthetic */ F a;

    I(F f2) {
        this.a = f2;
    }

    @Override
    void a(TypeVariable<?> typeVariable) {
        throw new IllegalArgumentException(F.d(this.a) + "contains a type variable and is not safe for the operation");
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a(wildcardType.getLowerBounds());
        this.a(wildcardType.getUpperBounds());
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        this.a(parameterizedType.getActualTypeArguments());
        this.a(parameterizedType.getOwnerType());
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        this.a(genericArrayType.getGenericComponentType());
    }
}

