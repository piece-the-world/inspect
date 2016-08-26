/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class X
extends FilterInputStream {
    private long a;
    private long b = -1;

    public X(InputStream inputStream) {
        super(aU.a(inputStream));
    }

    public long a() {
        return this.a;
    }

    @Override
    public int read() throws IOException {
        int n2 = this.in.read();
        if (n2 != -1) {
            ++this.a;
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        int n4 = this.in.read(arrby, n2, n3);
        if (n4 != -1) {
            this.a += (long)n4;
        }
        return n4;
    }

    @Override
    public long skip(long l2) throws IOException {
        long l3 = this.in.skip(l2);
        this.a += l3;
        return l3;
    }

    @Override
    public synchronized void mark(int n2) {
        this.in.mark(n2);
        this.b = this.a;
    }

    @Override
    public synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.b == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.a = this.b;
    }
}

