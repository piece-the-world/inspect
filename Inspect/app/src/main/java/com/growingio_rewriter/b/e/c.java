/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.e;

public class c {
    public static boolean a = false;

    private static Class d(String string) throws ClassNotFoundException {
        if (a) {
            return Class.forName(string, true, Thread.currentThread().getContextClassLoader());
        }
        return Class.forName(string);
    }

    public static Class a(String string) {
        try {
            return c.d(string);
        }
        catch (ClassNotFoundException var1_1) {
            throw new RuntimeException("$class: internal error, could not find class '" + string + "' (Desc.useContextClassLoader: " + Boolean.toString(a) + ")", var1_1);
        }
    }

    public static Class[] b(String string) {
        if (string.charAt(0) != '(') {
            throw new RuntimeException("$sig: internal error");
        }
        return c.a(string, string.length(), 1, 0);
    }

    public static Class c(String string) {
        Class[] arrclass = c.a(string, string.length(), 0, 0);
        if (arrclass == null || arrclass.length != 1) {
            throw new RuntimeException("$type: internal error");
        }
        return arrclass[0];
    }

    private static Class[] a(String string, int n2, int n3, int n4) {
        Class class_2;
        if (n3 >= n2) {
            return new Class[n4];
        }
        char c2 = string.charAt(n3);
        switch (c2) {
            Class class_2;
            case 'Z': {
                class_2 = Boolean.TYPE;
                break;
            }
            case 'C': {
                class_2 = Character.TYPE;
                break;
            }
            case 'B': {
                class_2 = Byte.TYPE;
                break;
            }
            case 'S': {
                class_2 = Short.TYPE;
                break;
            }
            case 'I': {
                class_2 = Integer.TYPE;
                break;
            }
            case 'J': {
                class_2 = Long.TYPE;
                break;
            }
            case 'F': {
                class_2 = Float.TYPE;
                break;
            }
            case 'D': {
                class_2 = Double.TYPE;
                break;
            }
            case 'V': {
                class_2 = Void.TYPE;
                break;
            }
            case 'L': 
            case '[': {
                return c.b(string, n2, n3, n4);
            }
            default: {
                return new Class[n4];
            }
        }
        Class[] arrclass = c.a(string, n2, n3 + 1, n4 + 1);
        arrclass[n4] = class_2;
        return arrclass;
    }

    private static Class[] b(String string, int n2, int n3, int n4) {
        int n5 = n3;
        while (string.charAt(n5) == '[') {
            ++n5;
        }
        if (string.charAt(n5) == 'L' && (n5 = string.indexOf(59, n5)) < 0) {
            throw new IndexOutOfBoundsException("bad descriptor");
        }
        String string2 = string.charAt(n3) == 'L' ? string.substring(n3 + 1, n5) : string.substring(n3, n5 + 1);
        Class[] arrclass = c.a(string, n2, n5 + 1, n4 + 1);
        try {
            arrclass[n4] = c.d(string2.replace('/', '.'));
        }
        catch (ClassNotFoundException var7_7) {
            throw new RuntimeException(var7_7.getMessage());
        }
        return arrclass;
    }
}

