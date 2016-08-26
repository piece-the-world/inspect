/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.fh;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.Z;
import com.growingio.a.a.n.aa;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

class J
extends Z {
    final /* synthetic */ fh a;
    final /* synthetic */ F b;

    J(F f2, fh fh2) {
        this.b = f2;
        this.a = fh2;
    }

    @Override
    void a(TypeVariable<?> typeVariable) {
        this.a(typeVariable.getBounds());
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a(wildcardType.getUpperBounds());
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        this.a.c((Class)parameterizedType.getRawType());
    }

    @Override
    void a(Class<?> class_) {
        this.a.c(class_);
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        this.a.c(aa.a(F.a(genericArrayType.getGenericComponentType()).b()));
    }
}

