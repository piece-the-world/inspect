/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.aA;
import com.growingio.a.a.o.a.ap;
import com.growingio.a.a.o.a.ax;
import com.growingio.a.a.o.a.ay;
import com.growingio.a.a.o.a.az;
import com.growingio.a.a.o.a.bZ;
import java.util.concurrent.Callable;

public final class aw {
    private aw() {
    }

    public static <T> Callable<T> a(T t2) {
        return new ax(t2);
    }

    public static <T> ap<T> a(Callable<T> callable, bZ bZ2) {
        aU.a(callable);
        aU.a(bZ2);
        return new ay(bZ2, callable);
    }

    static <T> Callable<T> a(Callable<T> callable, bG<String> bG2) {
        aU.a(bG2);
        aU.a(callable);
        return new az(bG2, callable);
    }

    static Runnable a(Runnable runnable, bG<String> bG2) {
        aU.a(bG2);
        aU.a(runnable);
        return new aA(bG2, runnable);
    }

    private static boolean b(String string, Thread thread) {
        try {
            thread.setName(string);
            return true;
        }
        catch (SecurityException var2_2) {
            return false;
        }
    }

    static /* synthetic */ boolean a(String string, Thread thread) {
        return aw.b(string, thread);
    }
}

