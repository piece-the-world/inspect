/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.e.f;
import com.growingio.a.a.e.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class e {
    private final Map<Character, String> a = new HashMap<Character, String>();
    private int b = -1;

    public e a(char c2, String string) {
        this.a.put(Character.valueOf(c2), aU.a(string));
        if (c2 > this.b) {
            this.b = c2;
        }
        return this;
    }

    public e a(char[] arrc, String string) {
        aU.a(string);
        for (char c2 : arrc) {
            this.a(c2, string);
        }
        return this;
    }

    public char[][] a() {
        char[][] arrarrc = new char[this.b + 1][];
        for (Map.Entry<Character, String> entry : this.a.entrySet()) {
            arrarrc[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return arrarrc;
    }

    public g b() {
        return new f(this.a());
    }
}

