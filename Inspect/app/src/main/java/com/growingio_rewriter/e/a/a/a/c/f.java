/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;

public class f
extends InputStream {
    private final IOException a;

    public f(IOException iOException) {
        this.a = iOException;
    }

    public f() {
        this(new IOException("Broken input stream"));
    }

    @Override
    public int read() throws IOException {
        throw this.a;
    }

    @Override
    public int available() throws IOException {
        throw this.a;
    }

    @Override
    public long skip(long l2) throws IOException {
        throw this.a;
    }

    @Override
    public synchronized void reset() throws IOException {
        throw this.a;
    }

    @Override
    public void close() throws IOException {
        throw this.a;
    }
}

