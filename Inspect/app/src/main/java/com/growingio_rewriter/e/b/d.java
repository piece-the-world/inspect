/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b;

import com.growingio.e.b.a.e;
import com.growingio.e.b.b.i;
import com.growingio.e.b.b.l;
import com.growingio.e.b.b.m;
import com.growingio.e.b.b.n;
import com.growingio.e.b.c;
import com.growingio.e.b.c.a;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public final class d {
    static final String a = "http://www.slf4j.org/codes.html";
    static final String b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final String c = "http://www.slf4j.org/codes.html#multiple_bindings";
    static final String d = "http://www.slf4j.org/codes.html#null_LF";
    static final String e = "http://www.slf4j.org/codes.html#version_mismatch";
    static final String f = "http://www.slf4j.org/codes.html#substituteLogger";
    static final String g = "http://www.slf4j.org/codes.html#loggerNameMismatch";
    static final String h = "http://www.slf4j.org/codes.html#replay";
    static final String i = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String j = "LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final int k = 0;
    static final int l = 1;
    static final int m = 2;
    static final int n = 3;
    static final int o = 4;
    static volatile int p = 0;
    static m q = new m();
    static i r = new i();
    static final String s = "slf4j.detectLoggerNameMismatch";
    static final String t = "java.vendor.url";
    static boolean u = n.b("slf4j.detectLoggerNameMismatch");
    private static final String[] v = new String[]{"1.6", "1.7"};
    private static String w = "com/growingio/org/slf4j/impl/StaticLoggerBinder.class";

    private d() {
    }

    static void a() {
        p = 0;
    }

    private static final void d() {
        d.e();
        if (p == 3) {
            d.i();
        }
    }

    private static boolean b(String string) {
        if (string == null) {
            return false;
        }
        if (string.contains("com/growingio/org/slf4j/impl/StaticLoggerBinder")) {
            return true;
        }
        if (string.contains("StaticLoggerBinder")) {
            return true;
        }
        return false;
    }

    private static final void e() {
        try {
            Set<URL> set = null;
            if (!d.j()) {
                set = d.b();
                d.b(set);
            }
            a.a();
            p = 3;
            d.c(set);
            d.f();
            d.g();
            q.e();
        }
        catch (NoClassDefFoundError var0_1) {
            String string = var0_1.getMessage();
            if (d.b(string)) {
                p = 4;
                n.c("Failed to load class \"StaticLoggerBinder\".");
                n.c("Defaulting to no-operation (NOP) logger implementation");
                n.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            }
            d.a(var0_1);
            throw var0_1;
        }
        catch (NoSuchMethodError var0_2) {
            String string = var0_2.getMessage();
            if (string != null && string.contains("StaticLoggerBinder.getSingleton()")) {
                p = 2;
                n.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                n.c("Your binding is version 1.5.5 or earlier.");
                n.c("Upgrade your binding to version 1.6.x.");
            }
            throw var0_2;
        }
        catch (Exception var0_3) {
            d.a(var0_3);
            throw new IllegalStateException("Unexpected initialization failure", var0_3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void f() {
        m m2 = q;
        synchronized (m2) {
            q.d();
            for (l l2 : q.b()) {
                c c2 = d.a(l2.a());
                l2.a(c2);
            }
        }
    }

    static void a(Throwable throwable) {
        p = 2;
        n.a("Failed to instantiate SLF4J LoggerFactory", throwable);
    }

    private static void g() {
        int n2;
        LinkedBlockingQueue<e> linkedBlockingQueue = q.c();
        int n3 = linkedBlockingQueue.size();
        int n4 = 0;
        int n5 = 128;
        ArrayList arrayList = new ArrayList(128);
        while ((n2 = linkedBlockingQueue.drainTo(arrayList, 128)) != 0) {
            for (e e2 : arrayList) {
                d.a(e2);
                if (n4++ != 0) continue;
                d.a(e2, n3);
            }
            arrayList.clear();
        }
    }

    private static void a(e e2, int n2) {
        if (e2.i().h()) {
            d.a(n2);
        } else if (!e2.i().j()) {
            d.h();
        }
    }

    private static void a(e e2) {
        if (e2 == null) {
            return;
        }
        l l2 = e2.i();
        String string = l2.a();
        if (l2.i()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (!l2.j()) {
            if (l2.h()) {
                l2.a(e2);
            } else {
                n.c(string);
            }
        }
    }

    private static void h() {
        n.c("The following set of substitute loggers may have been accessed");
        n.c("during the initialization phase. Logging calls during this");
        n.c("phase were not honored. However, subsequent logging calls to these");
        n.c("loggers will work as normally expected.");
        n.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void a(int n2) {
        n.c("A number (" + n2 + ") of logging calls during the initialization phase have been intercepted and are");
        n.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        n.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static final void i() {
        try {
            String string = a.a;
            boolean bl2 = false;
            for (String string2 : v) {
                if (!string.startsWith(string2)) continue;
                bl2 = true;
            }
            if (!bl2) {
                n.c("The requested version " + string + " by your slf4j binding is not compatible with " + Arrays.asList(v).toString());
                n.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        }
        catch (NoSuchFieldError var0_1) {
        }
        catch (Throwable var0_2) {
            n.a("Unexpected problem occured during version sanity check", var0_2);
        }
    }

    static Set<URL> b() {
        LinkedHashSet<URL> linkedHashSet = new LinkedHashSet<URL>();
        try {
            ClassLoader classLoader = d.class.getClassLoader();
            Enumeration<URL> enumeration = classLoader == null ? ClassLoader.getSystemResources(w) : classLoader.getResources(w);
            while (enumeration.hasMoreElements()) {
                URL uRL = enumeration.nextElement();
                linkedHashSet.add(uRL);
            }
        }
        catch (IOException var1_2) {
            n.a("Error getting resources from path", var1_2);
        }
        return linkedHashSet;
    }

    private static boolean a(Set<URL> set) {
        return set.size() > 1;
    }

    private static void b(Set<URL> set) {
        if (d.a(set)) {
            n.c("Class path contains multiple SLF4J bindings.");
            for (URL uRL : set) {
                n.c("Found binding in [" + uRL + "]");
            }
            n.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static boolean j() {
        String string = n.a("java.vendor.url");
        if (string == null) {
            return false;
        }
        return string.toLowerCase().contains("android");
    }

    private static void c(Set<URL> set) {
        if (set != null && d.a(set)) {
            n.c("Actual binding is of type [" + a.a().c() + "]");
        }
    }

    public static c a(String string) {
        com.growingio.e.b.a a2 = d.c();
        return a2.a(string);
    }

    public static c a(Class<?> class_) {
        Class class_2;
        c c2 = d.a(class_.getName());
        if (u && (class_2 = n.a()) != null && d.a(class_, class_2)) {
            n.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", c2.a(), class_2.getName()));
            n.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return c2;
    }

    private static boolean a(Class<?> class_, Class<?> class_2) {
        return !class_2.isAssignableFrom(class_);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static com.growingio.e.b.a c() {
        if (p == 0) {
            reference var0 = d.class;
            // MONITORENTER : com.growingio.e.b.d.class
            if (p == 0) {
                p = 1;
                d.d();
            }
            // MONITOREXIT : var0
        }
        switch (p) {
            case 3: {
                return a.a().b();
            }
            case 4: {
                return r;
            }
            case 2: {
                throw new IllegalStateException("LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            case 1: {
                return q;
            }
        }
        throw new IllegalStateException("Unreachable code");
    }
}

