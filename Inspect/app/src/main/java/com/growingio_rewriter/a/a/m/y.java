/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

final class y {
    final String a;
    final int b;

    private y(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    static y a(String string) {
        String string2;
        int n2;
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char c2 = string.charAt(0);
        if (string.startsWith("0x") || string.startsWith("0X")) {
            string2 = string.substring(2);
            n2 = 16;
        } else if (c2 == '#') {
            string2 = string.substring(1);
            n2 = 16;
        } else if (c2 == '0' && string.length() > 1) {
            string2 = string.substring(1);
            n2 = 8;
        } else {
            string2 = string;
            n2 = 10;
        }
        return new y(string2, n2);
    }
}

