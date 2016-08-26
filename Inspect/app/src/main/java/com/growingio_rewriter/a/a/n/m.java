/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

class m<T>
extends l<T, T> {
    final Constructor<?> a;

    m(Constructor<?> constructor) {
        super(constructor);
        this.a = constructor;
    }

    @Override
    final Object b(Object object, Object[] arrobject) throws InvocationTargetException, IllegalAccessException {
        try {
            return this.a.newInstance(arrobject);
        }
        catch (InstantiationException var3_3) {
            throw new RuntimeException(this.a + " failed.", var3_3);
        }
    }

    @Override
    Type u() {
        Class class_ = this.getDeclaringClass();
        Type[] arrtype = class_.getTypeParameters();
        if (arrtype.length > 0) {
            return aa.a(class_, arrtype);
        }
        return class_;
    }

    @Override
    Type[] r() {
        Class<?>[] arrclass;
        Type[] arrtype = this.a.getGenericParameterTypes();
        if (arrtype.length > 0 && this.v() && arrtype.length == (arrclass = this.a.getParameterTypes()).length && arrclass[0] == this.getDeclaringClass().getEnclosingClass()) {
            return Arrays.copyOfRange(arrtype, 1, arrtype.length);
        }
        return arrtype;
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
        TypeVariable<Class<T>>[] arrtypeVariable = this.getDeclaringClass().getTypeParameters();
        TypeVariable<Constructor<?>>[] arrtypeVariable2 = this.a.getTypeParameters();
        TypeVariable[] arrtypeVariable3 = new TypeVariable[arrtypeVariable.length + arrtypeVariable2.length];
        System.arraycopy(arrtypeVariable, 0, arrtypeVariable3, 0, arrtypeVariable.length);
        System.arraycopy(arrtypeVariable2, 0, arrtypeVariable3, arrtypeVariable.length, arrtypeVariable2.length);
        return arrtypeVariable3;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n() {
        return this.a.isVarArgs();
    }

    private boolean v() {
        Class class_ = this.a.getDeclaringClass();
        if (class_.getEnclosingConstructor() != null) {
            return true;
        }
        Method method = class_.getEnclosingMethod();
        if (method != null) {
            return !Modifier.isStatic(method.getModifiers());
        }
        return class_.getEnclosingClass() != null && !Modifier.isStatic(class_.getModifiers());
    }
}

