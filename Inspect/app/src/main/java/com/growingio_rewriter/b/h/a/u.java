/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

final class u
implements PrivilegedExceptionAction {
    final /* synthetic */ Class a;
    final /* synthetic */ String b;
    final /* synthetic */ Class[] c;

    u(Class class_, String string, Class[] arrclass) {
        this.a = class_;
        this.b = string;
        this.c = arrclass;
    }

    public Object run() throws Exception {
        return this.a.getDeclaredMethod(this.b, this.c);
    }
}

