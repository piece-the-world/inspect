/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.n.F;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

class h
extends AccessibleObject
implements Member {
    private final AccessibleObject a;
    private final Member b;

    <M extends AccessibleObject> h(M m2) {
        aU.a(m2);
        this.a = m2;
        this.b = (Member)m2;
    }

    public F<?> a() {
        return F.a(this.getDeclaringClass());
    }

    @Override
    public final boolean isAnnotationPresent(Class<? extends Annotation> class_) {
        return this.a.isAnnotationPresent(class_);
    }

    public final <A extends Annotation> A getAnnotation(Class<A> class_) {
        return this.a.getAnnotation(class_);
    }

    @Override
    public final Annotation[] getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override
    public final Annotation[] getDeclaredAnnotations() {
        return this.a.getDeclaredAnnotations();
    }

    @Override
    public final void setAccessible(boolean bl2) throws SecurityException {
        this.a.setAccessible(bl2);
    }

    @Override
    public final boolean isAccessible() {
        return this.a.isAccessible();
    }

    @Override
    public Class<?> getDeclaringClass() {
        return this.b.getDeclaringClass();
    }

    @Override
    public final String getName() {
        return this.b.getName();
    }

    @Override
    public final int getModifiers() {
        return this.b.getModifiers();
    }

    @Override
    public final boolean isSynthetic() {
        return this.b.isSynthetic();
    }

    public final boolean b() {
        return Modifier.isPublic(this.getModifiers());
    }

    public final boolean c() {
        return Modifier.isProtected(this.getModifiers());
    }

    public final boolean d() {
        return !this.e() && !this.b() && !this.c();
    }

    public final boolean e() {
        return Modifier.isPrivate(this.getModifiers());
    }

    public final boolean f() {
        return Modifier.isStatic(this.getModifiers());
    }

    public final boolean g() {
        return Modifier.isFinal(this.getModifiers());
    }

    public final boolean h() {
        return Modifier.isAbstract(this.getModifiers());
    }

    public final boolean i() {
        return Modifier.isNative(this.getModifiers());
    }

    public final boolean j() {
        return Modifier.isSynchronized(this.getModifiers());
    }

    final boolean k() {
        return Modifier.isVolatile(this.getModifiers());
    }

    final boolean l() {
        return Modifier.isTransient(this.getModifiers());
    }

    public boolean equals(Object object) {
        if (object instanceof h) {
            h h2 = (h)object;
            return this.a().equals(h2.a()) && this.b.equals(h2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString();
    }
}

