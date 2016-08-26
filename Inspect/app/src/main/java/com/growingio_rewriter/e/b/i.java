/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b;

import com.growingio.e.b.b;
import com.growingio.e.b.b.d;
import com.growingio.e.b.b.n;
import com.growingio.e.b.c.c;
import com.growingio.e.b.h;

public class i {
    static b a;

    private i() {
    }

    private static b b() throws NoClassDefFoundError {
        try {
            return c.a().b();
        }
        catch (NoSuchMethodError var0) {
            return c.a.b();
        }
    }

    public static h a(String string) {
        return a.a(string);
    }

    public static h b(String string) {
        return a.d(string);
    }

    public static b a() {
        return a;
    }

    static {
        try {
            a = i.b();
        }
        catch (NoClassDefFoundError var0) {
            a = new d();
        }
        catch (Exception var0_1) {
            n.a("Unexpected failure while binding MarkerFactory", var0_1);
        }
    }
}

