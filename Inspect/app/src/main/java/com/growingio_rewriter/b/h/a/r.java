/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.s;
import com.growingio.b.h.a.t;
import com.growingio.b.h.a.u;
import com.growingio.b.h.a.v;
import com.growingio.b.h.a.w;
import com.growingio.b.h.a.x;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;

class r {
    r() {
    }

    static Method[] a(Class class_) {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredMethods();
        }
        return (Method[])AccessController.doPrivileged(new s(class_));
    }

    static Constructor[] b(Class class_) {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredConstructors();
        }
        return (Constructor[])AccessController.doPrivileged(new t(class_));
    }

    static Method a(Class class_, String string, Class[] arrclass) throws NoSuchMethodException {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredMethod(string, arrclass);
        }
        try {
            return (Method)AccessController.doPrivileged(new u(class_, string, arrclass));
        }
        catch (PrivilegedActionException var3_3) {
            if (var3_3.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)var3_3.getCause();
            }
            throw new RuntimeException(var3_3.getCause());
        }
    }

    static Constructor a(Class class_, Class[] arrclass) throws NoSuchMethodException {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredConstructor(arrclass);
        }
        try {
            return (Constructor)AccessController.doPrivileged(new v(class_, arrclass));
        }
        catch (PrivilegedActionException var2_2) {
            if (var2_2.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)var2_2.getCause();
            }
            throw new RuntimeException(var2_2.getCause());
        }
    }

    static void a(AccessibleObject accessibleObject, boolean bl2) {
        if (System.getSecurityManager() == null) {
            accessibleObject.setAccessible(bl2);
        } else {
            AccessController.doPrivileged(new w(accessibleObject, bl2));
        }
    }

    static void a(Field field, Object object, Object object2) throws IllegalAccessException {
        if (System.getSecurityManager() == null) {
            field.set(object, object2);
        } else {
            try {
                AccessController.doPrivileged(new x(field, object, object2));
            }
            catch (PrivilegedActionException var3_3) {
                if (var3_3.getCause() instanceof NoSuchMethodException) {
                    throw (IllegalAccessException)var3_3.getCause();
                }
                throw new RuntimeException(var3_3.getCause());
            }
        }
    }
}

