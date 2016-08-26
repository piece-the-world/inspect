/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.Reader;

public class e
extends Reader {
    private static final int a = -1;
    private final Reader b;
    private int c = 0;
    private int d = -1;
    private int e;
    private final int f;

    public e(Reader reader, int n2) throws IOException {
        this.b = reader;
        this.f = n2;
    }

    @Override
    public void close() throws IOException {
        this.b.close();
    }

    @Override
    public void reset() throws IOException {
        this.c = this.d;
        this.b.reset();
    }

    @Override
    public void mark(int n2) throws IOException {
        this.e = n2 - this.c;
        this.d = this.c;
        this.b.mark(n2);
    }

    @Override
    public int read() throws IOException {
        if (this.c >= this.f) {
            return -1;
        }
        if (this.d >= 0 && this.c - this.d >= this.e) {
            return -1;
        }
        ++this.c;
        return this.b.read();
    }

    @Override
    public int read(char[] arrc, int n2, int n3) throws IOException {
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = this.read();
            if (n4 == -1) {
                return i2;
            }
            arrc[n2 + i2] = (char)n4;
        }
        return n3;
    }
}

