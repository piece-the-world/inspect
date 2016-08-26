/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.ai;
import com.growingio.a.a.b.ak;
import com.growingio.a.a.b.al;
import com.growingio.a.a.b.am;
import com.growingio.a.a.b.an;
import java.io.Closeable;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aj
implements Closeable {
    private static final Logger d = Logger.getLogger(aj.class.getName());
    private static final String e = "Finalizer";
    private static final Method f;
    final ReferenceQueue<Object> a = new ReferenceQueue();
    final PhantomReference<Object> b;
    final boolean c;

    public aj() {
        this.b = new PhantomReference<Object>(this, this.a);
        boolean bl2 = false;
        try {
            f.invoke(null, ai.class, this.a, this.b);
            bl2 = true;
        }
        catch (IllegalAccessException var2_2) {
            throw new AssertionError(var2_2);
        }
        catch (Throwable var2_3) {
            d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", var2_3);
        }
        this.c = bl2;
    }

    @Override
    public void close() {
        this.b.enqueue();
        this.a();
    }

    void a() {
        Reference<Object> reference;
        if (this.c) {
            return;
        }
        while ((reference = this.a.poll()) != null) {
            reference.clear();
            try {
                ((ai)((Object)reference)).a();
            }
            catch (Throwable var2_2) {
                d.log(Level.SEVERE, "Error cleaning up after reference.", var2_2);
            }
        }
    }

    private static /* varargs */ Class<?> a(am ... arram) {
        for (am am2 : arram) {
            Class class_ = am2.a();
            if (class_ == null) continue;
            return class_;
        }
        throw new AssertionError();
    }

    static Method a(Class<?> class_) {
        try {
            return class_.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        }
        catch (NoSuchMethodException var1_1) {
            throw new AssertionError(var1_1);
        }
    }

    static /* synthetic */ Logger b() {
        return d;
    }

    static {
        Class class_ = aj.a(new an(), new ak(), new al());
        f = aj.a(class_);
    }
}

