/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.f.a;
import com.growingio.a.a.f.m;
import com.growingio.a.a.f.q;
import com.growingio.a.a.f.r;
import com.growingio.a.a.f.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

class p {
    private m b;
    final Object a;
    private final Method c;
    private final Executor d;

    static p a(m m2, Object object, Method method) {
        return p.a(method) ? new p(m2, object, method) : new r(m2, object, method, null);
    }

    private p(m m2, Object object, Method method) {
        this.b = m2;
        this.a = aU.a(object);
        this.c = method;
        method.setAccessible(true);
        this.d = m2.b();
    }

    final void a(Object object) {
        this.d.execute(new q(this, object));
    }

    void b(Object object) throws InvocationTargetException {
        try {
            this.c.invoke(this.a, aU.a(object));
        }
        catch (IllegalArgumentException var2_2) {
            throw new Error("Method rejected target/argument: " + object, var2_2);
        }
        catch (IllegalAccessException var2_3) {
            throw new Error("Method became inaccessible: " + object, var2_3);
        }
        catch (InvocationTargetException var2_4) {
            if (var2_4.getCause() instanceof Error) {
                throw (Error)var2_4.getCause();
            }
            throw var2_4;
        }
    }

    private s c(Object object) {
        return new s(this.b, object, this.a, this.c);
    }

    public final int hashCode() {
        return (31 + this.c.hashCode()) * 31 + System.identityHashCode(this.a);
    }

    public final boolean equals(Object object) {
        if (object instanceof p) {
            p p2 = (p)object;
            return this.a == p2.a && this.c.equals(p2.c);
        }
        return false;
    }

    private static boolean a(Method method) {
        return method.getAnnotation(a.class) != null;
    }

    static /* synthetic */ s a(p p2, Object object) {
        return p2.c(object);
    }

    static /* synthetic */ m a(p p2) {
        return p2.b;
    }

    /* synthetic */ p(m m2, Object object, Method method, q q2) {
        this(m2, object, method);
    }
}

