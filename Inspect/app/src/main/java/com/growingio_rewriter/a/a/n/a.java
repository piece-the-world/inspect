/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public abstract class a
implements InvocationHandler {
    private static final Object[] a = new Object[0];

    @Override
    public final Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        if (arrobject == null) {
            arrobject = a;
        }
        if (arrobject.length == 0 && method.getName().equals("hashCode")) {
            return this.hashCode();
        }
        if (arrobject.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
            Object object2 = arrobject[0];
            if (object2 == null) {
                return false;
            }
            if (object == object2) {
                return true;
            }
            return a.a(object2, object.getClass()) && this.equals(Proxy.getInvocationHandler(object2));
        }
        if (arrobject.length == 0 && method.getName().equals("toString")) {
            return this.toString();
        }
        return this.a(object, method, arrobject);
    }

    protected abstract Object a(Object var1, Method var2, Object[] var3) throws Throwable;

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    private static boolean a(Object object, Class<?> class_) {
        return class_.isInstance(object) || Proxy.isProxyClass(object.getClass()) && Arrays.equals(object.getClass().getInterfaces(), class_.getInterfaces());
    }
}

