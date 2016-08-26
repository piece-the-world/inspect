/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.reflect.Constructor;
import java.security.PrivilegedAction;

final class t
implements PrivilegedAction {
    final /* synthetic */ Class a;

    t(Class class_) {
        this.a = class_;
    }

    public Object run() {
        return this.a.getDeclaredConstructors();
    }
}

