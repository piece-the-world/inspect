/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.as;
import com.growingio.b.a.b;
import com.growingio.b.a.b.a;
import com.growingio.b.a.h;
import com.growingio.b.a.p;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class c
implements InvocationHandler {
    private static final String a = "java.lang.annotation.Annotation";
    private static Method b = null;
    private a c;
    private g d;
    private ClassLoader e;
    private transient Class f;
    private transient int g = Integer.MIN_VALUE;

    public static Object a(ClassLoader classLoader, Class class_, g g2, a a2) {
        c c2 = new c(a2, g2, classLoader);
        return Proxy.newProxyInstance(classLoader, new Class[]{class_}, c2);
    }

    private c(a a2, g g2, ClassLoader classLoader) {
        this.c = a2;
        this.d = g2;
        this.e = classLoader;
    }

    public String a() {
        return this.c.a();
    }

    private Class c() {
        if (this.f == null) {
            String string = this.c.a();
            try {
                this.f = this.e.loadClass(string);
            }
            catch (ClassNotFoundException var2_2) {
                NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError("Error loading annotation class: " + string);
                noClassDefFoundError.setStackTrace(var2_2.getStackTrace());
                throw noClassDefFoundError;
            }
        }
        return this.f;
    }

    public a b() {
        return this.c;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        com.growingio.b.a.b.p p2;
        String string = method.getName();
        if (Object.class == method.getDeclaringClass()) {
            if ("equals".equals(string)) {
                Object object2 = arrobject[0];
                return new Boolean(this.a(object2));
            }
            if ("toString".equals(string)) {
                return this.c.toString();
            }
            if ("hashCode".equals(string)) {
                return new Integer(this.hashCode());
            }
        } else if ("annotationType".equals(string) && method.getParameterTypes().length == 0) {
            return this.c();
        }
        if ((p2 = this.c.a(string)) == null) {
            return this.a(string, method);
        }
        return p2.a(this.e, this.d, method);
    }

    private Object a(String string, Method method) throws ClassNotFoundException, RuntimeException {
        String string2 = this.c.a();
        if (this.d != null) {
            try {
                b b2;
                o o2 = this.d.f(string2);
                p p2 = o2.j();
                as as2 = p2.d(string);
                if (as2 != null && (b2 = (b)as2.c("AnnotationDefault")) != null) {
                    com.growingio.b.a.b.p p3 = b2.a();
                    return p3.a(this.e, this.d, method);
                }
            }
            catch (ae var4_5) {
                throw new RuntimeException("cannot find a class file: " + string2);
            }
        }
        throw new RuntimeException("no default value: " + string2 + "." + string + "()");
    }

    public int hashCode() {
        if (this.g == Integer.MIN_VALUE) {
            int n2 = 0;
            this.c();
            Method[] arrmethod = this.f.getDeclaredMethods();
            for (int i2 = 0; i2 < arrmethod.length; ++i2) {
                String string = arrmethod[i2].getName();
                int n3 = 0;
                com.growingio.b.a.b.p p2 = this.c.a(string);
                Object object = null;
                try {
                    if (p2 != null) {
                        object = p2.a(this.e, this.d, arrmethod[i2]);
                    }
                    if (object == null) {
                        object = this.a(string, arrmethod[i2]);
                    }
                }
                catch (RuntimeException var8_8) {
                    throw var8_8;
                }
                catch (Exception var8_9) {
                    throw new RuntimeException("Error retrieving value " + string + " for annotation " + this.c.a(), var8_9);
                }
                if (object != null) {
                    n3 = object.getClass().isArray() ? c.b(object) : object.hashCode();
                }
                n2 += 127 * string.hashCode() ^ n3;
            }
            this.g = n2;
        }
        return this.g;
    }

    private boolean a(Object object) throws Exception {
        Object object2;
        if (object == null) {
            return false;
        }
        if (object instanceof Proxy && (object2 = Proxy.getInvocationHandler(object)) instanceof c) {
            c c2 = (c)object2;
            return this.c.equals(c2.c);
        }
        object2 = (Class)b.invoke(object, null);
        if (!this.c().equals(object2)) {
            return false;
        }
        Method[] arrmethod = this.f.getDeclaredMethods();
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            String string = arrmethod[i2].getName();
            com.growingio.b.a.b.p p2 = this.c.a(string);
            Object object3 = null;
            Object object4 = null;
            try {
                if (p2 != null) {
                    object3 = p2.a(this.e, this.d, arrmethod[i2]);
                }
                if (object3 == null) {
                    object3 = this.a(string, arrmethod[i2]);
                }
                object4 = arrmethod[i2].invoke(object, null);
            }
            catch (RuntimeException var9_10) {
                throw var9_10;
            }
            catch (Exception var9_11) {
                throw new RuntimeException("Error retrieving value " + string + " for annotation " + this.c.a(), var9_11);
            }
            if (object3 == null && object4 != null) {
                return false;
            }
            if (object3 == null || object3.equals(object4)) continue;
            return false;
        }
        return true;
    }

    private static int b(Object object) {
        if (object == null) {
            return 0;
        }
        int n2 = 1;
        Object[] arrobject = (Object[])object;
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            int n3 = 0;
            if (arrobject[i2] != null) {
                n3 = arrobject[i2].hashCode();
            }
            n2 = 31 * n2 + n3;
        }
        return n2;
    }

    static {
        try {
            Class class_ = Class.forName("java.lang.annotation.Annotation");
            b = class_.getMethod("annotationType", null);
        }
        catch (Exception var0_1) {
            // empty catch block
        }
    }
}

