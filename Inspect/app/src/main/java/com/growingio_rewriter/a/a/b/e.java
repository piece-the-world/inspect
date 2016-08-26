/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;

public final class e {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 10;
    public static final byte m = 11;
    public static final byte n = 12;
    public static final byte o = 13;
    public static final byte p = 14;
    public static final byte q = 15;
    public static final byte r = 16;
    public static final byte s = 17;
    public static final byte t = 17;
    public static final byte u = 18;
    public static final byte v = 19;
    public static final byte w = 19;
    public static final byte x = 20;
    public static final byte y = 21;
    public static final byte z = 22;
    public static final byte A = 23;
    public static final byte B = 24;
    public static final byte C = 25;
    public static final byte D = 26;
    public static final byte E = 27;
    public static final byte F = 28;
    public static final byte G = 29;
    public static final byte H = 30;
    public static final byte I = 31;
    public static final byte J = 32;
    public static final byte K = 32;
    public static final byte L = 127;
    public static final char M = '\u0000';
    public static final char N = '';

    private e() {
    }

    public static String a(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!e.d(string.charAt(i2))) continue;
            char[] arrc = string.toCharArray();
            while (i2 < n2) {
                char c2 = arrc[i2];
                if (e.d(c2)) {
                    arrc[i2] = (char)(c2 ^ 32);
                }
                ++i2;
            }
            return String.valueOf(arrc);
        }
        return string;
    }

    public static String a(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return e.a((String)charSequence);
        }
        int n2 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(e.a(charSequence.charAt(i2)));
        }
        return stringBuilder.toString();
    }

    public static char a(char c2) {
        return e.d(c2) ? (char)(c2 ^ 32) : c2;
    }

    public static String b(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!e.c(string.charAt(i2))) continue;
            char[] arrc = string.toCharArray();
            while (i2 < n2) {
                char c2 = arrc[i2];
                if (e.c(c2)) {
                    arrc[i2] = (char)(c2 & 95);
                }
                ++i2;
            }
            return String.valueOf(arrc);
        }
        return string;
    }

    public static String b(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return e.b((String)charSequence);
        }
        int n2 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(e.b(charSequence.charAt(i2)));
        }
        return stringBuilder.toString();
    }

    public static char b(char c2) {
        return e.c(c2) ? (char)(c2 & 95) : c2;
    }

    public static boolean c(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean d(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static String a(CharSequence charSequence, int n2, String string) {
        aU.a(charSequence);
        int n3 = n2 - string.length();
        aU.a(n3 >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", n2, string.length());
        if (charSequence.length() <= n2) {
            String string2 = charSequence.toString();
            if (string2.length() <= n2) {
                return string2;
            }
            charSequence = string2;
        }
        return new StringBuilder(n2).append(charSequence, 0, n3).append(string).toString();
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (n2 != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            char c2;
            char c3 = charSequence.charAt(i2);
            if (c3 == (c2 = charSequence2.charAt(i2)) || (n3 = e.e(c3)) < 26 && n3 == e.e(c2)) continue;
            return false;
        }
        return true;
    }

    private static int e(char c2) {
        return (char)((c2 | 32) - 97);
    }
}

