/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.n.aq;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

final class ar
implements InvocationHandler {
    private static final ei<String, Method> a;
    private final aq<?> b;

    ar(aq<?> aq2) {
        this.b = aq2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        String string = method.getName();
        Method method2 = a.get(string);
        if (method2 == null) {
            throw new UnsupportedOperationException(string);
        }
        try {
            return method2.invoke(this.b, arrobject);
        }
        catch (InvocationTargetException var6_6) {
            throw var6_6.getCause();
        }
    }

    static /* synthetic */ aq a(ar ar2) {
        return ar2.b;
    }

    static {
        ek<String, Method> ek2 = ei.j();
        for (Method method : aq.class.getMethods()) {
            if (!method.getDeclaringClass().equals(aq.class)) continue;
            try {
                method.setAccessible(true);
            }
            catch (AccessControlException var5_5) {
                // empty catch block
            }
            ek2.b(method.getName(), method);
        }
        a = ek2.b();
    }
}

