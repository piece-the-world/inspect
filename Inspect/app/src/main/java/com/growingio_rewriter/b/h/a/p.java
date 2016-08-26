/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.c;
import com.growingio.b.h.a.d;
import com.growingio.b.h.a.e;
import com.growingio.b.h.a.m;
import com.growingio.b.h.a.q;
import com.growingio.b.h.a.r;
import com.growingio.b.h.a.y;
import java.io.InvalidClassException;
import java.lang.reflect.Method;

public class p {
    public static c a = new q();

    public static void a(Class class_, String string, String string2, int n2, String string3, Method[] arrmethod) {
        arrmethod[n2 + 1] = string2 == null ? null : p.a(class_, string2, string3);
        arrmethod[n2] = p.b(class_, string, string3);
    }

    public static void a(Object object, String string, String string2, int n2, String string3, Method[] arrmethod) {
        arrmethod[n2 + 1] = string2 == null ? null : p.a(object, string2, string3);
        arrmethod[n2] = p.b(object, string, string3);
    }

    public static Method a(Object object, String string, String string2) {
        Method method = p.f(object.getClass(), string, string2);
        if (method == null) {
            p.c(object.getClass(), string, string2);
        }
        return method;
    }

    public static Method a(Class class_, String string, String string2) {
        Method method = p.f(class_, string, string2);
        if (method == null) {
            p.c(class_, string, string2);
        }
        return method;
    }

    public static Method b(Object object, String string, String string2) {
        Class class_ = object.getClass();
        return p.b(class_, string, string2);
    }

    public static Method b(Class class_, String string, String string2) {
        Method method = p.d(class_.getSuperclass(), string, string2);
        if (method == null) {
            method = p.e(class_, string, string2);
        }
        if (method == null) {
            p.c(class_, string, string2);
        }
        return method;
    }

    private static void c(Class class_, String string, String string2) {
        throw new RuntimeException("not found " + string + ":" + string2 + " in " + class_.getName());
    }

    private static Method d(Class class_, String string, String string2) {
        Method method = p.f(class_, string, string2);
        if (method != null) {
            return method;
        }
        Class class_2 = class_.getSuperclass();
        if (class_2 != null && (method = p.d(class_2, string, string2)) != null) {
            return method;
        }
        return p.e(class_, string, string2);
    }

    private static Method e(Class class_, String string, String string2) {
        Method method = null;
        Class<?>[] arrclass = class_.getInterfaces();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            method = p.d(arrclass[i2], string, string2);
            if (method == null) continue;
            return method;
        }
        return method;
    }

    private static Method f(Class class_, String string, String string2) {
        Method[] arrmethod = r.a(class_);
        int n2 = arrmethod.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!arrmethod[i2].getName().equals(string) || !p.a(arrmethod[i2]).equals(string2)) continue;
            return arrmethod[i2];
        }
        return null;
    }

    public static String a(Method method) {
        Class[] arrclass = method.getParameterTypes();
        return p.a(arrclass, method.getReturnType());
    }

    public static String a(Class[] arrclass, Class class_) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            p.a(stringBuffer, arrclass[i2]);
        }
        stringBuffer.append(')');
        if (class_ != null) {
            p.a(stringBuffer, class_);
        }
        return stringBuffer.toString();
    }

    public static String a(String string, Class class_) {
        StringBuffer stringBuffer = new StringBuffer(string);
        p.a(stringBuffer, class_);
        return stringBuffer.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(StringBuffer stringBuffer, Class class_) {
        if (class_.isArray()) {
            stringBuffer.append('[');
            p.a(stringBuffer, class_.getComponentType());
            return;
        } else if (class_.isPrimitive()) {
            if (class_ == Void.TYPE) {
                stringBuffer.append('V');
                return;
            } else if (class_ == Integer.TYPE) {
                stringBuffer.append('I');
                return;
            } else if (class_ == Byte.TYPE) {
                stringBuffer.append('B');
                return;
            } else if (class_ == Long.TYPE) {
                stringBuffer.append('J');
                return;
            } else if (class_ == Double.TYPE) {
                stringBuffer.append('D');
                return;
            } else if (class_ == Float.TYPE) {
                stringBuffer.append('F');
                return;
            } else if (class_ == Character.TYPE) {
                stringBuffer.append('C');
                return;
            } else if (class_ == Short.TYPE) {
                stringBuffer.append('S');
                return;
            } else {
                if (class_ != Boolean.TYPE) throw new RuntimeException("bad type: " + class_.getName());
                stringBuffer.append('Z');
            }
            return;
        } else {
            stringBuffer.append('L').append(class_.getName().replace('.', '/')).append(';');
        }
    }

    public static y a(Object object) throws InvalidClassException {
        Class class_ = object.getClass();
        c c2 = null;
        if (object instanceof m) {
            c2 = ((m)object).a();
        } else if (object instanceof d) {
            c2 = e.a((d)object);
        }
        return new y(class_, e.c(class_), c2);
    }
}

