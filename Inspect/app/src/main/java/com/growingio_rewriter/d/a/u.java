/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class u {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final u m = new u(0, null, 1443168256, 1);
    public static final u n = new u(1, null, 1509950721, 1);
    public static final u o = new u(2, null, 1124075009, 1);
    public static final u p = new u(3, null, 1107297537, 1);
    public static final u q = new u(4, null, 1392510721, 1);
    public static final u r = new u(5, null, 1224736769, 1);
    public static final u s = new u(6, null, 1174536705, 1);
    public static final u t = new u(7, null, 1241579778, 1);
    public static final u u = new u(8, null, 1141048066, 1);
    private final int v;
    private final char[] w;
    private final int x;
    private final int y;

    private u(int n2, char[] arrc, int n3, int n4) {
        this.v = n2;
        this.w = arrc;
        this.x = n3;
        this.y = n4;
    }

    public static u a(String string) {
        return u.a(string.toCharArray(), 0);
    }

    public static u b(String string) {
        char[] arrc = string.toCharArray();
        return new u(arrc[0] == '[' ? 9 : 10, arrc, 0, arrc.length);
    }

    public static u c(String string) {
        return u.a(string.toCharArray(), 0);
    }

    public static /* varargs */ u a(u u2, u ... arru) {
        return u.a(u.b(u2, arru));
    }

    public static u a(Class<?> class_) {
        if (class_.isPrimitive()) {
            if (class_ == Integer.TYPE) {
                return r;
            }
            if (class_ == Void.TYPE) {
                return m;
            }
            if (class_ == Boolean.TYPE) {
                return n;
            }
            if (class_ == Byte.TYPE) {
                return p;
            }
            if (class_ == Character.TYPE) {
                return o;
            }
            if (class_ == Short.TYPE) {
                return q;
            }
            if (class_ == Double.TYPE) {
                return u;
            }
            if (class_ == Float.TYPE) {
                return s;
            }
            return t;
        }
        return u.a(u.c(class_));
    }

    public static u a(Constructor<?> constructor) {
        return u.a(u.b(constructor));
    }

    public static u a(Method method) {
        return u.a(u.d(method));
    }

    public static u[] d(String string) {
        char c2;
        char[] arrc = string.toCharArray();
        int n2 = 1;
        int n3 = 0;
        while ((c2 = arrc[n2++]) != ')') {
            if (c2 == 'L') {
                while (arrc[n2++] != ';') {
                }
                ++n3;
                continue;
            }
            if (c2 == '[') continue;
            ++n3;
        }
        u[] arru = new u[n3];
        n2 = 1;
        n3 = 0;
        while (arrc[n2] != ')') {
            arru[n3] = u.a(arrc, n2);
            n2 += arru[n3].y + (arru[n3].v == 10 ? 2 : 0);
            ++n3;
        }
        return arru;
    }

    public static u[] b(Method method) {
        Class<?>[] arrclass = method.getParameterTypes();
        u[] arru = new u[arrclass.length];
        for (int i2 = arrclass.length - 1; i2 >= 0; --i2) {
            arru[i2] = u.a(arrclass[i2]);
        }
        return arru;
    }

    public static u e(String string) {
        char[] arrc = string.toCharArray();
        return u.a(arrc, string.indexOf(41) + 1);
    }

    public static u c(Method method) {
        return u.a(method.getReturnType());
    }

    public static int f(String string) {
        int n2 = 1;
        int n3 = 1;
        do {
            char c2;
            if ((c2 = string.charAt(n3++)) == ')') {
                c2 = string.charAt(n3);
                return n2 << 2 | (c2 == 'V' ? 0 : (c2 == 'D' || c2 == 'J' ? 2 : 1));
            }
            if (c2 == 'L') {
                while (string.charAt(n3++) != ';') {
                }
                ++n2;
                continue;
            }
            if (c2 == '[') {
                while ((c2 = string.charAt(n3)) == '[') {
                    ++n3;
                }
                if (c2 != 'D' && c2 != 'J') continue;
                --n2;
                continue;
            }
            if (c2 == 'D' || c2 == 'J') {
                n2 += 2;
                continue;
            }
            ++n2;
        } while (true);
    }

    private static u a(char[] arrc, int n2) {
        switch (arrc[n2]) {
            case 'V': {
                return m;
            }
            case 'Z': {
                return n;
            }
            case 'C': {
                return o;
            }
            case 'B': {
                return p;
            }
            case 'S': {
                return q;
            }
            case 'I': {
                return r;
            }
            case 'F': {
                return s;
            }
            case 'J': {
                return t;
            }
            case 'D': {
                return u;
            }
            case '[': {
                int n3 = 1;
                while (arrc[n2 + n3] == '[') {
                    ++n3;
                }
                if (arrc[n2 + n3] == 'L') {
                    ++n3;
                    while (arrc[n2 + n3] != ';') {
                        ++n3;
                    }
                }
                return new u(9, arrc, n2, n3 + 1);
            }
            case 'L': {
                int n4 = 1;
                while (arrc[n2 + n4] != ';') {
                    ++n4;
                }
                return new u(10, arrc, n2 + 1, n4 - 1);
            }
        }
        return new u(11, arrc, n2, arrc.length - n2);
    }

    public int a() {
        return this.v;
    }

    public int b() {
        int n2 = 1;
        while (this.w[this.x + n2] == '[') {
            ++n2;
        }
        return n2;
    }

    public u c() {
        return u.a(this.w, this.x + this.b());
    }

    public String d() {
        switch (this.v) {
            case 0: {
                return "void";
            }
            case 1: {
                return "boolean";
            }
            case 2: {
                return "char";
            }
            case 3: {
                return "byte";
            }
            case 4: {
                return "short";
            }
            case 5: {
                return "int";
            }
            case 6: {
                return "float";
            }
            case 7: {
                return "long";
            }
            case 8: {
                return "double";
            }
            case 9: {
                StringBuilder stringBuilder = new StringBuilder(this.c().d());
                for (int i2 = this.b(); i2 > 0; --i2) {
                    stringBuilder.append("[]");
                }
                return stringBuilder.toString();
            }
            case 10: {
                return new String(this.w, this.x, this.y).replace('/', '.');
            }
        }
        return null;
    }

    public String e() {
        return new String(this.w, this.x, this.y);
    }

    public u[] f() {
        return u.d(this.i());
    }

    public u g() {
        return u.e(this.i());
    }

    public int h() {
        return u.f(this.i());
    }

    public String i() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public static /* varargs */ String b(u u2, u ... arru) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        for (int i2 = 0; i2 < arru.length; ++i2) {
            arru[i2].a(stringBuilder);
        }
        stringBuilder.append(')');
        u2.a(stringBuilder);
        return stringBuilder.toString();
    }

    private void a(StringBuilder stringBuilder) {
        if (this.w == null) {
            stringBuilder.append((char)((this.x & -16777216) >>> 24));
        } else if (this.v == 10) {
            stringBuilder.append('L');
            stringBuilder.append(this.w, this.x, this.y);
            stringBuilder.append(';');
        } else {
            stringBuilder.append(this.w, this.x, this.y);
        }
    }

    public static String b(Class<?> class_) {
        return class_.getName().replace('.', '/');
    }

    public static String c(Class<?> class_) {
        StringBuilder stringBuilder = new StringBuilder();
        u.a(stringBuilder, class_);
        return stringBuilder.toString();
    }

    public static String b(Constructor<?> constructor) {
        Class<?>[] arrclass = constructor.getParameterTypes();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            u.a(stringBuilder, arrclass[i2]);
        }
        return stringBuilder.append(")V").toString();
    }

    public static String d(Method method) {
        Class<?>[] arrclass = method.getParameterTypes();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            u.a(stringBuilder, arrclass[i2]);
        }
        stringBuilder.append(')');
        u.a(stringBuilder, method.getReturnType());
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, Class<?> class_) {
        Class class_2 = class_;
        do {
            if (class_2.isPrimitive()) {
                int n2 = class_2 == Integer.TYPE ? 73 : (class_2 == Void.TYPE ? 86 : (class_2 == Boolean.TYPE ? 90 : (class_2 == Byte.TYPE ? 66 : (class_2 == Character.TYPE ? 67 : (class_2 == Short.TYPE ? 83 : (class_2 == Double.TYPE ? 68 : (class_2 == Float.TYPE ? 70 : 74)))))));
                stringBuilder.append((char)n2);
                return;
            }
            if (!class_2.isArray()) break;
            stringBuilder.append('[');
            class_2 = class_2.getComponentType();
        } while (true);
        stringBuilder.append('L');
        String string = class_2.getName();
        int n3 = string.length();
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            stringBuilder.append(c2 == '.' ? '/' : (char)c2);
        }
        stringBuilder.append(';');
    }

    public int j() {
        return this.w == null ? this.x & 255 : 1;
    }

    public int a(int n2) {
        if (n2 == 46 || n2 == 79) {
            return n2 + (this.w == null ? (this.x & 65280) >> 8 : 4);
        }
        return n2 + (this.w == null ? (this.x & 16711680) >> 16 : 4);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        u u2 = (u)object;
        if (this.v != u2.v) {
            return false;
        }
        if (this.v >= 9) {
            if (this.y != u2.y) {
                return false;
            }
            int n2 = this.x;
            int n3 = u2.x;
            int n4 = n2 + this.y;
            while (n2 < n4) {
                if (this.w[n2] != u2.w[n3]) {
                    return false;
                }
                ++n2;
                ++n3;
            }
        }
        return true;
    }

    public int hashCode() {
        int n2 = 13 * this.v;
        if (this.v >= 9) {
            int n3;
            int n4 = n3 + this.y;
            for (n3 = this.x; n3 < n4; ++n3) {
                n2 = 17 * (n2 + this.w[n3]);
            }
        }
        return n2;
    }

    public String toString() {
        return this.i();
    }
}

