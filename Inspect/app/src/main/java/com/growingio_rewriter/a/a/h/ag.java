/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ag
extends FilterInputStream {
    private final M a;

    public ag(L l2, InputStream inputStream) {
        super(aU.a(inputStream));
        this.a = aU.a(l2.a());
    }

    @Override
    public int read() throws IOException {
        int n2 = this.in.read();
        if (n2 != -1) {
            this.a.b((byte)n2);
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        int n4 = this.in.read(arrby, n2, n3);
        if (n4 != -1) {
            this.a.b(arrby, n2, n4);
        }
        return n4;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public void mark(int n2) {
    }

    @Override
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    public H a() {
        return this.a.a();
    }
}

