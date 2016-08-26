/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.c;
import java.io.Serializable;
import java.lang.reflect.Method;

class q
implements c,
Serializable {
    q() {
    }

    @Override
    public Object a(Object object, Method method, Method method2, Object[] arrobject) throws Exception {
        return method2.invoke(object, arrobject);
    }
}

