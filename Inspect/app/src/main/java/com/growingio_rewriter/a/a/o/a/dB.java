/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.dC;

public final class dB {
    private dB() {
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new dC(Runtime.getRuntime());
    }
}

