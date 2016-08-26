/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class o {
    private final String a;
    private final String b;
    private static final Map<String, String> c = new HashMap<String, String>();

    public o(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public o(String string, u u2, u[] arru) {
        this(string, u.b(u2, arru));
    }

    public static o a(Method method) {
        return new o(method.getName(), u.d(method));
    }

    public static o a(Constructor<?> constructor) {
        return new o("<init>", u.b(constructor));
    }

    public static o a(String string) throws IllegalArgumentException {
        return o.a(string, false);
    }

    public static o a(String string, boolean bl2) throws IllegalArgumentException {
        int n2;
        int n3 = string.indexOf(32);
        int n4 = string.indexOf(40, n3) + 1;
        int n5 = string.indexOf(41, n4);
        if (n3 == -1 || n4 == -1 || n5 == -1) {
            throw new IllegalArgumentException();
        }
        String string2 = string.substring(0, n3);
        String string3 = string.substring(n3 + 1, n4 - 1).trim();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        do {
            String string4;
            if ((n2 = string.indexOf(44, n4)) == -1) {
                string4 = o.b(string.substring(n4, n5).trim(), bl2);
            } else {
                string4 = o.b(string.substring(n4, n2).trim(), bl2);
                n4 = n2 + 1;
            }
            stringBuilder.append(string4);
        } while (n2 != -1);
        stringBuilder.append(')');
        stringBuilder.append(o.b(string2, bl2));
        return new o(string3, stringBuilder.toString());
    }

    private static String b(String string, boolean bl2) {
        if ("".equals(string)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while ((n2 = string.indexOf("[]", n2) + 1) > 0) {
            stringBuilder.append('[');
        }
        String string2 = string.substring(0, string.length() - stringBuilder.length() * 2);
        String string3 = c.get(string2);
        if (string3 != null) {
            stringBuilder.append(string3);
        } else {
            stringBuilder.append('L');
            if (string2.indexOf(46) < 0) {
                if (!bl2) {
                    stringBuilder.append("java/lang/");
                }
                stringBuilder.append(string2);
            } else {
                stringBuilder.append(string2.replace('.', '/'));
            }
            stringBuilder.append(';');
        }
        return stringBuilder.toString();
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public u c() {
        return u.e(this.b);
    }

    public u[] d() {
        return u.d(this.b);
    }

    public String toString() {
        return this.a + this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof o)) {
            return false;
        }
        o o2 = (o)object;
        return this.a.equals(o2.a) && this.b.equals(o2.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    static {
        c.put("void", "V");
        c.put("byte", "B");
        c.put("char", "C");
        c.put("double", "D");
        c.put("float", "F");
        c.put("int", "I");
        c.put("long", "J");
        c.put("short", "S");
        c.put("boolean", "Z");
    }
}

