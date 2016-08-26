/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class p
extends FilterInputStream {
    public p(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        try {
            this.b(1);
            int n2 = this.in.read();
            this.a(n2 != -1 ? 1 : -1);
            return n2;
        }
        catch (IOException var1_2) {
            this.a(var1_2);
            return -1;
        }
    }

    @Override
    public int read(byte[] arrby) throws IOException {
        try {
            this.b(arrby != null ? arrby.length : 0);
            int n2 = this.in.read(arrby);
            this.a(n2);
            return n2;
        }
        catch (IOException var2_3) {
            this.a(var2_3);
            return -1;
        }
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        try {
            this.b(n3);
            int n4 = this.in.read(arrby, n2, n3);
            this.a(n4);
            return n4;
        }
        catch (IOException var4_5) {
            this.a(var4_5);
            return -1;
        }
    }

    @Override
    public long skip(long l2) throws IOException {
        try {
            return this.in.skip(l2);
        }
        catch (IOException var3_2) {
            this.a(var3_2);
            return 0;
        }
    }

    @Override
    public int available() throws IOException {
        try {
            return super.available();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
            return 0;
        }
    }

    @Override
    public void close() throws IOException {
        try {
            this.in.close();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
        }
    }

    @Override
    public synchronized void mark(int n2) {
        this.in.mark(n2);
    }

    @Override
    public synchronized void reset() throws IOException {
        try {
            this.in.reset();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
        }
    }

    @Override
    public boolean markSupported() {
        return this.in.markSupported();
    }

    protected void b(int n2) throws IOException {
    }

    protected void a(int n2) throws IOException {
    }

    protected void a(IOException iOException) throws IOException {
        throw iOException;
    }
}

