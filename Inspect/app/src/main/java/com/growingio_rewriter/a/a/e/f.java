/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.e.d;

class f
extends d {
    private final char[][] a;
    private final int b;

    f(char[][] arrc) {
        this.a = arrc;
        this.b = arrc.length;
    }

    @Override
    public String a(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= this.a.length || this.a[c2] == null) continue;
            return this.a(string, i2);
        }
        return string;
    }

    @Override
    protected char[] a(char c2) {
        return c2 < this.b ? this.a[c2] : null;
    }
}

