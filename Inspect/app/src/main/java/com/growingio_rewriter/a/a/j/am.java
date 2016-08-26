/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class am {
    private static final Logger a = Logger.getLogger(am.class.getName());

    private am() {
    }

    public static void a(Flushable flushable, boolean bl2) throws IOException {
        try {
            flushable.flush();
        }
        catch (IOException var2_2) {
            if (bl2) {
                a.log(Level.WARNING, "IOException thrown while flushing Flushable.", var2_2);
            }
            throw var2_2;
        }
    }

    public static void a(Flushable flushable) {
        try {
            am.a(flushable, true);
        }
        catch (IOException var1_1) {
            a.log(Level.SEVERE, "IOException should not have been thrown.", var1_1);
        }
    }
}

