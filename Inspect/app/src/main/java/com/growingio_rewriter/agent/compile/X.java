/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.T;
import com.growingio.agent.compile.U;
import com.growingio.agent.compile.m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class X
implements InvocationHandler {
    final /* synthetic */ U a;

    X(U u2) {
        this.a = u2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        T.b(this.a.b, arrobject != null && arrobject[0] == null);
        this.a.a.d("DisableInstrumentation: " + T.d(this.a.b) + " (" + arrobject + ")");
        return null;
    }
}

