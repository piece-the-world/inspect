/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public abstract class q
extends FilterReader {
    public q(Reader reader) {
        super(reader);
    }

    @Override
    public int read() throws IOException {
        try {
            this.a(1);
            int n2 = this.in.read();
            this.b(n2 != -1 ? 1 : -1);
            return n2;
        }
        catch (IOException var1_2) {
            this.a(var1_2);
            return -1;
        }
    }

    @Override
    public int read(char[] arrc) throws IOException {
        try {
            this.a(arrc != null ? arrc.length : 0);
            int n2 = this.in.read(arrc);
            this.b(n2);
            return n2;
        }
        catch (IOException var2_3) {
            this.a(var2_3);
            return -1;
        }
    }

    @Override
    public int read(char[] arrc, int n2, int n3) throws IOException {
        try {
            this.a(n3);
            int n4 = this.in.read(arrc, n2, n3);
            this.b(n4);
            return n4;
        }
        catch (IOException var4_5) {
            this.a(var4_5);
            return -1;
        }
    }

    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        try {
            this.a(charBuffer != null ? charBuffer.length() : 0);
            int n2 = this.in.read(charBuffer);
            this.b(n2);
            return n2;
        }
        catch (IOException var2_3) {
            this.a(var2_3);
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
    public boolean ready() throws IOException {
        try {
            return this.in.ready();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
            return false;
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
    public synchronized void mark(int n2) throws IOException {
        try {
            this.in.mark(n2);
        }
        catch (IOException var2_2) {
            this.a(var2_2);
        }
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

    protected void a(int n2) throws IOException {
    }

    protected void b(int n2) throws IOException {
    }

    protected void a(IOException iOException) throws IOException {
        throw iOException;
    }
}

