/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.b;
import com.growingio.e.b.b.c;
import com.growingio.e.b.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class d
implements b {
    private final ConcurrentMap<String, h> a = new ConcurrentHashMap<String, h>();

    @Override
    public h a(String string) {
        h h2;
        if (string == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        h h3 = this.a.get(string);
        if (h3 == null && (h2 = this.a.putIfAbsent(string, h3 = new c(string))) != null) {
            h3 = h2;
        }
        return h3;
    }

    @Override
    public boolean b(String string) {
        if (string == null) {
            return false;
        }
        return this.a.containsKey(string);
    }

    @Override
    public boolean c(String string) {
        if (string == null) {
            return false;
        }
        return this.a.remove(string) != null;
    }

    @Override
    public h d(String string) {
        return new c(string);
    }
}

