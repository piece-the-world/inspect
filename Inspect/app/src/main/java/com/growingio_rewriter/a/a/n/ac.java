/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.Z;
import com.growingio.a.a.n.aa;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

final class ac
extends Z {
    final /* synthetic */ AtomicReference a;

    ac(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override
    void a(TypeVariable<?> typeVariable) {
        this.a.set(aa.a(typeVariable.getBounds()));
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a.set(aa.a(wildcardType.getUpperBounds()));
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        this.a.set(genericArrayType.getGenericComponentType());
    }

    @Override
    void a(Class<?> class_) {
        this.a.set(class_.getComponentType());
    }
}

