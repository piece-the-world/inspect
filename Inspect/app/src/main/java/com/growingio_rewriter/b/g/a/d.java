/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import com.growingio.b.g.a.a;
import com.growingio.b.g.a.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class d
implements Serializable {
    static final String a = "_m_";
    static final int b = 3;
    private Class d;
    private Constructor[] e;
    private Method[] f;
    public static boolean c = false;

    public d(String[] arrstring) {
        try {
            this.d = this.b(arrstring[0]);
        }
        catch (ClassNotFoundException var2_2) {
            throw new RuntimeException("not found: " + arrstring[0] + ", useContextClassLoader: " + Boolean.toString(c), var2_2);
        }
        this.e = this.d.getConstructors();
        this.f = null;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.d.getName());
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.d = this.b(objectInputStream.readUTF());
        this.e = this.d.getConstructors();
        this.f = null;
    }

    private Class b(String string) throws ClassNotFoundException {
        if (c) {
            return Thread.currentThread().getContextClassLoader().loadClass(string);
        }
        return Class.forName(string);
    }

    public final Class a() {
        return this.d;
    }

    public final String b() {
        return this.d.getName();
    }

    public final boolean a(Object object) {
        return this.d.isInstance(object);
    }

    public final Object a(Object[] arrobject) throws a {
        int n2 = this.e.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                return this.e[i2].newInstance(arrobject);
            }
            catch (IllegalArgumentException var4_4) {
                continue;
            }
            catch (InstantiationException var4_5) {
                throw new a(var4_5);
            }
            catch (IllegalAccessException var4_6) {
                throw new a(var4_6);
            }
            catch (InvocationTargetException var4_7) {
                throw new a(var4_7);
            }
        }
        throw new a("no constructor matches");
    }

    public Object a(String string) {
        Class class_ = this.a();
        try {
            return class_.getField(string).get(null);
        }
        catch (NoSuchFieldException var3_3) {
            throw new RuntimeException(var3_3.toString());
        }
        catch (IllegalAccessException var3_4) {
            throw new RuntimeException(var3_4.toString());
        }
    }

    public void a(String string, Object object) {
        Class class_ = this.a();
        try {
            class_.getField(string).set(null, object);
        }
        catch (NoSuchFieldException var4_4) {
            throw new RuntimeException(var4_4.toString());
        }
        catch (IllegalAccessException var4_5) {
            throw new RuntimeException(var4_5.toString());
        }
    }

    public static Object a(Object object, int n2, Object[] arrobject) throws Throwable {
        Method[] arrmethod = object.getClass().getMethods();
        int n3 = arrmethod.length;
        String string = "_m_" + n2;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (!arrmethod[i2].getName().startsWith(string)) continue;
            try {
                return arrmethod[i2].invoke(object, arrobject);
            }
            catch (InvocationTargetException var7_7) {
                throw var7_7.getTargetException();
            }
            catch (IllegalAccessException var7_8) {
                throw new b(var7_8);
            }
        }
        throw new b("cannot find a method");
    }

    public Object a(int n2, Object[] arrobject) throws Throwable {
        try {
            Method[] arrmethod = this.c();
            return arrmethod[n2].invoke(null, arrobject);
        }
        catch (InvocationTargetException var3_4) {
            throw var3_4.getTargetException();
        }
        catch (IllegalAccessException var3_5) {
            throw new b(var3_5);
        }
    }

    public final Method[] c() {
        int n2;
        if (this.f != null) {
            return this.f;
        }
        Class class_ = this.a();
        Method[] arrmethod = class_.getDeclaredMethods();
        int n3 = arrmethod.length;
        int[] arrn = new int[n3];
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            char c2;
            Method method = arrmethod[n2];
            String string = method.getName();
            if (!string.startsWith("_m_")) continue;
            int n5 = 0;
            int n6 = 3;
            while ('0' <= (c2 = string.charAt(n6)) && c2 <= '9') {
                n5 = n5 * 10 + c2 - 48;
                ++n6;
            }
            arrn[n2] = ++n5;
            if (n5 <= n4) continue;
            n4 = n5;
        }
        this.f = new Method[n4];
        for (n2 = 0; n2 < n3; ++n2) {
            if (arrn[n2] <= 0) continue;
            this.f[arrn[n2] - 1] = arrmethod[n2];
        }
        return this.f;
    }

    public final Method a(int n2) {
        return this.c()[n2];
    }

    public final String b(int n2) {
        char c2;
        String string = this.c()[n2].getName();
        int n3 = 3;
        while ((c2 = string.charAt(n3++)) >= '0' && '9' >= c2) {
        }
        return string.substring(n3);
    }

    public final Class[] c(int n2) {
        return this.c()[n2].getParameterTypes();
    }

    public final Class d(int n2) {
        return this.c()[n2].getReturnType();
    }

    public final int a(String string, Class[] arrclass) throws NoSuchMethodException {
        Method[] arrmethod = this.c();
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            if (arrmethod[i2] == null || !this.b(i2).equals(string) || !Arrays.equals(arrclass, arrmethod[i2].getParameterTypes())) continue;
            return i2;
        }
        throw new NoSuchMethodException("Method " + string + " not found");
    }
}

