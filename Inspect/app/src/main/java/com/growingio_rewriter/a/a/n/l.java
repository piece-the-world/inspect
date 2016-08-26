/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.h;
import com.growingio.a.a.n.m;
import com.growingio.a.a.n.n;
import com.growingio.a.a.n.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public abstract class l<T, R>
extends h
implements GenericDeclaration {
    <M extends AccessibleObject> l(M m2) {
        super(m2);
    }

    public static l<?, Object> a(Method method) {
        return new n(method);
    }

    public static <T> l<T, T> a(Constructor<T> constructor) {
        return new m(constructor);
    }

    public abstract boolean m();

    public abstract boolean n();

    public final /* varargs */ R a(T t2, Object ... arrobject) throws InvocationTargetException, IllegalAccessException {
        return (R)this.b(t2, aU.a(arrobject));
    }

    public final F<? extends R> o() {
        return F.a(this.u());
    }

    public final ea<t> p() {
        Type[] arrtype = this.r();
        Annotation[][] arrannotation = this.t();
        ec<t> ec2 = ea.g();
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            ec2.c(new t(this, i2, F.a(arrtype[i2]), arrannotation[i2]));
        }
        return ec2.b();
    }

    public final ea<F<? extends Throwable>> q() {
        ec<F<?>> ec2 = ea.g();
        for (Type type : this.s()) {
            F<?> f2 = F.a(type);
            ec2.c(f2);
        }
        return ec2.b();
    }

    public final <R1 extends R> l<T, R1> a(Class<R1> class_) {
        return this.a(F.a(class_));
    }

    public final <R1 extends R> l<T, R1> a(F<R1> f2) {
        if (!f2.a(this.o())) {
            throw new IllegalArgumentException("Invokable is known to return " + this.o() + ", not " + f2);
        }
        l l2 = this;
        return l2;
    }

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }

    public F<T> a() {
        return F.a(this.getDeclaringClass());
    }

    abstract Object b(Object var1, Object[] var2) throws InvocationTargetException, IllegalAccessException;

    abstract Type[] r();

    abstract Type[] s();

    abstract Annotation[][] t();

    abstract Type u();
}

