/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.e.p;

public final class k
extends p {
    private static final char[] a = new char[]{'+'};
    private static final char[] b = "0123456789ABCDEF".toCharArray();
    private final boolean c;
    private final boolean[] d;

    public k(String string, boolean bl2) {
        aU.a(string);
        if (string.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        string = string + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (bl2 && string.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.c = bl2;
        this.d = k.b(string);
    }

    private static boolean[] b(String string) {
        char[] arrc;
        int n2 = -1;
        for (int n3 : arrc = string.toCharArray()) {
            n2 = Math.max(n3, n2);
        }
        char[] arrc2 = new boolean[n2 + 1];
        for (char c2 : arrc) {
            arrc2[c2] = '\u0001';
        }
        return arrc2;
    }

    @Override
    protected int a(CharSequence charSequence, int n2, int n3) {
        char c2;
        aU.a(charSequence);
        while (n2 < n3 && (c2 = charSequence.charAt(n2)) < this.d.length && this.d[c2]) {
            ++n2;
        }
        return n2;
    }

    @Override
    public String a(String string) {
        aU.a(string);
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < this.d.length && this.d[c2]) continue;
            return this.a(string, i2);
        }
        return string;
    }

    @Override
    protected char[] a(int n2) {
        if (n2 < this.d.length && this.d[n2]) {
            return null;
        }
        if (n2 == 32 && this.c) {
            return a;
        }
        if (n2 <= 127) {
            char[] arrc = new char[3];
            arrc[0] = 37;
            arrc[2] = b[n2 & 15];
            arrc[1] = b[n2 >>> 4];
            return arrc;
        }
        if (n2 <= 2047) {
            char[] arrc = new char[6];
            arrc[0] = 37;
            arrc[3] = 37;
            arrc[5] = b[n2 & 15];
            arrc[4] = b[8 | (n2 >>>= 4) & 3];
            arrc[2] = b[(n2 >>>= 2) & 15];
            arrc[1] = b[12 | (n2 >>>= 4)];
            return arrc;
        }
        if (n2 <= 65535) {
            char[] arrc = new char[9];
            arrc[0] = 37;
            arrc[1] = 69;
            arrc[3] = 37;
            arrc[6] = 37;
            arrc[8] = b[n2 & 15];
            arrc[7] = b[8 | (n2 >>>= 4) & 3];
            arrc[5] = b[(n2 >>>= 2) & 15];
            arrc[4] = b[8 | (n2 >>>= 4) & 3];
            arrc[2] = b[n2 >>>= 2];
            return arrc;
        }
        if (n2 <= 1114111) {
            char[] arrc = new char[12];
            arrc[0] = 37;
            arrc[1] = 70;
            arrc[3] = 37;
            arrc[6] = 37;
            arrc[9] = 37;
            arrc[11] = b[n2 & 15];
            arrc[10] = b[8 | (n2 >>>= 4) & 3];
            arrc[8] = b[(n2 >>>= 2) & 15];
            arrc[7] = b[8 | (n2 >>>= 4) & 3];
            arrc[5] = b[(n2 >>>= 2) & 15];
            arrc[4] = b[8 | (n2 >>>= 4) & 3];
            arrc[2] = b[(n2 >>>= 2) & 7];
            return arrc;
        }
        throw new IllegalArgumentException("Invalid unicode character value " + n2);
    }
}

