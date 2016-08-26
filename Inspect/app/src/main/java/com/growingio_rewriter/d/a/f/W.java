/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import java.io.IOException;
import java.io.InputStream;

final class W
extends InputStream {
    private final InputStream a;

    W(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override
    public final void close() throws IOException {
    }

    @Override
    public final int read() throws IOException {
        return this.a.read();
    }

    @Override
    public final int read(byte[] arrby, int n2, int n3) throws IOException {
        return this.a.read(arrby, n2, n3);
    }

    @Override
    public final int available() throws IOException {
        return this.a.available();
    }
}

