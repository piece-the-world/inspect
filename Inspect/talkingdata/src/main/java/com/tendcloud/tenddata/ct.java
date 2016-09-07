/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cn;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

static final class ct
implements InvocationHandler {
    final /* synthetic */ cn a;
    final /* synthetic */ Object b;

    ct(cn cn2, Object object) {
        this.a = cn2;
        this.b = object;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) {
        this.a.a(object, method, arrobject);
        Object object2 = method.invoke(this.b, arrobject);
        this.a.a(object, method, arrobject, object2);
        return object2;
    }
}

