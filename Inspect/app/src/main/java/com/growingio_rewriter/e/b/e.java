/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b;

import com.growingio.e.b.b.j;
import com.growingio.e.b.b.n;
import com.growingio.e.b.c.b;
import com.growingio.e.b.d.c;
import com.growingio.e.b.f;
import com.growingio.e.b.g;
import java.util.Map;

public class e {
    static final String a = "http://www.slf4j.org/codes.html#null_MDCA";
    static final String b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static c c;

    private e() {
    }

    private static c d() throws NoClassDefFoundError {
        try {
            return b.a().b();
        }
        catch (NoSuchMethodError var0) {
            return b.a.b();
        }
    }

    public static void a(String string, String string2) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        c.a(string, string2);
    }

    public static g b(String string, String string2) throws IllegalArgumentException {
        e.a(string, string2);
        return new g(string, null);
    }

    public static String a(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return c.a(string);
    }

    public static void b(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        c.b(string);
    }

    public static void a() {
        if (c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        c.a();
    }

    public static Map<String, String> b() {
        if (c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return c.c();
    }

    public static void a(Map<String, String> map) {
        if (c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        c.a(map);
    }

    public static c c() {
        return c;
    }

    static {
        try {
            c = e.d();
        }
        catch (NoClassDefFoundError var0) {
            c = new j();
            String string = var0.getMessage();
            if (string != null && string.contains("StaticMDCBinder")) {
                n.c("Failed to load class \"StaticMDCBinder\".");
                n.c("Defaulting to no-operation MDCAdapter implementation.");
                n.c("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
            }
            throw var0;
        }
        catch (Exception var0_1) {
            n.a("MDC binding unsuccessful.", var0_1);
        }
    }
}

