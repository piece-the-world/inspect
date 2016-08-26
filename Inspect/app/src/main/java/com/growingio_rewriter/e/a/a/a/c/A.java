/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A
extends p {
    private final OutputStream a;
    private final boolean b;

    public A(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    public A(InputStream inputStream, OutputStream outputStream, boolean bl2) {
        super(inputStream);
        this.a = outputStream;
        this.b = bl2;
    }

    @Override
    public void close() throws IOException {
        try {
            super.close();
        }
        finally {
            if (this.b) {
                this.a.close();
            }
        }
    }

    @Override
    public int read() throws IOException {
        int n2 = super.read();
        if (n2 != -1) {
            this.a.write(n2);
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        int n4 = super.read(arrby, n2, n3);
        if (n4 != -1) {
            this.a.write(arrby, n2, n4);
        }
        return n4;
    }

    @Override
    public int read(byte[] arrby) throws IOException {
        int n2 = super.read(arrby);
        if (n2 != -1) {
            this.a.write(arrby, 0, n2);
        }
        return n2;
    }
}

