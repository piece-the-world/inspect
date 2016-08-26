/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.OutputStream;

public class b
extends OutputStream {
    private final IOException a;

    public b(IOException iOException) {
        this.a = iOException;
    }

    public b() {
        this(new IOException("Broken output stream"));
    }

    @Override
    public void write(int n2) throws IOException {
        throw this.a;
    }

    @Override
    public void flush() throws IOException {
        throw this.a;
    }

    @Override
    public void close() throws IOException {
        throw this.a;
    }
}

