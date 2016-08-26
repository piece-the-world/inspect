/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.m;
import com.growingio.a.a.n.b;
import com.growingio.a.a.n.f;
import com.growingio.a.a.n.u;

public final class d
extends f {
    private final String b;

    d(String string, ClassLoader classLoader) {
        super(string, classLoader);
        this.b = b.c(string);
    }

    public String a() {
        return u.a(this.b);
    }

    public String b() {
        int n2 = this.b.lastIndexOf(36);
        if (n2 != -1) {
            String string = this.b.substring(n2 + 1);
            return m.f().l(string);
        }
        String string = this.a();
        if (string.isEmpty()) {
            return this.b;
        }
        return this.b.substring(string.length() + 1);
    }

    public String c() {
        return this.b;
    }

    public Class<?> d() {
        try {
            return this.a.loadClass(this.b);
        }
        catch (ClassNotFoundException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public String toString() {
        return this.b;
    }

    static /* synthetic */ String a(d d2) {
        return d2.b;
    }
}

