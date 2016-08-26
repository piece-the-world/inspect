/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.T;
import com.growingio.agent.compile.U;
import com.growingio.agent.compile.b;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class V
implements InvocationHandler {
    final /* synthetic */ U a;

    V(U u2) {
        this.a = u2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        byte[] arrby = (byte[])arrobject[1];
        if (T.a(this.a.b)) {
            this.a.a.d("instrument disabled.");
            if (T.b(this.a.b)) {
                T.a(this.a.b, false);
                this.a.a.a("Instrumentation disabled, no agent present");
            }
            return arrby;
        }
        T.a(this.a.b, true);
        k k2 = T.c(this.a.b);
        synchronized (k2) {
            b b2 = T.a(this.a.b, arrby);
            return b2 != null && b2.a() != null && b2.e() ? b2.a() : arrby;
        }
    }
}

