/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bQ;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bP {
    private static final String b = "sun.misc.JavaLangAccess";
    static final String a = "sun.misc.SharedSecrets";
    private static final Object c = bP.e();
    private static final Method d = c == null ? null : bP.f();
    private static final Method e = c == null ? null : bP.g();

    private bP() {
    }

    public static <X extends Throwable> void a(Throwable throwable, Class<X> class_) throws Throwable {
        aU.a(throwable);
        if (class_.isInstance(throwable)) {
            throw (Throwable)class_.cast(throwable);
        }
    }

    public static <X extends Throwable> void b(Throwable throwable, Class<X> class_) throws Throwable {
        if (throwable != null) {
            bP.a(throwable, class_);
        }
    }

    public static void a(Throwable throwable) {
        aU.a(throwable);
        if (throwable instanceof RuntimeException) {
            throw (RuntimeException)throwable;
        }
        if (throwable instanceof Error) {
            throw (Error)throwable;
        }
    }

    public static void b(Throwable throwable) {
        if (throwable != null) {
            bP.a(throwable);
        }
    }

    public static <X extends Throwable> void c(Throwable throwable, Class<X> class_) throws Throwable {
        bP.b(throwable, class_);
        bP.b(throwable);
    }

    public static <X1 extends Throwable, X2 extends Throwable> void a(Throwable throwable, Class<X1> class_, Class<X2> class_2) throws Throwable {
        aU.a(class_2);
        bP.b(throwable, class_);
        bP.c(throwable, class_2);
    }

    public static RuntimeException c(Throwable throwable) {
        bP.a(throwable);
        throw new RuntimeException(throwable);
    }

    public static Throwable d(Throwable throwable) {
        Throwable throwable2;
        while ((throwable2 = throwable.getCause()) != null) {
            throwable = throwable2;
        }
        return throwable;
    }

    public static List<Throwable> e(Throwable throwable) {
        aU.a(throwable);
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>(4);
        while (throwable != null) {
            arrayList.add(throwable);
            throwable = throwable.getCause();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String f(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static List<StackTraceElement> g(Throwable throwable) {
        return bP.a() ? bP.h(throwable) : Collections.unmodifiableList(Arrays.asList(throwable.getStackTrace()));
    }

    public static boolean a() {
        return d != null & e != null;
    }

    private static List<StackTraceElement> h(Throwable throwable) {
        aU.a(throwable);
        return new bQ(throwable);
    }

    private static /* varargs */ Object b(Method method, Object object, Object ... arrobject) {
        try {
            return method.invoke(object, arrobject);
        }
        catch (IllegalAccessException var3_3) {
            throw new RuntimeException(var3_3);
        }
        catch (InvocationTargetException var3_4) {
            throw bP.c(var3_4.getCause());
        }
    }

    private static Object e() {
        try {
            Class class_ = Class.forName("sun.misc.SharedSecrets", false, null);
            Method method = class_.getMethod("getJavaLangAccess", new Class[0]);
            return method.invoke(null, new Object[0]);
        }
        catch (ThreadDeath var0_1) {
            throw var0_1;
        }
        catch (Throwable var0_2) {
            return null;
        }
    }

    private static Method f() {
        return bP.a("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Method g() {
        return bP.a("getStackTraceDepth", Throwable.class);
    }

    private static /* varargs */ Method a(String string, Class<?> ... arrclass) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(string, arrclass);
        }
        catch (ThreadDeath var2_2) {
            throw var2_2;
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    static /* synthetic */ Method b() {
        return d;
    }

    static /* synthetic */ Object c() {
        return c;
    }

    static /* synthetic */ Object a(Method method, Object object, Object[] arrobject) {
        return bP.b(method, object, arrobject);
    }

    static /* synthetic */ Method d() {
        return e;
    }
}

