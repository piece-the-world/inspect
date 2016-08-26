/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class Y
extends FilterOutputStream {
    private long a;

    public Y(OutputStream outputStream) {
        super(aU.a(outputStream));
    }

    public long a() {
        return this.a;
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        this.out.write(arrby, n2, n3);
        this.a += (long)n3;
    }

    @Override
    public void write(int n2) throws IOException {
        this.out.write(n2);
        ++this.a;
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }
}

