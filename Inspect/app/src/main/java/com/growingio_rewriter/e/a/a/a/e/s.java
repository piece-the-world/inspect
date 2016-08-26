/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.e.o;
import java.io.IOException;
import java.io.OutputStream;

public class s
extends o {
    protected OutputStream a;

    public s(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.a = outputStream2;
    }

    @Override
    public synchronized void write(byte[] arrby) throws IOException {
        super.write(arrby);
        this.a.write(arrby);
    }

    @Override
    public synchronized void write(byte[] arrby, int n2, int n3) throws IOException {
        super.write(arrby, n2, n3);
        this.a.write(arrby, n2, n3);
    }

    @Override
    public synchronized void write(int n2) throws IOException {
        super.write(n2);
        this.a.write(n2);
    }

    @Override
    public void flush() throws IOException {
        super.flush();
        this.a.flush();
    }

    @Override
    public void close() throws IOException {
        try {
            super.close();
        }
        finally {
            this.a.close();
        }
    }
}

