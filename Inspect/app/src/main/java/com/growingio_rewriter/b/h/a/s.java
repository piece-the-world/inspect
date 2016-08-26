/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

final class s
implements PrivilegedAction {
    final /* synthetic */ Class a;

    s(Class class_) {
        this.a = class_;
    }

    public Object run() {
        return this.a.getDeclaredMethods();
    }
}

