/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.da;
import com.growingio.a.a.o.a.dc;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class db
implements InvocationHandler {
    final /* synthetic */ Object a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;
    final /* synthetic */ Set d;
    final /* synthetic */ da e;

    db(da da2, Object object, long l2, TimeUnit timeUnit, Set set) {
        this.e = da2;
        this.a = object;
        this.b = l2;
        this.c = timeUnit;
        this.d = set;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        dc dc2 = new dc(this, method, arrobject);
        return this.e.a(dc2, this.b, this.c, this.d.contains(method));
    }
}

