/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.U;
import com.growingio.a.a.j.W;
import java.io.Closeable;
import java.lang.reflect.Method;

final class V
implements W {
    static final V a = new V();
    static final Method b = V.b();

    V() {
    }

    static boolean a() {
        return b != null;
    }

    private static Method b() {
        try {
            return Throwable.class.getMethod("addSuppressed", Throwable.class);
        }
        catch (Throwable var0) {
            return null;
        }
    }

    @Override
    public void a(Closeable closeable, Throwable throwable, Throwable throwable2) {
        if (throwable == throwable2) {
            return;
        }
        try {
            b.invoke(throwable, throwable2);
        }
        catch (Throwable var4_4) {
            U.a.a(closeable, throwable, throwable2);
        }
    }
}

