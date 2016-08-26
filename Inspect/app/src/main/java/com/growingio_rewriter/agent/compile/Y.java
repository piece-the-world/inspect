/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.U;
import com.growingio.agent.compile.m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class Y
implements InvocationHandler {
    final /* synthetic */ U a;

    Y(U u2) {
        this.a = u2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        this.a.a.a(arrobject[0].toString());
        return null;
    }
}

