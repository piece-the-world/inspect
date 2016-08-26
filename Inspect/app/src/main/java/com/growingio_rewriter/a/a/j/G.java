/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class G
extends FilterInputStream {
    private long a;
    private long b = -1;

    G(InputStream inputStream, long l2) {
        super(inputStream);
        aU.a(inputStream);
        aU.a(l2 >= 0, (Object)"limit must be non-negative");
        this.a = l2;
    }

    @Override
    public int available() throws IOException {
        return (int)Math.min((long)this.in.available(), this.a);
    }

    @Override
    public synchronized void mark(int n2) {
        this.in.mark(n2);
        this.b = this.a;
    }

    @Override
    public int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int n2 = this.in.read();
        if (n2 != -1) {
            --this.a;
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int n4 = this.in.read(arrby, n2, n3 = (int)Math.min((long)n3, this.a));
        if (n4 != -1) {
            this.a -= (long)n4;
        }
        return n4;
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

    @Override
    public long skip(long l2) throws IOException {
        l2 = Math.min(l2, this.a);
        long l3 = this.in.skip(l2);
        this.a -= l3;
        return l3;
    }
}

