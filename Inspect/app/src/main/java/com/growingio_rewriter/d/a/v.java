/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.d;

public class v {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    byte[] e;
    int f;

    v(byte[] arrby, int n2) {
        this.e = arrby;
        this.f = n2;
    }

    public int a() {
        return this.e[this.f];
    }

    public int a(int n2) {
        return this.e[this.f + 2 * n2 + 1];
    }

    public int b(int n2) {
        return this.e[this.f + 2 * n2 + 2];
    }

    public static v a(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int n2 = string.length();
        d d2 = new d(n2);
        d2.a(0);
        int n3 = 0;
        while (n3 < n2) {
            char c2;
            if ((c2 = string.charAt(n3++)) == '[') {
                d2.a(0, 0);
                continue;
            }
            if (c2 == '.') {
                d2.a(1, 0);
                continue;
            }
            if (c2 == '*') {
                d2.a(2, 0);
                continue;
            }
            if (c2 < '0' || c2 > '9') continue;
            int n4 = c2 - 48;
            while (n3 < n2 && (c2 = string.charAt(n3)) >= '0' && c2 <= '9') {
                n4 = n4 * 10 + c2 - 48;
                ++n3;
            }
            if (n3 < n2 && string.charAt(n3) == ';') {
                ++n3;
            }
            d2.a(3, n4);
        }
        d2.a[0] = (byte)(d2.b / 2);
        return new v(d2.a, 0);
    }

    public String toString() {
        int n2 = this.a();
        StringBuilder stringBuilder = new StringBuilder(n2 * 2);
        block6 : for (int i2 = 0; i2 < n2; ++i2) {
            switch (this.a(i2)) {
                case 0: {
                    stringBuilder.append('[');
                    continue block6;
                }
                case 1: {
                    stringBuilder.append('.');
                    continue block6;
                }
                case 2: {
                    stringBuilder.append('*');
                    continue block6;
                }
                case 3: {
                    stringBuilder.append(this.b(i2)).append(';');
                    continue block6;
                }
                default: {
                    stringBuilder.append('_');
                }
            }
        }
        return stringBuilder.toString();
    }
}

