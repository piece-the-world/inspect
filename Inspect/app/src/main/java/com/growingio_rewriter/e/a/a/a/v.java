/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class v {
    private static final boolean a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Object i;
    private static Object j;

    v() {
    }

    public static boolean a(File file) {
        try {
            Object object = d.invoke(file, new Object[0]);
            Boolean bl2 = (Boolean)b.invoke(null, object);
            return bl2;
        }
        catch (IllegalAccessException var1_2) {
            throw new RuntimeException(var1_2);
        }
        catch (InvocationTargetException var1_3) {
            throw new RuntimeException(var1_3);
        }
    }

    public static File b(File file) throws IOException {
        try {
            Object object = d.invoke(file, new Object[0]);
            Object object2 = g.invoke(null, object);
            return (File)f.invoke(object2, new Object[0]);
        }
        catch (IllegalAccessException var1_2) {
            throw new RuntimeException(var1_2);
        }
        catch (InvocationTargetException var1_3) {
            throw new RuntimeException(var1_3);
        }
    }

    private static boolean d(File file) throws IOException {
        try {
            Object object = d.invoke(file, new Object[0]);
            Boolean bl2 = (Boolean)e.invoke(null, object, i);
            return bl2;
        }
        catch (IllegalAccessException var1_2) {
            throw new RuntimeException(var1_2);
        }
        catch (InvocationTargetException var1_3) {
            throw (RuntimeException)var1_3.getTargetException();
        }
    }

    public static File a(File file, File file2) throws IOException {
        try {
            if (!v.d(file)) {
                Object object = d.invoke(file, new Object[0]);
                Object object2 = h.invoke(null, object, d.invoke(file2, new Object[0]), j);
                return (File)f.invoke(object2, new Object[0]);
            }
            return file;
        }
        catch (IllegalAccessException var2_3) {
            throw new RuntimeException(var2_3);
        }
        catch (InvocationTargetException var2_4) {
            Throwable throwable = var2_4.getTargetException();
            throw (IOException)throwable;
        }
    }

    public static void c(File file) throws IOException {
        try {
            Object object = d.invoke(file, new Object[0]);
            c.invoke(null, object);
        }
        catch (IllegalAccessException var1_2) {
            throw new RuntimeException(var1_2);
        }
        catch (InvocationTargetException var1_3) {
            throw (IOException)var1_3.getTargetException();
        }
    }

    public static boolean a() {
        return a;
    }

    static {
        boolean bl2 = true;
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Class class_ = classLoader.loadClass("java.nio.file.Files");
            Class class_2 = classLoader.loadClass("java.nio.file.Path");
            Class class_3 = classLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class class_4 = classLoader.loadClass("java.nio.file.LinkOption");
            b = class_.getMethod("isSymbolicLink", class_2);
            c = class_.getMethod("delete", class_2);
            g = class_.getMethod("readSymbolicLink", class_2);
            j = Array.newInstance(class_3, 0);
            h = class_.getMethod("createSymbolicLink", class_2, class_2, j.getClass());
            i = Array.newInstance(class_4, 0);
            e = class_.getMethod("exists", class_2, i.getClass());
            d = File.class.getMethod("toPath", new Class[0]);
            f = class_2.getMethod("toFile", new Class[0]);
        }
        catch (ClassNotFoundException var1_2) {
            bl2 = false;
        }
        catch (NoSuchMethodException var1_3) {
            bl2 = false;
        }
        a = bl2;
    }
}

