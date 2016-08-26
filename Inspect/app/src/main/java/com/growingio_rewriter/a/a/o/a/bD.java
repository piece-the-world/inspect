/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.by;

final class bD
extends ClassValue<Boolean> {
    bD() {
    }

    protected Boolean a(Class<?> class_) {
        by.b(class_.asSubclass(Exception.class));
        return true;
    }

    @Override
    protected /* synthetic */ Object computeValue(Class class_) {
        return this.a(class_);
    }
}

