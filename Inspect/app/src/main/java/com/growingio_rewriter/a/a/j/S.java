/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class S {
    static final Logger a = Logger.getLogger(S.class.getName());

    private S() {
    }

    public static void a(Closeable closeable, boolean bl2) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException var2_2) {
            if (bl2) {
                a.log(Level.WARNING, "IOException thrown while closing Closeable.", var2_2);
            }
            throw var2_2;
        }
    }

    public static void a(InputStream inputStream) {
        try {
            S.a(inputStream, true);
        }
        catch (IOException var1_1) {
            throw new AssertionError(var1_1);
        }
    }

    public static void a(Reader reader) {
        try {
            S.a(reader, true);
        }
        catch (IOException var1_1) {
            throw new AssertionError(var1_1);
        }
    }
}

