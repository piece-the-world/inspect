/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.o.a.bA;
import com.growingio.a.a.o.a.bB;
import com.growingio.a.a.o.a.bC;
import com.growingio.a.a.o.a.bE;
import com.growingio.a.a.o.a.bb;
import com.growingio.a.a.o.a.bz;
import com.growingio.a.a.o.a.dD;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class by {
    private static final kO<Constructor<?>> a = kO.d().a(new bz()).a();

    static <V, X extends Exception> V a(Future<V> future, Class<X> class_) throws Exception {
        return by.a(by.c(), future, class_);
    }

    static <V, X extends Exception> V a(bA bA2, Future<V> future, Class<X> class_) throws Exception {
        bA2.a(class_);
        try {
            return future.get();
        }
        catch (InterruptedException var3_3) {
            Thread.currentThread().interrupt();
            throw by.a(class_, (Throwable)var3_3);
        }
        catch (ExecutionException var3_4) {
            by.a(var3_4.getCause(), class_);
            throw new AssertionError();
        }
    }

    static <V, X extends Exception> V a(Future<V> future, Class<X> class_, long l2, TimeUnit timeUnit) throws Exception {
        by.c().a(class_);
        try {
            return future.get(l2, timeUnit);
        }
        catch (InterruptedException var5_4) {
            Thread.currentThread().interrupt();
            throw by.a(class_, (Throwable)var5_4);
        }
        catch (TimeoutException var5_5) {
            throw by.a(class_, (Throwable)var5_5);
        }
        catch (ExecutionException var5_6) {
            by.a(var5_6.getCause(), class_);
            throw new AssertionError();
        }
    }

    private static bA c() {
        return bB.b;
    }

    static bA a() {
        return bE.a;
    }

    static bA b() {
        return bC.a;
    }

    private static <X extends Exception> void a(Throwable throwable, Class<X> class_) throws Exception {
        if (throwable instanceof Error) {
            throw new bb((Error)throwable);
        }
        if (throwable instanceof RuntimeException) {
            throw new dD(throwable);
        }
        throw by.a(class_, throwable);
    }

    private static boolean c(Class<? extends Exception> class_) {
        try {
            Exception exception = by.a(class_, (Throwable)new Exception());
            return true;
        }
        catch (Exception var1_2) {
            return false;
        }
    }

    private static <X extends Exception> X a(Class<X> class_, Throwable throwable) {
        List<Constructor<X>> list = Arrays.asList(class_.getConstructors());
        for (Constructor<X> constructor : by.a(list)) {
            Exception exception = (Exception)by.a(constructor, throwable);
            if (exception == null) continue;
            if (exception.getCause() == null) {
                exception.initCause(throwable);
            }
            return (X)exception;
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + class_ + " in response to chained exception", throwable);
    }

    private static <X extends Exception> List<Constructor<X>> a(List<Constructor<X>> list) {
        return a.a(list);
    }

    private static <X> X a(Constructor<X> constructor, Throwable throwable) {
        Class<?>[] arrclass = constructor.getParameterTypes();
        Object[] arrobject = new Object[arrclass.length];
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            Class class_ = arrclass[i2];
            if (class_.equals(String.class)) {
                arrobject[i2] = throwable.toString();
                continue;
            }
            if (class_.equals(Throwable.class)) {
                arrobject[i2] = throwable;
                continue;
            }
            return null;
        }
        try {
            return constructor.newInstance(arrobject);
        }
        catch (IllegalArgumentException var4_5) {
            return null;
        }
        catch (InstantiationException var4_6) {
            return null;
        }
        catch (IllegalAccessException var4_7) {
            return null;
        }
        catch (InvocationTargetException var4_8) {
            return null;
        }
    }

    static boolean a(Class<? extends Exception> class_) {
        return !RuntimeException.class.isAssignableFrom(class_);
    }

    static void b(Class<? extends Exception> class_) {
        aU.a(by.a(class_), "Futures.getChecked exception type (%s) must not be a RuntimeException", class_);
        aU.a(by.c(class_), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", class_);
    }

    private by() {
    }
}

