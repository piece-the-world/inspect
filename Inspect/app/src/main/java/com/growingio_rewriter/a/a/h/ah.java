/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class ah
extends FilterOutputStream {
    private final M a;

    public ah(L l2, OutputStream outputStream) {
        super(aU.a(outputStream));
        this.a = aU.a(l2.a());
    }

    @Override
    public void write(int n2) throws IOException {
        this.a.b((byte)n2);
        this.out.write(n2);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        this.a.b(arrby, n2, n3);
        this.out.write(arrby, n2, n3);
    }

    public H a() {
        return this.a.a();
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }
}

