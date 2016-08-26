/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.N;
import com.growingio.a.a.m.q;
import com.growingio.a.a.m.y;
import java.util.Comparator;

public final class M {
    static final long a = 0xFFFFFFFFL;

    private M() {
    }

    static int a(int n2) {
        return n2 ^ Integer.MIN_VALUE;
    }

    public static int a(int n2, int n3) {
        return q.a(M.a(n2), M.a(n3));
    }

    public static long b(int n2) {
        return (long)n2 & 0xFFFFFFFFL;
    }

    public static /* varargs */ int a(int ... arrn) {
        aU.a(arrn.length > 0);
        int n2 = M.a(arrn[0]);
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            int n3 = M.a(arrn[i2]);
            if (n3 >= n2) continue;
            n2 = n3;
        }
        return M.a(n2);
    }

    public static /* varargs */ int b(int ... arrn) {
        aU.a(arrn.length > 0);
        int n2 = M.a(arrn[0]);
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            int n3 = M.a(arrn[i2]);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return M.a(n2);
    }

    public static /* varargs */ String a(String string, int ... arrn) {
        aU.a(string);
        if (arrn.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrn.length * 5);
        stringBuilder.append(M.c(arrn[0]));
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            stringBuilder.append(string).append(M.c(arrn[i2]));
        }
        return stringBuilder.toString();
    }

    public static Comparator<int[]> a() {
        return N.a;
    }

    public static int b(int n2, int n3) {
        return (int)(M.b(n2) / M.b(n3));
    }

    public static int c(int n2, int n3) {
        return (int)(M.b(n2) % M.b(n3));
    }

    public static int a(String string) {
        y y2 = y.a(string);
        try {
            return M.a(y2.a, y2.b);
        }
        catch (NumberFormatException var2_2) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + string);
            numberFormatException.initCause(var2_2);
            throw numberFormatException;
        }
    }

    public static int b(String string) {
        return M.a(string, 10);
    }

    public static int a(String string, int n2) {
        aU.a(string);
        long l2 = Long.parseLong(string, n2);
        if ((l2 & 0xFFFFFFFFL) != l2) {
            throw new NumberFormatException("Input " + string + " in base " + n2 + " is not in the range of an unsigned integer");
        }
        return (int)l2;
    }

    public static String c(int n2) {
        return M.d(n2, 10);
    }

    public static String d(int n2, int n3) {
        long l2 = (long)n2 & 0xFFFFFFFFL;
        return Long.toString(l2, n3);
    }
}

