/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.g;
import com.growingio.a.a.m.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class f {
    public static final int a = 2;

    private f() {
    }

    public static int a(char c2) {
        return c2;
    }

    public static char a(long l2) {
        char c2 = (char)l2;
        if ((long)c2 != l2) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return c2;
    }

    public static char b(long l2) {
        if (l2 > 65535) {
            return '\uffff';
        }
        if (l2 < 0) {
            return '\u0000';
        }
        return (char)l2;
    }

    public static int a(char c2, char c3) {
        return c2 - c3;
    }

    public static boolean a(char[] arrc, char c2) {
        for (char c3 : arrc) {
            if (c3 != c2) continue;
            return true;
        }
        return false;
    }

    public static int b(char[] arrc, char c2) {
        return f.c(arrc, c2, 0, arrc.length);
    }

    private static int c(char[] arrc, char c2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrc[i2] != c2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(char[] arrc, char[] arrc2) {
        aU.a(arrc, (Object)"array");
        aU.a(arrc2, (Object)"target");
        if (arrc2.length == 0) {
            return 0;
        }
        block0 : for (int i2 = 0; i2 < arrc.length - arrc2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrc2.length; ++i3) {
                if (arrc[i2 + i3] != arrc2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(char[] arrc, char c2) {
        return f.d(arrc, c2, 0, arrc.length);
    }

    private static int d(char[] arrc, char c2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrc[i2] != c2) continue;
            return i2;
        }
        return -1;
    }

    public static /* varargs */ char a(char ... arrc) {
        aU.a(arrc.length > 0);
        char c2 = arrc[0];
        for (int i2 = 1; i2 < arrc.length; ++i2) {
            if (arrc[i2] >= c2) continue;
            c2 = arrc[i2];
        }
        return c2;
    }

    public static /* varargs */ char b(char ... arrc) {
        aU.a(arrc.length > 0);
        char c2 = arrc[0];
        for (int i2 = 1; i2 < arrc.length; ++i2) {
            if (arrc[i2] <= c2) continue;
            c2 = arrc[i2];
        }
        return c2;
    }

    public static /* varargs */ char[] a(char[] ... arrc) {
        int n2 = 0;
        for (char[] arrc2 : arrc) {
            n2 += arrc2.length;
        }
        char[][] arrc3 = new char[n2];
        int n3 = 0;
        for (char[] arrc4 : arrc) {
            System.arraycopy(arrc4, 0, arrc3, n3, arrc4.length);
            n3 += arrc4.length;
        }
        return arrc3;
    }

    public static byte[] b(char c2) {
        return new byte[]{(byte)(c2 >> 8), (byte)c2};
    }

    public static char a(byte[] arrby) {
        aU.a(arrby.length >= 2, "array too small: %s < %s", arrby.length, 2);
        return f.a(arrby[0], arrby[1]);
    }

    public static char a(byte by2, byte by3) {
        return (char)(by2 << 8 | by3 & 255);
    }

    public static char[] a(char[] arrc, int n2, int n3) {
        aU.a(n2 >= 0, "Invalid minLength: %s", n2);
        aU.a(n3 >= 0, "Invalid padding: %s", n3);
        return arrc.length < n2 ? Arrays.copyOf(arrc, n2 + n3) : arrc;
    }

    public static /* varargs */ String a(String string, char ... arrc) {
        aU.a(string);
        int n2 = arrc.length;
        if (n2 == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(n2 + string.length() * (n2 - 1));
        stringBuilder.append(arrc[0]);
        for (int i2 = 1; i2 < n2; ++i2) {
            stringBuilder.append(string).append(arrc[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<char[]> a() {
        return h.a;
    }

    public static char[] a(Collection<Character> collection) {
        if (collection instanceof g) {
            return ((g)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        char[] arrc = new char[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrc[i2] = ((Character)aU.a(arrobject[i2])).charValue();
        }
        return arrc;
    }

    public static /* varargs */ List<Character> c(char ... arrc) {
        if (arrc.length == 0) {
            return Collections.emptyList();
        }
        return new g(arrc);
    }

    static /* synthetic */ int a(char[] arrc, char c2, int n2, int n3) {
        return f.c(arrc, c2, n2, n3);
    }

    static /* synthetic */ int b(char[] arrc, char c2, int n2, int n3) {
        return f.d(arrc, c2, n2, n3);
    }
}

