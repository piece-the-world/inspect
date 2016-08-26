/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.aj;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

final class am
extends aj {
    am(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    Type a(Type type) {
        return b.a(type);
    }

    @Override
    Type b(Type type) {
        return b.b(type);
    }

    @Override
    String c(Type type) {
        try {
            Method method = Type.class.getMethod("getTypeName", new Class[0]);
            return (String)method.invoke(type, new Object[0]);
        }
        catch (NoSuchMethodException var2_3) {
            throw new AssertionError((Object)"Type.getTypeName should be available in Java 8");
        }
        catch (InvocationTargetException var2_4) {
            throw new RuntimeException(var2_4);
        }
        catch (IllegalAccessException var2_5) {
            throw new RuntimeException(var2_5);
        }
    }
}

