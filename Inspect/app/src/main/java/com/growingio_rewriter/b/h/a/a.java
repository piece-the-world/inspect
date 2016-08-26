/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.a.p;
import com.growingio.b.b;
import com.growingio.b.h.a.r;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;

public class a {
    private static Method g;
    private static Method h;
    public static final Class[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final int[] f;

    public static final int a(Class class_) {
        Class[] arrclass = a;
        int n2 = arrclass.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrclass[i2] != class_) continue;
            return i2;
        }
        throw new RuntimeException("bad type:" + class_.getName());
    }

    public static Class a(p p2, ClassLoader classLoader) throws b {
        return a.a(p2, classLoader, null);
    }

    public static Class a(p p2, ClassLoader classLoader, ProtectionDomain protectionDomain) throws b {
        try {
            Method method;
            Object[] arrobject;
            byte[] arrby = a.a(p2);
            if (protectionDomain == null) {
                method = g;
                arrobject = new Object[]{p2.i(), arrby, new Integer(0), new Integer(arrby.length)};
            } else {
                method = h;
                arrobject = new Object[]{p2.i(), arrby, new Integer(0), new Integer(arrby.length), protectionDomain};
            }
            return a.a(method, classLoader, arrobject);
        }
        catch (RuntimeException var3_4) {
            throw var3_4;
        }
        catch (InvocationTargetException var3_5) {
            throw new b(var3_5.getTargetException());
        }
        catch (Exception var3_6) {
            throw new b(var3_6);
        }
    }

    private static synchronized Class a(Method method, ClassLoader classLoader, Object[] arrobject) throws Exception {
        r.a(method, true);
        Class class_ = (Class)method.invoke(classLoader, arrobject);
        r.a(method, false);
        return class_;
    }

    private static byte[] a(p p2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            p2.a(dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void a(p p2, String string) throws b {
        try {
            a.b(p2, string);
        }
        catch (IOException var2_2) {
            throw new b(var2_2);
        }
    }

    private static void b(p p2, String string) throws b, IOException {
        Object object;
        String string2 = p2.i();
        String string3 = string + File.separatorChar + string2.replace('.', File.separatorChar) + ".class";
        int n2 = string3.lastIndexOf(File.separatorChar);
        if (n2 > 0 && !(object = string3.substring(0, n2)).equals(".")) {
            new File((String)object).mkdirs();
        }
        object = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(string3)));
        try {
            p2.a((DataOutputStream)object);
        }
        catch (IOException var6_6) {
            throw var6_6;
        }
        finally {
            object.close();
        }
    }

    static {
        try {
            Class class_ = Class.forName("java.lang.ClassLoader");
            g = r.a(class_, "defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE});
            h = r.a(class_, "defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class});
        }
        catch (Exception var0_1) {
            throw new RuntimeException("cannot initialize");
        }
        a = new Class[]{Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
        b = new String[]{"java.lang.Boolean", "java.lang.Byte", "java.lang.Character", "java.lang.Short", "java.lang.Integer", "java.lang.Long", "java.lang.Float", "java.lang.Double", "java.lang.Void"};
        c = new String[]{"(Z)V", "(B)V", "(C)V", "(S)V", "(I)V", "(J)V", "(F)V", "(D)V"};
        d = new String[]{"booleanValue", "byteValue", "charValue", "shortValue", "intValue", "longValue", "floatValue", "doubleValue"};
        e = new String[]{"()Z", "()B", "()C", "()S", "()I", "()J", "()F", "()D"};
        f = new int[]{1, 1, 1, 1, 1, 2, 1, 2};
    }
}

