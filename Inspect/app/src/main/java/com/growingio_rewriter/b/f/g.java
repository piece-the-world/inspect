/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class g
extends SoftReference {
    public Object a;

    private g(Object object, Object object2, ReferenceQueue referenceQueue) {
        super(object2, referenceQueue);
        this.a = object;
    }

    private static g b(Object object, Object object2, ReferenceQueue referenceQueue) {
        if (object2 == null) {
            return null;
        }
        return new g(object, object2, referenceQueue);
    }

    static /* synthetic */ g a(Object object, Object object2, ReferenceQueue referenceQueue) {
        return g.b(object, object2, referenceQueue);
    }
}

