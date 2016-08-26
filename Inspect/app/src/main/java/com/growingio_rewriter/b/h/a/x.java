/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;

final class x
implements PrivilegedExceptionAction {
    final /* synthetic */ Field a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    x(Field field, Object object, Object object2) {
        this.a = field;
        this.b = object;
        this.c = object2;
    }

    public Object run() throws Exception {
        this.a.set(this.b, this.c);
        return null;
    }
}

