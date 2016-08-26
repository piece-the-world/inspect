/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.f.m;
import com.growingio.a.a.f.p;
import com.growingio.a.a.f.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class r
extends p {
    private r(m m2, Object object, Method method) {
        super(m2, object, method, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void b(Object object) throws InvocationTargetException {
        r r2 = this;
        synchronized (r2) {
            super.b(object);
        }
    }

    /* synthetic */ r(m m2, Object object, Method method, q q2) {
        this(m2, object, method);
    }
}

