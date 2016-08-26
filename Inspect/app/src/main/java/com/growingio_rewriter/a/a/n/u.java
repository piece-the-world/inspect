/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class u {
    public static String a(Class<?> class_) {
        return u.a(class_.getName());
    }

    public static String a(String string) {
        int n2 = string.lastIndexOf(46);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    public static /* varargs */ void a(Class<?> ... arrclass) {
        for (Class class_ : arrclass) {
            try {
                Class.forName(class_.getName(), true, class_.getClassLoader());
                continue;
            }
            catch (ClassNotFoundException var5_5) {
                throw new AssertionError(var5_5);
            }
        }
    }

    public static <T> T a(Class<T> class_, InvocationHandler invocationHandler) {
        aU.a(invocationHandler);
        aU.a(class_.isInterface(), "%s is not an interface", class_);
        Object object = Proxy.newProxyInstance(class_.getClassLoader(), new Class[]{class_}, invocationHandler);
        return class_.cast(object);
    }

    private u() {
    }
}

