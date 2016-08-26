/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

class n<T>
extends l<T, Object> {
    final Method a;

    n(Method method) {
        super(method);
        this.a = method;
    }

    @Override
    final Object b(Object object, Object[] arrobject) throws InvocationTargetException, IllegalAccessException {
        return this.a.invoke(object, arrobject);
    }

    @Override
    Type u() {
        return this.a.getGenericReturnType();
    }

    @Override
    Type[] r() {
        return this.a.getGenericParameterTypes();
    }

    @Override
    Type[] s() {
        return this.a.getGenericExceptionTypes();
    }

    @Override
    final Annotation[][] t() {
        return this.a.getParameterAnnotations();
    }

    @Override
    public final TypeVariable<?>[] getTypeParameters() {
        return this.a.getTypeParameters();
    }

    @Override
    public final boolean m() {
        return !this.g() && !this.e() && !this.f() && !Modifier.isFinal(this.getDeclaringClass().getModifiers());
    }

    @Override
    public final boolean n() {
        return this.a.isVarArgs();
    }
}

