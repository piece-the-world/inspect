/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bP;
import com.growingio.a.a.o.a.j;
import com.growingio.a.a.o.a.k;
import com.growingio.a.a.o.a.l;
import com.growingio.a.a.o.a.p;
import com.growingio.a.a.o.a.v;
import com.growingio.a.a.o.a.w;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class u
extends l {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    private u() {
        super(null);
    }

    @Override
    void a(w w2, Thread thread) {
        a.putObject((Object)w2, e, (Object)thread);
    }

    @Override
    void a(w w2, w w3) {
        a.putObject((Object)w2, f, (Object)w3);
    }

    @Override
    boolean a(j<?> j2, w w2, w w3) {
        return a.compareAndSwapObject(j2, c, w2, w3);
    }

    @Override
    boolean a(j<?> j2, p p2, p p3) {
        return a.compareAndSwapObject(j2, b, p2, p3);
    }

    @Override
    boolean a(j<?> j2, Object object, Object object2) {
        return a.compareAndSwapObject(j2, d, object, object2);
    }

    /* synthetic */ u(k k2) {
        this();
    }

    static {
        Unsafe unsafe = null;
        try {
            unsafe = Unsafe.getUnsafe();
        }
        catch (SecurityException var1_1) {
            try {
                unsafe = (Unsafe)AccessController.doPrivileged(new v());
            }
            catch (PrivilegedActionException var2_4) {
                throw new RuntimeException("Could not initialize intrinsics", var2_4.getCause());
            }
        }
        try {
            reference var1_2 = j.class;
            c = unsafe.objectFieldOffset(var1_2.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(var1_2.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(var1_2.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(w.class.getDeclaredField("b"));
            f = unsafe.objectFieldOffset(w.class.getDeclaredField("c"));
            a = unsafe;
        }
        catch (Exception var1_3) {
            throw bP.c(var1_3);
        }
    }
}

