/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.io.PrintStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

final class dC
implements Thread.UncaughtExceptionHandler {
    private static final Logger a = Logger.getLogger(dC.class.getName());
    private final Runtime b;

    dC(Runtime runtime) {
        this.b = runtime;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        try {
            a.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), throwable);
        }
        catch (Throwable var3_3) {
            System.err.println(throwable.getMessage());
            System.err.println(var3_3.getMessage());
        }
        finally {
            this.b.exit(1);
        }
    }
}

