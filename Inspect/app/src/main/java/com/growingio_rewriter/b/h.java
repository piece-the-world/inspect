/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.g;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;

final class h
implements PrivilegedExceptionAction {
    h() {
    }

    public Object run() throws Exception {
        Class class_ = Class.forName("java.lang.ClassLoader");
        g.a(class_.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE));
        g.b(class_.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class));
        g.c(class_.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class));
        return null;
    }
}

