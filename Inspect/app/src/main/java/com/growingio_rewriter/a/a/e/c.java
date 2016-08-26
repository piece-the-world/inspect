/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.e.b;
import com.growingio.a.a.e.p;
import java.util.Map;

public abstract class c
extends p {
    private final char[][] a;
    private final int b;
    private final int c;
    private final int d;
    private final char e;
    private final char f;

    protected c(Map<Character, String> map, int n2, int n3, String string) {
        this(b.a(map), n2, n3, string);
    }

    protected c(b b2, int n2, int n3, String string) {
        aU.a(b2);
        this.a = b2.a();
        this.b = this.a.length;
        if (n3 < n2) {
            n3 = -1;
            n2 = Integer.MAX_VALUE;
        }
        this.c = n2;
        this.d = n3;
        if (n2 >= 55296) {
            this.e = 65535;
            this.f = '\u0000';
        } else {
            this.e = (char)n2;
            this.f = (char)Math.min(n3, 55295);
        }
    }

    @Override
    public final String a(String string) {
        aU.a(string);
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if ((c2 >= this.b || this.a[c2] == null) && c2 <= this.f && c2 >= this.e) continue;
            return this.a(string, i2);
        }
        return string;
    }

    @Override
    protected final int a(CharSequence charSequence, int n2, int n3) {
        char c2;
        while (n2 < n3 && ((c2 = charSequence.charAt(n2)) >= this.b || this.a[c2] == null) && c2 <= this.f && c2 >= this.e) {
            ++n2;
        }
        return n2;
    }

    @Override
    protected final char[] a(int n2) {
        char[] arrc;
        if (n2 < this.b && (arrc = this.a[n2]) != null) {
            return arrc;
        }
        if (n2 >= this.c && n2 <= this.d) {
            return null;
        }
        return this.b(n2);
    }

    protected abstract char[] b(int var1);
}

