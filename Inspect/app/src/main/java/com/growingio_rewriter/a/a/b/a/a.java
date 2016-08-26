/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b.a;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a
implements Runnable {
    private static final Logger a = Logger.getLogger(a.class.getName());
    private static final String b = "FinalizableReference";
    private final WeakReference<Class<?>> c;
    private final PhantomReference<Object> d;
    private final ReferenceQueue<Object> e;
    private static final Field f = a.a();

    public static void a(Class<?> class_, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        if (!class_.getName().equals("FinalizableReference")) {
            throw new IllegalArgumentException("Expected FinalizableReference.");
        }
        a a2 = new a(class_, referenceQueue, phantomReference);
        Thread thread = new Thread(a2);
        thread.setName(a.class.getName());
        thread.setDaemon(true);
        try {
            if (f != null) {
                f.set(thread, null);
            }
        }
        catch (Throwable var5_5) {
            a.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", var5_5);
        }
        thread.start();
    }

    private a(Class<?> class_, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.e = referenceQueue;
        this.c = new WeakReference(class_);
        this.d = phantomReference;
    }

    @Override
    public void run() {
        do {
            try {
                while (this.a(this.e.remove())) {
                }
                break;
            }
            catch (InterruptedException var1_1) {
                continue;
            }
            break;
        } while (true);
    }

    private boolean a(Reference<?> reference) {
        Method method = this.b();
        if (method == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.d) {
                return false;
            }
            try {
                method.invoke(reference, new Object[0]);
                continue;
            }
            catch (Throwable var3_3) {
                a.log(Level.SEVERE, "Error cleaning up after reference.", var3_3);
            }
        } while ((reference = this.e.poll()) != null);
        return true;
    }

    private Method b() {
        Class class_ = this.c.get();
        if (class_ == null) {
            return null;
        }
        try {
            return class_.getMethod("finalizeReferent", new Class[0]);
        }
        catch (NoSuchMethodException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    public static Field a() {
        try {
            Field field = Thread.class.getDeclaredField("inheritableThreadLocals");
            field.setAccessible(true);
            return field;
        }
        catch (Throwable var0_1) {
            a.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }
}

