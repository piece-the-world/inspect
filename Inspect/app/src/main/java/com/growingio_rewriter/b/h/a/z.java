/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.y;
import java.security.PrivilegedExceptionAction;

class z
implements PrivilegedExceptionAction {
    final /* synthetic */ String a;
    final /* synthetic */ y b;

    z(y y2, String string) {
        this.b = y2;
        this.a = string;
    }

    public Object run() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return Class.forName(this.a, true, classLoader);
    }
}

