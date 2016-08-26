/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.reflect.Constructor;
import java.security.PrivilegedExceptionAction;

final class v
implements PrivilegedExceptionAction {
    final /* synthetic */ Class a;
    final /* synthetic */ Class[] b;

    v(Class class_, Class[] arrclass) {
        this.a = class_;
        this.b = arrclass;
    }

    public Object run() throws Exception {
        return this.a.getDeclaredConstructor(this.b);
    }
}

