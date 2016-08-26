/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.b.o;
import com.growingio.e.b.b.p;
import java.io.PrintStream;

public final class n {
    private static p a;
    private static boolean b;

    private n() {
    }

    public static String a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("null input");
        }
        String string2 = null;
        try {
            string2 = System.getProperty(string);
        }
        catch (SecurityException var2_2) {
            // empty catch block
        }
        return string2;
    }

    public static boolean b(String string) {
        String string2 = n.a(string);
        if (string2 == null) {
            return false;
        }
        return string2.equalsIgnoreCase("true");
    }

    private static p b() {
        if (a != null) {
            return a;
        }
        if (b) {
            return null;
        }
        a = n.c();
        b = true;
        return a;
    }

    private static p c() {
        try {
            return new p(null);
        }
        catch (SecurityException var0) {
            return null;
        }
    }

    public static Class<?> a() {
        int n2;
        p p2 = n.b();
        if (p2 == null) {
            return null;
        }
        Class<?>[] arrclass = p2.getClassContext();
        String string = n.class.getName();
        for (n2 = 0; n2 < arrclass.length && !string.equals(arrclass[n2].getName()); ++n2) {
        }
        if (n2 >= arrclass.length || n2 + 2 >= arrclass.length) {
            throw new IllegalStateException("Failed to find Util or its caller in the stack; this should not happen");
        }
        return arrclass[n2 + 2];
    }

    public static final void a(String string, Throwable throwable) {
        System.err.println(string);
        System.err.println("Reported exception:");
        throwable.printStackTrace();
    }

    public static final void c(String string) {
        System.err.println("SLF4J: " + string);
    }

    static {
        b = false;
    }
}

