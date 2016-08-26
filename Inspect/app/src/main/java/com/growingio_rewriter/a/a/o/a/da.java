/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.o.a.dE;
import com.growingio.a.a.o.a.dF;
import com.growingio.a.a.o.a.db;
import com.growingio.a.a.o.a.dw;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class da
implements dw {
    private final ExecutorService a;

    public da(ExecutorService executorService) {
        this.a = aU.a(executorService);
    }

    public da() {
        this(Executors.newCachedThreadPool());
    }

    @Override
    public <T> T a(T t2, Class<T> class_, long l2, TimeUnit timeUnit) {
        aU.a(t2);
        aU.a(class_);
        aU.a(timeUnit);
        aU.a(l2 > 0, "bad timeout: %s", l2);
        aU.a(class_.isInterface(), (Object)"interfaceType must be an interface type");
        Set<Method> set = da.a(class_);
        db db2 = new db(this, t2, l2, timeUnit, set);
        return da.a(class_, db2);
    }

    @Override
    public <T> T a(Callable<T> callable, long l2, TimeUnit timeUnit, boolean bl2) throws Exception {
        aU.a(callable);
        aU.a(timeUnit);
        aU.a(l2 > 0, "timeout must be positive: %s", l2);
        Future<T> future = this.a.submit(callable);
        try {
            if (bl2) {
                try {
                    return future.get(l2, timeUnit);
                }
                catch (InterruptedException var7_6) {
                    future.cancel(true);
                    throw var7_6;
                }
            }
            return dF.a(future, l2, timeUnit);
        }
        catch (ExecutionException var7_7) {
            throw da.b(var7_7, true);
        }
        catch (TimeoutException var7_8) {
            future.cancel(true);
            throw new dE(var7_8);
        }
    }

    private static Exception b(Exception exception, boolean bl2) throws Exception {
        Throwable throwable = exception.getCause();
        if (throwable == null) {
            throw exception;
        }
        if (bl2) {
            StackTraceElement[] arrstackTraceElement = kN.a(throwable.getStackTrace(), exception.getStackTrace(), StackTraceElement.class);
            throwable.setStackTrace(arrstackTraceElement);
        }
        if (throwable instanceof Exception) {
            throw (Exception)throwable;
        }
        if (throwable instanceof Error) {
            throw (Error)throwable;
        }
        throw exception;
    }

    private static Set<Method> a(Class<?> class_) {
        HashSet<Method> hashSet = lI.a();
        for (Method method : class_.getMethods()) {
            if (!da.a(method)) continue;
            hashSet.add(method);
        }
        return hashSet;
    }

    private static boolean a(Method method) {
        for (Class class_ : method.getExceptionTypes()) {
            if (class_ != InterruptedException.class) continue;
            return true;
        }
        return false;
    }

    private static <T> T a(Class<T> class_, InvocationHandler invocationHandler) {
        Object object = Proxy.newProxyInstance(class_.getClassLoader(), new Class[]{class_}, invocationHandler);
        return class_.cast(object);
    }

    static /* synthetic */ Exception a(Exception exception, boolean bl2) throws Exception {
        return da.b(exception, bl2);
    }
}

