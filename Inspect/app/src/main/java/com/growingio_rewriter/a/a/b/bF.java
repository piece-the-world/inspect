/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;

public final class bF {
    private bF() {
    }

    public static String a(String string) {
        return string == null ? "" : string;
    }

    public static String b(String string) {
        return bF.c(string) ? null : string;
    }

    public static boolean c(String string) {
        return string == null || string.isEmpty();
    }

    public static String a(String string, int n2, char c2) {
        aU.a(string);
        if (string.length() >= n2) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = string.length(); i2 < n2; ++i2) {
            stringBuilder.append(c2);
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String b(String string, int n2, char c2) {
        aU.a(string);
        if (string.length() >= n2) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(n2);
        stringBuilder.append(string);
        for (int i2 = string.length(); i2 < n2; ++i2) {
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static String a(String string, int n2) {
        int n3;
        aU.a(string);
        if (n2 <= 1) {
            aU.a(n2 >= 0, "invalid count: %s", n2);
            return n2 == 0 ? "" : string;
        }
        int n4 = string.length();
        long l2 = (long)n4 * (long)n2;
        int n5 = (int)l2;
        if ((long)n5 != l2) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + l2);
        }
        char[] arrc = new char[n5];
        string.getChars(0, n4, arrc, 0);
        for (n3 = n4; n3 < n5 - n3; n3 <<= 1) {
            System.arraycopy(arrc, 0, arrc, n3, n3);
        }
        System.arraycopy(arrc, 0, arrc, n3, n5 - n3);
        return new String(arrc);
    }

    public static String a(CharSequence charSequence, CharSequence charSequence2) {
        int n2;
        aU.a(charSequence);
        aU.a(charSequence2);
        int n3 = Math.min(charSequence.length(), charSequence2.length());
        for (n2 = 0; n2 < n3 && charSequence.charAt(n2) == charSequence2.charAt(n2); ++n2) {
        }
        if (bF.a(charSequence, n2 - 1) || bF.a(charSequence2, n2 - 1)) {
            --n2;
        }
        return charSequence.subSequence(0, n2).toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int n2;
        aU.a(charSequence);
        aU.a(charSequence2);
        int n3 = Math.min(charSequence.length(), charSequence2.length());
        for (n2 = 0; n2 < n3 && charSequence.charAt(charSequence.length() - n2 - 1) == charSequence2.charAt(charSequence2.length() - n2 - 1); ++n2) {
        }
        if (bF.a(charSequence, charSequence.length() - n2 - 1) || bF.a(charSequence2, charSequence2.length() - n2 - 1)) {
            --n2;
        }
        return charSequence.subSequence(charSequence.length() - n2, charSequence.length()).toString();
    }

    static boolean a(CharSequence charSequence, int n2) {
        return n2 >= 0 && n2 <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(n2)) && Character.isLowSurrogate(charSequence.charAt(n2 + 1));
    }
}

