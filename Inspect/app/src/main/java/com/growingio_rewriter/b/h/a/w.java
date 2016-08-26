/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

final class w
implements PrivilegedAction {
    final /* synthetic */ AccessibleObject a;
    final /* synthetic */ boolean b;

    w(AccessibleObject accessibleObject, boolean bl2) {
        this.a = accessibleObject;
        this.b = bl2;
    }

    public Object run() {
        this.a.setAccessible(this.b);
        return null;
    }
}

