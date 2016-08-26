/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aU;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b {
    private final char[][] a;
    private static final char[][] b = new char[0][0];

    public static b a(Map<Character, String> map) {
        return new b(b.b(map));
    }

    private b(char[][] arrc) {
        this.a = arrc;
    }

    char[][] a() {
        return this.a;
    }

    static char[][] b(Map<Character, String> map) {
        aU.a(map);
        if (map.isEmpty()) {
            return b;
        }
        char c2 = Collections.max(map.keySet()).charValue();
        char[][] arrarrc = new char[c2 + '\u0001'][];
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            char c3 = iterator.next().charValue();
            arrarrc[c3] = map.get(Character.valueOf(c3)).toCharArray();
        }
        return arrarrc;
    }
}

