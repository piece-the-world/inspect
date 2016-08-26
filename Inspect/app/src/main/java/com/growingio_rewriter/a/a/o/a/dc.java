/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.da;
import com.growingio.a.a.o.a.db;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class dc
implements Callable<Object> {
    final /* synthetic */ Method a;
    final /* synthetic */ Object[] b;
    final /* synthetic */ db c;

    dc(db db2, Method method, Object[] arrobject) {
        this.c = db2;
        this.a = method;
        this.b = arrobject;
    }

    @Override
    public Object call() throws Exception {
        try {
            return this.a.invoke(this.c.a, this.b);
        }
        catch (InvocationTargetException var1_1) {
            throw da.a(var1_1, false);
        }
    }
}

